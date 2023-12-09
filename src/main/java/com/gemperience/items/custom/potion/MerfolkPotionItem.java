package com.gemperience.items.custom.potion;

import com.gemperience.potion.ModPotions;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.potion.PotionUtil;

public class MerfolkPotionItem extends PotionItem {
    public MerfolkPotionItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getDefaultStack() {
        return PotionUtil.setPotion(super.getDefaultStack(), ModPotions.MERFOLK);
    }
}
