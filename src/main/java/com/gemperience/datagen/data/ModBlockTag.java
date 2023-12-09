package com.gemperience.datagen.data;

import com.gemperience.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

/**
 * Literally just a class that holds a bunch of vanilla tags.
 */
public class ModBlockTag extends FabricTagProvider.BlockTagProvider {
    public ModBlockTag(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Block> PICKAXE_BLOCKS = TagKey.of(RegistryKeys.BLOCK, (new Identifier("minecraft", "mineable/pickaxe")));
    public static final TagKey<Block> SHOVEL_BLOCKS = TagKey.of(RegistryKeys.BLOCK, (new Identifier("minecraft", "mineable/shovel")));
    public static final TagKey<Block> NEED_IRON_TOOLS = TagKey.of(RegistryKeys.BLOCK, (new Identifier("minecraft", "needs_iron_tool")));
    public static final TagKey<Block> NEED_DIAMOND_TOOLS = TagKey.of(RegistryKeys.BLOCK, (new Identifier("minecraft", "needs_diamond_tool")));
    public static final TagKey<Block> NEED_STONE_TOOLS = TagKey.of(RegistryKeys.BLOCK, (new Identifier("minecraft", "needs_stone_tool")));
    public static final TagKey<Block> SOUL_FIRE_BASE_BLOCKS = TagKey.of(RegistryKeys.BLOCK, (new Identifier("minecraft", "soul_fire_base_blocks")));
    public static final TagKey<Block> INFIINIBURN_OVERWORLD = TagKey.of(RegistryKeys.BLOCK, (new Identifier("minecraft", "infiniburn_overworld")));
    public static final TagKey<Block> INFIINIBURN_NETHER = TagKey.of(RegistryKeys.BLOCK, (new Identifier("minecraft", "infiniburn_nether")));
    public static final TagKey<Block> INFIINIBURN_END = TagKey.of(RegistryKeys.BLOCK, (new Identifier("minecraft", "infiniburn_end")));
    public static final TagKey<Block> WALLS = TagKey.of(RegistryKeys.BLOCK, (new Identifier("minecraft", "walls")));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(PICKAXE_BLOCKS)
                .add(ModBlocks.DYANITE_ORE)
                .add(ModBlocks.DEEPSLATE_DYANITE_ORE)
                .add(ModBlocks.RAW_DYANITE_BLOCK)
                .add(ModBlocks.AMALGAMITE_ORE)
                .add(ModBlocks.ANTHOLIUM_BLOCK)
                .add(ModBlocks.GEM_GRINDER_TIER_1)
                .add(ModBlocks.GEM_GRINDER_TIER_2)
                .add(ModBlocks.BIOLIUM_BLOCK)
                .add(ModBlocks.BIOLIUM_ORE)
                .add(ModBlocks.JADESTONE_BLOCK)
                .add(ModBlocks.SLAGODITE_ORE)
                .add(ModBlocks.SLAGODITE_BLOCK)
                .add(ModBlocks.DEEPSLATE_SCULK_CHITIN_ORE)
                .add(ModBlocks.DEEPSLATE_COBGALITE_ORE)
                .add(ModBlocks.JADESTONE_ORE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.DENARIUM_ORE)
                .add(ModBlocks.RUNIAN_BLOCK)
                .add(ModBlocks.DENARIUM_BLOCK)
                .add(ModBlocks.PETRINITE_BLOCK)
                .add(ModBlocks.ANTHOLIUM_BLOCK)
                .add(ModBlocks.GLAZONIUM_ORE)
                .add(ModBlocks.GLAZONIUM_BLOCK)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.ECHOCRINE_STONE)
                .add(ModBlocks.POLISHED_ECHOCRINE_STONE)
                .add(ModBlocks.POLISHED_ECHOCRINE_STONE_STAIRS)
                .add(ModBlocks.ECHOCRINE_STONE_BRICK_STAIRS)
                .add(ModBlocks.CHISELED_ECHOCRINE_STONE)
                .add(ModBlocks.ECHOCRINE_STONE_STAIRS)
                .add(ModBlocks.ECHOCRINE_STONE_SLAB)
                .add(ModBlocks.ECHOCRINE_STONE_BRICKS)
                .add(ModBlocks.ECHOCRINE_STONE_BRICK_SLAB)
                .add(ModBlocks.SPIRONITE_BLOCK)
                .add(ModBlocks.POLISHED_ECHOCRINE_STONE_SLAB)
                .add(ModBlocks.ECHOCRINE_STONE_PILLAR)
                .add(ModBlocks.ECHOCRINE_STONE_WALL)
                .add(ModBlocks.CHITINOUS_MASS)
                .add(ModBlocks.AMALGAMITE_BLOCK)
                .add(ModBlocks.COBGALITE_BLOCK)
                .add(ModBlocks.SLAGODITE_ORE_BASALT)
                .add(ModBlocks.DENITIN_BLOCK)

                .add(ModBlocks.SOULSTONE)
                .add(ModBlocks.SOULSTONE_STAIRS)
                .add(ModBlocks.SOULSTONE_SLAB)
                .add(ModBlocks.SOULSTONE_WALL)
                .add(ModBlocks.SMOOTH_SOULSTONE)
                .add(ModBlocks.SMOOTH_SOULSTONE_STAIRS)
                .add(ModBlocks.SMOOTH_SOULSTONE_SLAB)
                .add(ModBlocks.CHISELED_SOULSTONE)
                .add(ModBlocks.CUT_SOULSTONE)
                .add(ModBlocks.CUT_SOULSTONE_SLAB)

                .add(ModBlocks.CHARGED_SOULSTONE)
                .add(ModBlocks.CHARGED_SOULSTONE_STAIRS)
                .add(ModBlocks.CHARGED_SOULSTONE_SLAB)
                .add(ModBlocks.CHARGED_SOULSTONE_WALL)
                .add(ModBlocks.CHARGED_CHISELED_SOULSTONE)
                .add(ModBlocks.CHARGED_CUT_SOULSTONE)
                .add(ModBlocks.CHARGED_CUT_SOULSTONE_SLAB)

                .add(ModBlocks.VOIDSTONE)
                .add(ModBlocks.VOIDSTONE_STAIRS)
                .add(ModBlocks.VOIDSTONE_SLAB)
                .add(ModBlocks.VOIDSTONE_WALL)

                .add(ModBlocks.VOIDSTONE_BRICKS)
                .add(ModBlocks.VOIDSTONE_BRICK_STAIRS)
                .add(ModBlocks.VOIDSTONE_BRICK_SLAB)
                .add(ModBlocks.VOIDSTONE_BRICK_WALL)

                .add(ModBlocks.POLISHED_VOIDSTONE)
                .add(ModBlocks.POLISHED_VOIDSTONE_SLAB)
                .add(ModBlocks.POLISHED_VOIDSTONE_STAIRS)
                .add(ModBlocks.NEUROSTONE)
                .add(ModBlocks.NEUROSTONE_BRICKS)
                .add(ModBlocks.NEUROSTONE_STAIRS)
                .add(ModBlocks.NEUROSTONE_SLAB)
                .add(ModBlocks.NEUROSTONE_BRICK_SLAB)
                .add(ModBlocks.NEUROSTONE_BRICK_STAIRS)
                .add(ModBlocks.NEUROSTONE_BRICK_WALL)
                .add(ModBlocks.POLISHED_NEUROSTONE)
                .add(ModBlocks.POLISHED_NEUROSTONE_SLAB)
                .add(ModBlocks.POLISHED_NEUROSTONE_STAIRS)

                .add(ModBlocks.ILLUMINIUM)
                .add(ModBlocks.ILLUMINIUM_LAMP)
                .add(ModBlocks.ILLUMINIUM_SLAB)
                .add(ModBlocks.ILLUMINIUM_STAIRS)
                .add(ModBlocks.ILLUMINIUM_WALL)
                .add(ModBlocks.ILLUMINIUM_BRICKS)
                .add(ModBlocks.ILLUMINIUM_BRICK_SLAB)
                .add(ModBlocks.ILLUMINIUM_BRICK_STAIRS)
                .add(ModBlocks.ILLUMINIUM_BRICK_WALL)
                .add(ModBlocks.POLISHED_ILLUMINIUM)
                .add(ModBlocks.POLISHED_ILLUMINIUM_SLAB)
                .add(ModBlocks.POLISHED_ILLUMINIUM_STAIRS)
                .add(ModBlocks.POLISHED_ILLUMINIUM_WALL)

                .add(ModBlocks.MARROWSHALE)
                .add(ModBlocks.MARROWSHALE_SLAB)
                .add(ModBlocks.MARROWSHALE_STAIRS)
                .add(ModBlocks.MARROWSHALE_WALL)
                .add(ModBlocks.MARROWSHALE_BRICKS)
                .add(ModBlocks.MARROWSHALE_BRICK_SLAB)
                .add(ModBlocks.MARROWSHALE_BRICK_STAIRS)
                .add(ModBlocks.MARROWSHALE_BRICK_WALL)
                .add(ModBlocks.POLISHED_MARROWSHALE)
                .add(ModBlocks.POLISHED_MARROWSHALE_SLAB)
                .add(ModBlocks.POLISHED_MARROWSHALE_STAIRS)
                .add(ModBlocks.POLISHED_MARROWSHALE_WALL)

                .add(ModBlocks.TARSHALE)
                .add(ModBlocks.TARSHALE_SLAB)
                .add(ModBlocks.TARSHALE_STAIRS)
                .add(ModBlocks.TARSHALE_WALL)
                .add(ModBlocks.TARSHALE_BRICKS)
                .add(ModBlocks.TARSHALE_BRICK_SLAB)
                .add(ModBlocks.TARSHALE_BRICK_STAIRS)
                .add(ModBlocks.TARSHALE_BRICK_WALL)
                .add(ModBlocks.POLISHED_TARSHALE)
                .add(ModBlocks.POLISHED_TARSHALE_SLAB)
                .add(ModBlocks.POLISHED_TARSHALE_STAIRS)
                .add(ModBlocks.POLISHED_TARSHALE_WALL)

                .add(ModBlocks.KILN)

                .add(ModBlocks.DYANITE_BLOCK);

        getOrCreateTagBuilder(SHOVEL_BLOCKS)
                .add(ModBlocks.RUNIAN_ORE_SOIL)
                .add(ModBlocks.RUNIAN_ORE_SAND)
                .add(ModBlocks.PETRINITE_CLAY)
                .add(ModBlocks.PETRINITE_MUD)
                .add(ModBlocks.SPIRONITE_ORE)
                .add(ModBlocks.RUBY_DUST_BLOCK)
                .add(ModBlocks.ECHOCRINE_GLOB)
                .add(ModBlocks.TAR)
                .add(ModBlocks.ENDBRINE)
                .add(ModBlocks.ANTHOLIUM_ORE_SAND);

        getOrCreateTagBuilder(NEED_IRON_TOOLS)
                .add(ModBlocks.DYANITE_ORE)
                .add(ModBlocks.DEEPSLATE_SCULK_CHITIN_ORE)
                .add(ModBlocks.DEEPSLATE_DYANITE_ORE)
                .add(ModBlocks.SLAGODITE_ORE)
                .add(ModBlocks.SLAGODITE_BLOCK)
                .add(ModBlocks.AMALGAMITE_ORE)
                .add(ModBlocks.ANTHOLIUM_BLOCK)
                .add(ModBlocks.BIOLIUM_BLOCK)
                .add(ModBlocks.BIOLIUM_ORE)
                .add(ModBlocks.DEEPSLATE_COBGALITE_ORE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.COBGALITE_BLOCK)
                .add(ModBlocks.CHITINOUS_MASS)
                .add(ModBlocks.SLAGODITE_ORE_BASALT)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.AMALGAMITE_BLOCK)
                .add(ModBlocks.JADESTONE_ORE)
                .add(ModBlocks.RAW_DYANITE_BLOCK)


                .add(ModBlocks.DYANITE_BLOCK);

        getOrCreateTagBuilder(NEED_DIAMOND_TOOLS)
                .add(ModBlocks.DENARIUM_ORE)
                .add(ModBlocks.GLAZONIUM_ORE);

        getOrCreateTagBuilder(NEED_STONE_TOOLS)
                .add(ModBlocks.ANTHOLIUM_BLOCK);

        getOrCreateTagBuilder(WALLS)
                .add(ModBlocks.ECHOCRINE_STONE_WALL)
                .add(ModBlocks.POLISHED_ECHOCRINE_STONE_WALL)
                .add(ModBlocks.VOIDSTONE_WALL)
                .add(ModBlocks.VOIDSTONE_BRICK_WALL)
                .add(ModBlocks.POLISHED_VOIDSTONE_WALL)
                .add(ModBlocks.VOIDSTONE_WALL)
                .add(ModBlocks.POLISHED_VOIDSTONE_WALL)
                .add(ModBlocks.ECHOCRINE_STONE_BRICK_WALL)
                .add(ModBlocks.CHARGED_SOULSTONE_WALL)
                .add(ModBlocks.SOULSTONE_WALL)
                .add(ModBlocks.NEUROSTONE_WALL)
                .add(ModBlocks.POLISHED_NEUROSTONE_WALL)
                .add(ModBlocks.NEUROSTONE_BRICK_WALL)
                .add(ModBlocks.ILLUMINIUM_WALL)
                .add(ModBlocks.ILLUMINIUM_BRICK_WALL)
                .add(ModBlocks.POLISHED_ILLUMINIUM_WALL)
                .add(ModBlocks.TARSHALE_WALL)
                .add(ModBlocks.TARSHALE_BRICK_WALL)
                .add(ModBlocks.POLISHED_TARSHALE_WALL)
                .add(ModBlocks.MARROWSHALE_WALL)
                .add(ModBlocks.MARROWSHALE_BRICK_WALL)
                .add(ModBlocks.POLISHED_MARROWSHALE_WALL);

        getOrCreateTagBuilder(SOUL_FIRE_BASE_BLOCKS)
                .add(ModBlocks.RUNIAN_ORE_SAND)
                .add(ModBlocks.RUNIAN_ORE_SOIL)
                .add(ModBlocks.RUNIAN_BLOCK)
                .add(ModBlocks.SOULSTONE)
                //.add(ModBlocks.SOULSTONE_STAIRS)
                //.add(ModBlocks.SOULSTONE_SLAB)
                .add(ModBlocks.SMOOTH_SOULSTONE)
                //.add(ModBlocks.SMOOTH_SOULSTONE_STAIRS)
                //.add(ModBlocks.SMOOTH_SOULSTONE_SLAB)
                //.add(ModBlocks.CUT_SOULSTONE_SLAB)
                .add(ModBlocks.CUT_SOULSTONE)
                .add(ModBlocks.CHISELED_SOULSTONE)
                .add(ModBlocks.CHARGED_SOULSTONE)
                //.add(ModBlocks.CHARGED_SOULSTONE_STAIRS)
                //.add(ModBlocks.CHARGED_SOULSTONE_SLAB)
                //.add(ModBlocks.CHARGED_CUT_SOULSTONE_SLAB)
                .add(ModBlocks.CHARGED_CUT_SOULSTONE)
                .add(ModBlocks.CHARGED_CHISELED_SOULSTONE);

        getOrCreateTagBuilder(INFIINIBURN_OVERWORLD)
                .add(ModBlocks.TAR)
                .add(ModBlocks.TARSHALE)
                .add(ModBlocks.TARSHALE_SLAB)
                .add(ModBlocks.TARSHALE_STAIRS)
                .add(ModBlocks.TARSHALE_WALL)
                .add(ModBlocks.POLISHED_TARSHALE)
                .add(ModBlocks.POLISHED_TARSHALE_SLAB)
                .add(ModBlocks.POLISHED_TARSHALE_STAIRS)
                .add(ModBlocks.POLISHED_TARSHALE_WALL)
                .add(ModBlocks.TARSHALE_BRICKS)
                .add(ModBlocks.TARSHALE_BRICK_SLAB)
                .add(ModBlocks.TARSHALE_BRICK_STAIRS)
                .add(ModBlocks.TARSHALE_BRICK_WALL);

        getOrCreateTagBuilder(INFIINIBURN_NETHER)
                .add(ModBlocks.TAR)
                .add(ModBlocks.TARSHALE)
                .add(ModBlocks.TARSHALE_SLAB)
                .add(ModBlocks.TARSHALE_STAIRS)
                .add(ModBlocks.TARSHALE_WALL)
                .add(ModBlocks.POLISHED_TARSHALE)
                .add(ModBlocks.POLISHED_TARSHALE_SLAB)
                .add(ModBlocks.POLISHED_TARSHALE_STAIRS)
                .add(ModBlocks.POLISHED_TARSHALE_WALL)
                .add(ModBlocks.TARSHALE_BRICKS)
                .add(ModBlocks.TARSHALE_BRICK_SLAB)
                .add(ModBlocks.TARSHALE_BRICK_STAIRS)
                .add(ModBlocks.TARSHALE_BRICK_WALL);

        getOrCreateTagBuilder(INFIINIBURN_END)
                .add(ModBlocks.TAR)
                .add(ModBlocks.TARSHALE)
                .add(ModBlocks.TARSHALE_SLAB)
                .add(ModBlocks.TARSHALE_STAIRS)
                .add(ModBlocks.TARSHALE_WALL)
                .add(ModBlocks.POLISHED_TARSHALE)
                .add(ModBlocks.POLISHED_TARSHALE_SLAB)
                .add(ModBlocks.POLISHED_TARSHALE_STAIRS)
                .add(ModBlocks.POLISHED_TARSHALE_WALL)
                .add(ModBlocks.TARSHALE_BRICKS)
                .add(ModBlocks.TARSHALE_BRICK_SLAB)
                .add(ModBlocks.TARSHALE_BRICK_STAIRS)
                .add(ModBlocks.TARSHALE_BRICK_WALL);
    }
}
