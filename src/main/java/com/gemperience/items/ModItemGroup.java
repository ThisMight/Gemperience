package com.gemperience.items;

import com.gemperience.Gemperience;
import com.gemperience.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final RegistryKey<ItemGroup> GEMPERIENCE =
            RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Gemperience.MODID, "gemperience"));


    public static void registerItemGroups(){
        Registry.register(Registries.ITEM_GROUP, GEMPERIENCE, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.RAW_DYANITE))
                .displayName(Text.translatable("itemgroup.gemperience")).build());
    }
}
