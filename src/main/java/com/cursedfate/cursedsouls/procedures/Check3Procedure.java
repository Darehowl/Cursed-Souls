package com.cursedfate.cursedsouls.procedures;

import net.minecraft.world.entity.Entity;

import com.cursedfate.cursedsouls.network.CursedSoulsModVariables;

public class Check3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).soul01;
	}
}
