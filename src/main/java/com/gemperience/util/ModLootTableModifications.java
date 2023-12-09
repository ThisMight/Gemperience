package com.gemperience.util;

import com.gemperience.items.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifications {
    private static final Identifier END_CITY_CHEST_LOOTTABLE_ID = new Identifier("minecraft","chests/end_city_treasure");
    private static final Identifier ABANDONED_MINESHAFT_LOOTTABLE_ID = new Identifier("minecraft","chests/abandoned_mineshaft");
    private static final Identifier VILLAGE_SNOWY_HOUSE_LOOTTABLE_ID = new Identifier("minecraft","chests/village/village_snowy_house");
    private static final Identifier UNDERWATER_RUIN_SMALL_LOOTTABLE_ID = new Identifier("minecraft","chests/underwater_ruin_small");
    private static final Identifier UNDERWATER_RUIN_BIG_LOOTTABLE_ID = new Identifier("minecraft","chests/underwater_ruin_big");
    private static final Identifier JUNGLE_TEMPLE_LOOTTABLE_ID = new Identifier("minecraft","chests/jungle_temple");
    private static final Identifier VILLAGE_MASON_LOOTTABLE_ID = new Identifier("minecraft","chests/village/village_mason");
    private static final Identifier DESERT_TEMPLE_LOOTTABLE_ID = new Identifier("minecraft","chests/desert_pyramid");
    private static final Identifier ANCIENT_CITY_LOOTTABLE_ID = new Identifier("minecraft","chests/ancient_city");
    private static final Identifier ANCIENT_CITY_ICE_BOX_ID = new Identifier("minecraft","chests/ancient_city_ice_box");
    private static final Identifier NETHER_FORTRESS_LOOTTABLE_ID = new Identifier("minecraft","chests/nether_bridge");
    private static final Identifier BASTION_TREASURE_LOOTTABLE_ID = new Identifier("minecraft","chests/bastion_treasure");
    private static final Identifier BASTION_OTHER_LOOTTABLE_ID = new Identifier("minecraft","chests/bastion_other");
    private static final Identifier VILLAGE_TEMPLE_LOOTTABLE_ID = new Identifier("minecraft","chests/village/village_temple");
    private static final Identifier SHIPWRECK_TREASURE_LOOTTABLE_ID = new Identifier("minecraft","chests/shipwreck_treasure");
    private static final Identifier SHIPWRECK_SUPPLY_LOOTTABLE_ID = new Identifier("minecraft","chests/shipwreck_supply");
    private static final Identifier BURIED_TREASURE_LOOTTABLE_ID = new Identifier("minecraft","chests/buried_treasure");
    private static final Identifier IGLOO_CHEST_LOOTTABLE_ID = new Identifier("minecraft","chests/igloo_chest");
    private static final Identifier WOODLAND_MANSION_LOOTTABLE_ID = new Identifier("minecraft","chests/woodland_mansion");

    public static void registerModLootTableModifications() {
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin()) {
                if (END_CITY_CHEST_LOOTTABLE_ID.equals(id)) {
                    ModifyEndCityLoot(tableBuilder);
                }
                else if (ABANDONED_MINESHAFT_LOOTTABLE_ID.equals(id)){
                    ModifyAbandonedMineshaftLoot(tableBuilder);
                }
                else if (VILLAGE_SNOWY_HOUSE_LOOTTABLE_ID.equals(id)){
                    ModifyVillageSnowyHouseLoot(tableBuilder);
                }
                else if (UNDERWATER_RUIN_SMALL_LOOTTABLE_ID.equals(id)){
                    ModifyUnderwaterRuinSmallLoot(tableBuilder);
                }
                else if (UNDERWATER_RUIN_BIG_LOOTTABLE_ID.equals(id)){
                    ModifyUnderwaterRuinBigLoot(tableBuilder);
                }
                else if (JUNGLE_TEMPLE_LOOTTABLE_ID.equals(id)){
                    ModifyJungleTempleLoot(tableBuilder);
                }
                else if (VILLAGE_MASON_LOOTTABLE_ID.equals(id)){
                    ModifyVillageMasonLoot(tableBuilder);
                }
                else if (DESERT_TEMPLE_LOOTTABLE_ID.equals(id)) {
                    ModifyDesertTempleLoot(tableBuilder);
                }
                else if (ANCIENT_CITY_LOOTTABLE_ID.equals(id)){
                    ModifyAncientCityLoot(tableBuilder);
                }
                else if (NETHER_FORTRESS_LOOTTABLE_ID.equals(id)){
                    ModifyNetherBridgeLoot(tableBuilder);
                }
                else if (BASTION_TREASURE_LOOTTABLE_ID.equals(id)){
                    ModifyBastionTreasureLoot(tableBuilder);
                }
                else if (BASTION_OTHER_LOOTTABLE_ID.equals(id)){
                    ModifyBastionOtherLoot(tableBuilder);
                }
                else if (VILLAGE_TEMPLE_LOOTTABLE_ID.equals(id)){
                    ModifyVillageTempleLoot(tableBuilder);
                }
                else if (SHIPWRECK_TREASURE_LOOTTABLE_ID.equals(id)){
                    ModifyShipwreckTreasureLoot(tableBuilder);
                }
                else if (SHIPWRECK_SUPPLY_LOOTTABLE_ID.equals(id)){
                    ModifyShipwreckSupplyLoot(tableBuilder);
                }
                else if (ANCIENT_CITY_ICE_BOX_ID.equals(id)){
                    ModifyAncientCityIceBoxLoot(tableBuilder);
                }
                else if (BURIED_TREASURE_LOOTTABLE_ID.equals(id)){
                    ModifyBuriedTreasureLoot(tableBuilder);
                }
                else if (IGLOO_CHEST_LOOTTABLE_ID.equals(id)){
                    ModifyIglooChestLoot(tableBuilder);
                }
                else if (WOODLAND_MANSION_LOOTTABLE_ID.equals(id)){
                    ModifyWoodlandMansionLoot(tableBuilder);
                }
            }
        }));
    }

    private static void ModifyWoodlandMansionLoot(LootTable.Builder tableBuilder) {
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.RUBY_DUST).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 8.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    private static void ModifyShipwreckSupplyLoot(LootTable.Builder tableBuilder) {
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.ANTHOLIUM).weight(4)).conditionally(RandomChanceLootCondition.builder(0.5f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 8f)));
        tableBuilder.pool(poolbuilder);
    }

    private static void ModifyIglooChestLoot(LootTable.Builder tableBuilder) {
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.RUBY_DUST).weight(4)).conditionally(RandomChanceLootCondition.builder(0.5f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 15f)))
                .with(ItemEntry.builder(ModItems.SPIRONITE).weight(4)).conditionally(RandomChanceLootCondition.builder(0.5f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 3f)));
        tableBuilder.pool(poolbuilder);
    }

    private static void ModifyBuriedTreasureLoot(LootTable.Builder tableBuilder) {
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.ANTHOLIUM).weight(4)).conditionally(RandomChanceLootCondition.builder(0.5f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 8f)));
        tableBuilder.pool(poolbuilder);
    }


    static void ModifyEndCityLoot(LootTable.Builder tableBuilder){
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.DENARIUM).weight(10).conditionally(RandomChanceLootCondition.builder(0.6f))).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 12.0f)))
                .with(ItemEntry.builder(ModItems.GLAZONIUM).weight(4).conditionally(RandomChanceLootCondition.builder(0.4f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f))).build());

        LootPool.Builder poolbuilder_denitin_smithing_template = LootPool.builder()
                .with(ItemEntry.builder(ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE).weight(1)).conditionally(RandomChanceLootCondition.builder(0.4f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)));

        tableBuilder.pool(poolbuilder);
        tableBuilder.pool(poolbuilder_denitin_smithing_template);
    }

    static void ModifyAbandonedMineshaftLoot(LootTable.Builder tableBuilder){
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.RAW_DYANITE).weight(15)).conditionally(RandomChanceLootCondition.builder(0.7f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(5.0f, 12.0f)))
                .with(ItemEntry.builder(ModItems.AMALGAMITE).weight(5).conditionally(RandomChanceLootCondition.builder(0.7f))).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 12.0f)))
                .with(ItemEntry.builder(ModItems.DYANITE).weight(4).conditionally(RandomChanceLootCondition.builder(0.7f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f))))
                .with(ItemEntry.builder(ModItems.COBGALITE).weight(4).conditionally(RandomChanceLootCondition.builder(0.55f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f))))
                .with(ItemEntry.builder(ModItems.COPPER_NUGGET).weight(4).conditionally(RandomChanceLootCondition.builder(0.55f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(7.0f, 25.0f))))
                .with(ItemEntry.builder(ModItems.RUBY).weight(4).conditionally(RandomChanceLootCondition.builder(0.55f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f))).build());
        tableBuilder.pool(poolbuilder);
    }

    static void ModifyVillageSnowyHouseLoot(LootTable.Builder tableBuilder){
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.SPIRONITE).weight(10)).conditionally(RandomChanceLootCondition.builder(0.4f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 7.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    public static void ModifyUnderwaterRuinSmallLoot(LootTable.Builder tableBuilder){
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.ANTHOLIUM).weight(10)).conditionally(RandomChanceLootCondition.builder(0.4f))
                .with(ItemEntry.builder(ModItems.COPPER_NUGGET).weight(4).conditionally(RandomChanceLootCondition.builder(0.55f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(12.0f, 25.0f))))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 10.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    public static void ModifyUnderwaterRuinBigLoot(LootTable.Builder tableBuilder){
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.ANTHOLIUM).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .with(ItemEntry.builder(ModItems.COPPER_NUGGET).weight(4).conditionally(RandomChanceLootCondition.builder(0.55f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(12.0f, 25.0f))))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 10.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    public static void ModifyJungleTempleLoot(LootTable.Builder tableBuilder){
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.PETRINITE_BULB).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 10.0f)).build())
                .with(ItemEntry.builder(ModItems.PETRINITE_ROOTS).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 10.0f)).build())
                .with(ItemEntry.builder(ModItems.PETRINITE_ROSE).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 10.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    public static void ModifyVillageMasonLoot(LootTable.Builder tableBuilder){
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.COBGALITE).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 10.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    public static void ModifyDesertTempleLoot(LootTable.Builder tableBuilder){
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.RUBY).weight(10)).conditionally(RandomChanceLootCondition.builder(0.55f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 15.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    private static void ModifyAncientCityLoot(LootTable.Builder tableBuilder) {
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.CHITINOUS_GROWTH).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 15.0f)))
                .with(ItemEntry.builder(ModItems.CHITIN_BOMB).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)));
        tableBuilder.pool(poolbuilder);
    }

    private static void ModifyNetherBridgeLoot(LootTable.Builder tableBuilder) {
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.RUNIAN).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 7.0f)))
                .with(ItemEntry.builder(ModItems.SLAGODITE).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 7.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    private static void ModifyBastionTreasureLoot(LootTable.Builder tableBuilder) {
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.JADESTONE).weight(10)).conditionally(RandomChanceLootCondition.builder(0.5f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    private static void ModifyBastionOtherLoot(LootTable.Builder tableBuilder) {
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.BIOLIUM).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 8.0f)))
                .with(ItemEntry.builder(ModItems.SLAGODITE).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 7.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    private static void ModifyVillageTempleLoot(LootTable.Builder tableBuilder) {
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.RUBY_DUST).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 8.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    private static void ModifyShipwreckTreasureLoot(LootTable.Builder tableBuilder){
        LootPool.Builder poolbuilder = LootPool.builder()
                .with(ItemEntry.builder(ModItems.COPPER_NUGGET).weight(4).conditionally(RandomChanceLootCondition.builder(0.55f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(12.0f, 25.0f))))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 10.0f)))
                .with(ItemEntry.builder(ModItems.DYANITE).weight(4).conditionally(RandomChanceLootCondition.builder(0.55f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 10.0f))))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 10.0f)))
                .with(ItemEntry.builder(ModItems.RUBY).weight(4).conditionally(RandomChanceLootCondition.builder(0.55f)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 10.0f))))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 10.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

    private static void ModifyAncientCityIceBoxLoot(LootTable.Builder tableBuilder) {
        LootPool.Builder poolbuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(2))
                .with(ItemEntry.builder(ModItems.SPIRONITE).weight(10)).conditionally(RandomChanceLootCondition.builder(0.6f))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 15.0f)).build());
        tableBuilder.pool(poolbuilder);
    }

}
