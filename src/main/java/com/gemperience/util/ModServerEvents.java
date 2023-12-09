package com.gemperience.util;

import com.gemperience.Gemperience;
import com.gemperience.projectiles.ChitinBombProjectile;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModServerEvents {
    public static void registerModServerEventListeners(){
        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
            if (!handler.player.getAdvancementTracker().getProgress(server.getAdvancementLoader().get(new Identifier(Gemperience.MODID, "root"))).isDone()) {
                handler.player.getAdvancementTracker().grantCriterion(server.getAdvancementLoader().get(new Identifier(Gemperience.MODID, "root")), "root_adv_get");
            }
        });

        ServerLivingEntityEvents.ALLOW_DAMAGE.register((handler, sender, server) -> {
            if (sender.getSource() != null) {
                return !(sender.getSource() instanceof ChitinBombProjectile);
            }
            return true;
        });
    }
}
