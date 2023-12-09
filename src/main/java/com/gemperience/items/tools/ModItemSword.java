package com.gemperience.items.tools;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModItemSword extends SwordItem {
    public ModItemSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
