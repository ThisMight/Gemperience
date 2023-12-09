package com.gemperience.items.custom;

import net.minecraft.item.Item;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public abstract class AbstractGemItem extends Item {

    public abstract void crushGem(ServerWorld world, BlockPos pos);

    public AbstractGemItem(Settings settings) {
        super(settings);
    }
}
