package com.gemperience.projectiles.dispensebehaviours;

import com.gemperience.projectiles.ChitinBombProjectile;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class ChitinBombDispenseBehaviour extends ProjectileDispenserBehavior {
    @Override
    protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
        return new ChitinBombProjectile(world, position.getX(), position.getY(), position.getZ());
    }
}
