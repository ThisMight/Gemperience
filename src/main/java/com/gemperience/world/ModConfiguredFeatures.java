package com.gemperience.world;

import com.gemperience.Gemperience;
import com.gemperience.blocks.ModBlocks;
import com.gemperience.world.gen.custom.*;
import net.minecraft.block.Blocks;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> DYANITE_ORE_KEY = registryKey("dyanite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SLAGODITE_ORE_KEY = registryKey("slagodite_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMALGAMITE_ORE_KEY = registryKey("amalgamite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUNIAN_ORE_KEY = registryKey("runian_gen_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JADESTONE_ORE_KEY = registryKey("jadestone_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPIRONITE_ORE_KEY = registryKey("spironite_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PETRINITE_ORE_MUD_KEY = registryKey("petrinite_ore_mud_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PETRINITE_ORE_CLAY_KEY = registryKey("petrinite_ore_clay_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANTHOLIUM_ORE_SAND_KEY = registryKey("antholium_ore_sand_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENARIUM_ORE_KEY = registryKey("denarium_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GLAZONIUM_ORE_KEY = registryKey("glazonium_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHITEN_ORE_KEY = registryKey("chiten_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBGALITE_ORE_KEY = registryKey("cobgalite_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SLAGODITE_BASALT_KEY = registryKey("slagodite_basalt_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registryKey("ruby_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BIOLIUM_ORE_KEY = registryKey("biolium_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VOIDSTONE_ORE_KEY = registryKey("voidstone_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NEUROSTONE_ORE_KEY = registryKey("neurostone_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOULSTONE_ORE_KEY = registryKey("soulstone_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ECHOCRINE_GLOB_ORE_KEY = registryKey("echocrine_glob_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ILLUMINIUM_KEY = registryKey("illuminium_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TAR_KEY = registryKey("tar_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENDBRINE_KEY = registryKey("endbrine_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MARROWSHALE_KEY = registryKey("marrowshale_key");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context){

        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest soilReplacables = new BlockMatchRuleTest(Blocks.SOUL_SOIL);
        RuleTest soulsandReplaces = new BlockMatchRuleTest(Blocks.SOUL_SAND);
        RuleTest snowReplacables = new BlockMatchRuleTest(Blocks.SNOW_BLOCK);
        RuleTest mudReplacables = new BlockMatchRuleTest(Blocks.MUD);
        RuleTest clayReplacables = new BlockMatchRuleTest(Blocks.CLAY);
        RuleTest sandReplacables = new BlockMatchRuleTest(Blocks.SAND);
        RuleTest basaltReplaceables = new BlockMatchRuleTest(Blocks.BASALT);
        RuleTest endStoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);
        RuleTest netherrackReplaceables = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest sculkRecplaceables = new BlockMatchRuleTest(Blocks.SCULK);

        List<OreFeatureConfig.Target> dyaniteores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.DYANITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_DYANITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> amalgamiteores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.AMALGAMITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> chiten =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SCULK_CHITIN_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> runiangeneration =
                List.of(OreFeatureConfig.createTarget(soilReplacables, ModBlocks.RUNIAN_ORE_SOIL.getDefaultState()),
                        OreFeatureConfig.createTarget(soulsandReplaces, ModBlocks.RUNIAN_ORE_SAND.getDefaultState()));

        List<OreFeatureConfig.Target> jadestone =
                List.of(OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.NETHERRACK), ModBlocks.JADESTONE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> spironite =
                List.of(OreFeatureConfig.createTarget(snowReplacables, ModBlocks.SPIRONITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> petrinite_mud =
                List.of(OreFeatureConfig.createTarget(mudReplacables, ModBlocks.PETRINITE_MUD.getDefaultState()));

        List<OreFeatureConfig.Target> petrinite_clay =
                List.of(OreFeatureConfig.createTarget(clayReplacables, ModBlocks.PETRINITE_CLAY.getDefaultState()));

        List<OreFeatureConfig.Target> antholium_sand =
                List.of(OreFeatureConfig.createTarget(sandReplacables, ModBlocks.ANTHOLIUM_ORE_SAND.getDefaultState()));

        List<OreFeatureConfig.Target> denarium =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, ModBlocks.DENARIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> cobgalite =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_COBGALITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> basaltSlagodite =
                List.of(OreFeatureConfig.createTarget(basaltReplaceables, ModBlocks.SLAGODITE_ORE_BASALT.getDefaultState()));

        List<OreFeatureConfig.Target> slagoditenethherack =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, ModBlocks.SLAGODITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> bioliumnetherrack =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, ModBlocks.BIOLIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> voidstone =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.VOIDSTONE.getDefaultState()));

        List<OreFeatureConfig.Target> neurostone =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.NEUROSTONE.getDefaultState()));

        List<OreFeatureConfig.Target> soulstone =
                List.of(OreFeatureConfig.createTarget(soilReplacables, ModBlocks.SOULSTONE.getDefaultState()),
                        OreFeatureConfig.createTarget(soulsandReplaces, ModBlocks.SOULSTONE.getDefaultState()));

        List<OreFeatureConfig.Target> echocrine_glob =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ECHOCRINE_GLOB.getDefaultState()),
                        OreFeatureConfig.createTarget(sculkRecplaceables, ModBlocks.ECHOCRINE_GLOB.getDefaultState()));

        List<OreFeatureConfig.Target> rubyOre =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> illuminium =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, ModBlocks.ILLUMINIUM.getDefaultState()));

        List<OreFeatureConfig.Target> tar =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TAR.getDefaultState()));

        List<OreFeatureConfig.Target> endbrine =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, ModBlocks.ENDBRINE.getDefaultState()));

        List<OreFeatureConfig.Target> marrowshale =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, ModBlocks.MARROWSHALE.getDefaultState()));

        List<OreFeatureConfig.Target> glazonium =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, ModBlocks.GLAZONIUM_ORE.getDefaultState()));



        register(context, DYANITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(dyaniteores, 6));
        register(context, AMALGAMITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(amalgamiteores, 6));
        register(context, SOULSTONE_ORE_KEY, ModFeatures.SOULSTONE, new OreFeatureConfig(soulstone, 64));
        register(context, RUNIAN_ORE_KEY, ModFeatures.RUNIAN_LIKE, new OreFeatureConfig(runiangeneration,12));
        register(context, JADESTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(jadestone, 7));
        register(context, SPIRONITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(spironite, 20));
        register(context, PETRINITE_ORE_CLAY_KEY, Feature.ORE, new OreFeatureConfig(petrinite_clay, 12));
        register(context, PETRINITE_ORE_MUD_KEY, Feature.ORE, new OreFeatureConfig(petrinite_mud, 12));
        register(context, ANTHOLIUM_ORE_SAND_KEY, Feature.ORE, new OreFeatureConfig(antholium_sand, 12));
        register(context, DENARIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(denarium, 4));
        register(context, CHITEN_ORE_KEY, Feature.ORE, new OreFeatureConfig(chiten, 16));
        register(context, COBGALITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(cobgalite, 12));
        register(context, SLAGODITE_BASALT_KEY, Feature.ORE, new OreFeatureConfig(basaltSlagodite, 12));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(rubyOre, 6));
        register(context, SLAGODITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(slagoditenethherack, 6));
        register(context, BIOLIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(bioliumnetherrack, 8));
        register(context, VOIDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(voidstone, 64));
        register(context, NEUROSTONE_ORE_KEY, ModFeatures.NEUROSTONE, new NeurostoneOreFeatureConfig(neurostone, 32));
        register(context, ECHOCRINE_GLOB_ORE_KEY, ModFeatures.ECHOCRINE_GLOB, new EchocrineGlobOreFeatureConfig(echocrine_glob, 32));
        register(context, ILLUMINIUM_KEY, Feature.ORE, new OreFeatureConfig(illuminium, 32));
        register(context, TAR_KEY, Feature.ORE, new OreFeatureConfig(tar, 32));
        register(context, ENDBRINE_KEY, Feature.ORE, new RunianLikeOreFeatureConfig(endbrine, 32));
        register(context, MARROWSHALE_KEY, Feature.ORE, new OreFeatureConfig(marrowshale, 32));
        register(context, GLAZONIUM_ORE_KEY, ModFeatures.GLAZONIUM, new GlazoniumOreFeatureConfig(glazonium, 8));
}

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Gemperience.MODID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>>key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
