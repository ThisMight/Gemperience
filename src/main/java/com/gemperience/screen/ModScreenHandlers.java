package com.gemperience.screen;

import com.gemperience.Gemperience;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<KilnScreenHandler> KILN_SCREEN_HANDLER_TYPE = Registry.register(
            Registries.SCREEN_HANDLER, new Identifier(Gemperience.MODID, "kiln_screen_handler"),
            new ExtendedScreenHandlerType<>(KilnScreenHandler::new));
}
