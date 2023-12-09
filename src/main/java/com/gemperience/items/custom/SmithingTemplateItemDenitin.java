package com.gemperience.items.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class SmithingTemplateItemDenitin extends SmithingTemplateItem{

    static final Text APPLIES_TO_TEXT = Text.translatable("item.denitin_smithing_template.applies_to").formatted(Formatting.BLUE);
    static final Text INGREDIENTS_TEXT = Text.translatable("item.denitin_smithing_template.ingredients").formatted(Formatting.BLUE);

    static final Text TITLE_TEXT = Text.translatable("item.denitin_smithing_template.title").formatted(Formatting.GRAY);

    static final Text BASE_SLOT_DESCRIPTION_TEXT = Text.translatable("item.denitin_smithing_template.base_slot_description");

    static final Text ADDITION_SLOT_DESCRIPTION_TEXT = Text.translatable("item.denitin_smithing_template.addition_slot_description");

    static final Identifier EMPTY_SLOT_INGOT_TEXTURE = new Identifier("item/empty_slot_ingot");

    static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = new Identifier("item/empty_armor_slot_helmet");
    static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = new Identifier("item/empty_armor_slot_chestplate");
    static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = new Identifier("item/empty_armor_slot_leggings");
    static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = new Identifier("item/empty_armor_slot_boots");
    static final Identifier EMPTY_SLOT_HOE_TEXTURE = new Identifier("item/empty_slot_hoe");
    static final Identifier EMPTY_SLOT_AXE_TEXTURE = new Identifier("item/empty_slot_axe");
    static final Identifier EMPTY_SLOT_SWORD_TEXTURE = new Identifier("item/empty_slot_sword");
    static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = new Identifier("item/empty_slot_shovel");
    static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = new Identifier("item/empty_slot_pickaxe");
    public SmithingTemplateItemDenitin() {
        super(
                APPLIES_TO_TEXT,
                INGREDIENTS_TEXT,
                TITLE_TEXT,
                BASE_SLOT_DESCRIPTION_TEXT,
                ADDITION_SLOT_DESCRIPTION_TEXT,
                getNetheriteUpgradeEmptyBaseSlotTextures(),
                getDenitinUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getNetheriteUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    private static List<Identifier> getDenitinUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }
}
