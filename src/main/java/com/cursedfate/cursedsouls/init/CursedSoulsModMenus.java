
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.cursedfate.cursedsouls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import com.cursedfate.cursedsouls.world.inventory.SoulMenuMenu;
import com.cursedfate.cursedsouls.CursedSoulsMod;

public class CursedSoulsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CursedSoulsMod.MODID);
	public static final RegistryObject<MenuType<SoulMenuMenu>> SOUL_MENU = REGISTRY.register("soul_menu", () -> IForgeMenuType.create(SoulMenuMenu::new));
}
