package com.gemperience.entity;

import com.gemperience.entity.custom.GenericTntEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.*;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CherryBombEntity extends GenericTntEntity {

    public CherryBombEntity(EntityType<? extends Entity> entityType, World world, double x, double y, double z, @Nullable LivingEntity igniter) {
        super(entityType, world, x, y, z, igniter);
    }

    public CherryBombEntity(World world) {
        super(world);
    }

    public CherryBombEntity(EntityType<? extends Entity> entityType, World world) {
        super(entityType, world);
    }

    public CherryBombEntity(World world, double x, double y, double z, LivingEntity causingEntity) {
        super(ModEntities.CHERRY_BOMB_ENTITY_TYPE, world, x, y, z, causingEntity);
    }
}
