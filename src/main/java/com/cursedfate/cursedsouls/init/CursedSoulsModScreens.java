
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.cursedfate.cursedsouls.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import com.cursedfate.cursedsouls.client.gui.SoulMenuScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CursedSoulsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CursedSoulsModMenus.SOUL_MENU.get(), SoulMenuScreen::new);
		});
	}
}
