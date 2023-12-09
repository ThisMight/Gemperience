package com.gemperience.blocks.entity;

import com.gemperience.Gemperience;
import com.gemperience.blocks.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<KilnBlockEntity> KILN_BLOCK_ENTITY_BLOCK_ENTITY_TYPE =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Gemperience.MODID, "kiln"),
                FabricBlockEntityTypeBuilder.create(KilnBlockEntity::new,
                        ModBlocks.KILN).build());

    public static void registerBlockEntities(){
        System.out.println("Registering Block Entities for " + Gemperience.MODID);
    }
}
