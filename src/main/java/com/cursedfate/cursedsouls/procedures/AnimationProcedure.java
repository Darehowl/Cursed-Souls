package com.cursedfate.cursedsouls.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import com.cursedfate.cursedsouls.network.CursedSoulsModVariables;
import com.cursedfate.cursedsouls.CursedSoulsMod;

@Mod.EventBusSubscriber
public class AnimationProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CursedSoulsMod.queueServerWork(2, () -> {
			{
				double _setval = (entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).GUIAnimation + 1;
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.GUIAnimation = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		});
		if ((entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).CursedfateAbilityToCast >= 13) {
			{
				double _setval = 0;
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.GUIAnimation = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
