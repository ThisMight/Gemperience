package com.gemperience.items.tools.materials;

import com.gemperience.items.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;

public class ModToolMaterials {
    public static final ToolMaterial DYANITE = new ToolMaterial() {
        @Override
        public int getDurability() {
            return (int) (ToolMaterials.DIAMOND.getDurability() * .75f);
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return ToolMaterials.STONE.getMiningSpeedMultiplier() * 1.15f;
        }

        @Override
        public float getAttackDamage() {
            return ToolMaterials.IRON.getAttackDamage();
        }

        @Override
        public int getMiningLevel() {
            return ToolMaterials.IRON.getMiningLevel();
        }

        @Override
        public int getEnchantability() {
            return ToolMaterials.DIAMOND.getEnchantability();
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(ModItems.DYANITE);
        }
    };


    public static final ToolMaterial DENITIN = new ToolMaterial() {
        @Override
        public int getDurability() {
            return ToolMaterials.NETHERITE.getDurability();
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return ToolMaterials.NETHERITE.getMiningSpeedMultiplier();
        }

        @Override
        public float getAttackDamage() {
            return ToolMaterials.NETHERITE.getAttackDamage();
        }

        @Override
        public int getMiningLevel() {
            return ToolMaterials.NETHERITE.getMiningLevel();
        }

        @Override
        public int getEnchantability() {
            return ToolMaterials.NETHERITE.getEnchantability();
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(ModItems.DENITIN_INGOT);
        }
    };
}
