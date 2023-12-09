package com.gemperience.blocks;

import com.gemperience.Gemperience;
import com.gemperience.blocks.custom.*;
import com.gemperience.items.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //region ORES
    public static final Block DYANITE_ORE = registerBlock("dyanite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block DEEPSLATE_DYANITE_ORE = registerBlock("deepslate_dyanite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block AMALGAMITE_ORE = registerBlock("amalgamite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block PETRINITE_CLAY = registerBlock("petrinite_clay",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).hardness(1.5f).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block PETRINITE_MUD = registerBlock("petrinite_mud",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD).hardness(1.8f).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static final Block ANTHOLIUM_ORE_SAND = registerBlock("antholium_ore_sand",
            new Block(FabricBlockSettings.copyOf(Blocks.SAND).hardness(1.2f).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static RunianSoulSandRedstoneBlock RUNIAN_ORE_SAND = (RunianSoulSandRedstoneBlock) registerBlock("runian_ore_sand",
            new RunianSoulSandRedstoneBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND).requiresTool().hardness(1.7f).luminance(3)), ModItemGroup.GEMPERIENCE);

    public static RedstoneEmittingBlock RUNIAN_ORE_SOIL = (RedstoneEmittingBlock) registerBlock("runian_ore_soil",
            new RedstoneEmittingBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL).requiresTool().hardness(1.7f).luminance(3), 3), ModItemGroup.GEMPERIENCE);

    public static final Block JADESTONE_ORE = registerBlock("jadestone_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static final Block BIOLIUM_ORE = registerBlock("biolium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool().luminance(3)), ModItemGroup.GEMPERIENCE);

    public static final Block GLAZONIUM_ORE = registerBlock("glazonium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static final Block DENARIUM_ORE = registerBlock("denarium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block SLAGODITE_ORE = registerBlock("slagodite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool()
                    .luminance(4)),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock SLAGODITE_ORE_BASALT = (PillarBlock) registerBlock("slagodite_ore_basalt",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BASALT).requiresTool().luminance(4)), ModItemGroup.GEMPERIENCE);

    public static final Block DEEPSLATE_SCULK_CHITIN_ORE = registerBlock("deepslate_sculk_chitin_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block DEEPSLATE_COBGALITE_ORE = registerBlock("deepslate_cobgalite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static final Block SPIRONITE_ORE = registerBlock("spironite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK).requiresTool().hardness(1.5f)), ModItemGroup.GEMPERIENCE);
    //endregion

    //region GRINDERS

    public static GemGrinder GEM_GRINDER_TIER_1 = (GemGrinder) registerBlock("gem_grinder_tier_1",
            new GemGrinder(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(Blocks.STONE.getHardness()), (byte) 1), ModItemGroup.GEMPERIENCE);

    public static GemGrinder GEM_GRINDER_TIER_2 = (GemGrinder) registerBlock("gem_grinder_tier_2",
            new GemGrinder(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(Blocks.STONE.getHardness()), (byte) 2), ModItemGroup.GEMPERIENCE);

    //endregion

    //region Kiln
    public static Kiln KILN = (Kiln) registerBlock("kiln",
            new Kiln(FabricBlockSettings.copyOf(Blocks.FURNACE)), ModItemGroup.GEMPERIENCE);
    //endregion

    //region BLOCKS
    public static final Block DYANITE_BLOCK = registerBlock("dyanite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block RAW_DYANITE_BLOCK = registerBlock("raw_dyanite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static final Block ANTHOLIUM_BLOCK = registerBlock("antholium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.CORAL).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static final Block SPIRONITE_BLOCK = registerBlock("spironite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.GLASS).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static RedstoneEmittingBlock RUNIAN_BLOCK = (RedstoneEmittingBlock) registerBlock("runian_block",
            new RedstoneEmittingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool()
                    .luminance(Blocks.SEA_LANTERN.getDefaultState().getLuminance()), 9), ModItemGroup.GEMPERIENCE);
    public static GlazedTerracottaBlock BIOLIUM_BLOCK = (GlazedTerracottaBlock) registerBlock("biolium_block",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool()
                    .sounds(BlockSoundGroup.FROGLIGHT)
                    .luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())), ModItemGroup.GEMPERIENCE);

    public static final Block PETRINITE_BLOCK = registerBlock("petrinite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)
                    .sounds(BlockSoundGroup.MUD)
                    .requiresTool()), ModItemGroup.GEMPERIENCE);
    public static final Block GLAZONIUM_BLOCK = registerBlock("glazonium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static final Block COBGALITE_BLOCK = registerBlock("cobgalite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static final Block SLAGODITE_BLOCK = registerBlock("slagodite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool()
                    .luminance(4)),
            ModItemGroup.GEMPERIENCE);
    public static final Block DENARIUM_BLOCK = registerBlock("denarium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block CHITINOUS_MASS = registerBlock("chitinous_mass",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
                    .sounds(BlockSoundGroup.BONE)
                    .requiresTool()), ModItemGroup.GEMPERIENCE);

    public static GlazedTerracottaBlock JADESTONE_BLOCK = (GlazedTerracottaBlock) registerBlock("jadestone_block",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static final Block AMALGAMITE_BLOCK = registerBlock("amalgamite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)
                    .sounds(BlockSoundGroup.NETHERITE)
                    .requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static FallingBlock RUBY_DUST_BLOCK = (FallingBlock) registerBlock("ruby_dust_block",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND)), ModItemGroup.GEMPERIENCE);

    public static CherryBombBlock CHERRY_BOMB = (CherryBombBlock) registerBlock("cherry_bomb",
            new CherryBombBlock(FabricBlockSettings.copyOf(Blocks.TNT)), ModItemGroup.GEMPERIENCE);

    public static final Block DENITIN_BLOCK = registerFireProofBlock("denitin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.BONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final SlowMovementBlock ECHOCRINE_GLOB = (SlowMovementBlock) registerBlock("echocrine_glob",
            new SlowMovementBlock(FabricBlockSettings.copyOf(Blocks.STONE).velocityMultiplier(.6f).sounds(BlockSoundGroup.SLIME)), ModItemGroup.GEMPERIENCE);

    public static final Block ECHOCRINE_STONE = registerBlock("echocrine_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.NETHERRACK)), ModItemGroup.GEMPERIENCE);
    public static final StairsBlock ECHOCRINE_STONE_STAIRS = (StairsBlock) registerBlock("echocrine_stone_stairs",
            new StairsBlock(ECHOCRINE_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_STAIRS)), ModItemGroup.GEMPERIENCE);
    public static final SlabBlock ECHOCRINE_STONE_SLAB = (SlabBlock) registerBlock("echocrine_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ECHOCRINE_STONE)), ModItemGroup.GEMPERIENCE);
    public static final WallBlock ECHOCRINE_STONE_WALL = (WallBlock) registerBlock("echocrine_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(ECHOCRINE_STONE)), ModItemGroup.GEMPERIENCE);
    public static final Block POLISHED_ECHOCRINE_STONE = registerBlock("polished_echocrine_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).sounds(BlockSoundGroup.NETHERRACK)), ModItemGroup.GEMPERIENCE);
    public static final StairsBlock POLISHED_ECHOCRINE_STONE_STAIRS = (StairsBlock) registerBlock("polished_echocrine_stone_stairs",
            new StairsBlock(ECHOCRINE_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_STAIRS)), ModItemGroup.GEMPERIENCE);
    public static final SlabBlock POLISHED_ECHOCRINE_STONE_SLAB = (SlabBlock) registerBlock("polished_echocrine_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(POLISHED_ECHOCRINE_STONE)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock POLISHED_ECHOCRINE_STONE_WALL = (WallBlock) registerBlock("polished_echocrine_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(POLISHED_ECHOCRINE_STONE)), ModItemGroup.GEMPERIENCE);

    public static final Block ECHOCRINE_STONE_BRICKS = registerBlock("echocrine_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).sounds(BlockSoundGroup.NETHERRACK)), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock ECHOCRINE_STONE_BRICK_STAIRS = (StairsBlock) registerBlock("echocrine_stone_brick_stairs",
            new StairsBlock(ECHOCRINE_STONE.getDefaultState(), FabricBlockSettings.copyOf(ECHOCRINE_STONE_BRICKS)), ModItemGroup.GEMPERIENCE);
    public static final SlabBlock ECHOCRINE_STONE_BRICK_SLAB = (SlabBlock) registerBlock("echocrine_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ECHOCRINE_STONE_BRICKS)), ModItemGroup.GEMPERIENCE);
    public static final WallBlock ECHOCRINE_STONE_BRICK_WALL = (WallBlock) registerBlock("echocrine_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ECHOCRINE_STONE_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final PillarBlock ECHOCRINE_STONE_PILLAR = (PillarBlock) registerBlock("echocrine_stone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).sounds(BlockSoundGroup.NETHERRACK)), ModItemGroup.GEMPERIENCE);

    public static final PillarBlock CHISELED_ECHOCRINE_STONE = (PillarBlock) registerBlock("chiseled_echocrine_stone",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE).sounds(BlockSoundGroup.NETHERRACK)), ModItemGroup.GEMPERIENCE);

    public static final Block VOIDSTONE = registerBlock("voidstone",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock VOIDSTONE_STAIRS = (StairsBlock) registerBlock("voidstone_stairs",
            new StairsBlock(VOIDSTONE.getDefaultState(), FabricBlockSettings.copyOf(VOIDSTONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock VOIDSTONE_SLAB = (SlabBlock) registerBlock("voidstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(VOIDSTONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final WallBlock VOIDSTONE_WALL = (WallBlock) registerBlock("voidstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(VOIDSTONE)), ModItemGroup.GEMPERIENCE);

    public static final Block POLISHED_VOIDSTONE = registerBlock("polished_voidstone",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock POLISHED_VOIDSTONE_STAIRS = (StairsBlock) registerBlock("polished_voidstone_stairs",
            new StairsBlock(POLISHED_VOIDSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock POLISHED_VOIDSTONE_SLAB = (SlabBlock) registerBlock("polished_voidstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(POLISHED_VOIDSTONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final WallBlock POLISHED_VOIDSTONE_WALL = (WallBlock) registerBlock("polished_voidstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(POLISHED_VOIDSTONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block VOIDSTONE_BRICKS = registerBlock("voidstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock VOIDSTONE_BRICK_STAIRS = (StairsBlock) registerBlock("voidstone_brick_stairs",
            new StairsBlock(VOIDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(VOIDSTONE_BRICKS).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock VOIDSTONE_BRICK_SLAB = (SlabBlock) registerBlock("voidstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(VOIDSTONE_BRICKS).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final WallBlock VOIDSTONE_BRICK_WALL = (WallBlock) registerBlock("voidstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(VOIDSTONE_BRICKS).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block SOULSTONE = registerBlock("soulstone",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock SOULSTONE_STAIRS = (StairsBlock) registerBlock("soulstone_stairs",
            new StairsBlock(SOULSTONE.getDefaultState(), FabricBlockSettings.copyOf(SOULSTONE)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock SOULSTONE_SLAB = (SlabBlock) registerBlock("soulstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(SOULSTONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final WallBlock SOULSTONE_WALL = (WallBlock) registerBlock("soulstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(SOULSTONE)), ModItemGroup.GEMPERIENCE);

    public static final Block SMOOTH_SOULSTONE = registerBlock("smooth_soulstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ).sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock SMOOTH_SOULSTONE_STAIRS = (StairsBlock) registerBlock("smooth_soulstone_stairs",
            new StairsBlock(SMOOTH_SOULSTONE.getDefaultState(), FabricBlockSettings.copyOf(SMOOTH_SOULSTONE)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock SMOOTH_SOULSTONE_SLAB = (SlabBlock) registerBlock("smooth_soulstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_SOULSTONE)), ModItemGroup.GEMPERIENCE);

    public static final Block CUT_SOULSTONE = registerBlock("cut_soulstone",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.STONE)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock CUT_SOULSTONE_SLAB = (SlabBlock) registerBlock("cut_soulstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(CUT_SOULSTONE).sounds(BlockSoundGroup.STONE)), ModItemGroup.GEMPERIENCE);

    public static final Block CHISELED_SOULSTONE = registerBlock("chiseled_soulstone",
            new Block(FabricBlockSettings.copyOf(SOULSTONE)), ModItemGroup.GEMPERIENCE);

    public static final Block CHARGED_SOULSTONE = registerBlock("charged_soulstone",
            new Block(FabricBlockSettings.copyOf(SOULSTONE).requiresTool().luminance(3)), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock CHARGED_SOULSTONE_STAIRS = (StairsBlock) registerBlock("charged_soulstone_stairs",
            new StairsBlock(SOULSTONE.getDefaultState(), FabricBlockSettings.copyOf(SOULSTONE_STAIRS).luminance(3)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock CHARGED_SOULSTONE_SLAB = (SlabBlock) registerBlock("charged_soulstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(SOULSTONE_SLAB).requiresTool().luminance(3)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock CHARGED_SOULSTONE_WALL = (WallBlock) registerBlock("charged_soulstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(SOULSTONE_WALL).luminance(3)), ModItemGroup.GEMPERIENCE);

    public static final Block CHARGED_CUT_SOULSTONE = registerBlock("charged_cut_soulstone",
            new Block(FabricBlockSettings.copyOf(SOULSTONE).requiresTool().luminance(3)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock CHARGED_CUT_SOULSTONE_SLAB = (SlabBlock) registerBlock("charged_cut_soulstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(SOULSTONE_SLAB).requiresTool().luminance(3)), ModItemGroup.GEMPERIENCE);

    public static final Block CHARGED_CHISELED_SOULSTONE = registerBlock("charged_chiseled_soulstone",
            new Block(FabricBlockSettings.copyOf(SOULSTONE).requiresTool().luminance(3)), ModItemGroup.GEMPERIENCE);

    public static final Block NEUROSTONE = registerBlock("neurostone",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.TUFF).luminance(5).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock NEUROSTONE_STAIRS = (StairsBlock) registerBlock("neurostone_stairs",
            new StairsBlock(NEUROSTONE.getDefaultState(), FabricBlockSettings.copyOf(NEUROSTONE)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock NEUROSTONE_SLAB = (SlabBlock) registerBlock("neurostone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(NEUROSTONE)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock NEUROSTONE_WALL = (WallBlock) registerBlock("neurostone_wall",
            new WallBlock(FabricBlockSettings.copyOf(NEUROSTONE)), ModItemGroup.GEMPERIENCE);

    public static final Block POLISHED_NEUROSTONE = registerBlock("polished_neurostone",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).sounds(BlockSoundGroup.TUFF).luminance(5)), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock POLISHED_NEUROSTONE_STAIRS = (StairsBlock) registerBlock("polished_neurostone_stairs",
            new StairsBlock(POLISHED_NEUROSTONE.getDefaultState(), FabricBlockSettings.copyOf(POLISHED_NEUROSTONE)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock POLISHED_NEUROSTONE_SLAB = (SlabBlock) registerBlock("polished_neurostone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(POLISHED_NEUROSTONE)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock POLISHED_NEUROSTONE_WALL = (WallBlock) registerBlock("polished_neurostone_wall",
            new WallBlock(FabricBlockSettings.copyOf(POLISHED_NEUROSTONE)), ModItemGroup.GEMPERIENCE);

    public static final Block NEUROSTONE_BRICKS = registerBlock("neurostone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.TUFF).requiresTool().luminance(5)), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock NEUROSTONE_BRICK_STAIRS = (StairsBlock) registerBlock("neurostone_brick_stairs",
            new StairsBlock(NEUROSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(NEUROSTONE_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock NEUROSTONE_BRICK_SLAB = (SlabBlock) registerBlock("neurostone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(NEUROSTONE_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock NEUROSTONE_BRICK_WALL = (WallBlock) registerBlock("neurostone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(NEUROSTONE_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final Block MARROWSHALE = registerBlock("marrowshale",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.BONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock MARROWSHALE_STAIRS = (StairsBlock) registerBlock("marrowshale_stairs",
            new StairsBlock(MARROWSHALE.getDefaultState(), FabricBlockSettings.copyOf(MARROWSHALE)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock MARROWSHALE_SLAB = (SlabBlock) registerBlock("marrowshale_slab",
            new SlabBlock(FabricBlockSettings.copyOf(MARROWSHALE)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock MARROWSHALE_WALL = (WallBlock) registerBlock("marrowshale_wall",
            new WallBlock(FabricBlockSettings.copyOf(MARROWSHALE)), ModItemGroup.GEMPERIENCE);

    public static final Block POLISHED_MARROWSHALE = registerBlock("polished_marrowshale",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).sounds(BlockSoundGroup.BONE)), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock POLISHED_MARROWSHALE_STAIRS = (StairsBlock) registerBlock("polished_marrowshale_stairs",
            new StairsBlock(POLISHED_MARROWSHALE.getDefaultState(), FabricBlockSettings.copyOf(POLISHED_MARROWSHALE)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock POLISHED_MARROWSHALE_SLAB = (SlabBlock) registerBlock("polished_marrowshale_slab",
            new SlabBlock(FabricBlockSettings.copyOf(POLISHED_MARROWSHALE)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock POLISHED_MARROWSHALE_WALL = (WallBlock) registerBlock("polished_marrowshale_wall",
            new WallBlock(FabricBlockSettings.copyOf(POLISHED_MARROWSHALE)), ModItemGroup.GEMPERIENCE);

    public static final Block MARROWSHALE_BRICKS = registerBlock("marrowshale_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.BONE).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock MARROWSHALE_BRICK_STAIRS = (StairsBlock) registerBlock("marrowshale_brick_stairs",
            new StairsBlock(MARROWSHALE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(MARROWSHALE_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock MARROWSHALE_BRICK_SLAB = (SlabBlock) registerBlock("marrowshale_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(MARROWSHALE_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock MARROWSHALE_BRICK_WALL = (WallBlock) registerBlock("marrowshale_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(MARROWSHALE_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final SlowMovementBlock TAR = (SlowMovementBlock) registerBlock("tar",
            new SlowMovementBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.PACKED_MUD).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final Block TARSHALE = registerBlock("tarshale",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock TARSHALE_STAIRS = (StairsBlock) registerBlock("tarshale_stairs",
            new StairsBlock(TARSHALE.getDefaultState(), FabricBlockSettings.copyOf(TARSHALE)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock TARSHALE_SLAB = (SlabBlock) registerBlock("tarshale_slab",
            new SlabBlock(FabricBlockSettings.copyOf(TARSHALE)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock TARSHALE_WALL = (WallBlock) registerBlock("tarshale_wall",
            new WallBlock(FabricBlockSettings.copyOf(TARSHALE)), ModItemGroup.GEMPERIENCE);

    public static final Block POLISHED_TARSHALE = registerBlock("polished_tarshale",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).sounds(BlockSoundGroup.MUD_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock POLISHED_TARSHALE_STAIRS = (StairsBlock) registerBlock("polished_tarshale_stairs",
            new StairsBlock(POLISHED_TARSHALE.getDefaultState(), FabricBlockSettings.copyOf(POLISHED_TARSHALE)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock POLISHED_TARSHALE_SLAB = (SlabBlock) registerBlock("polished_tarshale_slab",
            new SlabBlock(FabricBlockSettings.copyOf(POLISHED_TARSHALE)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock POLISHED_TARSHALE_WALL = (WallBlock) registerBlock("polished_tarshale_wall",
            new WallBlock(FabricBlockSettings.copyOf(POLISHED_TARSHALE)), ModItemGroup.GEMPERIENCE);

    public static final Block TARSHALE_BRICKS = registerBlock("tarshale_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock TARSHALE_BRICK_STAIRS = (StairsBlock) registerBlock("tarshale_brick_stairs",
            new StairsBlock(TARSHALE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(TARSHALE_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock TARSHALE_BRICK_SLAB = (SlabBlock) registerBlock("tarshale_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(TARSHALE_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock TARSHALE_BRICK_WALL = (WallBlock) registerBlock("tarshale_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(TARSHALE_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final Block ILLUMINIUM = registerBlock("illuminium",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.CALCITE).luminance(7).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock ILLUMINIUM_STAIRS = (StairsBlock) registerBlock("illuminium_stairs",
            new StairsBlock(ILLUMINIUM.getDefaultState(), FabricBlockSettings.copyOf(ILLUMINIUM)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock ILLUMINIUM_SLAB = (SlabBlock) registerBlock("illuminium_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ILLUMINIUM)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock ILLUMINIUM_WALL = (WallBlock) registerBlock("illuminium_wall",
            new WallBlock(FabricBlockSettings.copyOf(ILLUMINIUM)), ModItemGroup.GEMPERIENCE);

    public static final Block POLISHED_ILLUMINIUM = registerBlock("polished_illuminium",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).sounds(BlockSoundGroup.CALCITE).luminance(7).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock POLISHED_ILLUMINIUM_STAIRS = (StairsBlock) registerBlock("polished_illuminium_stairs",
            new StairsBlock(POLISHED_ILLUMINIUM.getDefaultState(), FabricBlockSettings.copyOf(POLISHED_ILLUMINIUM)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock POLISHED_ILLUMINIUM_SLAB = (SlabBlock) registerBlock("polished_illuminium_slab",
            new SlabBlock(FabricBlockSettings.copyOf(POLISHED_ILLUMINIUM)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock POLISHED_ILLUMINIUM_WALL = (WallBlock) registerBlock("polished_illuminium_wall",
            new WallBlock(FabricBlockSettings.copyOf(POLISHED_ILLUMINIUM)), ModItemGroup.GEMPERIENCE);

    public static final Block ILLUMINIUM_BRICKS = registerBlock("illuminium_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.CALCITE).requiresTool().luminance(7).requiresTool()), ModItemGroup.GEMPERIENCE);

    public static final StairsBlock ILLUMINIUM_BRICK_STAIRS = (StairsBlock) registerBlock("illuminium_brick_stairs",
            new StairsBlock(ILLUMINIUM_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ILLUMINIUM_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final SlabBlock ILLUMINIUM_BRICK_SLAB = (SlabBlock) registerBlock("illuminium_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ILLUMINIUM_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final WallBlock ILLUMINIUM_BRICK_WALL = (WallBlock) registerBlock("illuminium_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ILLUMINIUM_BRICKS)), ModItemGroup.GEMPERIENCE);

    public static final Block ILLUMINIUM_LAMP = registerBlock("illuminium_lamp",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP).luminance(15).requiresTool()), ModItemGroup.GEMPERIENCE);
    public static final SlowMovementBlock ENDBRINE = (SlowMovementBlock) registerBlock("endbrine",
            new SlowMovementBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL).sounds(BlockSoundGroup.SLIME).requiresTool()), ModItemGroup.GEMPERIENCE);
    //region FROGLIGHTS
    public static final PillarBlock ALIZARIN_FROGLIGHT = (PillarBlock) registerBlock("alizarin_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock APRICOT_FROGLIGHT = (PillarBlock) registerBlock("apricot_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock BYZANTIUM_FROGLIGHT = (PillarBlock) registerBlock("byzantium_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock CARIBBEAN_FROGLIGHT = (PillarBlock) registerBlock("caribbean_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock CARNATION_FROGLIGHT = (PillarBlock) registerBlock("carnation_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock CERULEAN_FROGLIGHT = (PillarBlock) registerBlock("cerulean_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock CIDER_FROGLIGHT = (PillarBlock) registerBlock("cider_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock HARBOR_FROGLIGHT = (PillarBlock) registerBlock("harbor_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock INDIGO_FROGLIGHT = (PillarBlock) registerBlock("indigo_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock JADE_FROGLIGHT = (PillarBlock) registerBlock("jade_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock PEARL_FROGLIGHT = (PillarBlock) registerBlock("pearl_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock PEWTER_FROGLIGHT = (PillarBlock) registerBlock("pewter_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);

    public static final PillarBlock UMBRAL_FROGLIGHT = (PillarBlock) registerBlock("umbral_froglight",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.PEARLESCENT_FROGLIGHT).luminance(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState().getLuminance())),
            ModItemGroup.GEMPERIENCE);
    //endregion
    //endregion


    public static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Gemperience.MODID, name), block);
    }

    public static Block registerFireProofBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerFireProofBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Gemperience.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Gemperience.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(item);
        });
        return item;
    }

    private static Item registerFireProofBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Gemperience.MODID, name),
                new BlockItem(block, new FabricItemSettings().fireproof()));
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(item);
        });
        return item;
    }

    public static void registerModBlocks() {
        System.out.println("Registering blocks for " + Gemperience.MODID);
    }
}
