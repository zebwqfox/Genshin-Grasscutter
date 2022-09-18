local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1
L0_1 = {}
L0_1.group_id = 133104135
L1_1 = {}
L2_1 = {}
L2_1.config_id = 135001
L2_1.monster_id = 21011201
L3_1 = {}
L3_1.x = 316.053
L3_1.y = 215.871
L3_1.z = 318.408
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 359.542
L3_1.y = 350.174
L3_1.z = 357.356
L2_1.rot = L3_1
L2_1.level = 19
L2_1.drop_id = 1000100
L2_1.disableWander = true
L2_1.area_id = 9
L3_1 = {}
L3_1.config_id = 135002
L3_1.monster_id = 21011201
L4_1 = {}
L4_1.x = 323.078
L4_1.y = 216.488
L4_1.z = 320.493
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 351.067
L4_1.y = 241.929
L4_1.z = 7.705
L3_1.rot = L4_1
L3_1.level = 19
L3_1.drop_id = 1000100
L3_1.disableWander = true
L3_1.pose_id = 9012
L3_1.area_id = 9
L4_1 = {}
L4_1.config_id = 135003
L4_1.monster_id = 21011001
L5_1 = {}
L5_1.x = 312.876
L5_1.y = 215.95
L5_1.z = 322.412
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 82.933
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 19
L4_1.drop_id = 1000100
L4_1.disableWander = true
L4_1.area_id = 9
L5_1 = {}
L5_1.config_id = 135004
L5_1.monster_id = 21030401
L6_1 = {}
L6_1.x = 314.399
L6_1.y = 216.072
L6_1.z = 326.918
L5_1.pos = L6_1
L6_1 = {}
L6_1.x = 0.0
L6_1.y = 166.178
L6_1.z = 0.0
L5_1.rot = L6_1
L5_1.level = 19
L5_1.drop_id = 1000100
L5_1.pose_id = 9012
L5_1.area_id = 9
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
L1_1[4] = L5_1
monsters = L1_1
L1_1 = {}
npcs = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 135007
L2_1.gadget_id = 70220013
L3_1 = {}
L3_1.x = 319.192
L3_1.y = 216.32
L3_1.z = 322.622
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 0.0
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 19
L2_1.area_id = 9
L1_1[1] = L2_1
gadgets = L1_1
L1_1 = {}
regions = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 1135010
L2_1.name = "ANY_GADGET_DIE_135010"
L3_1 = EventType
L3_1 = L3_1.EVENT_ANY_GADGET_DIE
L2_1.event = L3_1
L2_1.source = ""
L2_1.condition = "condition_EVENT_ANY_GADGET_DIE_135010"
L2_1.action = "action_EVENT_ANY_GADGET_DIE_135010"
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
L4_1 = 135001
L5_1 = 135002
L6_1 = 135003
L7_1 = 135004
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L3_1[4] = L7_1
L2_1.monsters = L3_1
L3_1 = {}
L4_1 = 135007
L3_1[1] = L4_1
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L4_1 = "ANY_GADGET_DIE_135010"
L3_1[1] = L4_1
L2_1.triggers = L3_1
L2_1.rand_weight = 100
L1_1[1] = L2_1
suites = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2
  L2_2 = ScriptLib
  L2_2 = L2_2.CheckRemainGadgetCountByGroupId
  L3_2 = A0_2
  L4_2 = {}
  L4_2.group_id = 133104135
  L2_2 = L2_2(L3_2, L4_2)
  if L2_2 ~= 0 then
    L2_2 = false
    return L2_2
  end
  L2_2 = true
  return L2_2
end
condition_EVENT_ANY_GADGET_DIE_135010 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2
  L2_2 = ScriptLib
  L2_2 = L2_2.AddQuestProgress
  L3_2 = A0_2
  L4_2 = "133104135"
  L2_2 = L2_2(L3_2, L4_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : add_quest_progress"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = 0
  return L2_2
end
action_EVENT_ANY_GADGET_DIE_135010 = L1_1