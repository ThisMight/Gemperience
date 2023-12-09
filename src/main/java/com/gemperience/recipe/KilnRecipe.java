package com.gemperience.recipe;

import com.gemperience.blocks.ModBlocks;
import com.gemperience.items.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.minecraft.util.Identifier;

public class KilnRecipe extends AbstractCookingRecipe {
    public KilnRecipe(Identifier id, String group, CookingRecipeCategory category, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(ModRecipeTypes.KILN_RECIPE_TYPE, id, group, category, input, output, experience, cookTime);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.KILN);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializers.KILN_RECIPE_SERIALIZER;
    }
}
