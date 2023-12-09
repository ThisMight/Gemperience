package com.gemperience.world;

import com.gemperience.Gemperience;
import com.gemperience.blocks.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> DYANITE_ORE_PLACED_KEY = registerKey("dyanite_ore_placed");
    public static final RegistryKey<PlacedFeature> AMALGAMITE_ORE_PLACED = registerKey("amalgamite_ore_placed");
    public static final RegistryKey<PlacedFeature> RUNIAN_ORE_PLACED = registerKey("runian_ore_placed");
    public static final RegistryKey<PlacedFeature> JADESTONE_PLACED = registerKey("jadestone_placed");
    public static final RegistryKey<PlacedFeature> SPIRONITE_PLACED = registerKey("spironite_placed");
    public static final RegistryKey<PlacedFeature> PETRINITE_CLAY_PLACED = registerKey("petrinite_clay_placed");
    public static final RegistryKey<PlacedFeature> PETRINITE_MUD_PLACED = registerKey("petrinite_mud_placed");
    public static final RegistryKey<PlacedFeature> ANTHOLIUM_PLACED = registerKey("antholium_placed");
    public static final RegistryKey<PlacedFeature> DENARIUM_PLACED = registerKey("denarium_placed");
    public static final RegistryKey<PlacedFeature> GLAZONIUM_PLACED = registerKey("glazonium_placed");
    public static final RegistryKey<PlacedFeature> CHITEN_PLACED = registerKey("chiten_placed");
    public static final RegistryKey<PlacedFeature> COBGALITE_PLACED = registerKey("cobgalite_placed");
    public static final RegistryKey<PlacedFeature> SLAGODITE_BASALT_PLACED = registerKey("slagodite_basalt_placed");
    public static final RegistryKey<PlacedFeature> SLAGODITE_ORE_PLACED = registerKey("slagodite_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> BIOLIUM_ORE_PLACED = registerKey("biolium_ore_placed");
    public static final RegistryKey<PlacedFeature> VOIDSTONE_ORE_PLACED = registerKey("voidstone_ore_placed");
    public static final RegistryKey<PlacedFeature> NEURSTONE_ORE_PLACED = registerKey("neurostone_ore_placed");
    public static final RegistryKey<PlacedFeature> SOULSTONE_ORE_PLACED = registerKey("soulstone_ore_placed");
    public static final RegistryKey<PlacedFeature> ECHOCRINE_GLOB_ORE_PLACED = registerKey("echocrine_glob_ore_placed");
    public static final RegistryKey<PlacedFeature> ILLUMINIUM_PLACED = registerKey("illuminium_placed");
    public static final RegistryKey<PlacedFeature> TAR_PLACED = registerKey("tar_placed");
    public static final RegistryKey<PlacedFeature> ENDBRINE_PLACED = registerKey("endbrine_placed");
    public static final RegistryKey<PlacedFeature> MARROWSHALE_PLACED = registerKey("marrowshale_placed");
    public static final RegistryKey<PlacedFeature> ENRICHED_END_ISLAND = registerKey("enriched_end_island");

    public static void bootstrap(Registerable<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, DYANITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DYANITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, //veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-100), YOffset.fixed(80))));

        register(context, AMALGAMITE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.AMALGAMITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(35))));

        register(context, SOULSTONE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SOULSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));

        register(context, RUNIAN_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUNIAN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(15, //veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));

        register(context, JADESTONE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JADESTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(15,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(20), YOffset.fixed(128))));

        register(context, SPIRONITE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SPIRONITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(26,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.TOP)));

        register(context, PETRINITE_CLAY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PETRINITE_ORE_CLAY_KEY),
                ModOrePlacement.modifiersWithCount(32,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(150))));

        register(context, PETRINITE_MUD_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PETRINITE_ORE_MUD_KEY),
                ModOrePlacement.modifiersWithCount(15,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(120))));

        register(context, ANTHOLIUM_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ANTHOLIUM_ORE_SAND_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(62))));

        register(context, DENARIUM_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DENARIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(24,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));

        register(context, GLAZONIUM_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GLAZONIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(24,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));

        register(context, CHITEN_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHITEN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(35))));

        register(context, COBGALITE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBGALITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(0))));

        register(context, SLAGODITE_BASALT_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SLAGODITE_BASALT_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(60))));

        register(context, SLAGODITE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SLAGODITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(40))));

        register(context, RUBY_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(45))));

        register(context, BIOLIUM_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BIOLIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(40), YOffset.fixed(100))));

        register(context, VOIDSTONE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VOIDSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-60))));

        register(context, NEURSTONE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NEUROSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.BOTTOM, YOffset.fixed(30))));

        register(context, ECHOCRINE_GLOB_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ECHOCRINE_GLOB_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(35))));

        register(context, ILLUMINIUM_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ILLUMINIUM_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));

        register(context, TAR_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TAR_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-5), YOffset.fixed(5))));

        register(context, ENDBRINE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ENDBRINE_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(55), YOffset.fixed(65))));

        register(context, MARROWSHALE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MARROWSHALE_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
    }


    public static RegistryKey<PlacedFeature> registerKey(String name){
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Gemperience.MODID, name));
    }

    public static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                  RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                  PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
