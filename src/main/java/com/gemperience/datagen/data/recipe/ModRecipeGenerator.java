package com.gemperience.datagen.data.recipe;

import com.gemperience.blocks.ModBlocks;
import com.gemperience.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DYANITE, RecipeCategory.MISC,
                ModBlocks.DYANITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ANTHOLIUM, RecipeCategory.MISC,
                ModBlocks.ANTHOLIUM_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PETRINITE_BULB, RecipeCategory.MISC,
                ModBlocks.PETRINITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUNIAN, RecipeCategory.MISC,
                ModBlocks.RUNIAN_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.MISC,
                ModBlocks.RUBY_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JADESTONE, RecipeCategory.MISC,
                ModBlocks.JADESTONE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BIOLIUM, RecipeCategory.MISC,
                ModBlocks.BIOLIUM_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GLAZONIUM, RecipeCategory.MISC,
                ModBlocks.GLAZONIUM_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DENARIUM, RecipeCategory.MISC,
                ModBlocks.DENARIUM_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SPIRONITE, RecipeCategory.MISC,
                ModBlocks.SPIRONITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ECHORINE_PASTE, RecipeCategory.MISC,
                ModBlocks.ECHOCRINE_GLOB);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SCULK_CHITIN, RecipeCategory.MISC,
                ModBlocks.CHITINOUS_MASS);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SLAGODITE, RecipeCategory.MISC,
                ModBlocks.SLAGODITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_DYANITE, RecipeCategory.MISC,
                ModBlocks.RAW_DYANITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COBGALITE, RecipeCategory.MISC,
                ModBlocks.COBGALITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.AMALGAMITE, RecipeCategory.MISC,
                ModBlocks.AMALGAMITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COPPER_NUGGET, RecipeCategory.MISC,
                Items.COPPER_INGOT);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DENITIN_INGOT, RecipeCategory.MISC,
                ModBlocks.DENITIN_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY_DUST, RecipeCategory.MISC,
                ModBlocks.RUBY_DUST_BLOCK);

        ModStoneCutterRecipeGenerator stoneCutterRecipeGenerator = new ModStoneCutterRecipeGenerator();
        stoneCutterRecipeGenerator.generateStoneCuttingRecipes(exporter, this);

        //region smithing

        //Denitin smithing template
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE)
                .pattern("DTD")
                .pattern("DED")
                .pattern("DDD")
                .input('D', ModItems.DENARIUM)
                .input('T', ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE)
                .input('E', Items.END_STONE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENARIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DENARIUM))
                .offerTo(exporter);

        SmithingTransformRecipeJsonBuilder.create(
                Ingredient.ofItems(() -> ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(() -> Items.NETHERITE_PICKAXE),
                Ingredient.ofItems(() -> ModItems.DENITIN_INGOT),
                RecipeCategory.MISC,
                ModItems.DENITIN_PICKAXE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENITIN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DENITIN_INGOT))
                .offerTo(exporter, "denitin_pickaxe_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(() -> ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(() -> Items.NETHERITE_AXE),
                        Ingredient.ofItems(() -> ModItems.DENITIN_INGOT),
                        RecipeCategory.MISC,
                        ModItems.DENITIN_AXE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENITIN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DENITIN_INGOT))
                .offerTo(exporter, "denitin_axe_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(() -> ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(() -> Items.NETHERITE_HOE),
                        Ingredient.ofItems(() -> ModItems.DENITIN_INGOT),
                        RecipeCategory.MISC,
                        ModItems.DENITIN_HOE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENITIN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DENITIN_INGOT))
                .offerTo(exporter, "denitin_hoe_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(() -> ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(() -> Items.NETHERITE_SHOVEL),
                        Ingredient.ofItems(() -> ModItems.DENITIN_INGOT),
                        RecipeCategory.MISC,
                        ModItems.DENITIN_SHOVEL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENITIN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DENITIN_INGOT))
                .offerTo(exporter, "denitin_shovel_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(() -> ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(() -> Items.NETHERITE_SWORD),
                        Ingredient.ofItems(() -> ModItems.DENITIN_INGOT),
                        RecipeCategory.MISC,
                        ModItems.DENITIN_SWORD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENITIN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DENITIN_INGOT))
                .offerTo(exporter, "denitin_sword_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(() -> ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(() -> ModItems.NETHERITE_HAMMER),
                        Ingredient.ofItems(() -> ModItems.DENITIN_INGOT),
                        RecipeCategory.MISC,
                        ModItems.DENITIN_HAMMER)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENITIN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DENITIN_INGOT))
                .offerTo(exporter, "denitin_hammer_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(() -> ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(() -> Items.NETHERITE_HELMET),
                        Ingredient.ofItems(() -> ModItems.DENITIN_INGOT),
                        RecipeCategory.MISC,
                        ModItems.DENITIN_HELMET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENITIN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DENITIN_INGOT))
                .offerTo(exporter, "denitin_helmet_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(() -> ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(() -> Items.NETHERITE_CHESTPLATE),
                        Ingredient.ofItems(() -> ModItems.DENITIN_INGOT),
                        RecipeCategory.MISC,
                        ModItems.DENITIN_CHESTPLATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENITIN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DENITIN_INGOT))
                .offerTo(exporter, "denitin_chestplate_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(() -> ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(() -> Items.NETHERITE_LEGGINGS),
                        Ingredient.ofItems(() -> ModItems.DENITIN_INGOT),
                        RecipeCategory.MISC,
                        ModItems.DENITIN_LEGGINGS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENITIN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DENITIN_INGOT))
                .offerTo(exporter, "denitin_leggings_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(() -> ModItems.DENITIN_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(() -> Items.NETHERITE_BOOTS),
                        Ingredient.ofItems(() -> ModItems.DENITIN_INGOT),
                        RecipeCategory.MISC,
                        ModItems.DENITIN_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENITIN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DENITIN_INGOT))
                .offerTo(exporter, "denitin_boots_smithing");


        //region Gem Crusher

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GEM_GRINDER_TIER_2)
                .pattern("SG$")
                .pattern("GUG")
                .pattern("$GS")
                .input('G', Items.GOLD_INGOT)
                .input('U', ModBlocks.GEM_GRINDER_TIER_1)
                .input('$', ModItems.SLAGODITE)
                .input('S', ModItems.SPIRONITE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.GEM_GRINDER_TIER_1),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.GEM_GRINDER_TIER_1))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.KILN)
                .pattern("BMB")
                .pattern("MFM")
                .pattern("BMB")
                .input('B', Items.BRICK)
                .input('F', Blocks.FURNACE)
                .input('M', Items.MUD_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.FURNACE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.FURNACE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GEM_GRINDER_TIER_1)
                .pattern("III")
                .pattern("RSR")
                .pattern("CCC")
                .input('I', Items.IRON_INGOT)
                .input('R', ModItems.RUBY)
                .input('S', Items.STONECUTTER)
                .input('C', Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        //endregion

        //region Tools

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DYANITE_PICKAXE)
                .pattern("ddd")
                .pattern(" i ")
                .pattern(" i ")
                .input('d', ModItems.DYANITE)
                .input('i', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DYANITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DYANITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DYANITE_AXE)
                .pattern("dd")
                .pattern("di")
                .pattern(" i")
                .input('d', ModItems.DYANITE)
                .input('i', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DYANITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DYANITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DYANITE_HOE)
                .pattern("dd")
                .pattern(" i")
                .pattern(" i")
                .input('d', ModItems.DYANITE)
                .input('i', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DYANITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DYANITE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DYANITE_SHOVEL)
                .pattern(" d ")
                .pattern(" i ")
                .pattern(" i ")
                .input('d', ModItems.DYANITE)
                .input('i', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DYANITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DYANITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DYANITE_SWORD)
                .pattern(" d ")
                .pattern(" d ")
                .pattern(" i ")
                .input('d', ModItems.DYANITE)
                .input('i', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DYANITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DYANITE))
                .offerTo(exporter);

        //endregion

        //region Armor
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DYANITE_HELMET)
                .pattern("iii")
                .pattern("i i")
                .input('i', ModItems.DYANITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DYANITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DYANITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DYANITE_CHESTPLATE)
                .pattern("i i")
                .pattern("iii")
                .pattern("iii")
                .input('i', ModItems.DYANITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DYANITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DYANITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DYANITE_LEGGINGS)
                .pattern("iii")
                .pattern("i i")
                .pattern("i i")
                .input('i', ModItems.DYANITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DYANITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DYANITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DYANITE_BOOTS)
                .pattern("i i")
                .pattern("i i")
                .input('i', ModItems.DYANITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DYANITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DYANITE))
                .offerTo(exporter);

        //endregion

        //region hammers


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("ddd")
                .pattern("did")
                .pattern(" i ")
                .input('d', ItemTags.PLANKS)
                .input('i', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_HAMMER)
                .pattern("ddd")
                .pattern("did")
                .pattern(" i ")
                .input('d', Items.COBBLESTONE)
                .input('i', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COBBLESTONE),
                        FabricRecipeProvider.conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_HAMMER)
                .pattern("ddd")
                .pattern("did")
                .pattern(" i ")
                .input('d', Items.IRON_INGOT)
                .input('i', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_HAMMER)
                .pattern("ddd")
                .pattern("did")
                .pattern(" i ")
                .input('d', Items.GOLD_INGOT)
                .input('i', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_HAMMER)
                .pattern("ddd")
                .pattern("did")
                .pattern(" i ")
                .input('d', Items.DIAMOND)
                .input('i', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DYANITE_HAMMER)
                .pattern("ddd")
                .pattern("did")
                .pattern(" i ")
                .input('d', ModItems.DYANITE)
                .input('i', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DYANITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DYANITE))
                .offerTo(exporter);

        offerNetheriteUpgradeRecipe(
                exporter,
                ModItems.DIAMOND_HAMMER,
                RecipeCategory.MISC,
                ModItems.NETHERITE_HAMMER
        );

        //endregion

        //region BLOCKS
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHOCRINE_STONE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.ECHOCRINE_STONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ECHOCRINE_STONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ECHOCRINE_STONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHOCRINE_STONE_BRICK_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.ECHOCRINE_STONE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ECHOCRINE_STONE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ECHOCRINE_STONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ECHOCRINE_STONE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_ECHOCRINE_STONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_ECHOCRINE_STONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_ECHOCRINE_STONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHOCRINE_STONE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.ECHOCRINE_STONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ECHOCRINE_STONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ECHOCRINE_STONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHOCRINE_STONE_BRICK_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.ECHOCRINE_STONE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ECHOCRINE_STONE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ECHOCRINE_STONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ECHOCRINE_STONE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_ECHOCRINE_STONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_ECHOCRINE_STONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_ECHOCRINE_STONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHOCRINE_STONE_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.ECHOCRINE_STONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ECHOCRINE_STONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ECHOCRINE_STONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHOCRINE_STONE_BRICK_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.ECHOCRINE_STONE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ECHOCRINE_STONE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ECHOCRINE_STONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ECHOCRINE_STONE_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_ECHOCRINE_STONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_ECHOCRINE_STONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_ECHOCRINE_STONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHOCRINE_STONE_PILLAR, 2)
                .pattern("S")
                .pattern("S")
                .input('S', ModBlocks.ECHOCRINE_STONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ECHOCRINE_STONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ECHOCRINE_STONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOULSTONE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.SOULSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SOULSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.SOULSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SOULSTONE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.SMOOTH_SOULSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SMOOTH_SOULSTONE_STAIRS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.SMOOTH_SOULSTONE_STAIRS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOULSTONE_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.SOULSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SOULSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.SOULSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOULSTONE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.SOULSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SOULSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.SOULSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SOULSTONE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.SMOOTH_SOULSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SMOOTH_SOULSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.SMOOTH_SOULSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SOULSTONE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.CUT_SOULSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CUT_SOULSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.CUT_SOULSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SOULSTONE, 1)
                .pattern("d")
                .pattern("d")
                .input('d', ModBlocks.SOULSTONE_SLAB)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SOULSTONE_SLAB),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.SOULSTONE_SLAB))
                .offerTo(exporter);
        //endregion

        //region neurostone
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEUROSTONE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.NEUROSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NEUROSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.NEUROSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEUROSTONE_BRICK_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.NEUROSTONE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NEUROSTONE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.NEUROSTONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NEUROSTONE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_NEUROSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_NEUROSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_NEUROSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEUROSTONE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.NEUROSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NEUROSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.NEUROSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEUROSTONE_BRICK_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.NEUROSTONE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NEUROSTONE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.NEUROSTONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NEUROSTONE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_NEUROSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_NEUROSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_NEUROSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEUROSTONE_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.NEUROSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NEUROSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.NEUROSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NEUROSTONE_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_NEUROSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_NEUROSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_NEUROSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEUROSTONE_BRICK_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.NEUROSTONE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NEUROSTONE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.NEUROSTONE_BRICKS))
                .offerTo(exporter);
        //endregion

        //region tarshale
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TARSHALE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.TARSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.TARSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.TARSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TARSHALE_BRICK_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.TARSHALE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.TARSHALE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.TARSHALE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TARSHALE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_TARSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_TARSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_TARSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TARSHALE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.TARSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.TARSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.TARSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TARSHALE_BRICK_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.TARSHALE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.TARSHALE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.TARSHALE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TARSHALE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_TARSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_TARSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_TARSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TARSHALE_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.TARSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.TARSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.TARSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TARSHALE_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_TARSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_TARSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_TARSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TARSHALE_BRICK_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.TARSHALE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.TARSHALE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.TARSHALE_BRICKS))
                .offerTo(exporter);
        //endregion

        //region illuminium
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ILLUMINIUM_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.ILLUMINIUM)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ILLUMINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ILLUMINIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ILLUMINIUM_BRICK_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.ILLUMINIUM_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ILLUMINIUM_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ILLUMINIUM_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ILLUMINIUM_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_ILLUMINIUM)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_ILLUMINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_ILLUMINIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ILLUMINIUM_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.ILLUMINIUM)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ILLUMINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ILLUMINIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ILLUMINIUM_BRICK_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.ILLUMINIUM_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ILLUMINIUM_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ILLUMINIUM_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ILLUMINIUM_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_ILLUMINIUM)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_ILLUMINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_ILLUMINIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ILLUMINIUM_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.ILLUMINIUM)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ILLUMINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ILLUMINIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ILLUMINIUM_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_ILLUMINIUM)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_ILLUMINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_ILLUMINIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ILLUMINIUM_BRICK_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.ILLUMINIUM_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ILLUMINIUM_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ILLUMINIUM_BRICKS))
                .offerTo(exporter);
        //endregion

        //region marrowshale
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARROWSHALE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.MARROWSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MARROWSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MARROWSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARROWSHALE_BRICK_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.MARROWSHALE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MARROWSHALE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MARROWSHALE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARROWSHALE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_MARROWSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_MARROWSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_MARROWSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARROWSHALE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.MARROWSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MARROWSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MARROWSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARROWSHALE_BRICK_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.MARROWSHALE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MARROWSHALE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MARROWSHALE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARROWSHALE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_MARROWSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_MARROWSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_MARROWSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARROWSHALE_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.MARROWSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MARROWSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MARROWSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARROWSHALE_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_MARROWSHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_MARROWSHALE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_MARROWSHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARROWSHALE_BRICK_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.MARROWSHALE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MARROWSHALE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MARROWSHALE_BRICKS))
                .offerTo(exporter);
        //endregion

        //region voidstone
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOIDSTONE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.VOIDSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.VOIDSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.VOIDSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOIDSTONE_BRICK_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.VOIDSTONE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.VOIDSTONE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.VOIDSTONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_VOIDSTONE_STAIRS, 4)
                .pattern("d  ")
                .pattern("dd ")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_VOIDSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_VOIDSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_VOIDSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOIDSTONE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.VOIDSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.VOIDSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.VOIDSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOIDSTONE_BRICK_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.VOIDSTONE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.VOIDSTONE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.VOIDSTONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_VOIDSTONE_SLAB, 2)
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_VOIDSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_VOIDSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_VOIDSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOIDSTONE_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.VOIDSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.VOIDSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.VOIDSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_VOIDSTONE_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.POLISHED_VOIDSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_VOIDSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_VOIDSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOIDSTONE_BRICK_WALL, 6)
                .pattern("ddd")
                .pattern("ddd")
                .input('d', ModBlocks.VOIDSTONE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.VOIDSTONE_BRICKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.VOIDSTONE_BRICKS))
                .offerTo(exporter);
        //endregion

        //region GHAST TEAR IN A BOTTLE
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GHAST_TEAR_IN_A_BOTTLE)
                .pattern("T")
                .pattern("B")
                .input('T', Items.GHAST_TEAR)
                .input('B', Items.GLASS_BOTTLE)
                .criterion(FabricRecipeProvider.hasItem(Items.GHAST_TEAR),
                        FabricRecipeProvider.conditionsFromItem(Items.GHAST_TEAR))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CHITIN_BOMB)
                .pattern("CGC")
                .pattern("GGG")
                .pattern("CGC")
                .input('G', Items.GUNPOWDER)
                .input('C', ModItems.SCULK_CHITIN)
                .criterion(FabricRecipeProvider.hasItem(Items.GUNPOWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.GUNPOWDER))
                .offerTo(exporter);
        //endregion

        //Cherry bomb
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERRY_BOMB)
                .pattern("DID")
                .pattern("DTD")
                .pattern("DID")
                .input('D', ModItems.RUBY_DUST)
                .input('T', Items.TNT)
                .input('I', Items.IRON_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter);



        //region SMELTING

        offerSmelting(exporter, List.of(ModBlocks.DYANITE_ORE, ModBlocks.DEEPSLATE_DYANITE_ORE), RecipeCategory.MISC,
                ModItems.DYANITE, 1.5f, 200, "dyanite");


        offerSmelting(exporter, List.of(ModBlocks.AMALGAMITE_ORE), RecipeCategory.MISC,
                ModItems.AMALGAMITE, 1.5f, 200, "amalgamite");

        offerSmelting(exporter, List.of(ModBlocks.PETRINITE_CLAY, ModBlocks.PETRINITE_MUD), RecipeCategory.MISC,
                ModItems.PETRINITE_BULB, 1.5f, 200, "petrinite");

        offerSmelting(exporter, List.of(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE), RecipeCategory.MISC,
                ModItems.RUBY, 1.5f, 200, "ruby");

        offerSmelting(exporter, List.of(ModBlocks.ANTHOLIUM_ORE_SAND), RecipeCategory.MISC,
                ModItems.ANTHOLIUM, 1.5f, 200, "antholium");

        offerSmelting(exporter, List.of(ModBlocks.SLAGODITE_ORE, ModBlocks.SLAGODITE_ORE_BASALT), RecipeCategory.MISC,
                ModItems.SLAGODITE, 1.5f, 200, "slagodite");

        offerSmelting(exporter, List.of(ModBlocks.RUNIAN_ORE_SAND, ModBlocks.RUNIAN_ORE_SOIL), RecipeCategory.MISC,
                ModItems.RUNIAN, 1.5f, 200, "runian");

        offerSmelting(exporter, List.of(ModBlocks.JADESTONE_ORE), RecipeCategory.MISC,
                ModItems.JADESTONE, 1.5f, 200, "jadestone");

        offerSmelting(exporter, List.of(ModBlocks.BIOLIUM_ORE), RecipeCategory.MISC,
                ModItems.BIOLIUM, 1.5f, 200, "biolium");

        offerSmelting(exporter, List.of(ModBlocks.DENARIUM_ORE), RecipeCategory.MISC,
                ModItems.DENARIUM, 1.5f, 200, "denarium");

        offerSmelting(exporter, List.of(ModBlocks.GLAZONIUM_ORE), RecipeCategory.MISC,
                ModItems.GLAZONIUM, 1.5f, 200, "jadestone");

        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_SCULK_CHITIN_ORE), RecipeCategory.MISC,
                ModItems.CHITINOUS_GROWTH, 1.5f, 200, "sculk_chiten");

        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_COBGALITE_ORE), RecipeCategory.MISC,
                ModItems.COBGALITE, 1.5f, 200, "cobgalite");

        offerSmelting(exporter, List.of(ModBlocks.SOULSTONE), RecipeCategory.MISC,
                ModBlocks.SMOOTH_SOULSTONE, 1.5f, 200, "cobgalite");

        offerSmelting(exporter, List.of(ModBlocks.ECHOCRINE_GLOB), RecipeCategory.MISC,
                ModBlocks.ECHOCRINE_STONE, 1.5f, 200, "echocrine_glob");

        offerSmelting(exporter, List.of(ModBlocks.TAR), RecipeCategory.MISC,
                ModBlocks.TARSHALE, .1f, 200, "tarshale");

        //endregion

        //region BLASTING

        offerBlasting(exporter, List.of(ModBlocks.DYANITE_ORE, ModBlocks.DEEPSLATE_DYANITE_ORE), RecipeCategory.MISC,
                ModItems.DYANITE, 1.5f, 100, "dyanite");

        offerBlasting(exporter, List.of(ModBlocks.AMALGAMITE_ORE), RecipeCategory.MISC,
                ModItems.AMALGAMITE, 1.5f, 100, "amalgamite");

        offerBlasting(exporter, List.of(ModBlocks.PETRINITE_CLAY, ModBlocks.PETRINITE_MUD), RecipeCategory.MISC,
                ModItems.PETRINITE_BULB, 1.5f, 100, "petrinite");

        offerBlasting(exporter, List.of(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE), RecipeCategory.MISC,
                ModItems.RUBY, 1.5f, 100, "ruby");

        offerBlasting(exporter, List.of(ModBlocks.ANTHOLIUM_ORE_SAND), RecipeCategory.MISC,
                ModItems.ANTHOLIUM, 1.5f, 100, "antholium");

        offerBlasting(exporter, List.of(ModBlocks.SLAGODITE_ORE, ModBlocks.SLAGODITE_ORE_BASALT), RecipeCategory.MISC,
                ModItems.SLAGODITE, 1.5f, 100, "slagodite");

        offerBlasting(exporter, List.of(ModBlocks.RUNIAN_ORE_SAND, ModBlocks.RUNIAN_ORE_SOIL), RecipeCategory.MISC,
                ModItems.RUNIAN, 1.5f, 100, "runian");

        offerBlasting(exporter, List.of(ModBlocks.JADESTONE_ORE), RecipeCategory.MISC,
                ModItems.JADESTONE, 1.5f, 100, "jadestone");

        offerBlasting(exporter, List.of(ModBlocks.BIOLIUM_ORE), RecipeCategory.MISC,
                ModItems.BIOLIUM, 1.5f, 100, "biolium");

        offerBlasting(exporter, List.of(ModBlocks.DENARIUM_ORE), RecipeCategory.MISC,
                ModItems.DENARIUM, 1.5f, 100, "denarium");

        offerBlasting(exporter, List.of(ModBlocks.GLAZONIUM_ORE), RecipeCategory.MISC,
                ModItems.GLAZONIUM, 1.5f, 100, "jadestone");

        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_SCULK_CHITIN_ORE), RecipeCategory.MISC,
                ModItems.CHITINOUS_GROWTH, 1.5f, 100, "sculk_chiten");

        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_COBGALITE_ORE), RecipeCategory.MISC,
                ModItems.COBGALITE, 1.5f, 100, "cobgalite");

        //endregion

        //region SHAPELESS
        ShapelessRecipeJsonBuilder.create(
                RecipeCategory.MISC,
                Items.ECHO_SHARD,
                1
        ).input(ModItems.ECHORINE_PASTE)
                .input(Items.AMETHYST_SHARD).criterion(FabricRecipeProvider.hasItem(ModItems.ECHORINE_PASTE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ECHORINE_PASTE)).criterion(FabricRecipeProvider.hasItem(Items.ECHO_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.ECHO_SHARD)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(
                RecipeCategory.MISC,
                Items.EXPERIENCE_BOTTLE,
                1
        ).input(ModItems.RUNIAN, 3)
                .input(Items.GLASS_BOTTLE).criterion(FabricRecipeProvider.hasItem(ModItems.ECHORINE_PASTE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).criterion(FabricRecipeProvider.hasItem(ModItems.RUNIAN),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(
                RecipeCategory.MISC,
                ModItems.DENITIN_INGOT,
                1
        ).input(ModItems.SCULK_CHITIN, 4)
                .input(ModItems.DENARIUM, 4)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENARIUM),
                FabricRecipeProvider.conditionsFromItem(ModItems.SCULK_CHITIN)).criterion(FabricRecipeProvider.hasItem(ModItems.SCULK_CHITIN),
                FabricRecipeProvider.conditionsFromItem(ModItems.SCULK_CHITIN)).offerTo(exporter, "shapeless_denitium");


        ShapelessRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.CHARGED_SOULSTONE,
                        1
                ).input(ModItems.RUNIAN)
                .input(ModBlocks.SOULSTONE).criterion(FabricRecipeProvider.hasItem(ModBlocks.SOULSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).criterion(FabricRecipeProvider.hasItem(ModItems.RUNIAN),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.CHARGED_SOULSTONE_SLAB,
                        1
                ).input(ModItems.RUNIAN)
                .input(ModBlocks.SOULSTONE_SLAB).criterion(FabricRecipeProvider.hasItem(ModBlocks.SOULSTONE_SLAB),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).criterion(FabricRecipeProvider.hasItem(ModItems.RUNIAN),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.CHARGED_SOULSTONE_STAIRS,
                        1
                ).input(ModItems.RUNIAN)
                .input(ModBlocks.SOULSTONE_STAIRS).criterion(FabricRecipeProvider.hasItem(ModBlocks.SOULSTONE_STAIRS),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).criterion(FabricRecipeProvider.hasItem(ModItems.RUNIAN),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.CHARGED_SOULSTONE_WALL,
                        1
                ).input(ModItems.RUNIAN)
                .input(ModBlocks.SOULSTONE_WALL).criterion(FabricRecipeProvider.hasItem(ModBlocks.SOULSTONE_WALL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).criterion(FabricRecipeProvider.hasItem(ModItems.RUNIAN),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.CHARGED_CHISELED_SOULSTONE,
                        1
                ).input(ModItems.RUNIAN)
                .input(ModBlocks.CHISELED_SOULSTONE).criterion(FabricRecipeProvider.hasItem(ModBlocks.CHISELED_SOULSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).criterion(FabricRecipeProvider.hasItem(ModItems.RUNIAN),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.CHARGED_CUT_SOULSTONE,
                        1
                ).input(ModItems.RUNIAN)
                .input(ModBlocks.CUT_SOULSTONE).criterion(FabricRecipeProvider.hasItem(ModBlocks.CUT_SOULSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).criterion(FabricRecipeProvider.hasItem(ModItems.RUNIAN),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.CHARGED_CUT_SOULSTONE_SLAB,
                        1
                ).input(ModItems.RUNIAN)
                .input(ModBlocks.CUT_SOULSTONE_SLAB).criterion(FabricRecipeProvider.hasItem(ModBlocks.CUT_SOULSTONE_SLAB),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).criterion(FabricRecipeProvider.hasItem(ModItems.RUNIAN),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUNIAN)).offerTo(exporter);

        //endregion


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.PURPUR_BLOCK, 2)
                .pattern("PPP")
                .pattern("PEP")
                .pattern("PPP")
                .input('P', Items.POPPED_CHORUS_FRUIT)
                .input('E', ModBlocks.ENDBRINE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ENDBRINE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ENDBRINE))
                .offerTo(exporter, "endbrine");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ILLUMINIUM_LAMP, 2)
                .pattern("III")
                .pattern("IGI")
                .pattern("III")
                .input('I', ModBlocks.ILLUMINIUM)
                .input('G', Blocks.GLOWSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ILLUMINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ILLUMINIUM))
                .offerTo(exporter, "illuminium_lamp");

        //region Dust

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_DYANITE, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.RAW_DYANITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_raw_dyanite");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBGALITE, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.COBGALITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_cobgalite");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMALGAMITE, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.AMALGAMITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_amalgamite");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SPIRONITE, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.SPIRONITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_spironite");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ANTHOLIUM, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.ANTHOLIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_antholium");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PETRINITE_BULB, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.PETRINITE_BULB)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_petrinite_bulb");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PETRINITE_ROSE, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.PETRINITE_ROSE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_petrinite_rose");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PETRINITE_ROOTS, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.PETRINITE_ROOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_petrinite_roots");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_ruby");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHITINOUS_GROWTH, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.CHITINOUS_GROWTH)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_chitinous_growth");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SLAGODITE, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.SLAGODITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_slagodite");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BIOLIUM, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.BIOLIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_biolium");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUNIAN, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.RUNIAN)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_runian");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JADESTONE, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.JADESTONE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_jadestone");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DENARIUM, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.DENARIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_denarium");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GLAZONIUM, 2)
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .input('D', ModItems.RUBY_DUST)
                .input('G', ModItems.GLAZONIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY_DUST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RUBY_DUST))
                .offerTo(exporter, "dusted_glazonium");

        //endregion

    }

}
