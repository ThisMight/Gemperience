package com.gemperience.world.gen;

import com.gemperience.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DYANITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.AMALGAMITE_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.DEEP_DARK),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CHITEN_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RUBY_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBGALITE_PLACED);

        //Soulstone has to generate before runian does.
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SOULSTONE_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RUNIAN_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.WARPED_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.JADESTONE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.FROZEN_PEAKS, BiomeKeys.SNOWY_SLOPES,
                        BiomeKeys.FROZEN_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN,
                        BiomeKeys.JAGGED_PEAKS, BiomeKeys.ICE_SPIKES, BiomeKeys.GROVE),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SPIRONITE_PLACED);

        //THAT IS A LOT OF BIOMES.
        // GOOD.
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.FROZEN_OCEAN, BiomeKeys.WARM_OCEAN,
                        BiomeKeys.SPARSE_JUNGLE, BiomeKeys.DEEP_LUKEWARM_OCEAN,
                        BiomeKeys.LUSH_CAVES, BiomeKeys.COLD_OCEAN,
                        BiomeKeys.DEEP_OCEAN, BiomeKeys.SWAMP, BiomeKeys.DEEP_FROZEN_OCEAN,
                        BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.LUKEWARM_OCEAN,
                        BiomeKeys.OCEAN, BiomeKeys.JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PETRINITE_CLAY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PETRINITE_MUD_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SLAGODITE_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.BASALT_DELTAS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SLAGODITE_BASALT_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.WARM_OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ANTHOLIUM_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.END_BARRENS, BiomeKeys.END_HIGHLANDS, BiomeKeys.END_MIDLANDS, BiomeKeys.SMALL_END_ISLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DENARIUM_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.CRIMSON_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BIOLIUM_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.VOIDSTONE_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN,
                BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NEURSTONE_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_DARK),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ECHOCRINE_GLOB_ORE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ILLUMINIUM_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TAR_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS, BiomeKeys.END_HIGHLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ENDBRINE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.NETHER_WASTES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MARROWSHALE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS, BiomeKeys.END_HIGHLANDS, BiomeKeys.END_MIDLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GLAZONIUM_PLACED);
    }
}
