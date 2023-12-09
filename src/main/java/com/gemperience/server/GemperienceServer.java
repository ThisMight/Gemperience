package com.gemperience.server;

import com.gemperience.util.ModServerEvents;
import net.fabricmc.api.DedicatedServerModInitializer;


public class GemperienceServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        System.out.println("Serverside, initialised.");
        ModServerEvents.registerModServerEventListeners();
    }
}