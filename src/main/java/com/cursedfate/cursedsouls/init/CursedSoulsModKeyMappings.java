
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.cursedfate.cursedsouls.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import com.cursedfate.cursedsouls.network.SoulBindingMessage;
import com.cursedfate.cursedsouls.network.QuickShiftMessage;
import com.cursedfate.cursedsouls.CursedSoulsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CursedSoulsModKeyMappings {
	public static final KeyMapping SOUL_BINDING = new KeyMapping("key.cursed_souls.soul_binding", GLFW.GLFW_KEY_KP_5, "key.categories.souls") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CursedSoulsMod.PACKET_HANDLER.sendToServer(new SoulBindingMessage(0, 0));
				SoulBindingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping QUICK_SHIFT = new KeyMapping("key.cursed_souls.quick_shift", GLFW.GLFW_KEY_RIGHT_SHIFT, "key.categories.souls") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CursedSoulsMod.PACKET_HANDLER.sendToServer(new QuickShiftMessage(0, 0));
				QuickShiftMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SOUL_BINDING);
		event.register(QUICK_SHIFT);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				SOUL_BINDING.consumeClick();
				QUICK_SHIFT.consumeClick();
			}
		}
	}
}
