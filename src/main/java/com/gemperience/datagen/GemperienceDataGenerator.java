package com.gemperience.datagen;

import com.gemperience.datagen.data.*;
import com.gemperience.datagen.data.recipe.ModRecipeGenerator;
import com.gemperience.world.ModConfiguredFeatures;
import com.gemperience.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class GemperienceDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModWorldGenerator::new);
        pack.addProvider(ModItemTag::new);
        pack.addProvider(ModBlockTag::new);
        pack.addProvider(EnglishLangProvider::new);
        pack.addProvider(ModRecipeGenerator::new);
        pack.addProvider(ModAdvancementProvider::new);
        pack.addProvider(ModLootTables::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
