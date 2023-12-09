package com.gemperience.blocks.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class RedstoneEmittingBlock extends RedstoneBlock {

    final int REDSTONE_POWER;

    public int getREDSTONE_POWER(){
        return REDSTONE_POWER;
    }

    public RedstoneEmittingBlock(Settings settings, int redstonePower) {
        super(settings);
        REDSTONE_POWER = redstonePower;
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return REDSTONE_POWER;
    }
}
