package com.cursedfate.cursedsouls.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import com.cursedfate.cursedsouls.network.CursedSoulsModVariables;

@Mod.EventBusSubscriber
public class A7Procedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static boolean execute(Entity entity) {
		return execute(null, entity);
	}

	private static boolean execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).CursedfateAbilityToCast == 7;
	}
}
