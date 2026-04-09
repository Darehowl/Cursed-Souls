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
				}
			});
			context.setPacketHandled(true);
		}
	}
}
