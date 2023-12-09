package com.gemperience.projectiles;

import com.gemperience.Gemperience;
import com.gemperience.items.ModItems;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class ChitinBombProjectile extends ThrownItemEntity {

    public ChitinBombProjectile(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public ChitinBombProjectile(EntityType<? extends ThrownItemEntity> entityType, double d, double e, double f, World world) {
        super(entityType, d, e, f, world);
    }

    public ChitinBombProjectile(LivingEntity livingEntity, World world) {
        super(Gemperience.CHITIN_BOMB_PROJECTILE_ENTITY_TYPE, livingEntity, world);
    }

    public ChitinBombProjectile(World world, double x, double y, double z) {
        super(Gemperience.CHITIN_BOMB_PROJECTILE_ENTITY_TYPE, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.CHITIN_BOMB; // We will configure this later, once we have created the ProjectileItem.
    }

    protected void onEntityHit(EntityHitResult entityHitResult) { // called on entity hit.
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity(); // sets a new Entity instance as the EntityHitResult (victim)

        if (entity instanceof LivingEntity livingEntity) { // checks if entity is an instance of LivingEntity (meaning it is not a boat or minecart)
            livingEntity.getWorld().createExplosion(this, this.getX(), this.getY(), this.getZ(), 1.75f, World.ExplosionSourceType.NONE);
        }
    }

    protected void onCollision(HitResult hitResult) { // called on collision with a block
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) { // checks if the world is client
            this.getWorld().sendEntityStatus(this, (byte)3); // particle?
            this.getWorld().createExplosion(this, this.getX(), this.getY(), this.getZ(), 1.75f, World.ExplosionSourceType.NONE);
            this.kill(); // kills the projectile
        }

    }


}
