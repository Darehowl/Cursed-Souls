package com.cursedfate.cursedsouls.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import com.cursedfate.cursedsouls.network.CursedSoulsModVariables;

public class SoulOrbRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).Awakening1) {
			if (new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(new Object() {
				public String getResult(Entity _ent, String _command) {
					StringBuilder _result = new StringBuilder();
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						CommandSource _dataConsumer = new CommandSource() {
							@Override
							public void sendSystemMessage(Component message) {
								_result.append(message.getString());
							}

							@Override
							public boolean acceptsSuccess() {
								return true;
							}

							@Override
							public boolean acceptsFailure() {
								return true;
							}

							@Override
							public boolean shouldInformAdmins() {
								return false;
							}
						};
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), _command);
					}
					return _result.toString();
				}
			}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s InnateMastery")) >= 100) {
				if (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new Object() {
					public String getResult(Entity _ent, String _command) {
						StringBuilder _result = new StringBuilder();
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							CommandSource _dataConsumer = new CommandSource() {
								@Override
								public void sendSystemMessage(Component message) {
									_result.append(message.getString());
								}

								@Override
								public boolean acceptsSuccess() {
									return true;
								}

								@Override
								public boolean acceptsFailure() {
									return true;
								}

								@Override
								public boolean shouldInformAdmins() {
									return false;
								}
							};
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), _command);
						}
						return _result.toString();
					}
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s Level")) >= 75) {
					if (new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new Object() {
						public String getResult(Entity _ent, String _command) {
							StringBuilder _result = new StringBuilder();
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								CommandSource _dataConsumer = new CommandSource() {
									@Override
									public void sendSystemMessage(Component message) {
										_result.append(message.getString());
									}

									@Override
									public boolean acceptsSuccess() {
										return true;
									}

									@Override
									public boolean acceptsFailure() {
										return true;
									}

									@Override
									public boolean shouldInformAdmins() {
										return false;
									}
								};
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), _command);
							}
							return _result.toString();
						}
					}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s CEMastery")) >= 50) {
						if (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(new Object() {
							public String getResult(Entity _ent, String _command) {
								StringBuilder _result = new StringBuilder();
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									CommandSource _dataConsumer = new CommandSource() {
										@Override
										public void sendSystemMessage(Component message) {
											_result.append(message.getString());
										}

										@Override
										public boolean acceptsSuccess() {
											return true;
										}

										@Override
										public boolean acceptsFailure() {
											return true;
										}

										@Override
										public boolean shouldInformAdmins() {
											return false;
										}
									};
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), _command);
								}
								return _result.toString();
							}
						}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s WeaponMastery")) >= 50) {
							if (new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(new Object() {
								public String getResult(Entity _ent, String _command) {
									StringBuilder _result = new StringBuilder();
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										CommandSource _dataConsumer = new CommandSource() {
											@Override
											public void sendSystemMessage(Component message) {
												_result.append(message.getString());
											}

											@Override
											public boolean acceptsSuccess() {
												return true;
											}

											@Override
											public boolean acceptsFailure() {
												return true;
											}

											@Override
											public boolean shouldInformAdmins() {
												return false;
											}
										};
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
												_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), _command);
									}
									return _result.toString();
								}
							}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s StrengthMastery")) >= 50) {
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s cursed_souls:soul_orb 1");
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SOUL, x, y, z, 20, 3, 3, 3, 0.5);
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 255, false, false));
								{
									String _setval = new Object() {
										public String getResult(Entity _ent, String _command) {
											StringBuilder _result = new StringBuilder();
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												CommandSource _dataConsumer = new CommandSource() {
													@Override
													public void sendSystemMessage(Component message) {
														_result.append(message.getString());
													}

													@Override
													public boolean acceptsSuccess() {
														return true;
													}

													@Override
													public boolean acceptsFailure() {
														return true;
													}

													@Override
													public boolean shouldInformAdmins() {
														return false;
													}
												};
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), _command);
											}
											return _result.toString();
										}
									}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s Technique");
									entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.soul1ct = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									double _setval = 25;
									entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.soul1innate = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									double _setval = 25;
									entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.soul1level = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									double _setval = 25;
									entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.soul1ce = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									double _setval = 25;
									entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.soul1weapon = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									double _setval = 25;
									entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.soul1melee = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									String _setval = "Shrine";
									entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Technique = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level().getServer(), _ent),
												("cursedfate Addon SetTechnique @s " + (entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).Technique));
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "cursedfate SetMastery Levels CE 0 @s");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"cursedfate SetMastery Levels Weapon 0 @s");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"cursedfate SetMastery Levels Melee 0 @s");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "cursedfate SetMastery Points CE 0 @s");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"cursedfate SetMastery Points Weapon 0 @s");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "cursedfate SetMastery Points CE 0 @s");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"cursedfate SetPlayerLevel SetLevel 2 @s");
									}
								}
								{
									boolean _setval = true;
									entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.Awakening1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("cursed_souls:observation_of_the_soul"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										for (String criteria : _ap.getRemainingCriteria())
											_player.getAdvancements().award(_adv, criteria);
									}
								}
								{
									boolean _setval = true;
									entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.soul01 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("You Need More Melee Mastery"), false);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You Need More Weapon Mastery"), false);
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("You Need More CE Mastery"), false);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You Need More Player Levels"), false);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("You Need More Innate Mastery " + (100 - new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(new Object() {
						public String getResult(Entity _ent, String _command) {
							StringBuilder _result = new StringBuilder();
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								CommandSource _dataConsumer = new CommandSource() {
									@Override
									public void sendSystemMessage(Component message) {
										_result.append(message.getString());
									}

									@Override
									public boolean acceptsSuccess() {
										return true;
									}

									@Override
									public boolean acceptsFailure() {
										return true;
									}

									@Override
									public boolean shouldInformAdmins() {
										return false;
									}
								};
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), _command);
							}
							return _result.toString();
						}
					}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s InnateMastery"))))), false);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You Already Have A Dormant Soul"), false);
		}
	}
}
