package com.gemperience.world.gen.custom;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class NeurostoneOreFeature<FC extends OreFeatureConfig> extends OreFeature {

    public static NeurostoneOreFeature<NeurostoneOreFeatureConfig> INSTANCE = new NeurostoneOreFeature<NeurostoneOreFeatureConfig>(OreFeatureConfig.CODEC);

    public NeurostoneOreFeature(Codec<OreFeatureConfig> codec) {
        super(codec);
    }

    //Generate only if air is above the origin on the generation origin. If so, send it over to the ore gen.
    @Override
    public boolean generate(FeatureContext<OreFeatureConfig> context) {
        if (context.getWorld().getBlockState(context.getOrigin().up(1)) == Blocks.WATER.getDefaultState()){
            return ORE.generate(context);
        }
        return false;
    }
}