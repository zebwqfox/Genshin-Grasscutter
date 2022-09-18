local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1
L0_1 = {}
L0_1.group_id = 133007239
L1_1 = {}
L2_1 = {}
L2_1.config_id = 239001
L2_1.monster_id = 21010201
L3_1 = {}
L3_1.x = 2886.012
L3_1.y = 209.23
L3_1.z = -56.17
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 0.0
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 23
L2_1.drop_tag = "\228\184\152\228\184\152\228\186\186"
L2_1.disableWander = true
L2_1.area_id = 4
L3_1 = {}
L3_1.config_id = 239004
L3_1.monster_id = 21010401
L4_1 = {}
L4_1.x = 2883.549
L4_1.y = 212.849
L4_1.z = -59.09
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 0.0
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 30
L3_1.drop_tag = "\232\191\156\231\168\139\228\184\152\228\184\152\228\186\186"
L3_1.pose_id = 402
L3_1.area_id = 4
L4_1 = {}
L4_1.config_id = 239005
L4_1.monster_id = 21010401
L5_1 = {}
L5_1.x = 2889.828
L5_1.y = 212.909
L5_1.z = -48.989
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 279.978
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 30
L4_1.drop_tag = "\232\191\156\231\168\139\228\184\152\228\184\152\228\186\186"
L4_1.pose_id = 402
L4_1.area_id = 4
L5_1 = {}
L5_1.config_id = 239006
L5_1.monster_id = 21020101
L6_1 = {}
L6_1.x = 2883.175
L6_1.y = 208.986
L6_1.z = -50.1
L5_1.pos = L6_1
L6_1 = {}
L6_1.x = 0.0
L6_1.y = 316.068
L6_1.z = 0.0
L5_1.rot = L6_1
L5_1.level = 30
L5_1.drop_tag = "\228\184\152\228\184\152\230\154\180\229\190\146"
L5_1.disableWander = true
L5_1.area_id = 4
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
L1_1[4] = L5_1
monsters = L1_1
L1_1 = {}
npcs = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 239002
L2_1.gadget_id = 70211012
L3_1 = {}
L3_1.x = 2888.5
L3_1.y = 209.4
L3_1.z = -55.4
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 309.645
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 21
L2_1.drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\232\146\153\229\190\183"
L3_1 = GadgetState
L3_1 = L3_1.ChestLocked
L2_1.state = L3_1
L2_1.isOneoff = true
L2_1.persistent = true
L3_1 = {}
L3_1.name = "chest"
L3_1.exp = 1
L2_1.explore = L3_1
L2_1.area_id = 4
L3_1 = {}
L3_1.config_id = 239007
L3_1.gadget_id = 70310001
L4_1 = {}
L4_1.x = 2882.712
L4_1.y = 208.502
L4_1.z = -56.922
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 241.393
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 23
L4_1 = GadgetState
L4_1 = L4_1.GearStart
L3_1.state = L4_1
L3_1.area_id = 4
L4_1 = {}
L4_1.config_id = 239008
L4_1.gadget_id = 70310001
L5_1 = {}
L5_1.x = 2888.66
L5_1.y = 209.207
L5_1.z = -50.513
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 134.44
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 23
L5_1 = GadgetState
L5_1 = L5_1.GearStart
L4_1.state = L5_1
L4_1.area_id = 4
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
gadgets = L1_1
L1_1 = {}
regions = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 1239003
L2_1.name = "ANY_MONSTER_DIE_239003"
L3_1 = EventType
L3_1 = L3_1.EVENT_ANY_MONSTER_DIE
L2_1.event = L3_1
L2_1.source = ""
L2_1.condition = "condition_EVENT_ANY_MONSTER_DIE_239003"
L2_1.action = "action_EVENT_ANY_MONSTER_DIE_239003"
L1_1[1] = L2_1
triggers = L1_1
L1_1 = {}
variables = L1_1
L1_1 = {}
L1_1.suite = 1
L1_1.end_suite = 0
L1_1.rand_suite = false
init_config = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L4_1 = 239001
L5_1 = 239004
L6_1 = 239005
L7_1 = 239006
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L3_1[4] = L7_1
L2_1.monsters = L3_1
L3_1 = {}
L4_1 = 239002
L5_1 = 239007
L6_1 = 239008
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L4_1 = "ANY_MONSTER_DIE_239003"
L3_1[1] = L4_1
L2_1.triggers = L3_1
L2_1.rand_weight = 100
L1_1[1] = L2_1
suites = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2
  L2_2 = ScriptLib
  L2_2 = L2_2.GetGroupMonsterCount
  L3_2 = A0_2
  L2_2 = L2_2(L3_2)
  if L2_2 ~= 0 then
    L2_2 = false
    return L2_2
  end
  L2_2 = true
  return L2_2
end
condition_EVENT_ANY_MONSTER_DIE_239003 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2, L5_2, L6_2
  L2_2 = ScriptLib
  L2_2 = L2_2.SetGadgetStateByConfigId
  L3_2 = A0_2
  L4_2 = 239002
  L5_2 = GadgetState
  L5_2 = L5_2.Default
  L2_2 = L2_2(L3_2, L4_2, L5_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : set_gadget_state_by_configId"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = ScriptLib
  L2_2 = L2_2.MarkPlayerAction
  L3_2 = A0_2
  L4_2 = 4000
  L5_2 = 3
  L6_2 = 1
  L2_2 = L2_2(L3_2, L4_2, L5_2, L6_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : mark_playerAction"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = 0
  return L2_2
end
action_EVENT_ANY_MONSTER_DIE_239003 = L1_1
