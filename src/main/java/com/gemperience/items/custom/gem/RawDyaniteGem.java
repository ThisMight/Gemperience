package com.gemperience.items.custom.gem;

import com.gemperience.blocks.ModBlocks;
import com.gemperience.items.custom.AbstractGemItem;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;

public class RawDyaniteGem extends AbstractGemItem {
    @Override
    public void crushGem(ServerWorld world, BlockPos pos) {
        world.playSound(null, pos, SoundEvents.BLOCK_ANVIL_STEP, SoundCategory.BLOCKS, .75f, 1);
        world.playSound(null, pos, SoundEvents.BLOCK_CHAIN_HIT, SoundCategory.BLOCKS, .75f, 1);
        world.spawnParticles(
                new BlockStateParticleEffect(ParticleTypes.BLOCK, ModBlocks.RAW_DYANITE_BLOCK.getDefaultState()),
                pos.getX() + .5, pos.getY() + .8, pos.getZ() + .5,
                6,
                0, 0, 0,
                5);
    }
    public RawDyaniteGem(Settings settings) {
        super(settings);
    }
}
