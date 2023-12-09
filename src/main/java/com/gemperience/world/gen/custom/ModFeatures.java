package com.gemperience.world.gen.custom;

import com.gemperience.Gemperience;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public abstract class ModFeatures <FC extends FeatureConfig>  {
    public static final RunianLikeOreFeature<OreFeatureConfig> RUNIAN_LIKE = Registry.register(Registries.FEATURE,
            Gemperience.MODID + ":runian_ore_gen_feature", new RunianLikeOreFeature<OreFeatureConfig>(OreFeatureConfig.CODEC));

    public static final SoulstoneOreFeature<OreFeatureConfig> SOULSTONE = Registry.register(Registries.FEATURE,
            Gemperience.MODID + ":soulstone_ore_gen_feature", new SoulstoneOreFeature<OreFeatureConfig>(OreFeatureConfig.CODEC));

    public static final NeurostoneOreFeature<OreFeatureConfig> NEUROSTONE = Registry.register(Registries.FEATURE,
            Gemperience.MODID + ":neurostone_ore_gen_feature", new NeurostoneOreFeature<OreFeatureConfig>(OreFeatureConfig.CODEC));

    public static final EchocrineGlobOreFeature<OreFeatureConfig> ECHOCRINE_GLOB = Registry.register(Registries.FEATURE,
            Gemperience.MODID + ":echocrine_glob_gen_feature", new EchocrineGlobOreFeature<OreFeatureConfig>(OreFeatureConfig.CODEC));

    public static final GlazoniumOreFeature<OreFeatureConfig> GLAZONIUM = Registry.register(Registries.FEATURE,
            Gemperience.MODID + ":glazonium_ore_gen_feature", new GlazoniumOreFeature<OreFeatureConfig>(OreFeatureConfig.CODEC));

    public static void RegisterFeatures(){
        System.out.println("Registering modFeatures.");
    }
}
