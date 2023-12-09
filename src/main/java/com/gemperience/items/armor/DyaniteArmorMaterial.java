package com.gemperience.items.armor;

import com.gemperience.items.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class DyaniteArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    //Left to right:
    // Boots, Leggings, Chestplate, Helmet
    private static final int[] PROTECTION_VALUES = new int[] {2, 5, 6, 3};

    @Override
    public int getDurability(ArmorItem.Type type) {
        return 1047;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return ArmorMaterials.IRON.getEnchantability();
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.DYANITE);
    }

    @Override
    public String getName() {
        return "dyanite";
    }

    @Override
    public float getToughness() {
        return ArmorMaterials.IRON.getToughness();
    }

    @Override
    public float getKnockbackResistance() {
        return ArmorMaterials.IRON.getKnockbackResistance();
    }
}
