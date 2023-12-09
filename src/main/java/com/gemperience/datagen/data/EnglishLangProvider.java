package com.gemperience.datagen.data;

import com.gemperience.blocks.ModBlocks;
import com.gemperience.items.ModItemGroup;
import com.gemperience.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricDataOutput datagenerator) {
        super(datagenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //region ItemGroups
        translationBuilder.add(ModItemGroup.GEMPERIENCE, "Gemperience");
        //endregion

        //Items
        translationBuilder.add(ModItems.DYANITE, "Dyanite");
        translationBuilder.add(ModItems.RUBY_DUST, "Ruby Dust");
        translationBuilder.add(ModItems.DENITIN_INGOT, "Denitin Ingot");
        translationBuilder.add(ModItems.RAW_DYANITE, "Raw Dyanite");
        translationBuilder.add(ModItems.AMALGAMITE, "Amalgamite");
        translationBuilder.add(ModItems.PETRINITE_BULB, "Petrinite Bulb");
        translationBuilder.add(ModItems.PETRINITE_ROSE, "Petrinite Rose");
        translationBuilder.add(ModItems.PETRINITE_ROOTS, "Petrinite Roots");
        translationBuilder.add(ModItems.ANTHOLIUM, "Antholium");
        translationBuilder.add(ModItems.RUBY, "Ruby");
        translationBuilder.add(ModItems.JADESTONE, "Jadestone");
        translationBuilder.add(ModItems.BIOLIUM, "Biolium");
        translationBuilder.add(ModItems.RUNIAN, "Runian");
        translationBuilder.add(ModItems.SPIRONITE, "Spironite");
        translationBuilder.add(ModItems.COBGALITE, "Cobgalite");
        translationBuilder.add(ModItems.SLAGODITE, "Slagodite");
        translationBuilder.add(ModItems.GLAZONIUM, "Glazonium");
        translationBuilder.add(ModItems.ECHORINE_PASTE, "Echocrine Paste");
        translationBuilder.add(ModItems.DENARIUM, "Denarium");
        translationBuilder.add(ModItems.CHITINOUS_GROWTH, "Chitinous Growth");
        translationBuilder.add(ModItems.SCULK_CHITIN, "Sculk Chitin");
        translationBuilder.add(ModItems.COPPER_NUGGET, "Copper Nugget");
        translationBuilder.add(ModItems.CHITIN_BOMB, "Chitin Bomb");

        //Tools
        translationBuilder.add(ModItems.DYANITE_PICKAXE, "Dyanite Pickaxe");
        translationBuilder.add(ModItems.DYANITE_SHOVEL, "Dyanite Shovel");
        translationBuilder.add(ModItems.DYANITE_AXE, "Dyanite Axe");
        translationBuilder.add(ModItems.DYANITE_SWORD, "Dyanite Sword");
        translationBuilder.add(ModItems.DYANITE_HOE, "Dyanite Hoe");
        translationBuilder.add(ModItems.WOODEN_HAMMER, "Wooden Hammer");
        translationBuilder.add(ModItems.STONE_HAMMER, "Stone Hammer");
        translationBuilder.add(ModItems.DYANITE_HAMMER, "Dyanite Hammer");
        translationBuilder.add(ModItems.IRON_HAMMER, "Iron Hammer");
        translationBuilder.add(ModItems.GOLDEN_HAMMER, "Golden Hammer");
        translationBuilder.add(ModItems.DIAMOND_HAMMER, "Diamond Hammer");
        translationBuilder.add(ModItems.NETHERITE_HAMMER, "Netherite Hammer");

        translationBuilder.add(ModItems.DENITIN_PICKAXE, "Denitin Pickaxe");
        translationBuilder.add(ModItems.DENITIN_AXE, "Denitin Axe");
        translationBuilder.add(ModItems.DENITIN_SHOVEL, "Denitin Shovel");
        translationBuilder.add(ModItems.DENITIN_SWORD, "Denitin Sword");
        translationBuilder.add(ModItems.DENITIN_HOE, "Denitin Hoe");
        translationBuilder.add(ModItems.DENITIN_HAMMER, "Denitin Hammer");

        //Denitin smithing template
        translationBuilder.add("item.denitin_smithing_template.applies_to", "Netherite Equipment");
        translationBuilder.add("item.denitin_smithing_template.ingredients", "Denitin Ingot");
        translationBuilder.add("item.denitin_smithing_template.title", "Denitin Upgrade");
        translationBuilder.add("item.denitin_smithing_template.base_slot_description", "Add Netherite weapon, armor or tool");
        translationBuilder.add("item.denitin_smithing_template.addition_slot_description", "Add Denitin Ingot");

        //Armor
        translationBuilder.add(ModItems.DENITIN_HELMET, "Denitin Helmet");
        translationBuilder.add(ModItems.DENITIN_CHESTPLATE, "Denitin Chestplate");
        translationBuilder.add(ModItems.DENITIN_LEGGINGS, "Denitin Leggings");
        translationBuilder.add(ModItems.DENITIN_BOOTS, "Denitin Boots");

        translationBuilder.add(ModItems.DYANITE_HELMET, "Dyanite Helmet");
        translationBuilder.add(ModItems.DYANITE_CHESTPLATE, "Dyanite Chestplate");
        translationBuilder.add(ModItems.DYANITE_LEGGINGS, "Dyanite Leggings");
        translationBuilder.add(ModItems.DYANITE_BOOTS, "Dyanite Boots");

        //Blocks
        translationBuilder.add(ModBlocks.DYANITE_ORE, "Dyanite Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_DYANITE_ORE, "Deepslate Dyanite Ore");
        translationBuilder.add(ModBlocks.RAW_DYANITE_BLOCK, "Block of Raw Dyanite");
        translationBuilder.add(ModBlocks.AMALGAMITE_ORE, "Amalgamite Ore");
        translationBuilder.add(ModBlocks.RUNIAN_ORE_SAND, "Runian Soul Sand");
        translationBuilder.add(ModBlocks.RUNIAN_ORE_SOIL, "Runian Soul Soil");
        translationBuilder.add(ModBlocks.PETRINITE_MUD, "Petrinite Mud");
        translationBuilder.add(ModBlocks.PETRINITE_CLAY, "Petrinite Clay");
        translationBuilder.add(ModBlocks.GLAZONIUM_ORE, "Glazonium Ore");
        translationBuilder.add(ModBlocks.JADESTONE_ORE, "Jadestone Ore");
        translationBuilder.add(ModBlocks.BIOLIUM_ORE, "Biolium Ore");
        translationBuilder.add(ModBlocks.SLAGODITE_ORE, "Slagodite Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_COBGALITE_ORE, "Deepslate Cobgalite Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_SCULK_CHITIN_ORE, "Deepslate Chitin Ore");
        translationBuilder.add(ModBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");
        translationBuilder.add(ModBlocks.DENARIUM_ORE, "Denarium Ore");
        translationBuilder.add(ModBlocks.ANTHOLIUM_ORE_SAND, "Antholium Ore");
        translationBuilder.add(ModBlocks.SPIRONITE_ORE, "Spironite Ore");
        translationBuilder.add(ModBlocks.SLAGODITE_ORE_BASALT, "Basalt Slagodite Ore");
        translationBuilder.add(ModBlocks.VOIDSTONE, "Voidstone");
        translationBuilder.add(ModBlocks.VOIDSTONE_STAIRS, "Voidstone Stairs");
        translationBuilder.add(ModBlocks.VOIDSTONE_SLAB, "Voidstone Slab");
        translationBuilder.add(ModBlocks.VOIDSTONE_WALL, "Voidstone Wall");
        translationBuilder.add(ModBlocks.POLISHED_VOIDSTONE, "Polished Voidstone");
        translationBuilder.add(ModBlocks.POLISHED_VOIDSTONE_SLAB, "Polished Voidstone Slab");
        translationBuilder.add(ModBlocks.POLISHED_VOIDSTONE_STAIRS, "Polished Voidstone Stairs");
        translationBuilder.add(ModBlocks.POLISHED_VOIDSTONE_WALL, "Polished Voidstone Wall");
        translationBuilder.add(ModBlocks.VOIDSTONE_BRICKS, "Voidstone Bricks");
        translationBuilder.add(ModBlocks.VOIDSTONE_BRICK_STAIRS, "Voidstone Brick Stairs");
        translationBuilder.add(ModBlocks.VOIDSTONE_BRICK_SLAB, "Voidstone Brick Slab");
        translationBuilder.add(ModBlocks.VOIDSTONE_BRICK_WALL, "Voidstone Brick Wall");

        translationBuilder.add(ModBlocks.NEUROSTONE, "Neurostone");
        translationBuilder.add(ModBlocks.NEUROSTONE_STAIRS, "Neurostone Stairs");
        translationBuilder.add(ModBlocks.NEUROSTONE_SLAB, "Neurostone Slab");
        translationBuilder.add(ModBlocks.NEUROSTONE_WALL, "Neurostone Wall");
        translationBuilder.add(ModBlocks.NEUROSTONE_BRICKS, "Neurostone Bricks");
        translationBuilder.add(ModBlocks.NEUROSTONE_BRICK_STAIRS, "Neurostone Brick Stairs");
        translationBuilder.add(ModBlocks.NEUROSTONE_BRICK_SLAB, "Neurostone Brick Slab");
        translationBuilder.add(ModBlocks.NEUROSTONE_BRICK_WALL, "Neurostone Brick Wall");
        translationBuilder.add(ModBlocks.POLISHED_NEUROSTONE, "Polished Neurostone");
        translationBuilder.add(ModBlocks.POLISHED_NEUROSTONE_STAIRS, "Polished Neurostone Stairs");
        translationBuilder.add(ModBlocks.POLISHED_NEUROSTONE_SLAB, "Polished Neurostone Slab");
        translationBuilder.add(ModBlocks.POLISHED_NEUROSTONE_WALL, "Polished Neurostone Wall");

        //Grinders
        translationBuilder.add(ModBlocks.GEM_GRINDER_TIER_1, "Mineral Grinder");
        translationBuilder.add(ModBlocks.GEM_GRINDER_TIER_2, "Molten Mineral Grinder");

        //Kiln
        translationBuilder.add(ModBlocks.KILN, "Kiln");
        translationBuilder.add("gemperience.block.kiln.displayname", "Kiln");

        //Cherry bomb
        translationBuilder.add(ModBlocks.CHERRY_BOMB, "Cherry Bomb");

        //Ruby Dust
        translationBuilder.add(ModBlocks.RUBY_DUST_BLOCK, "Block of Ruby Dust");

        //Ores
        translationBuilder.add(ModBlocks.ANTHOLIUM_BLOCK, "Block of Antholium");
        translationBuilder.add(ModBlocks.SPIRONITE_BLOCK, "Block of Spironite");
        translationBuilder.add(ModBlocks.RUNIAN_BLOCK, "Block of Runian");
        translationBuilder.add(ModBlocks.GLAZONIUM_BLOCK, "Block of Glazonium");
        translationBuilder.add(ModBlocks.PETRINITE_BLOCK, "Block of Petrinite");
        translationBuilder.add(ModBlocks.SLAGODITE_BLOCK, "Block of Slagodite");
        translationBuilder.add(ModBlocks.DENARIUM_BLOCK, "Block of Denarium");
        translationBuilder.add(ModBlocks.BIOLIUM_BLOCK, "Block of Biolium");
        translationBuilder.add(ModBlocks.JADESTONE_BLOCK, "Block of Jadestone");
        translationBuilder.add(ModBlocks.RUBY_BLOCK, "Block of Ruby");
        translationBuilder.add(ModBlocks.DENITIN_BLOCK, "Block of Denitin");
        translationBuilder.add(ModBlocks.AMALGAMITE_BLOCK, "Block of Amalgamite");
        translationBuilder.add(ModBlocks.DYANITE_BLOCK, "Block of Dyanite");
        translationBuilder.add(ModBlocks.ECHOCRINE_GLOB, "Echocrine Glob");
        translationBuilder.add(ModBlocks.CHITINOUS_MASS, "Chitinous Mass");
        translationBuilder.add(ModBlocks.COBGALITE_BLOCK, "Block of Cobgalite");

        //soulstone
        translationBuilder.add(ModBlocks.SOULSTONE, "Soulstone");
        translationBuilder.add(ModBlocks.SOULSTONE_STAIRS, "Soulstone Stairs");
        translationBuilder.add(ModBlocks.SOULSTONE_SLAB, "Soulstone Slab");
        translationBuilder.add(ModBlocks.SOULSTONE_WALL, "Soulstone Wall");
        translationBuilder.add(ModBlocks.CHISELED_SOULSTONE, "Chiseled Soulstone");
        translationBuilder.add(ModBlocks.CUT_SOULSTONE, "Cut Soulstone");
        translationBuilder.add(ModBlocks.CUT_SOULSTONE_SLAB, "Cut Soulstone Slab");
        translationBuilder.add(ModBlocks.SMOOTH_SOULSTONE, "Smooth Soulstone");
        translationBuilder.add(ModBlocks.SMOOTH_SOULSTONE_STAIRS, "Smooth Soulstone Stairs");
        translationBuilder.add(ModBlocks.SMOOTH_SOULSTONE_SLAB, "Smooth Soulstone Slab");
        translationBuilder.add(ModBlocks.CHARGED_SOULSTONE, "Charged Soulstone");
        translationBuilder.add(ModBlocks.CHARGED_SOULSTONE_STAIRS, "Charged Soulstone Stairs");
        translationBuilder.add(ModBlocks.CHARGED_SOULSTONE_SLAB, "Charged Soulstone Slab");
        translationBuilder.add(ModBlocks.CHARGED_SOULSTONE_WALL, "Charged Soulstone Wall");
        translationBuilder.add(ModBlocks.CHARGED_CHISELED_SOULSTONE, "Charged Chiseled Soulstone");
        translationBuilder.add(ModBlocks.CHARGED_CUT_SOULSTONE, "Charged Cut Soulstone");
        translationBuilder.add(ModBlocks.CHARGED_CUT_SOULSTONE_SLAB, "Charged Cut Soulstone Slab");

        //echocrine
        translationBuilder.add(ModBlocks.ECHOCRINE_STONE, "Echocrine Stone");
        translationBuilder.add(ModBlocks.ECHOCRINE_STONE_STAIRS, "Echocrine Stone Stairs");
        translationBuilder.add(ModBlocks.ECHOCRINE_STONE_SLAB, "Echocrine Stone Slab");
        translationBuilder.add(ModBlocks.ECHOCRINE_STONE_WALL, "Echocrine Stone Wall");
        translationBuilder.add(ModBlocks.POLISHED_ECHOCRINE_STONE, "Polished Echocrine Stone");
        translationBuilder.add(ModBlocks.POLISHED_ECHOCRINE_STONE_STAIRS, "Polished Echocrine Stone Stairs");
        translationBuilder.add(ModBlocks.POLISHED_ECHOCRINE_STONE_SLAB, "Polished Echocrine Stone Slab");
        translationBuilder.add(ModBlocks.POLISHED_ECHOCRINE_STONE_WALL, "Polished Echocrine Stone Wall");
        translationBuilder.add(ModBlocks.ECHOCRINE_STONE_BRICKS, "Echocrine Stone Bricks");
        translationBuilder.add(ModBlocks.ECHOCRINE_STONE_BRICK_STAIRS, "Echocrine Stone Brick Stairs");
        translationBuilder.add(ModBlocks.ECHOCRINE_STONE_BRICK_SLAB, "Echocrine Stone Brick Slab");
        translationBuilder.add(ModBlocks.ECHOCRINE_STONE_BRICK_WALL, "Echocrine Stone Brick Wall");
        translationBuilder.add(ModBlocks.ECHOCRINE_STONE_PILLAR, "Echocrine Stone Pillar");
        translationBuilder.add(ModBlocks.CHISELED_ECHOCRINE_STONE, "Chiseled Echocrine Stone");

        //marrowShale
        translationBuilder.add(ModBlocks.MARROWSHALE, "Marrowshale");
        translationBuilder.add(ModBlocks.MARROWSHALE_STAIRS, "Marrowshale Stairs");
        translationBuilder.add(ModBlocks.MARROWSHALE_SLAB, "Marrowshale Slab");
        translationBuilder.add(ModBlocks.MARROWSHALE_WALL, "Marrowshale Wall");
        translationBuilder.add(ModBlocks.POLISHED_MARROWSHALE, "Polished Marrowshale");
        translationBuilder.add(ModBlocks.POLISHED_MARROWSHALE_STAIRS, "Polished Marrowshale Stairs");
        translationBuilder.add(ModBlocks.POLISHED_MARROWSHALE_SLAB, "Polished Marrowshale Slab");
        translationBuilder.add(ModBlocks.POLISHED_MARROWSHALE_WALL, "Polished Marrowshale Wall");
        translationBuilder.add(ModBlocks.MARROWSHALE_BRICKS, "Marrowshale Bricks");
        translationBuilder.add(ModBlocks.MARROWSHALE_BRICK_STAIRS, "Marrowshale Brick Stairs");
        translationBuilder.add(ModBlocks.MARROWSHALE_BRICK_SLAB, "Marrowshale Brick Slab");
        translationBuilder.add(ModBlocks.MARROWSHALE_BRICK_WALL, "Marrowshale Brick Wall");

        //tarshale
        translationBuilder.add(ModBlocks.TAR, "Tar");
        translationBuilder.add(ModBlocks.TARSHALE, "Tarshale");
        translationBuilder.add(ModBlocks.TARSHALE_STAIRS, "Tarshale Stairs");
        translationBuilder.add(ModBlocks.TARSHALE_SLAB, "Tarshale Slab");
        translationBuilder.add(ModBlocks.TARSHALE_WALL, "Tarshale Wall");
        translationBuilder.add(ModBlocks.POLISHED_TARSHALE, "Polished Tarshale");
        translationBuilder.add(ModBlocks.POLISHED_TARSHALE_STAIRS, "Polished Tarshale Stairs");
        translationBuilder.add(ModBlocks.POLISHED_TARSHALE_SLAB, "Polished Tarshale Slab");
        translationBuilder.add(ModBlocks.POLISHED_TARSHALE_WALL, "Polished Tarshale Wall");
        translationBuilder.add(ModBlocks.TARSHALE_BRICKS, "Tarshale Bricks");
        translationBuilder.add(ModBlocks.TARSHALE_BRICK_STAIRS, "Tarshale Brick Stairs");
        translationBuilder.add(ModBlocks.TARSHALE_BRICK_SLAB, "Tarshale Brick Slab");
        translationBuilder.add(ModBlocks.TARSHALE_BRICK_WALL, "Tarshale Brick Wall");

        //illuminium
        translationBuilder.add(ModBlocks.ILLUMINIUM_LAMP, "Illuminium Lamp");
        translationBuilder.add(ModBlocks.ILLUMINIUM, "Illuminium");
        translationBuilder.add(ModBlocks.ILLUMINIUM_STAIRS, "Illuminium Stairs");
        translationBuilder.add(ModBlocks.ILLUMINIUM_SLAB, "Illuminium Slab");
        translationBuilder.add(ModBlocks.ILLUMINIUM_WALL, "Illuminium Wall");
        translationBuilder.add(ModBlocks.POLISHED_ILLUMINIUM, "Polished Illuminium");
        translationBuilder.add(ModBlocks.POLISHED_ILLUMINIUM_STAIRS, "Polished Illuminium Stairs");
        translationBuilder.add(ModBlocks.POLISHED_ILLUMINIUM_SLAB, "Polished Illuminium Slab");
        translationBuilder.add(ModBlocks.POLISHED_ILLUMINIUM_WALL, "Polished Illuminium Wall");
        translationBuilder.add(ModBlocks.ILLUMINIUM_BRICKS, "Illuminium Bricks");
        translationBuilder.add(ModBlocks.ILLUMINIUM_BRICK_STAIRS, "Illuminium Brick Stairs");
        translationBuilder.add(ModBlocks.ILLUMINIUM_BRICK_SLAB, "Illuminium Brick Slab");
        translationBuilder.add(ModBlocks.ILLUMINIUM_BRICK_WALL, "Illuminium Brick Wall");

        translationBuilder.add(ModBlocks.ENDBRINE, "Endbrine");

        //Froglights
        translationBuilder.add(ModBlocks.ALIZARIN_FROGLIGHT, "Alizarin Froglight");
        translationBuilder.add(ModBlocks.APRICOT_FROGLIGHT, "Apricot Froglight");
        translationBuilder.add(ModBlocks.BYZANTIUM_FROGLIGHT, "Byzantium Froglight");
        translationBuilder.add(ModBlocks.CARIBBEAN_FROGLIGHT, "Caribbean Froglight");
        translationBuilder.add(ModBlocks.CIDER_FROGLIGHT, "Cider Froglight");
        translationBuilder.add(ModBlocks.UMBRAL_FROGLIGHT, "Umbral Froglight");
        translationBuilder.add(ModBlocks.INDIGO_FROGLIGHT, "Indigo Froglight");
        translationBuilder.add(ModBlocks.PEARL_FROGLIGHT, "Pearl Froglight");
        translationBuilder.add(ModBlocks.PEWTER_FROGLIGHT, "Pewter Froglight");
        translationBuilder.add(ModBlocks.JADE_FROGLIGHT, "Jade Froglight");
        translationBuilder.add(ModBlocks.HARBOR_FROGLIGHT, "Harbor Froglight");
        translationBuilder.add(ModBlocks.CARNATION_FROGLIGHT, "Carnation Froglight");
        translationBuilder.add(ModBlocks.CERULEAN_FROGLIGHT, "Cerulean Froglight");

        translationBuilder.add("block.grinder.info.item_empty", "You need an item before you can grind");
        translationBuilder.add("block.grinder.info.item_unusable", "This item cannot be ground");
        translationBuilder.add("block.grinder.info.maxupgrade", "Grinder already at max tier");
        translationBuilder.add("block.grinder.info.upgrade_usable", "Grinder upgraded");
        translationBuilder.add("block.grinder.info.tier_too_low", "Grinder tier too low");
        translationBuilder.add("block.grinder.info.upgrade_unusable", "Unable to upgrade tier");
        translationBuilder.add("block.grinder.info.hammer_needs_gems", "your other hand needs a gem before you can grind.");
        translationBuilder.add("adv.gemperience.rootgems.title", "Gemperience");
        translationBuilder.add("adv.gemperience.rootgems.desc", "May the gems guide you.");

        translationBuilder.add("adv.gemperience.dyanite_get.title", "Shiny!");
        translationBuilder.add("adv.gemperience.dyanite_get.desc", "Discover Dyanite");
        translationBuilder.add("adv.gemperience.lazutite_get.title", "Shiny But Purple!");
        translationBuilder.add("adv.gemperience.lazutite_get.desc", "Discover Lazutite");
        translationBuilder.add("adv.gemperience.amalgamite_get.title", "One And Many");
        translationBuilder.add("adv.gemperience.amalgamite_get.desc", "Discover Amalgamite");
        translationBuilder.add("adv.gemperience.spironite_get.title", "Cold Hearted");
        translationBuilder.add("adv.gemperience.spironite_get.desc", "Discover Spironite");
        translationBuilder.add("adv.gemperience.slagodite_get.title", "Hot to The Touch");
        translationBuilder.add("adv.gemperience.slagodite_get.desc", "Discover Slagodite");
        translationBuilder.add("adv.gemperience.runian_get.title", "Old Friends Die Hard");
        translationBuilder.add("adv.gemperience.runian_get.desc", "Discover Runian");
        translationBuilder.add("adv.gemperience.jadestone_get.title", "Warped Spectrum");
        translationBuilder.add("adv.gemperience.jadestone_get.desc", "Discover Jadestone");
        translationBuilder.add("adv.gemperience.antholium_get.title", "Aquatic Quadratic!");
        translationBuilder.add("adv.gemperience.antholium_get.desc", "Discover Antholium");
        translationBuilder.add("adv.gemperience.petrinite_get.title", "The Jungle Grows Restless");
        translationBuilder.add("adv.gemperience.petrinite_get.desc", "Discover Petrinite");
        translationBuilder.add("adv.gemperience.sculk_chitin_get.title", "Tumors");
        translationBuilder.add("adv.gemperience.sculk_chitin_get.desc", "Discover Chitanous Growth");
        translationBuilder.add("adv.gemperience.glazonium_get.title", "Paradoxical Past");
        translationBuilder.add("adv.gemperience.glazonium_get.desc", "Discover Glazonium");
        translationBuilder.add("adv.gemperience.denarium_get.title", "Ender Power");
        translationBuilder.add("adv.gemperience.denarium_get.desc", "Discover Denarium");
        translationBuilder.add("adv.gemperience.upgrade_tier_2.title", "Bring In The Heat!");
        translationBuilder.add("adv.gemperience.upgrade_tier_2.desc", "Upgrade a grinder to the Heat-tier");
        translationBuilder.add("adv.gemperience.upgrade_tier_3.title", "The End of Grinding");
        translationBuilder.add("adv.gemperience.upgrade_tier_3.desc", "Max out a grinder");
        translationBuilder.add("adv.gemperience.echocrine_get.title", "It's sticky!");
        translationBuilder.add("adv.gemperience.echocrine_get.desc", "Discover Echocrine");
        translationBuilder.add("adv.gemperience.raw_dyanite_get.title", "Rough Around The Edges");
        translationBuilder.add("adv.gemperience.raw_dyanite_get.desc", "Discover Raw Dyanite");
        translationBuilder.add("adv.gemperience.cobgalite_get.title", "Rock And Stone");
        translationBuilder.add("adv.gemperience.cobgalite_get.desc", "Discover Cobgalite");
        translationBuilder.add("adv.gemperience.biolium_get.title", "Biotics");
        translationBuilder.add("adv.gemperience.biolium_get.desc", "Discover Biolium");
        translationBuilder.add("adv.gemperience.grind_all_gems.title", "Grinding Gears");
        translationBuilder.add("adv.gemperience.grind_all_gems.desc", "Grind one of each gem.");
        translationBuilder.add("adv.gemperience.spawned_runian.title", "Bound Down");
        translationBuilder.add("adv.gemperience.spawned_runian.desc", "Capture the essence of a Mob into Soul Sand or Soil");
        translationBuilder.add("adv.gemperience.drinking_tears.title", "Drinking Tears");
        translationBuilder.add("adv.gemperience.drinking_tears.desc", "You just had to do it, didn't you?");

        //Special edge case since the name of the item has gone did goofed.
        translationBuilder.add("item.gemperience.ghast_tear_in_a_bottle.effect.empty", "Ghast Tear In a Bottle");
        translationBuilder.add("item.ghast_tear_in_a_bottle.tooltip", "§9Slow Falling (00:10)");

        translationBuilder.add("item.gemperience.chitin_bomb.tooltip", "§7Deals §cno §7damage.");



        //potions

        // <- Merfolk ->
        translationBuilder.add("item.minecraft.potion.effect.merfolk", "Potion of Merfolk");
        translationBuilder.add("item.minecraft.splash_potion.effect.merfolk", "Splash Potion of Merfolk");
        translationBuilder.add("item.minecraft.lingering_potion.effect.merfolk", "Lingering Potion of Merfolk");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.merfolk", "Arrow of Merfolk");

        // <- Vitality ->
        translationBuilder.add("item.minecraft.potion.effect.vitality", "Potion of Vitality");
        translationBuilder.add("item.minecraft.splash_potion.effect.vitality", "Splash Potion of Vitality");
        translationBuilder.add("item.minecraft.lingering_potion.effect.vitality", "Lingering Potion of Vitality");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.vitality", "Arrow of Vitality");

        // <- Decay ->
        translationBuilder.add("item.minecraft.potion.effect.decay", "Potion of Decay");
        translationBuilder.add("item.minecraft.splash_potion.effect.decay", "Splash Potion of Decay");
        translationBuilder.add("item.minecraft.lingering_potion.effect.decay", "Lingering Potion of Decay");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.decay", "Arrow of Decay");

        // <- Radiance ->
        translationBuilder.add("item.minecraft.potion.effect.radiance", "Potion of Radiance");
        translationBuilder.add("item.minecraft.splash_potion.effect.radiance", "Splash Potion of Radiance");
        translationBuilder.add("item.minecraft.lingering_potion.effect.radiance", "Lingering Potion of Radiance");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.radiance", "Arrow of Radiance");

        // <- Darkness ->
        translationBuilder.add("item.minecraft.potion.effect.darkness", "Potion of Darkness");
        translationBuilder.add("item.minecraft.splash_potion.effect.darkness", "Splash Potion of Darkness");
        translationBuilder.add("item.minecraft.lingering_potion.effect.darkness", "Lingering Potion of Darkness");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.darkness", "Arrow of Darkness");

        // <- Saturation ->
        translationBuilder.add("item.minecraft.potion.effect.saturation", "Potion of Saturation");
        translationBuilder.add("item.minecraft.splash_potion.effect.saturation", "Splash Potion of Saturation");
        translationBuilder.add("item.minecraft.lingering_potion.effect.saturation", "Lingering Potion of Saturation");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.saturation", "Arrow of Saturation");

        // <- Starvation ->
        translationBuilder.add("item.minecraft.potion.effect.starvation", "Potion of Starvation");
        translationBuilder.add("item.minecraft.splash_potion.effect.starvation", "Splash Potion of Starvation");
        translationBuilder.add("item.minecraft.lingering_potion.effect.starvation", "Lingering Potion of Starvation");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.starvation", "Arrow of Starvation");

        // <- Haste ->
        translationBuilder.add("item.minecraft.potion.effect.haste", "Potion of Haste");
        translationBuilder.add("item.minecraft.splash_potion.effect.haste", "Splash Potion of Haste");
        translationBuilder.add("item.minecraft.lingering_potion.effect.haste", "Lingering Potion of Haste");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.haste", "Arrow of Haste");

        // <- Mining Fatigue ->
        translationBuilder.add("item.minecraft.potion.effect.mining_fatigue", "Potion of Mining Fatigue");
        translationBuilder.add("item.minecraft.splash_potion.effect.mining_fatigue", "Splash Potion of Mining Fatigue");
        translationBuilder.add("item.minecraft.lingering_potion.effect.mining_fatigue", "Lingering Potion of Mining Fatigue");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.mining_fatigue", "Arrow of Mining Fatigue");

        // <- Sickness ->
        translationBuilder.add("item.minecraft.potion.effect.sickness", "Potion of Sickness");
        translationBuilder.add("item.minecraft.splash_potion.effect.sickness", "Splash Potion of Sickness");
        translationBuilder.add("item.minecraft.lingering_potion.effect.sickness", "Lingering Potion of Sickness");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.sickness", "Arrow of Sickness");

        // <- Absorption ->
        translationBuilder.add("item.minecraft.potion.effect.absorption", "Potion of Absorption");
        translationBuilder.add("item.minecraft.splash_potion.effect.absorption", "Splash Potion of Absorption");
        translationBuilder.add("item.minecraft.lingering_potion.effect.absorption", "Lingering Potion of Absorption");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.absorption", "Arrow of Absorption");

        // <- Leviation ->
        translationBuilder.add("item.minecraft.potion.effect.leviation", "Potion of Leviation");
        translationBuilder.add("item.minecraft.splash_potion.effect.leviation", "Splash Potion of Leviation");
        translationBuilder.add("item.minecraft.lingering_potion.effect.leviation", "Lingering Potion of Leviation");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.leviation", "Arrow of Leviation");

        // <- Blindness ->
        translationBuilder.add("item.minecraft.potion.effect.blindness", "Potion of Blindness");
        translationBuilder.add("item.minecraft.splash_potion.effect.blindness", "Splash Potion of Blindness");
        translationBuilder.add("item.minecraft.lingering_potion.effect.blindness", "Lingering Potion of Blindness");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.blindness", "Arrow of Blindness");

        // <- Luck ->
        translationBuilder.add("item.minecraft.potion.effect.luck", "Potion of Luck");
        translationBuilder.add("item.minecraft.splash_potion.effect.luck", "Splash Potion of Luck");
        translationBuilder.add("item.minecraft.lingering_potion.effect.luck", "Lingering Potion of Luck");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.luck", "Arrow of Luck");

        // <- Unluck ->
        translationBuilder.add("item.minecraft.potion.effect.unluck", "Potion of Bad Luck");
        translationBuilder.add("item.minecraft.splash_potion.effect.unluck", "Splash Potion of Bad Luck");
        translationBuilder.add("item.minecraft.lingering_potion.effect.unluck", "Lingering Potion of Bad Luck");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.unluck", "Arrow of Bad Luck");

        translationBuilder.add("adv.gemperience.crush_first_gem.title", "Nifty Business.");
        translationBuilder.add("adv.gemperience.crush_first_gem.desc", "Grind your first gem.");
        translationBuilder.add("adv.gemperience.stuck_in_1_0.title", "Stuck in 1.0");
        translationBuilder.add("adv.gemperience.stuck_in_1_0.desc", "Use an end-tier mineral on an standard mineral grinder");
        translationBuilder.add("adv.gemperience.upgrade_tier_1.title", "Upgrades People, Upgrades!");
        translationBuilder.add("adv.gemperience.upgrade_tier_1.desc", "Upgrade an untiered grinder");


        // Statistics
        translationBuilder.add("stat.gemperience.interact_with_kiln", "Interactions with Kiln");

        // Gamerules
        translationBuilder.add("gamerule.canRunianSpawn", "Can Runian Spawn");

        // Subtitles
        translationBuilder.add("subtitles.gemperience.runian_spawn", "Bound Down Souls");

        // Load an existing language file.
        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/gemperience/lang/en_us.json").get();
            if (existingFilePath.toFile().delete()){
                System.out.println("Original language file deleted successfully.");
            }
        } catch (Exception e) {
            System.out.println("Original language file Could not be deleted.");
        }
    }


}
