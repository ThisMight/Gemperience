package com.gemperience.world.gen.custom;

import com.gemperience.blocks.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.List;

public class GlazoniumOreFeature<FC extends OreFeatureConfig> extends OreFeature {

    public static GlazoniumOreFeature<GlazoniumOreFeatureConfig> INSTANCE = new GlazoniumOreFeature<GlazoniumOreFeatureConfig>(OreFeatureConfig.CODEC);

    public GlazoniumOreFeature(Codec<OreFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(FeatureContext<OreFeatureConfig> context) {
        boolean isUpperLimitValid = false;
        boolean isLowerLimitValid = false;
        int MAX_SEARCH = 20;
        for (int i = 0; i < MAX_SEARCH; i++) {
            if (context.getWorld().getBlockState(context.getOrigin().up(i)) == Blocks.END_STONE.getDefaultState()) {
                isUpperLimitValid = true;
                break;
            }
        }
        if (isUpperLimitValid) {
            for (int i = 0; i < MAX_SEARCH; i++) {
                if (context.getWorld().getBlockState(context.getOrigin().down(i)) == Blocks.END_STONE.getDefaultState()) {
                    isLowerLimitValid = true;
                    break;
                }
            }
        }
        if (isUpperLimitValid && isLowerLimitValid) return ORE.generate(context);
        else return false;
    }
}