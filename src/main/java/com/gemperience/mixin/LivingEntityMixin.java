package com.gemperience.mixin;

import com.gemperience.Gemperience;
import com.gemperience.blocks.ModBlocks;
import com.gemperience.sound.ModSounds;
import com.gemperience.util.GemCrusherUtilities;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.dimension.DimensionTypes;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashMap;
import java.util.Random;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Shadow
    @Nullable
    public abstract LivingEntity getAttacker();

    @Shadow
    private BlockPos lastBlockPos;

    private boolean setRunianBlock(Block original, BlockPos blockPos, ServerWorld world, ServerPlayerEntity player) {
        HashMap<Block, Block> runianizedBlocks = new HashMap<>();
        runianizedBlocks.put(Blocks.SOUL_SAND, ModBlocks.RUNIAN_ORE_SAND);
        runianizedBlocks.put(Blocks.SOUL_SOIL, ModBlocks.RUNIAN_ORE_SOIL);
        runianizedBlocks.put(ModBlocks.SOULSTONE, ModBlocks.CHARGED_SOULSTONE);
        runianizedBlocks.put(ModBlocks.SOULSTONE_SLAB, ModBlocks.CHARGED_SOULSTONE_SLAB);
        runianizedBlocks.put(ModBlocks.SOULSTONE_STAIRS, ModBlocks.CHARGED_SOULSTONE_STAIRS);
        runianizedBlocks.put(ModBlocks.SOULSTONE_WALL, ModBlocks.CHARGED_SOULSTONE_WALL);
        runianizedBlocks.put(ModBlocks.CUT_SOULSTONE, ModBlocks.CHARGED_CUT_SOULSTONE);
        runianizedBlocks.put(ModBlocks.CUT_SOULSTONE_SLAB, ModBlocks.CHARGED_CUT_SOULSTONE_SLAB);
        runianizedBlocks.put(ModBlocks.SOULSTONE_WALL, ModBlocks.CHARGED_SOULSTONE_WALL);
        runianizedBlocks.put(ModBlocks.CHISELED_SOULSTONE, ModBlocks.CHARGED_CHISELED_SOULSTONE);

        if (!runianizedBlocks.containsKey(original)) {
            return false;
        }

        world.playSound(null, lastBlockPos, ModSounds.RUNIAN_SPAWN, SoundCategory.BLOCKS, .75f, 1);
        if (original instanceof SlabBlock || original instanceof StairsBlock) {
            BlockState state = world.getBlockState(blockPos);
            world.setBlockState(blockPos, runianizedBlocks.get(original).getStateWithProperties(state));
        } else {
            world.setBlockState(blockPos, runianizedBlocks.get(original).getDefaultState());
        }

        GemCrusherUtilities.GetCrushAdvancement(player.getServer(), player, "gameplay/generated_runian_using_entity", "generated_runian_using_entity");
        world.spawnParticles(ParticleTypes.SOUL,
                lastBlockPos.getX() + .5, lastBlockPos.getY() + 1, lastBlockPos.getZ() + .5,
                5,
                0, 0, 0,
                .2);

        return true;
    }


    @Inject(at = @At("TAIL"), method = "onDeath")
    private void onDeathEntity(DamageSource damageSource, CallbackInfo ci) {
        Random rnd = new Random();
        if (getAttacker() != null &&
                getAttacker().getWorld().getGameRules().getBoolean(Gemperience.CAN_RUNIAN_SPAWN) &&
                rnd.nextInt(0, 50) <= 10) {

            if ((this.getAttacker() instanceof ServerPlayerEntity player) &&
                    (this.getAttacker().getWorld() instanceof ServerWorld s_world) &&
                    (s_world.getDimensionKey() == DimensionTypes.THE_NETHER) &&
                    (s_world.getBiome(lastBlockPos).getKey().get() == BiomeKeys.SOUL_SAND_VALLEY)) {

                if (s_world.getBlockState(lastBlockPos) == Blocks.SOUL_SAND.getDefaultState()
                        || s_world.getBlockState(lastBlockPos).getBlock() instanceof SlabBlock
                        || s_world.getBlockState(lastBlockPos).getBlock() instanceof StairsBlock) {
                    setRunianBlock(s_world.getBlockState(lastBlockPos).getBlock(), lastBlockPos, s_world, player);
                } else {
                    setRunianBlock(s_world.getBlockState(lastBlockPos.down()).getBlock(), lastBlockPos.down(), s_world, player);
                }
            }
        }
    }
}
