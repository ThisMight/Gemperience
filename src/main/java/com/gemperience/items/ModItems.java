package com.gemperience.items;

import com.gemperience.Gemperience;
import com.gemperience.items.armor.DenitinArmorMaterial;
import com.gemperience.items.armor.DyaniteArmorMaterial;
import com.gemperience.items.custom.*;
import com.gemperience.items.custom.gem.*;
import com.gemperience.items.tools.*;
import com.gemperience.items.tools.materials.ModToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    //region < ---- GEMS ---- >
    public static final RawDyaniteGem RAW_DYANITE = (RawDyaniteGem) registerItem("raw_dyanite",
            new RawDyaniteGem(new FabricItemSettings()));

    public static final AmalgamiteGem AMALGAMITE = (AmalgamiteGem) registerItem("amalgamite",
            new AmalgamiteGem(new FabricItemSettings()));

    public static final RubyGem RUBY = (RubyGem) registerItem("ruby",
            new RubyGem(new FabricItemSettings()));

    public static final PetriniteGem PETRINITE_BULB = (PetriniteGem) registerItem("petrinite_bulb",
            new PetriniteGem(new FabricItemSettings()));

    public static final PetriniteGem PETRINITE_ROSE = (PetriniteGem) registerItem("petrinite_rose",
            new PetriniteGem(new FabricItemSettings()));

    public static final PetriniteGem PETRINITE_ROOTS = (PetriniteGem) registerItem("petrinite_roots",
            new PetriniteGem(new FabricItemSettings()));


    public static final AntholiumGem ANTHOLIUM = (AntholiumGem) registerItem("antholium",
            new AntholiumGem(new FabricItemSettings()));

    public static final CobgaliteGem COBGALITE = (CobgaliteGem) registerItem("cobgalite",
            new CobgaliteGem(new FabricItemSettings()));

    public static final SpironiteGem SPIRONITE = (SpironiteGem) registerItem("spironite",
            new SpironiteGem(new FabricItemSettings()));

    public static final RunianGem RUNIAN = (RunianGem) registerItem("runian",
            new RunianGem(new FabricItemSettings()));

    public static final BioliumGem BIOLIUM = (BioliumGem) registerItem("biolium",
            new BioliumGem(new FabricItemSettings()));

    public static final JadestoneGem JADESTONE = (JadestoneGem) registerItem("jadestone",
            new JadestoneGem(new FabricItemSettings()));

    public static final SlagoditeGem SLAGODITE = (SlagoditeGem) registerItem("slagodite",
            new SlagoditeGem(new FabricItemSettings()));

    public static final Item ECHORINE_PASTE = registerItem("echocrine_paste",
            new Item(new FabricItemSettings()));
    public static final DenariumGem DENARIUM = (DenariumGem) registerItem("denarium",
            new DenariumGem(new FabricItemSettings()));

    public static final GlazoniumGem GLAZONIUM = (GlazoniumGem) registerItem("glazonium",
            new GlazoniumGem(new FabricItemSettings()));

    public static final ChitinousGrowthGem CHITINOUS_GROWTH = (ChitinousGrowthGem) registerItem("chitinous_growth",
            new ChitinousGrowthGem(new FabricItemSettings()));

    //endregion

    //region UPGRADES

    //endregion
    public static final Item DYANITE = registerItem("dyanite",
            new Item(new FabricItemSettings()));

    public static final Item RUBY_DUST = registerItem("ruby_dust",
            new Item(new FabricItemSettings()));

    public static final Item DENITIN_INGOT = registerItem("denitin_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item SCULK_CHITIN = registerItem("sculk_chitin",
            new Item(new FabricItemSettings()));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings()));

    public static final GhastTearInABottleItem GHAST_TEAR_IN_A_BOTTLE = (GhastTearInABottleItem) registerItem("ghast_tear_in_a_bottle",
            new GhastTearInABottleItem(new FabricItemSettings()));

    public static final ChitinBombItem CHITIN_BOMB = (ChitinBombItem) registerItem("chitin_bomb",
            new ChitinBombItem(new FabricItemSettings().maxCount(16)));


    public static final SmithingTemplateItemDenitin DENITIN_UPGRADE_SMITHING_TEMPLATE = registerItem("denitin_upgrade_smithing_template",
            new SmithingTemplateItemDenitin());

    //region tools



    //region aquamarine
    public static final ModItemPickaxe DYANITE_PICKAXE = (ModItemPickaxe) registerItem("dyanite_pickaxe",
            new ModItemPickaxe(ModToolMaterials.DYANITE, 0, -2.8f, new Item.Settings()));

    public static final ModItemShovel DYANITE_SHOVEL = (ModItemShovel) registerItem("dyanite_shovel",
            new ModItemShovel(ModToolMaterials.DYANITE, 1f, -3f, new Item.Settings()));

    public static final ModItemAxe DYANITE_AXE = (ModItemAxe) registerItem("dyanite_axe",
            new ModItemAxe(ModToolMaterials.DYANITE, 5f, -3.2f, new Item.Settings()));

    public static final ModItemSword DYANITE_SWORD = (ModItemSword) registerItem("dyanite_sword",
            new ModItemSword(ModToolMaterials.DYANITE, 2, -2.4f, new Item.Settings()));

    public static final ModItemHoe DYANITE_HOE = (ModItemHoe) registerItem("dyanite_hoe",
            new ModItemHoe(ModToolMaterials.DYANITE, -2, -1f, new Item.Settings()));

    //region DENARIUM TOOLS
    public static final ModItemPickaxe DENITIN_PICKAXE = (ModItemPickaxe) registerItem("denitin_pickaxe",
            new ModItemPickaxe(ModToolMaterials.DENITIN, 1, -2.5f, new Item.Settings().fireproof()));

    public static final ModItemShovel DENITIN_SHOVEL = (ModItemShovel) registerItem("denitin_shovel",
            new ModItemShovel(ModToolMaterials.DENITIN, 1.5f, -2.5f, new Item.Settings().fireproof()));

    public static final ModItemAxe DENITIN_AXE = (ModItemAxe) registerItem("denitin_axe",
            new ModItemAxe(ModToolMaterials.DENITIN, 5f, -2.5f, new Item.Settings().fireproof()));

    public static final ModItemSword DENITIN_SWORD = (ModItemSword) registerItem("denitin_sword",
            new ModItemSword(ModToolMaterials.DENITIN, 4, -2.4f, new Item.Settings().fireproof()));

    public static final ModItemHoe DENITIN_HOE = (ModItemHoe) registerItem("denitin_hoe",
            new ModItemHoe(ModToolMaterials.DENITIN, -4, 0f, new Item.Settings().fireproof()));

    //region HAMMER
    public static final ModItemHammer DYANITE_HAMMER = (ModItemHammer) registerItem("dyanite_hammer",
            new ModItemHammer(ModToolMaterials.DYANITE, 9, -3.5f, new FabricItemSettings()));
    public static final ModItemHammer WOODEN_HAMMER = (ModItemHammer) registerItem("wooden_hammer",
            new ModItemHammer(ToolMaterials.WOOD, 9, -3.5f, new FabricItemSettings()));

    public static final ModItemHammer STONE_HAMMER = (ModItemHammer) registerItem("stone_hammer",
            new ModItemHammer(ToolMaterials.STONE, (int)ToolMaterials.STONE.getAttackDamage() + 9, -3.5f, new FabricItemSettings()));

    public static final ModItemHammer IRON_HAMMER = (ModItemHammer) registerItem("iron_hammer",
            new ModItemHammer(ToolMaterials.IRON, (int)ToolMaterials.IRON.getAttackDamage() + 8, -3.5f, new FabricItemSettings()));

    public static final ModItemHammer GOLDEN_HAMMER = (ModItemHammer) registerItem("golden_hammer",
            new ModItemHammer(ToolMaterials.GOLD, (int)ToolMaterials.GOLD.getAttackDamage() + 10, -3.3f, new FabricItemSettings()));

    public static final ModItemHammer DIAMOND_HAMMER = (ModItemHammer) registerItem("diamond_hammer",
            new ModItemHammer(ToolMaterials.DIAMOND, (int)ToolMaterials.DIAMOND.getAttackDamage() + 7, -3.4f, new FabricItemSettings()));

    public static final ModItemHammer NETHERITE_HAMMER = (ModItemHammer) registerItem("netherite_hammer",
            new ModItemHammer(ToolMaterials.NETHERITE, (int)ToolMaterials.NETHERITE.getAttackDamage() + 5, -3.4f, new FabricItemSettings().fireproof()));

    public static final ModItemHammer DENITIN_HAMMER = (ModItemHammer) registerItem("denitin_hammer",
            new ModItemHammer(ModToolMaterials.DENITIN, 10, -3.3f, new FabricItemSettings().fireproof()));




    //region Armor
    public static final ArmorMaterial DENITIN_ARMOR_MATERIAL = new DenitinArmorMaterial();
    // If you made a new material, this is where you would note it.
    public static final Item DENITIN_HELMET =  registerItem("denitin_helmet",
            new ArmorItem(DENITIN_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
    public static final DenitinChestPlate DENITIN_CHESTPLATE = (DenitinChestPlate) registerItem("denitin_chestplate",
            new DenitinChestPlate(DENITIN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
    public static final Item DENITIN_LEGGINGS = registerItem("denitin_leggings",
            new ArmorItem(DENITIN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
    public static final Item DENITIN_BOOTS = registerItem("denitin_boots",
            new ArmorItem(DENITIN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));

    public static final ArmorMaterial DYANITE_ARMOR_MATERIAL = new DyaniteArmorMaterial();
    // If you made a new material, this is where you would note it.
    public static final Item DYANITE_HELMET =  registerItem("dyanite_helmet",
            new ArmorItem(DYANITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item DYANITE_CHESTPLATE = registerItem("dyanite_chestplate",
            new ArmorItem(DYANITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item DYANITE_LEGGINGS = registerItem("dyanite_leggings",
            new ArmorItem(DYANITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item DYANITE_BOOTS = registerItem("dyanite_boots",
            new ArmorItem(DYANITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()));
    //endregion


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Gemperience.MODID, name), item);
    }

    private static AbstractGemItem registerItem(String name, AbstractGemItem gemItem){
        return Registry.register(Registries.ITEM, new Identifier(Gemperience.MODID, name), gemItem);
    }

    private static SmithingTemplateItemDenitin registerItem(String name, SmithingTemplateItemDenitin upgradeItem){
        return Registry.register(Registries.ITEM, new Identifier(Gemperience.MODID, name), upgradeItem);
    }
    public static void addItemsToGroup(){
        //Gem group
        addToItemGroup(ModItemGroup.GEMPERIENCE, RAW_DYANITE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, AMALGAMITE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, SPIRONITE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, ANTHOLIUM);
        addToItemGroup(ModItemGroup.GEMPERIENCE, PETRINITE_BULB);
        addToItemGroup(ModItemGroup.GEMPERIENCE, PETRINITE_ROSE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, PETRINITE_ROOTS);
        addToItemGroup(ModItemGroup.GEMPERIENCE, COBGALITE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, RUBY);
        addToItemGroup(ModItemGroup.GEMPERIENCE, CHITINOUS_GROWTH);
        addToItemGroup(ModItemGroup.GEMPERIENCE, SLAGODITE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, BIOLIUM);
        addToItemGroup(ModItemGroup.GEMPERIENCE, RUNIAN);
        addToItemGroup(ModItemGroup.GEMPERIENCE, JADESTONE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENARIUM);
        addToItemGroup(ModItemGroup.GEMPERIENCE, GLAZONIUM);

        //Tool group
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE_PICKAXE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE_AXE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE_SHOVEL);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE_SWORD);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE_HOE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_PICKAXE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_AXE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_SWORD);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_SHOVEL);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_HOE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE_SWORD);
        addToItemGroup(ModItemGroup.GEMPERIENCE, WOODEN_HAMMER);
        addToItemGroup(ModItemGroup.GEMPERIENCE, STONE_HAMMER);
        addToItemGroup(ModItemGroup.GEMPERIENCE, IRON_HAMMER);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE_HAMMER);
        addToItemGroup(ModItemGroup.GEMPERIENCE, GOLDEN_HAMMER);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DIAMOND_HAMMER);
        addToItemGroup(ModItemGroup.GEMPERIENCE, NETHERITE_HAMMER);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_HAMMER);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_HELMET);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_CHESTPLATE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_LEGGINGS);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_BOOTS);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE_HELMET);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE_CHESTPLATE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE_LEGGINGS);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE_BOOTS);

        //Item group
        addToItemGroup(ModItemGroup.GEMPERIENCE, RUBY_DUST);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_INGOT);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DYANITE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, COPPER_NUGGET);
        addToItemGroup(ModItemGroup.GEMPERIENCE, SCULK_CHITIN);
        addToItemGroup(ModItemGroup.GEMPERIENCE, ECHORINE_PASTE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, GHAST_TEAR_IN_A_BOTTLE);
        addToItemGroup(ModItemGroup.GEMPERIENCE, CHITIN_BOMB);
        addToItemGroup(ModItemGroup.GEMPERIENCE, DENITIN_UPGRADE_SMITHING_TEMPLATE);
    }

    public static void addToItemGroup(RegistryKey<ItemGroup> group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        System.out.println("Registering items for " + Gemperience.MODID);
        addItemsToGroup();
    }
}
