package com.gemperience.entity;

import com.gemperience.Gemperience;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<CherryBombEntity> CHERRY_BOMB_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Gemperience.MODID, "cherry_bomb"),
            FabricEntityTypeBuilder.<CherryBombEntity>create(SpawnGroup.MISC, CherryBombEntity::new)
                    .dimensions(EntityDimensions.fixed(0.98f, .98f)).build());


    public static void registerModEntities(){
        System.out.println("Registering mod entities for " + Gemperience.MODID);
    }

}
