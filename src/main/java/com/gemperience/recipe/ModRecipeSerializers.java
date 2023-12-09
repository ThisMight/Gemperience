package com.gemperience.recipe;

import com.gemperience.Gemperience;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipeSerializers {

    public static final RecipeSerializer<KilnRecipe> KILN_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, new Identifier(Gemperience.MODID, "kiln_recipe_serializer"),
            new CookingRecipeSerializer<>(KilnRecipe::new, 200));

    public static void registerModRecipeSerializers(){

    }
}
