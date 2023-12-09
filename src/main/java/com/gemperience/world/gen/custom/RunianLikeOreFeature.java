package com.gemperience.world.gen.custom;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class RunianLikeOreFeature<FC extends OreFeatureConfig> extends OreFeature {

    public static RunianLikeOreFeature<RunianLikeOreFeatureConfig> INSTANCE = new RunianLikeOreFeature<RunianLikeOreFeatureConfig>(OreFeatureConfig.CODEC);

    public RunianLikeOreFeature(Codec<OreFeatureConfig> codec) {
        super(codec);
    }

    //Generate only if air is above the origin on the generation origin. If so, send it over to the ore gen.
    @Override
    public boolean generate(FeatureContext<OreFeatureConfig> context) {
        if (context.getWorld().getBlockState(context.getOrigin().up(1)) == Blocks.AIR.getDefaultState() &&
            context.getWorld().getBlockState(context.getOrigin().down(3)) != Blocks.AIR.getDefaultState()) {
            return ORE.generate(context);
        }
        return false;
    }
}
