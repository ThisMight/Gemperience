package com.gemperience.world.gen.custom;

import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class NeurostoneOreFeatureConfig extends OreFeatureConfig implements FeatureConfig {

    public NeurostoneOreFeatureConfig(List<OreFeatureConfig.Target> targets, int size) {
        super(targets, size);
    }
}