package com.gemperience.screen;

import com.gemperience.recipe.ModRecipeTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;

public class KilnScreenHandler extends AbstractFurnaceScreenHandler {

    protected KilnScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ModScreenHandlers.KILN_SCREEN_HANDLER_TYPE, ModRecipeTypes.KILN_RECIPE_TYPE, RecipeBookCategory.FURNACE, syncId, playerInventory);
    }

    protected KilnScreenHandler(ScreenHandlerType<?> type, RecipeType<? extends AbstractCookingRecipe> recipeType, RecipeBookCategory category, int syncId, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(type, recipeType, category, syncId, playerInventory, inventory, propertyDelegate);
    }

    public KilnScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(ModScreenHandlers.KILN_SCREEN_HANDLER_TYPE, ModRecipeTypes.KILN_RECIPE_TYPE, RecipeBookCategory.FURNACE, syncId, playerInventory, inventory, propertyDelegate);
    }

    public KilnScreenHandler(int i, PlayerInventory playerInventory, PacketByteBuf packetByteBuf) {
        super(ModScreenHandlers.KILN_SCREEN_HANDLER_TYPE, ModRecipeTypes.KILN_RECIPE_TYPE, RecipeBookCategory.FURNACE, i, playerInventory);
    }

}
