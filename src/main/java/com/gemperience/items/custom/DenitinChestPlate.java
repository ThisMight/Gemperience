package com.gemperience.items.custom;

import net.minecraft.entity.Entity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class DenitinChestPlate extends ArmorItem {
    public DenitinChestPlate(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
       //Guard clause for performance
        if (slot != 2) { return; }

        if (entity instanceof ServerPlayerEntity player){
            if (!world.isClient && world instanceof ServerWorld serverWorld && entity.horizontalSpeed == 0){
                serverWorld.spawnParticles(ParticleTypes.PORTAL,
                        entity.getX(), entity.getY(), entity.getZ(),
                        2,
                        0,0,0, .2);
            }
        }
    }
}
