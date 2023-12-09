package com.gemperience.datagen.data;

import com.gemperience.Gemperience;
import com.gemperience.blocks.ModBlocks;
import com.gemperience.items.ModItems;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.ImpossibleCriterion;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancements implements Consumer<Consumer<Advancement>> {

    @Override
    public void accept(Consumer<Advancement> consumer) {
        Advancement GEMPERIENCE_ROOT = Advancement.Builder.create()
                .display(
                        ModItems.DYANITE, // The display icon
                        Text.translatable("adv.gemperience.rootgems.title"), // The title
                        Text.translatable("adv.gemperience.rootgems.desc"), // The description
                        new Identifier(Gemperience.MODID, "textures/block/denarium_block.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        false, // Show toast top right
                        false, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("root_adv_get", new ImpossibleCriterion.Conditions())
                .build(consumer, Gemperience.MODID + ":root");

        Advancement RAW_DYANITE_GET = Advancement.Builder.create().parent(GEMPERIENCE_ROOT)
                .display(
                        ModItems.RAW_DYANITE,
                        Text.translatable("adv.gemperience.raw_dyanite_get.title"),
                        Text.translatable("adv.gemperience.raw_dyanite_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_raw_dyanite", InventoryChangedCriterion.Conditions.items(ModItems.RAW_DYANITE))
                .build(consumer, AppendName("gameplay/raw_dyanite_get"));

        Advancement AMALGAMITE_GET = Advancement.Builder.create().parent(RAW_DYANITE_GET)
                .display(
                        ModItems.AMALGAMITE,
                        Text.translatable("adv.gemperience.amalgamite_get.title"),
                        Text.translatable("adv.gemperience.amalgamite_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_amalgamite", InventoryChangedCriterion.Conditions.items(ModItems.AMALGAMITE))
                .build(consumer, AppendName("gameplay/amalgamite_get"));

        Advancement CHITIN_GET = Advancement.Builder.create().parent(AMALGAMITE_GET)
                .display(
                        ModItems.CHITINOUS_GROWTH,
                        Text.translatable("adv.gemperience.sculk_chitin_get.title"),
                        Text.translatable("adv.gemperience.sculk_chitin_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_sculk_chitin", InventoryChangedCriterion.Conditions.items(ModItems.CHITINOUS_GROWTH))
                .build(consumer, AppendName("gameplay/sculk_chitin_get"));

        Advancement ECHOCRINE_GET = Advancement.Builder.create().parent(CHITIN_GET)
                .display(
                        ModItems.ECHORINE_PASTE,
                        Text.translatable("adv.gemperience.echocrine_get.title"),
                        Text.translatable("adv.gemperience.echocrine_get.desc"),
                        null,
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                ).criterion("needs_echocrine", InventoryChangedCriterion.Conditions.items(ModItems.ECHORINE_PASTE))
                .build(consumer, AppendName("gameplay/echocrine_get"));

        Advancement SPIRONITE_GET = Advancement.Builder.create().parent(RAW_DYANITE_GET)
                .display(
                        ModItems.SPIRONITE,
                        Text.translatable("adv.gemperience.spironite_get.title"),
                        Text.translatable("adv.gemperience.spironite_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_spironite", InventoryChangedCriterion.Conditions.items(ModItems.SPIRONITE))
                .build(consumer, AppendName("gameplay/spironite_get"));

        Advancement COBGALITE_GET = Advancement.Builder.create().parent(SPIRONITE_GET)
                .display(
                        ModItems.COBGALITE,
                        Text.translatable("adv.gemperience.cobgalite_get.title"),
                        Text.translatable("adv.gemperience.cobgalite_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_cobgalite", InventoryChangedCriterion.Conditions.items(ModItems.COBGALITE))
                .build(consumer, AppendName("gameplay/cobgalite"));

        Advancement ANTHOLIUM_GET = Advancement.Builder.create().parent(SPIRONITE_GET)
                .display(
                        ModItems.ANTHOLIUM,
                        Text.translatable("adv.gemperience.antholium_get.title"),
                        Text.translatable("adv.gemperience.antholium_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_antholium", InventoryChangedCriterion.Conditions.items(ModItems.ANTHOLIUM))
                .build(consumer, AppendName("gameplay/antholium_get"));

        Advancement PETRINITE_GET = Advancement.Builder.create().parent(ANTHOLIUM_GET)
                .display(
                        ModItems.PETRINITE_BULB,
                        Text.translatable("adv.gemperience.petrinite_get.title"),
                        Text.translatable("adv.gemperience.petrinite_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_petrinite", InventoryChangedCriterion.Conditions.items(ModItems.PETRINITE_BULB))
                .build(consumer, AppendName("gameplay/petrinite_get"));

        Advancement SLAGODITE_GET = Advancement.Builder.create().parent(GEMPERIENCE_ROOT)
                .display(
                        ModItems.SLAGODITE,
                        Text.translatable("adv.gemperience.slagodite_get.title"),
                        Text.translatable("adv.gemperience.slagodite_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_slagodite", InventoryChangedCriterion.Conditions.items(ModItems.SLAGODITE))
                .build(consumer, AppendName("gameplay/slagodite_get"));

        Advancement RUNIAN_GET = Advancement.Builder.create().parent(SLAGODITE_GET)
                .display(
                        ModItems.RUNIAN,
                        Text.translatable("adv.gemperience.runian_get.title"),
                        Text.translatable("adv.gemperience.runian_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_runian", InventoryChangedCriterion.Conditions.items(ModItems.RUNIAN))
                .build(consumer, AppendName("gameplay/runian_get"));

        Advancement JADESTONE_GET = Advancement.Builder.create().parent(RUNIAN_GET)
                .display(
                        ModItems.JADESTONE,
                        Text.translatable("adv.gemperience.jadestone_get.title"),
                        Text.translatable("adv.gemperience.jadestone_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_jadestone", InventoryChangedCriterion.Conditions.items(ModItems.JADESTONE))
                .build(consumer, AppendName("gameplay/jadestone_get"));

        Advancement CRUSH_FIRST_GEM = Advancement.Builder.create().parent(GEMPERIENCE_ROOT)
                .display(
                        ModBlocks.GEM_GRINDER_TIER_1,
                        Text.translatable("adv.gemperience.crush_first_gem.title"),
                        Text.translatable("adv.gemperience.crush_first_gem.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("gem_crushed", new ImpossibleCriterion.Conditions())
                .build(consumer, AppendName("gameplay/crush_first_gem"));

        Advancement GLAZONIUM_GET = Advancement.Builder.create().parent(GEMPERIENCE_ROOT)
                .display(
                        ModItems.GLAZONIUM,
                        Text.translatable("adv.gemperience.glazonium_get.title"),
                        Text.translatable("adv.gemperience.glazonium_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_glazonium", InventoryChangedCriterion.Conditions.items(ModItems.GLAZONIUM))
                .build(consumer, AppendName("gameplay/glazonium_get"));

        Advancement DENARIUM_GET = Advancement.Builder.create().parent(GLAZONIUM_GET)
                .display(
                        ModItems.DENARIUM,
                        Text.translatable("adv.gemperience.denarium_get.title"),
                        Text.translatable("adv.gemperience.denarium_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_denarium", InventoryChangedCriterion.Conditions.items(ModItems.DENARIUM))
                .build(consumer, AppendName("gameplay/denarium_get"));

        Advancement BIOLIUM_GET = Advancement.Builder.create().parent(JADESTONE_GET)
                .display(
                        ModItems.BIOLIUM,
                        Text.translatable("adv.gemperience.biolium_get.title"),
                        Text.translatable("adv.gemperience.biolium_get.desc"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                ).criterion("needs_biolium", InventoryChangedCriterion.Conditions.items(ModItems.BIOLIUM))
                .build(consumer, AppendName("gameplay/biolium_get"));

        Advancement GRIND_ALL_GEMS = Advancement.Builder.create().parent(CRUSH_FIRST_GEM).display(
                ModItems.DYANITE,
                Text.translatable("adv.gemperience.grind_all_gems.title"),
                Text.translatable("adv.gemperience.grind_all_gems.desc"),
                null,
                AdvancementFrame.CHALLENGE,
                true,
                true,
                false
        ).criterion("ground_raw_dyanite", new ImpossibleCriterion.Conditions()
        ).criterion("ground_amalgamite", new ImpossibleCriterion.Conditions()
        ).criterion("ground_cobgalite", new ImpossibleCriterion.Conditions()
        ).criterion("ground_spironite", new ImpossibleCriterion.Conditions()
        ).criterion("ground_petrinite_bulb", new ImpossibleCriterion.Conditions()
        ).criterion("ground_petrinite_rose", new ImpossibleCriterion.Conditions()
        ).criterion("ground_petrinite_roots", new ImpossibleCriterion.Conditions()
        ).criterion("ground_denarium", new ImpossibleCriterion.Conditions()
        ).criterion("ground_glazonium", new ImpossibleCriterion.Conditions()
        ).criterion("ground_slagodite", new ImpossibleCriterion.Conditions()
        ).criterion("ground_jadestone", new ImpossibleCriterion.Conditions()
        ).criterion("ground_runian", new ImpossibleCriterion.Conditions()
        ).criterion("ground_ruby", new ImpossibleCriterion.Conditions()
        ).criterion("ground_antholium", new ImpossibleCriterion.Conditions()
        ).criterion("ground_chitinous_growth", new ImpossibleCriterion.Conditions()
        ).criterion("ground_biolium", new ImpossibleCriterion.Conditions()
        ).build(consumer, AppendName("gameplay/grind_all_gems"));

        Advancement RUNAIN_SPAWNED = Advancement.Builder.create().parent(RUNIAN_GET).display(
                ModBlocks.RUNIAN_ORE_SOIL,
                Text.translatable("adv.gemperience.spawned_runian.title"),
                Text.translatable("adv.gemperience.spawned_runian.desc"),
                null,
                AdvancementFrame.GOAL,
                true,
                true,
                false
        ).criterion("generated_runian_using_entity", new ImpossibleCriterion.Conditions()
        ).build(consumer, AppendName("gameplay/generated_runian_using_entity"));

        Advancement DRINKING_TEARS = Advancement.Builder.create().parent(GEMPERIENCE_ROOT).display(
                ModItems.GHAST_TEAR_IN_A_BOTTLE,
                Text.translatable("adv.gemperience.drinking_tears.title"),
                Text.translatable("adv.gemperience.drinking_tears.desc"),
                null,
                AdvancementFrame.TASK,
                true,
                true,
                false
        ).criterion("drank_tears", new ImpossibleCriterion.Conditions()
        ).build(consumer, AppendName("gameplay/drinking_tears"));
    }

    private String AppendName(String input){
        return Gemperience.MODID + ":" + input;
    }
}
