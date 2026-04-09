
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.cursedfate.cursedsouls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import com.cursedfate.cursedsouls.item.SoulOrbItem;
import com.cursedfate.cursedsouls.CursedSoulsMod;

public class CursedSoulsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CursedSoulsMod.MODID);
	public static final RegistryObject<Item> SOUL_ORB = REGISTRY.register("soul_orb", () -> new SoulOrbItem());
	// Start of user code block custom items
	// End of user code block custom items
}
