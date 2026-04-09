
package com.cursedfate.cursedsouls.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import com.cursedfate.cursedsouls.procedures.CheckSoulProcedure;
import com.cursedfate.cursedsouls.procedures.CheckSoul2Procedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SoulOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (CheckSoul2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cursed_souls:textures/screens/soul11.png"), w / 2 + 93, h / 2 + 102, 0, 0, 16, 16, 16, 208);
			}
			if (CheckSoulProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cursed_souls:textures/screens/soul22.png"), w / 2 + 93, h / 2 + 102, 0, 0, 16, 16, 16, 208);
			}
		}
	}
}
