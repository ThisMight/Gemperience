package com.gemperience.datagen.data;

import com.gemperience.blocks.ModBlocks;
import com.gemperience.items.ModItemGroup;
import com.gemperience.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DYANITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DENITIN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_DYANITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANTHOLIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PETRINITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUNIAN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLAZONIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMALGAMITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPIRONITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SLAGODITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DENARIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_DUST_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ECHOCRINE_STONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ECHOCRINE_STONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ECHOCRINE_STONE_BRICKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHISELED_ECHOCRINE_STONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ECHOCRINE_GLOB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHITINOUS_MASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOIDSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOIDSTONE_BRICKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_VOIDSTONE);
        //Soulstone is built from JSON
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NEUROSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_NEUROSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NEUROSTONE_BRICKS);

        //Echobrine special blocks are NOT auto generated!

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DYANITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_DYANITE_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMALGAMITE_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_RUBY_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.CARIBBEAN_FROGLIGHT);

        //Nether
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUNIAN_ORE_SAND);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUNIAN_ORE_SOIL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.JADESTONE_ORE);
        //Nether basalt is not auto-generated.

        /*

                CRUSHERS ARE NOT AUTO-GENERATED.

         */

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PETRINITE_CLAY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PETRINITE_MUD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_COBGALITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_SCULK_CHITIN_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLAZONIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SLAGODITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIOLIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DENARIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANTHOLIUM_ORE_SAND);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPIRONITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBGALITE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Gems
        itemModelGenerator.register(ModItems.DYANITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.DENITIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_DYANITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMALGAMITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PETRINITE_BULB, Models.GENERATED);
        itemModelGenerator.register(ModItems.PETRINITE_ROSE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PETRINITE_ROOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANTHOLIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPIRONITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COBGALITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.SCULK_CHITIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLAGODITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNIAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIOLIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHITINOUS_GROWTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.GHAST_TEAR_IN_A_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHITIN_BOMB, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADESTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ECHORINE_PASTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DENARIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLAZONIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DENITIN_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DENITIN_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DENITIN_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DENITIN_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DYANITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DYANITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DYANITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DYANITE_BOOTS, Models.GENERATED);

        // Aquamarine tools
        itemModelGenerator.register(ModItems.DYANITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DYANITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DYANITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DYANITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DYANITE_SWORD, Models.HANDHELD);

        // Denarium tools
        itemModelGenerator.register(ModItems.DENITIN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DENITIN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DENITIN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DENITIN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DENITIN_SWORD, Models.HANDHELD);

        //Hammers
        itemModelGenerator.register(ModItems.WOODEN_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DYANITE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DENITIN_HAMMER, Models.HANDHELD);
    }
}
