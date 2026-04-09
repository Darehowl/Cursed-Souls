package com.cursedfate.cursedsouls.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import com.cursedfate.cursedsouls.network.CursedSoulsModVariables;

@Mod.EventBusSubscriber
public class AwakeningProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).Awakening2) {
			if ((entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).Awakening1) {
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
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), _command);
										}
										return _result.toString();
									}
								}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s StrengthMastery")) >= 50) {
									{
										boolean _setval = true;
										entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.Awakening2 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("You Have Awakened Your Dormant Soul"), false);
								}
							}
						}
					}
				}
			}
		}
	}
}
