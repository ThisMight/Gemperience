package com.gemperience.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SlowMovementBlock extends Block {
    public SlowMovementBlock(Settings settings) {
        super(settings);
    }

    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        double absoluteVelocity = Math.abs(entity.getVelocity().y);
        if (absoluteVelocity < 0.1 && !entity.bypassesSteppingEffects()) {
            double slowedDownVelocity = 0.4 + absoluteVelocity * 0.2;
            entity.setVelocity(entity.getVelocity().multiply(slowedDownVelocity, 1.0, slowedDownVelocity));
        }

        super.onSteppedOn(world, pos, state, entity);
    }

}
