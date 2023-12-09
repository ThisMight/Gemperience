package com.gemperience.recipe;

import com.gemperience.Gemperience;
import com.gemperience.blocks.custom.Kiln;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipeTypes {

    public static RecipeType<KilnRecipe> KILN_RECIPE_TYPE = Registry.register(
            Registries.RECIPE_TYPE, new Identifier(Gemperience.MODID, "kiln_recipe"),
            new RecipeType<KilnRecipe>() {
                @Override
                public String toString() {
                    return "kiln_recipe";
                }
            });

    public static void registerModRecipeTypes(){

    }
}
