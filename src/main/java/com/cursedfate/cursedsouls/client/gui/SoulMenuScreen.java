package com.cursedfate.cursedsouls.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

import com.cursedfate.cursedsouls.world.inventory.SoulMenuMenu;
import com.cursedfate.cursedsouls.procedures.CheckSoulProcedure;
import com.cursedfate.cursedsouls.procedures.CheckSoul2Procedure;
import com.cursedfate.cursedsouls.procedures.Check2Procedure;
import com.cursedfate.cursedsouls.procedures.Check1Procedure;
import com.cursedfate.cursedsouls.network.SoulMenuButtonMessage;
import com.cursedfate.cursedsouls.CursedSoulsMod;

public class SoulMenuScreen extends AbstractContainerScreen<SoulMenuMenu> {
	private final static HashMap<String, Object> guistate = SoulMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_holder;
	ImageButton imagebutton_holder1;

	public SoulMenuScreen(SoulMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("cursed_souls:textures/screens/soul_menu.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (Check1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cursed_souls:textures/screens/selected.png"), this.leftPos + -71, this.topPos + 35, 0, 0, 40, 40, 40, 40);
		}
		if (Check2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cursed_souls:textures/screens/selected.png"), this.leftPos + 29, this.topPos + 35, 0, 0, 40, 40, 40, 40);
		}

		guiGraphics.blit(new ResourceLocation("cursed_souls:textures/screens/selected.png"), this.leftPos + -71, this.topPos + 35, 0, 0, 40, 40, 40, 40);

		guiGraphics.blit(new ResourceLocation("cursed_souls:textures/screens/selected.png"), this.leftPos + 29, this.topPos + 35, 0, 0, 40, 40, 40, 40);

		guiGraphics.blit(new ResourceLocation("cursed_souls:textures/screens/soul11.png"), this.leftPos + -59, this.topPos + 47, 0, 0, 16, 16, 16, 208);

		guiGraphics.blit(new ResourceLocation("cursed_souls:textures/screens/soul22.png"), this.leftPos + 41, this.topPos + 47, 0, 0, 16, 16, 16, 208);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		imagebutton_holder = new ImageButton(this.leftPos + -71, this.topPos + 35, 40, 40, 0, 0, 40, new ResourceLocation("cursed_souls:textures/screens/atlas/imagebutton_holder.png"), 40, 80, e -> {
			if (CheckSoulProcedure.execute()) {
				CursedSoulsMod.PACKET_HANDLER.sendToServer(new SoulMenuButtonMessage(0, x, y, z));
				SoulMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = CheckSoulProcedure.execute();
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_holder", imagebutton_holder);
		this.addRenderableWidget(imagebutton_holder);
		imagebutton_holder1 = new ImageButton(this.leftPos + 29, this.topPos + 35, 40, 40, 0, 0, 40, new ResourceLocation("cursed_souls:textures/screens/atlas/imagebutton_holder1.png"), 40, 80, e -> {
			if (CheckSoul2Procedure.execute()) {
				CursedSoulsMod.PACKET_HANDLER.sendToServer(new SoulMenuButtonMessage(1, x, y, z));
				SoulMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = CheckSoul2Procedure.execute();
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_holder1", imagebutton_holder1);
		this.addRenderableWidget(imagebutton_holder1);
	}
}
