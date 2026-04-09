package com.cursedfate.cursedsouls.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import com.cursedfate.cursedsouls.network.CursedSoulsModVariables;

public class Soul2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).soul01) {
			{
				boolean _setval = true;
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.soul01 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
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
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), _command);
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
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s InnateMastery"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.soul1innate = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s Level"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.soul1level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s CEMastery"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.soul1ce = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s WeaponMastery"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.soul1weapon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s StrengthMastery"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.soul1melee = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum1"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum2"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum3"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum4"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum5"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum6"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum7"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum8"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum9"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum10"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum11"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum12"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum13"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum14"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum15"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum16"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum17"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum18"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum19"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum20"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum21"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
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
				}.getResult(entity, "cursedfate Datapack ReturnAndPrint @s AbilityNum22"));
				entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedfateAbilityToCast = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level().getServer(), _ent),
							("cursedfate Addon SetTechnique @s " + (entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).soul2ct));
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level().getServer(), _ent),
							("cursedfate SetMastery Levels Innate " + (entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).soul2innate + " @s"));
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level().getServer(), _ent),
							("cursedfate SetPlayerLevel SetLevel " + (entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).soul2level + " @s"));
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level().getServer(), _ent),
							("cursedfate SetMastery Levels CE " + (entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).soul2ce + " @s"));
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level().getServer(), _ent),
							("cursedfate SetMastery Levels Weapon " + (entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).soul2weapon + " @s"));
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level().getServer(), _ent),
							("cursedfate SetMastery Levels Melee " + (entity.getCapability(CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CursedSoulsModVariables.PlayerVariables())).soul2melee + " @s"));
				}
			} // 1. Get your addon's capability (Pulling from the S2 variable set)
			var myVars = (entity.getCapability(com.cursedfate.cursedsouls.network.CursedSoulsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new com.cursedfate.cursedsouls.network.CursedSoulsModVariables.PlayerVariables()));
			// 2. Access the Cursed Fate slots
			entity.getCapability(cursedfate.network.CursedfateModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				// Mapping all 22 slots for Preset 2
				capability.AbilityNum1 = (int) myVars.s2a1;
				capability.AbilityNum2 = (int) myVars.s2a2;
				capability.AbilityNum3 = (int) myVars.s2a3;
				capability.AbilityNum4 = (int) myVars.s2a4;
				capability.AbilityNum5 = (int) myVars.s2a5;
				capability.AbilityNum6 = (int) myVars.s2a6;
				capability.AbilityNum7 = (int) myVars.s2a7;
				capability.AbilityNum8 = (int) myVars.s2a8;
				capability.AbilityNum9 = (int) myVars.s2a9;
				capability.AbilityNum10 = (int) myVars.s2a10;
				capability.AbilityNum11 = (int) myVars.s2a11;
				capability.AbilityNum12 = (int) myVars.s2a12;
				capability.AbilityNum13 = (int) myVars.s2a13;
				capability.AbilityNum14 = (int) myVars.s2a14;
				capability.AbilityNum15 = (int) myVars.s2a15;
				capability.AbilityNum16 = (int) myVars.s2a16;
				capability.AbilityNum17 = (int) myVars.s2a17;
				capability.AbilityNum18 = (int) myVars.s2a18;
				capability.AbilityNum19 = (int) myVars.s2a19;
				capability.AbilityNum20 = (int) myVars.s2a20;
				capability.AbilityNum21 = (int) myVars.s2a21;
				capability.AbilityNum22 = (int) myVars.s2a22;
				// 3. Final sync
				capability.syncPlayerVariables(entity);
			});
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Already Active"), true);
		}
	}
}
