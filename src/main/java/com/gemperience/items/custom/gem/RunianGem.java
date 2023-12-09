package com.gemperience.items.custom.gem;

import com.gemperience.blocks.ModBlocks;
import com.gemperience.items.custom.AbstractGemItem;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;

public class RunianGem extends AbstractGemItem {
    public RunianGem(Settings settings) {
        super(settings);
    }

    @Override
    public void crushGem(ServerWorld world, BlockPos pos) {
        world.playSound(null, pos, SoundEvents.BLOCK_SOUL_SAND_BREAK, SoundCategory.BLOCKS, .75f, 1);
        world.playSound(null, pos, SoundEvents.BLOCK_DEEPSLATE_BREAK, SoundCategory.BLOCKS, .75f, 1);
        world.playSound(null, pos, SoundEvents.PARTICLE_SOUL_ESCAPE, SoundCategory.BLOCKS, .75f, 1);
        //Soul particles
        world.spawnParticles(ParticleTypes.SOUL,pos.getX() + .5, pos.getY() + .6, pos.getZ() + .5,
                3,
                0, 0, 0,
                .2);
        //Block particles
        world.spawnParticles(
                new BlockStateParticleEffect(ParticleTypes.BLOCK, ModBlocks.RUNIAN_BLOCK.getDefaultState()),
                pos.getX() + .5, pos.getY() + .6, pos.getZ() + .5,
                4,
                0, 0, 0,
                5);
    }
}
