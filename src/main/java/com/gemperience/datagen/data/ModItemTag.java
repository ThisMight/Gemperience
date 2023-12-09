package com.gemperience.datagen.data;

import com.gemperience.Gemperience;
import com.gemperience.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTag extends FabricTagProvider.ItemTagProvider {
    /**
     * Constructs a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registryKey
     * @param registriesFuture the backing registry for the tag type
     */
    public static final TagKey<Item> GEMS = TagKey.of(RegistryKeys.ITEM, new Identifier(Gemperience.MODID, "gems"));
    public static final TagKey<Item> GEMS_TIER_1 = TagKey.of(RegistryKeys.ITEM, new Identifier(Gemperience.MODID, "gems_tier_1"));
    public static final TagKey<Item> GEMS_TIER_2 = TagKey.of(RegistryKeys.ITEM, new Identifier(Gemperience.MODID, "gems_tier_2"));
    public static final TagKey<Item> HAMMERS = TagKey.of(RegistryKeys.ITEM, new Identifier(Gemperience.MODID, "gem_hammers"));
    public static final TagKey<Item> PICKAXES = TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "pickaxes"));
    public static final TagKey<Item> AXES = TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "axes"));
    public static final TagKey<Item> SHOVELS = TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "shovels"));

    //hehe.. is funny
    public static final TagKey<Item> HOES = TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "hoes"));
    public static final TagKey<Item> SWORDS = TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "swords"));

    public ModItemTag(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {;
        //region MOD TAGS

        getOrCreateTagBuilder(GEMS)
                .add(ModItems.RAW_DYANITE)
                .add(ModItems.AMALGAMITE)
                .add(ModItems.ANTHOLIUM)
                .add(ModItems.PETRINITE_BULB)
                .add(ModItems.PETRINITE_ROSE)
                .add(ModItems.PETRINITE_ROOTS)
                .add(ModItems.RUNIAN)
                .add(ModItems.COBGALITE)
                .add(ModItems.JADESTONE)
                .add(ModItems.DENARIUM)
                .add(ModItems.SLAGODITE)
                .add(ModItems.BIOLIUM)
                .add(ModItems.SPIRONITE)
                .add(ModItems.RUBY)
                .add(ModItems.CHITINOUS_GROWTH)
                .add(ModItems.GLAZONIUM);

        getOrCreateTagBuilder(GEMS_TIER_1)
                .add(ModItems.SPIRONITE)
                .add(ModItems.BIOLIUM)
                .add(ModItems.ANTHOLIUM)
                .add(ModItems.PETRINITE_BULB)
                .add(ModItems.PETRINITE_ROSE)
                .add(ModItems.PETRINITE_ROOTS)
                .add(ModItems.AMALGAMITE)
                .add(ModItems.RAW_DYANITE)
                .add(ModItems.COBGALITE)
                .add(ModItems.CHITINOUS_GROWTH);

        getOrCreateTagBuilder(GEMS_TIER_2)
                .add(ModItems.RUNIAN)
                .add(ModItems.SLAGODITE)
                .add(ModItems.JADESTONE)
                .add(ModItems.GLAZONIUM)
                .add(ModItems.RUBY)
                .add(ModItems.DENARIUM);

        getOrCreateTagBuilder(HAMMERS)
                .add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLDEN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.DENITIN_HAMMER)
                .add(ModItems.DYANITE_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);
        //endregion

        //region GENERIC TAGS :: MINECRAFT

        //endregion

        //region GENERIC TAGS :: FABRIC
        getOrCreateTagBuilder(PICKAXES)
            .add(ModItems.DYANITE_PICKAXE)
            .add(ModItems.DENITIN_PICKAXE);

        getOrCreateTagBuilder(SHOVELS)
                .add(ModItems.DYANITE_SHOVEL)
                .add(ModItems.DENITIN_SHOVEL);

        getOrCreateTagBuilder(AXES)
                .add(ModItems.DYANITE_AXE)
                .add(ModItems.DENITIN_AXE);

        getOrCreateTagBuilder(HOES)
                .add(ModItems.DYANITE_HOE)
                .add(ModItems.DENITIN_HOE);

        getOrCreateTagBuilder(SWORDS)
                .add(ModItems.DENITIN_SWORD)
                .add(ModItems.DYANITE_SWORD);


        //endregion
    }
}
