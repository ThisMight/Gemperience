package com.gemperience.util;

import com.gemperience.Gemperience;
import com.gemperience.datagen.data.ModItemTag;
import com.gemperience.items.ModItems;
import com.gemperience.items.custom.AbstractGemItem;
import com.gemperience.items.custom.gem.RubyGem;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.advancement.criterion.CriterionProgress;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GemCrusherUtilities {
    public static void GemGrinder_Gems(byte tier, World world, BlockPos pos, ServerPlayerEntity player, ItemStack gems, ItemStack hammer){
        switch (tier){

            case 1:
                gem_grinding_tier_1(world, pos, player, gems, hammer);
                break;

            case 2:
                gem_grinding_tier_2(world, pos, player, gems, hammer);
                break;
        }

    }

    static void gem_grinding_tier_1(World world,BlockPos pos, ServerPlayerEntity player, ItemStack gems, ItemStack hammer) {
        if (player.getMainHandStack().isIn(ModItemTag.GEMS_TIER_1) || player.getOffHandStack().isIn(ModItemTag.GEMS_TIER_1)) {
            if (world instanceof ServerWorld s_world) {
                try {
                    Crush_gem(0, s_world, pos, player, gems, hammer);
                } catch (CommandSyntaxException e) {
                    System.out.println("UNABLE TO GRIND GEM, ISSUE WITH COMMAND HANDLING.");
                }
            }
        } else {
            player.sendMessage(Text.translatable("block.grinder.info.tier_too_low"), true);
        }
    }


    static void gem_grinding_tier_2(World world,BlockPos pos, ServerPlayerEntity player, ItemStack gems, ItemStack hammer) {
        if (player.getMainHandStack().isIn(ModItemTag.GEMS_TIER_2) || player.getOffHandStack().isIn(ModItemTag.GEMS_TIER_2)) {
            if (world instanceof ServerWorld s_world) {
                try {
                    Crush_gem(1, s_world, pos, player, gems, hammer);
                } catch (CommandSyntaxException e) {
                    System.out.println("UNABLE TO GRIND GEM, ISSUE WITH COMMAND HANDLING.");
                }
            }
        } else if (player.getMainHandStack().isIn(ModItemTag.GEMS_TIER_1) || player.getOffHandStack().isIn(ModItemTag.GEMS_TIER_1)) {
            gem_grinding_tier_1(world, pos, player, gems, hammer);
        } else {
            player.sendMessage(Text.translatable("block.grinder.info.tier_too_low"), true);
        }
    }

        static void Crush_gem(int tier, ServerWorld world, BlockPos pos, ServerPlayerEntity player, ItemStack gems, ItemStack hammer) throws CommandSyntaxException {
        //Get the name of the gem for usage in the loot table spawner.
        String gemName = gems.getItem().getTranslationKey().replace("item.gemperience.", "");
        //Get the crush advancement
        GetCrushAdvancement(world.getServer(), player, "gameplay/crush_first_gem", "gem_crushed");

        // Gem particles appear from this method call.
        if (gems.getItem() instanceof AbstractGemItem gem) {
            gem.crushGem(world, pos);

            ProgressGrindAllAdvancement(world.getServer(), player, gemName);
            //In the instance of ruby, give an advancement.
            if (gem instanceof RubyGem){
                if (tier > 0) player.getWorld().spawnEntity(new ItemEntity(world, pos.getX() + .5, pos.getY() + 0.6, pos.getZ() + 0.5, new ItemStack(ModItems.RUBY_DUST)));
            }
        }

        //If we are using a hammer in our MAIN hand
        if (hammer != null) {
            //Calculate the crush amount.
            //If the durability of the hammer is enough to crush all gems, return the gem amount
            //Else, return the durability of the hammer.
            int CrushAmount = (hammer.getMaxDamage() - hammer.getDamage()) - gems.getCount() >= -1 ?
                    gems.getCount() : (hammer.getMaxDamage() - hammer.getDamage());
            for (int i = 0; i < CrushAmount; i++) {
                //I know this is a hacky solution, but it is much better than creating blockEntities that do nothing.
                    player.getWorld().getServer().getCommandManager().getDispatcher().execute("loot spawn " + (pos.getX() + .5) + " " + (pos.getY() + .2) + " " + (pos.getZ() + .5) + " loot gemperience:gameplay/gem/" + gemName, world.getServer().getCommandSource().withWorld((ServerWorld) player.getWorld()).withSilent());
                }
            world.spawnEntity(new ExperienceOrbEntity((World) world, pos.getX()+.5, pos.getY() + .5, pos.getZ() + .5, (int) Math.floor(ReturnExperienceAmount_Hammer(tier, CrushAmount))));
                if (!player.isCreative()) {
                    gems.decrement(CrushAmount);
                    DamageHammers(CrushAmount, player, hammer);
                }
            } else {
                //I know this is a hacky solution, but it is much better than creating blockEntities that do nothing.
                player.getWorld().getServer().getCommandManager().getDispatcher().execute("loot spawn " + (pos.getX() + .5) + " " + (pos.getY() + .2) + " " + (pos.getZ() + .5) + " loot gemperience:gameplay/gem/" + gemName, world.getServer().getCommandSource().withWorld((ServerWorld) player.getWorld()).withSilent());
                world.spawnEntity(new ExperienceOrbEntity((World) world, pos.getX()+.5, pos.getY() + .5, pos.getZ() + .5, (int) Math.floor(ReturnExperienceAmount(tier, 1))));
                if (!player.isCreative()) {
                    player.getMainHandStack().decrement(1);
                }
            }
        }

    // Updated to account for new hammer logic.
    static void DamageHammers(int amount, PlayerEntity player, ItemStack Hammer){
        {
            Hammer.setDamage(Hammer.getDamage() + amount);
            if (Hammer.getDamage() == Hammer.getMaxDamage()){
                player.sendToolBreakStatus(Hand.MAIN_HAND);
                Hammer.decrement(1);
            }
        }
    }

    public static void GetCrushAdvancement(MinecraftServer server, ServerPlayerEntity player, String path, String criterionName){
        if (!player.getAdvancementTracker().getProgress(server.getAdvancementLoader().get(new Identifier(Gemperience.MODID, path))).isDone()){
            player.getAdvancementTracker().grantCriterion(server.getAdvancementLoader().get(new Identifier(Gemperience.MODID, path)), criterionName);
        }
    }

    static void ProgressGrindAllAdvancement(MinecraftServer server, ServerPlayerEntity player, String gemName) {
        CriterionProgress progress = player.getAdvancementTracker().getProgress(server.getAdvancementLoader().get(new Identifier(Gemperience.MODID, "gameplay/grind_all_gems"))).getCriterionProgress("ground_" + gemName);
        if (progress != null && !progress.isObtained()) {
            player.getAdvancementTracker().grantCriterion(server.getAdvancementLoader().get(new Identifier(Gemperience.MODID, "gameplay/grind_all_gems")), "ground_" + gemName);
        }
    }

    static float ReturnExperienceAmount(int tier, int amount){
        final float TIER_0_TAX = 0.25f;
        final float TIER_1_TAX = 0.5f;
        final float TIER_2_TAX = 1f;
        final float TIER_3_TAX = 1f;
        switch (tier) {
            case 0 -> {
                return amount * 3 / (1 + TIER_0_TAX) + (tier * (1 - TIER_0_TAX));
            }
            case 1 -> {
                return amount * 3 / (1 + TIER_1_TAX) + (tier * (1 - TIER_1_TAX));
            }
            case 2 -> {
                return amount * 3 / (1 + TIER_2_TAX) + (tier * (1 - TIER_2_TAX));
            }
            case 3 -> {
                return amount * 3 / (1 + TIER_3_TAX) + (tier * (1 - TIER_3_TAX));
            }
        }
        //Seriously, it doesn't do well with any other tier that isn't on here.
        return 0;
    }
    static float ReturnExperienceAmount_Hammer(int tier, int amount){
        switch (tier) {
            case 1 -> {
                return ReturnExperienceAmount(tier, amount) * 1.25f;
            }
            case 2 -> {
                return ReturnExperienceAmount(tier, amount) * 1.33f;
            }
            case 3 -> {
                return ReturnExperienceAmount(tier, amount) * 1.55f;
            }
            case 4 -> {
                return ReturnExperienceAmount(tier, amount) * 1.64f;
            }
        }
        //Seriously, it doesn't do well with any other tier that isn't on here.
        return 0;
    }
}
