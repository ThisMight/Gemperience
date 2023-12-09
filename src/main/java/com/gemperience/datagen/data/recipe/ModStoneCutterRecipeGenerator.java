package com.gemperience.datagen.data.recipe;

import com.gemperience.blocks.ModBlocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModStoneCutterRecipeGenerator {
    public void generateStoneCuttingRecipes(Consumer<RecipeJsonProvider> exporter, ModRecipeGenerator gen){
        //region Special blocks
        //region echocrine
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ECHOCRINE_STONE, ModBlocks.ECHOCRINE_STONE);

        gen.offerChiseledBlockRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.CHISELED_ECHOCRINE_STONE, ModBlocks.ECHOCRINE_STONE_SLAB);

        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_BRICKS, ModBlocks.ECHOCRINE_STONE);

        //Bricks to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_BRICK_STAIRS, ModBlocks.ECHOCRINE_STONE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_BRICK_SLAB, ModBlocks.ECHOCRINE_STONE_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_BRICK_WALL, ModBlocks.ECHOCRINE_STONE_BRICKS);

        //Stone to special blocks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_PILLAR, ModBlocks.ECHOCRINE_STONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_PILLAR, ModBlocks.ECHOCRINE_STONE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_PILLAR, ModBlocks.POLISHED_ECHOCRINE_STONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_ECHOCRINE_STONE, ModBlocks.ECHOCRINE_STONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_ECHOCRINE_STONE, ModBlocks.ECHOCRINE_STONE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_ECHOCRINE_STONE, ModBlocks.POLISHED_ECHOCRINE_STONE);

        //Stone to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_BRICK_STAIRS, ModBlocks.ECHOCRINE_STONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_BRICK_SLAB, ModBlocks.ECHOCRINE_STONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_BRICK_WALL, ModBlocks.ECHOCRINE_STONE);

        //Stone to Stone
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_STAIRS, ModBlocks.ECHOCRINE_STONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_SLAB, ModBlocks.ECHOCRINE_STONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ECHOCRINE_STONE_WALL, ModBlocks.ECHOCRINE_STONE);

        //Stone to Polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ECHOCRINE_STONE, ModBlocks.ECHOCRINE_STONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ECHOCRINE_STONE_SLAB, ModBlocks.ECHOCRINE_STONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ECHOCRINE_STONE_STAIRS, ModBlocks.ECHOCRINE_STONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ECHOCRINE_STONE_WALL, ModBlocks.ECHOCRINE_STONE);
        //Bricks to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ECHOCRINE_STONE_STAIRS, ModBlocks.ECHOCRINE_STONE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ECHOCRINE_STONE_SLAB, ModBlocks.ECHOCRINE_STONE_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ECHOCRINE_STONE_WALL, ModBlocks.ECHOCRINE_STONE_BRICKS);
        //Polished to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ECHOCRINE_STONE_SLAB, ModBlocks.POLISHED_ECHOCRINE_STONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ECHOCRINE_STONE_STAIRS, ModBlocks.POLISHED_ECHOCRINE_STONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ECHOCRINE_STONE_WALL, ModBlocks.POLISHED_ECHOCRINE_STONE);

        //Compacting brick recipe
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHOCRINE_STONE_BRICKS, ModBlocks.POLISHED_ECHOCRINE_STONE);
        //endregion

        //region voidstone
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_VOIDSTONE, ModBlocks.VOIDSTONE);

        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOIDSTONE_BRICKS, ModBlocks.VOIDSTONE);

        //Bricks to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOIDSTONE_BRICK_STAIRS, ModBlocks.VOIDSTONE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOIDSTONE_BRICK_SLAB, ModBlocks.VOIDSTONE_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOIDSTONE_BRICK_WALL, ModBlocks.VOIDSTONE_BRICKS);

        //Stone to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOIDSTONE_BRICK_STAIRS, ModBlocks.VOIDSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOIDSTONE_BRICK_SLAB, ModBlocks.VOIDSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOIDSTONE_BRICK_WALL, ModBlocks.VOIDSTONE);

        //Stone to Stone
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOIDSTONE_STAIRS, ModBlocks.VOIDSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOIDSTONE_SLAB, ModBlocks.VOIDSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.VOIDSTONE_WALL, ModBlocks.VOIDSTONE);

        //Stone to Polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_VOIDSTONE, ModBlocks.VOIDSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_VOIDSTONE_SLAB, ModBlocks.VOIDSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_VOIDSTONE_STAIRS, ModBlocks.VOIDSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_VOIDSTONE_WALL, ModBlocks.VOIDSTONE);
        //Bricks to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_VOIDSTONE_STAIRS, ModBlocks.VOIDSTONE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_VOIDSTONE_SLAB, ModBlocks.VOIDSTONE_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_VOIDSTONE_WALL, ModBlocks.VOIDSTONE_BRICKS);
        //Polished to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_VOIDSTONE_SLAB, ModBlocks.POLISHED_VOIDSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_VOIDSTONE_STAIRS, ModBlocks.POLISHED_VOIDSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_VOIDSTONE_WALL, ModBlocks.POLISHED_VOIDSTONE);

        //Compacting brick recipe
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOIDSTONE_BRICKS, ModBlocks.POLISHED_VOIDSTONE);
        //endregion

        //region neurostone
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NEUROSTONE, ModBlocks.NEUROSTONE);

        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.NEUROSTONE_BRICKS, ModBlocks.NEUROSTONE);

        //Bricks to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.NEUROSTONE_BRICK_STAIRS, ModBlocks.NEUROSTONE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.NEUROSTONE_BRICK_SLAB, ModBlocks.NEUROSTONE_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.NEUROSTONE_BRICK_WALL, ModBlocks.NEUROSTONE_BRICKS);

        //Stone to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.NEUROSTONE_BRICK_STAIRS, ModBlocks.NEUROSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.NEUROSTONE_BRICK_SLAB, ModBlocks.NEUROSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.NEUROSTONE_BRICK_WALL, ModBlocks.NEUROSTONE);

        //Stone to Stone
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.NEUROSTONE_STAIRS, ModBlocks.NEUROSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.NEUROSTONE_SLAB, ModBlocks.NEUROSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.NEUROSTONE_WALL, ModBlocks.NEUROSTONE);

        //Stone to Polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_NEUROSTONE, ModBlocks.NEUROSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_NEUROSTONE_SLAB, ModBlocks.NEUROSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_NEUROSTONE_STAIRS, ModBlocks.NEUROSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_NEUROSTONE_WALL, ModBlocks.NEUROSTONE);
        //Bricks to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_NEUROSTONE_STAIRS, ModBlocks.NEUROSTONE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_NEUROSTONE_SLAB, ModBlocks.NEUROSTONE_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_NEUROSTONE_WALL, ModBlocks.NEUROSTONE_BRICKS);
        //Polished to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_NEUROSTONE_SLAB, ModBlocks.POLISHED_NEUROSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_NEUROSTONE_STAIRS, ModBlocks.POLISHED_NEUROSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_NEUROSTONE_WALL, ModBlocks.POLISHED_NEUROSTONE);

        //Compacting brick recipe
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEUROSTONE_BRICKS, ModBlocks.POLISHED_NEUROSTONE);
        //endregion

        //region soulstone
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_SOULSTONE, ModBlocks.SOULSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SOULSTONE_SLAB, ModBlocks.SOULSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CUT_SOULSTONE, ModBlocks.SOULSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CUT_SOULSTONE_SLAB, ModBlocks.SOULSTONE, 2);

        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CUT_SOULSTONE_SLAB, ModBlocks.CUT_SOULSTONE, 2);

        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_SOULSTONE_SLAB, ModBlocks.SMOOTH_SOULSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_SOULSTONE_STAIRS, ModBlocks.SMOOTH_SOULSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SOULSTONE_STAIRS, ModBlocks.SOULSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SOULSTONE_WALL, ModBlocks.SOULSTONE);

        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHARGED_CHISELED_SOULSTONE, ModBlocks.CHARGED_SOULSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHARGED_SOULSTONE_SLAB, ModBlocks.CHARGED_SOULSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHARGED_CUT_SOULSTONE, ModBlocks.CHARGED_SOULSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHARGED_CUT_SOULSTONE_SLAB, ModBlocks.CHARGED_SOULSTONE, 2);

        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHARGED_CUT_SOULSTONE_SLAB, ModBlocks.CHARGED_CUT_SOULSTONE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHARGED_SOULSTONE_STAIRS, ModBlocks.CHARGED_SOULSTONE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHARGED_SOULSTONE_WALL, ModBlocks.CHARGED_SOULSTONE);
        //endregion

        //region illuminium;
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ILLUMINIUM, ModBlocks.ILLUMINIUM);

        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ILLUMINIUM_BRICKS, ModBlocks.ILLUMINIUM);

        //Bricks to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ILLUMINIUM_BRICK_STAIRS, ModBlocks.ILLUMINIUM_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ILLUMINIUM_BRICK_SLAB, ModBlocks.ILLUMINIUM_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ILLUMINIUM_BRICK_WALL, ModBlocks.ILLUMINIUM_BRICKS);

        //Stone to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ILLUMINIUM_BRICK_STAIRS, ModBlocks.ILLUMINIUM);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ILLUMINIUM_BRICK_SLAB, ModBlocks.ILLUMINIUM, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ILLUMINIUM_BRICK_WALL, ModBlocks.ILLUMINIUM);

        //Stone to Stone
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ILLUMINIUM_STAIRS, ModBlocks.ILLUMINIUM);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ILLUMINIUM_SLAB, ModBlocks.ILLUMINIUM, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ILLUMINIUM_WALL, ModBlocks.ILLUMINIUM);

        //Stone to Polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ILLUMINIUM, ModBlocks.ILLUMINIUM);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ILLUMINIUM_SLAB, ModBlocks.ILLUMINIUM, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ILLUMINIUM_STAIRS, ModBlocks.ILLUMINIUM);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ILLUMINIUM_WALL, ModBlocks.ILLUMINIUM);
        //Bricks to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ILLUMINIUM_STAIRS, ModBlocks.ILLUMINIUM_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ILLUMINIUM_SLAB, ModBlocks.ILLUMINIUM_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ILLUMINIUM_WALL, ModBlocks.ILLUMINIUM_BRICKS);
        //Polished to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ILLUMINIUM_SLAB, ModBlocks.POLISHED_ILLUMINIUM, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ILLUMINIUM_STAIRS, ModBlocks.POLISHED_ILLUMINIUM);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ILLUMINIUM_WALL, ModBlocks.POLISHED_ILLUMINIUM);

        //Compacting brick recipe
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ILLUMINIUM_BRICKS, ModBlocks.POLISHED_ILLUMINIUM);
        //endregion

        //region tarshale;
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TARSHALE, ModBlocks.TARSHALE);

        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TARSHALE_BRICKS, ModBlocks.TARSHALE);

        //Bricks to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TARSHALE_BRICK_STAIRS, ModBlocks.TARSHALE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TARSHALE_BRICK_SLAB, ModBlocks.TARSHALE_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TARSHALE_BRICK_WALL, ModBlocks.TARSHALE_BRICKS);

        //Stone to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TARSHALE_BRICK_STAIRS, ModBlocks.TARSHALE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TARSHALE_BRICK_SLAB, ModBlocks.TARSHALE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TARSHALE_BRICK_WALL, ModBlocks.TARSHALE);

        //Stone to Stone
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TARSHALE_STAIRS, ModBlocks.TARSHALE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TARSHALE_SLAB, ModBlocks.TARSHALE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TARSHALE_WALL, ModBlocks.TARSHALE);

        //Stone to Polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TARSHALE, ModBlocks.TARSHALE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TARSHALE_SLAB, ModBlocks.TARSHALE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TARSHALE_STAIRS, ModBlocks.TARSHALE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TARSHALE_WALL, ModBlocks.TARSHALE);
        //Bricks to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TARSHALE_STAIRS, ModBlocks.TARSHALE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TARSHALE_SLAB, ModBlocks.TARSHALE_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TARSHALE_WALL, ModBlocks.TARSHALE_BRICKS);
        //Polished to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TARSHALE_SLAB, ModBlocks.POLISHED_TARSHALE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TARSHALE_STAIRS, ModBlocks.POLISHED_TARSHALE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TARSHALE_WALL, ModBlocks.POLISHED_TARSHALE);

        //Compacting brick recipe
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TARSHALE_BRICKS, ModBlocks.POLISHED_TARSHALE);
        //endregion

        //region marrowshale;
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARROWSHALE, ModBlocks.MARROWSHALE);

        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARROWSHALE_BRICKS, ModBlocks.MARROWSHALE);

        //Bricks to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARROWSHALE_BRICK_STAIRS, ModBlocks.MARROWSHALE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARROWSHALE_BRICK_SLAB, ModBlocks.MARROWSHALE_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARROWSHALE_BRICK_WALL, ModBlocks.MARROWSHALE_BRICKS);

        //Stone to bricks
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARROWSHALE_BRICK_STAIRS, ModBlocks.MARROWSHALE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARROWSHALE_BRICK_SLAB, ModBlocks.MARROWSHALE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARROWSHALE_BRICK_WALL, ModBlocks.MARROWSHALE);

        //Stone to Stone
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARROWSHALE_STAIRS, ModBlocks.MARROWSHALE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARROWSHALE_SLAB, ModBlocks.MARROWSHALE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MARROWSHALE_WALL, ModBlocks.MARROWSHALE);

        //Stone to Polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARROWSHALE, ModBlocks.MARROWSHALE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARROWSHALE_SLAB, ModBlocks.MARROWSHALE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARROWSHALE_STAIRS, ModBlocks.MARROWSHALE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARROWSHALE_WALL, ModBlocks.MARROWSHALE);
        //Bricks to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARROWSHALE_STAIRS, ModBlocks.MARROWSHALE_BRICKS);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARROWSHALE_SLAB, ModBlocks.MARROWSHALE_BRICKS, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARROWSHALE_WALL, ModBlocks.MARROWSHALE_BRICKS);
        //Polished to polished
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARROWSHALE_SLAB, ModBlocks.POLISHED_MARROWSHALE, 2);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARROWSHALE_STAIRS, ModBlocks.POLISHED_MARROWSHALE);
        gen.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_MARROWSHALE_WALL, ModBlocks.POLISHED_MARROWSHALE);

        //Compacting brick recipe
        gen.offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARROWSHALE_BRICKS, ModBlocks.POLISHED_MARROWSHALE);
        //endregion

    }
}
