package com.cursedfate.cursedsouls.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;
import java.util.ArrayList;

import com.cursedfate.cursedsouls.CursedSoulsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CursedSoulsModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CursedSoulsMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.NewTechnique = original.NewTechnique;
			clone.CursedfateTechnique = original.CursedfateTechnique;
			clone.Cursedfateinnatemenuopened = original.Cursedfateinnatemenuopened;
			clone.CursedfateAbilityToCast = original.CursedfateAbilityToCast;
			clone.TextureOveride = original.TextureOveride;
			clone.soul1innate = original.soul1innate;
			clone.soul1level = original.soul1level;
			clone.soul1ce = original.soul1ce;
			clone.soul1weapon = original.soul1weapon;
			clone.soul1melee = original.soul1melee;
			clone.soul2innate = original.soul2innate;
			clone.soul2level = original.soul2level;
			clone.soul2ce = original.soul2ce;
			clone.soul2weapon = original.soul2weapon;
			clone.soul2melee = original.soul2melee;
			clone.soul1ct = original.soul1ct;
			clone.soul2ct = original.soul2ct;
			clone.Technique = original.Technique;
			clone.Awakening1 = original.Awakening1;
			clone.Awakening2 = original.Awakening2;
			clone.soul01 = original.soul01;
			clone.Selected = original.Selected;
			clone.s1a1 = original.s1a1;
			clone.s1a2 = original.s1a2;
			clone.s1a3 = original.s1a3;
			clone.s1a4 = original.s1a4;
			clone.s1a5 = original.s1a5;
			clone.s1a6 = original.s1a6;
			clone.s1a7 = original.s1a7;
			clone.s1a8 = original.s1a8;
			clone.s1a9 = original.s1a9;
			clone.s1a10 = original.s1a10;
			clone.s1a11 = original.s1a11;
			clone.s1a12 = original.s1a12;
			clone.s1a13 = original.s1a13;
			clone.s1a14 = original.s1a14;
			clone.s2a1 = original.s2a1;
			clone.s2a2 = original.s2a2;
			clone.s2a3 = original.s2a3;
			clone.s2a4 = original.s2a4;
			clone.s2a5 = original.s2a5;
			clone.s2a6 = original.s2a6;
			clone.s2a7 = original.s2a7;
			clone.s2a8 = original.s2a8;
			clone.s2a9 = original.s2a9;
			clone.s2a10 = original.s2a10;
			clone.s2a11 = original.s2a11;
			clone.s2a12 = original.s2a12;
			clone.s2a13 = original.s2a13;
			clone.s2a14 = original.s2a14;
			clone.s1a15 = original.s1a15;
			clone.s1a16 = original.s1a16;
			clone.s1a17 = original.s1a17;
			clone.s1a18 = original.s1a18;
			clone.s1a19 = original.s1a19;
			clone.s1a20 = original.s1a20;
			clone.s1a21 = original.s1a21;
			clone.s1a22 = original.s1a22;
			clone.s2a15 = original.s2a15;
			clone.s2a16 = original.s2a16;
			clone.s2a17 = original.s2a17;
			clone.s2a18 = original.s2a18;
			clone.s2a19 = original.s2a19;
			clone.s2a20 = original.s2a20;
			clone.s2a21 = original.s2a21;
			clone.s2a22 = original.s2a22;
			clone.GUIAnimation = original.GUIAnimation;
			if (!event.isWasDeath()) {
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("cursed_souls", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public String NewTechnique = "\"\"";
		public String CursedfateTechnique = "\"\"";
		public String Cursedfateinnatemenuopened = "";
		public double CursedfateAbilityToCast = 0;
		public boolean TextureOveride = false;
		public double soul1innate = 0.0;
		public double soul1level = 0;
		public double soul1ce = 0;
		public double soul1weapon = 0;
		public double soul1melee = 0;
		public double soul2innate = 0;
		public double soul2level = 0;
		public double soul2ce = 0;
		public double soul2weapon = 0;
		public double soul2melee = 0;
		public String soul1ct = "\"\"";
		public String soul2ct = "\"\"";
		public String Technique = "\"\"";
		public boolean Awakening1 = false;
		public boolean Awakening2 = false;
		public boolean soul01 = false;
		public boolean Selected = false;
		public double s1a1 = 0;
		public double s1a2 = 0;
		public double s1a3 = 0;
		public double s1a4 = 0;
		public double s1a5 = 0;
		public double s1a6 = 0;
		public double s1a7 = 0;
		public double s1a8 = 0;
		public double s1a9 = 0;
		public double s1a10 = 0;
		public double s1a11 = 0;
		public double s1a12 = 0;
		public double s1a13 = 0;
		public double s1a14 = 0;
		public double s2a1 = 0;
		public double s2a2 = 0;
		public double s2a3 = 0;
		public double s2a4 = 0;
		public double s2a5 = 0;
		public double s2a6 = 0;
		public double s2a7 = 0;
		public double s2a8 = 0;
		public double s2a9 = 0;
		public double s2a10 = 0;
		public double s2a11 = 0;
		public double s2a12 = 0;
		public double s2a13 = 0;
		public double s2a14 = 0;
		public double s1a15 = 0;
		public double s1a16 = 0;
		public double s1a17 = 0;
		public double s1a18 = 0;
		public double s1a19 = 0;
		public double s1a20 = 0;
		public double s1a21 = 0;
		public double s1a22 = 0;
		public double s2a15 = 0;
		public double s2a16 = 0;
		public double s2a17 = 0;
		public double s2a18 = 0;
		public double s2a19 = 0;
		public double s2a20 = 0;
		public double s2a21 = 0;
		public double s2a22 = 0;
		public double GUIAnimation = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CursedSoulsMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("NewTechnique", NewTechnique);
			nbt.putString("CursedfateTechnique", CursedfateTechnique);
			nbt.putString("Cursedfateinnatemenuopened", Cursedfateinnatemenuopened);
			nbt.putDouble("CursedfateAbilityToCast", CursedfateAbilityToCast);
			nbt.putBoolean("TextureOveride", TextureOveride);
			nbt.putDouble("soul1innate", soul1innate);
			nbt.putDouble("soul1level", soul1level);
			nbt.putDouble("soul1ce", soul1ce);
			nbt.putDouble("soul1weapon", soul1weapon);
			nbt.putDouble("soul1melee", soul1melee);
			nbt.putDouble("soul2innate", soul2innate);
			nbt.putDouble("soul2level", soul2level);
			nbt.putDouble("soul2ce", soul2ce);
			nbt.putDouble("soul2weapon", soul2weapon);
			nbt.putDouble("soul2melee", soul2melee);
			nbt.putString("soul1ct", soul1ct);
			nbt.putString("soul2ct", soul2ct);
			nbt.putString("Technique", Technique);
			nbt.putBoolean("Awakening1", Awakening1);
			nbt.putBoolean("Awakening2", Awakening2);
			nbt.putBoolean("soul01", soul01);
			nbt.putBoolean("Selected", Selected);
			nbt.putDouble("s1a1", s1a1);
			nbt.putDouble("s1a2", s1a2);
			nbt.putDouble("s1a3", s1a3);
			nbt.putDouble("s1a4", s1a4);
			nbt.putDouble("s1a5", s1a5);
			nbt.putDouble("s1a6", s1a6);
			nbt.putDouble("s1a7", s1a7);
			nbt.putDouble("s1a8", s1a8);
			nbt.putDouble("s1a9", s1a9);
			nbt.putDouble("s1a10", s1a10);
			nbt.putDouble("s1a11", s1a11);
			nbt.putDouble("s1a12", s1a12);
			nbt.putDouble("s1a13", s1a13);
			nbt.putDouble("s1a14", s1a14);
			nbt.putDouble("s2a1", s2a1);
			nbt.putDouble("s2a2", s2a2);
			nbt.putDouble("s2a3", s2a3);
			nbt.putDouble("s2a4", s2a4);
			nbt.putDouble("s2a5", s2a5);
			nbt.putDouble("s2a6", s2a6);
			nbt.putDouble("s2a7", s2a7);
			nbt.putDouble("s2a8", s2a8);
			nbt.putDouble("s2a9", s2a9);
			nbt.putDouble("s2a10", s2a10);
			nbt.putDouble("s2a11", s2a11);
			nbt.putDouble("s2a12", s2a12);
			nbt.putDouble("s2a13", s2a13);
			nbt.putDouble("s2a14", s2a14);
			nbt.putDouble("s1a15", s1a15);
			nbt.putDouble("s1a16", s1a16);
			nbt.putDouble("s1a17", s1a17);
			nbt.putDouble("s1a18", s1a18);
			nbt.putDouble("s1a19", s1a19);
			nbt.putDouble("s1a20", s1a20);
			nbt.putDouble("s1a21", s1a21);
			nbt.putDouble("s1a22", s1a22);
			nbt.putDouble("s2a15", s2a15);
			nbt.putDouble("s2a16", s2a16);
			nbt.putDouble("s2a17", s2a17);
			nbt.putDouble("s2a18", s2a18);
			nbt.putDouble("s2a19", s2a19);
			nbt.putDouble("s2a20", s2a20);
			nbt.putDouble("s2a21", s2a21);
			nbt.putDouble("s2a22", s2a22);
			nbt.putDouble("GUIAnimation", GUIAnimation);
			return nbt;
		}

		public void readNBT(Tag tag) {
			if (tag == null) {
				tag = writeNBT();
			}
			CompoundTag nbt = (CompoundTag) tag;
			if (nbt == null) {
				nbt = (CompoundTag) writeNBT();
			}
			NewTechnique = nbt.getString("NewTechnique");
			CursedfateTechnique = nbt.getString("CursedfateTechnique");
			Cursedfateinnatemenuopened = nbt.getString("Cursedfateinnatemenuopened");
			CursedfateAbilityToCast = nbt.getDouble("CursedfateAbilityToCast");
			TextureOveride = nbt.getBoolean("TextureOveride");
			soul1innate = nbt.getDouble("soul1innate");
			soul1level = nbt.getDouble("soul1level");
			soul1ce = nbt.getDouble("soul1ce");
			soul1weapon = nbt.getDouble("soul1weapon");
			soul1melee = nbt.getDouble("soul1melee");
			soul2innate = nbt.getDouble("soul2innate");
			soul2level = nbt.getDouble("soul2level");
			soul2ce = nbt.getDouble("soul2ce");
			soul2weapon = nbt.getDouble("soul2weapon");
			soul2melee = nbt.getDouble("soul2melee");
			soul1ct = nbt.getString("soul1ct");
			soul2ct = nbt.getString("soul2ct");
			Technique = nbt.getString("Technique");
			Awakening1 = nbt.getBoolean("Awakening1");
			Awakening2 = nbt.getBoolean("Awakening2");
			soul01 = nbt.getBoolean("soul01");
			Selected = nbt.getBoolean("Selected");
			s1a1 = nbt.getDouble("s1a1");
			s1a2 = nbt.getDouble("s1a2");
			s1a3 = nbt.getDouble("s1a3");
			s1a4 = nbt.getDouble("s1a4");
			s1a5 = nbt.getDouble("s1a5");
			s1a6 = nbt.getDouble("s1a6");
			s1a7 = nbt.getDouble("s1a7");
			s1a8 = nbt.getDouble("s1a8");
			s1a9 = nbt.getDouble("s1a9");
			s1a10 = nbt.getDouble("s1a10");
			s1a11 = nbt.getDouble("s1a11");
			s1a12 = nbt.getDouble("s1a12");
			s1a13 = nbt.getDouble("s1a13");
			s1a14 = nbt.getDouble("s1a14");
			s2a1 = nbt.getDouble("s2a1");
			s2a2 = nbt.getDouble("s2a2");
			s2a3 = nbt.getDouble("s2a3");
			s2a4 = nbt.getDouble("s2a4");
			s2a5 = nbt.getDouble("s2a5");
			s2a6 = nbt.getDouble("s2a6");
			s2a7 = nbt.getDouble("s2a7");
			s2a8 = nbt.getDouble("s2a8");
			s2a9 = nbt.getDouble("s2a9");
			s2a10 = nbt.getDouble("s2a10");
			s2a11 = nbt.getDouble("s2a11");
			s2a12 = nbt.getDouble("s2a12");
			s2a13 = nbt.getDouble("s2a13");
			s2a14 = nbt.getDouble("s2a14");
			s1a15 = nbt.getDouble("s1a15");
			s1a16 = nbt.getDouble("s1a16");
			s1a17 = nbt.getDouble("s1a17");
			s1a18 = nbt.getDouble("s1a18");
			s1a19 = nbt.getDouble("s1a19");
			s1a20 = nbt.getDouble("s1a20");
			s1a21 = nbt.getDouble("s1a21");
			s1a22 = nbt.getDouble("s1a22");
			s2a15 = nbt.getDouble("s2a15");
			s2a16 = nbt.getDouble("s2a16");
			s2a17 = nbt.getDouble("s2a17");
			s2a18 = nbt.getDouble("s2a18");
			s2a19 = nbt.getDouble("s2a19");
			s2a20 = nbt.getDouble("s2a20");
			s2a21 = nbt.getDouble("s2a21");
			s2a22 = nbt.getDouble("s2a22");
			GUIAnimation = nbt.getDouble("GUIAnimation");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CursedSoulsMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.NewTechnique = message.data.NewTechnique;
					variables.CursedfateTechnique = message.data.CursedfateTechnique;
					variables.Cursedfateinnatemenuopened = message.data.Cursedfateinnatemenuopened;
					variables.CursedfateAbilityToCast = message.data.CursedfateAbilityToCast;
					variables.TextureOveride = message.data.TextureOveride;
					variables.soul1innate = message.data.soul1innate;
					variables.soul1level = message.data.soul1level;
					variables.soul1ce = message.data.soul1ce;
					variables.soul1weapon = message.data.soul1weapon;
					variables.soul1melee = message.data.soul1melee;
					variables.soul2innate = message.data.soul2innate;
					variables.soul2level = message.data.soul2level;
					variables.soul2ce = message.data.soul2ce;
					variables.soul2weapon = message.data.soul2weapon;
					variables.soul2melee = message.data.soul2melee;
					variables.soul1ct = message.data.soul1ct;
					variables.soul2ct = message.data.soul2ct;
					variables.Technique = message.data.Technique;
					variables.Awakening1 = message.data.Awakening1;
					variables.Awakening2 = message.data.Awakening2;
					variables.soul01 = message.data.soul01;
					variables.Selected = message.data.Selected;
					variables.s1a1 = message.data.s1a1;
					variables.s1a2 = message.data.s1a2;
					variables.s1a3 = message.data.s1a3;
					variables.s1a4 = message.data.s1a4;
					variables.s1a5 = message.data.s1a5;
					variables.s1a6 = message.data.s1a6;
					variables.s1a7 = message.data.s1a7;
					variables.s1a8 = message.data.s1a8;
					variables.s1a9 = message.data.s1a9;
					variables.s1a10 = message.data.s1a10;
					variables.s1a11 = message.data.s1a11;
					variables.s1a12 = message.data.s1a12;
					variables.s1a13 = message.data.s1a13;
					variables.s1a14 = message.data.s1a14;
					variables.s2a1 = message.data.s2a1;
					variables.s2a2 = message.data.s2a2;
					variables.s2a3 = message.data.s2a3;
					variables.s2a4 = message.data.s2a4;
					variables.s2a5 = message.data.s2a5;
					variables.s2a6 = message.data.s2a6;
					variables.s2a7 = message.data.s2a7;
					variables.s2a8 = message.data.s2a8;
					variables.s2a9 = message.data.s2a9;
					variables.s2a10 = message.data.s2a10;
					variables.s2a11 = message.data.s2a11;
					variables.s2a12 = message.data.s2a12;
					variables.s2a13 = message.data.s2a13;
					variables.s2a14 = message.data.s2a14;
					variables.s1a15 = message.data.s1a15;
					variables.s1a16 = message.data.s1a16;
					variables.s1a17 = message.data.s1a17;
					variables.s1a18 = message.data.s1a18;
					variables.s1a19 = message.data.s1a19;
					variables.s1a20 = message.data.s1a20;
					variables.s1a21 = message.data.s1a21;
					variables.s1a22 = message.data.s1a22;
					variables.s2a15 = message.data.s2a15;
					variables.s2a16 = message.data.s2a16;
					variables.s2a17 = message.data.s2a17;
					variables.s2a18 = message.data.s2a18;
					variables.s2a19 = message.data.s2a19;
					variables.s2a20 = message.data.s2a20;
					variables.s2a21 = message.data.s2a21;
					variables.s2a22 = message.data.s2a22;
					variables.GUIAnimation = message.data.GUIAnimation;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
