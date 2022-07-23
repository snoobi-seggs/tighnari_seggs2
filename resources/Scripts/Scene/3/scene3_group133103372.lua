local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1, L8_1
L0_1 = {}
L0_1.group_id = 133103372
L1_1 = {}
L2_1 = {}
L2_1.config_id = 372001
L2_1.monster_id = 21010501
L3_1 = {}
L3_1.x = 236.328
L3_1.y = 235.541
L3_1.z = 1025.831
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 318.768
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 19
L2_1.drop_tag = "\232\191\156\231\168\139\228\184\152\228\184\152\228\186\186"
L2_1.disableWander = true
L2_1.pose_id = 9013
L2_1.area_id = 6
L3_1 = {}
L3_1.config_id = 372006
L3_1.monster_id = 21010101
L4_1 = {}
L4_1.x = 230.271
L4_1.y = 235.63
L4_1.z = 1024.941
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 224.377
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 19
L3_1.drop_tag = "\228\184\152\228\184\152\228\186\186"
L3_1.disableWander = true
L3_1.area_id = 6
L4_1 = {}
L4_1.config_id = 372007
L4_1.monster_id = 21010101
L5_1 = {}
L5_1.x = 234.515
L5_1.y = 237.117
L5_1.z = 1015.233
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 0.0
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 19
L4_1.drop_tag = "\228\184\152\228\184\152\228\186\186"
L4_1.disableWander = true
L4_1.area_id = 6
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
monsters = L1_1
L1_1 = {}
npcs = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 372002
L2_1.gadget_id = 70211012
L3_1 = {}
L3_1.x = 241.042
L3_1.y = 235.617
L3_1.z = 1020.043
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 353.609
L3_1.y = 289.333
L3_1.z = 354.013
L2_1.rot = L3_1
L2_1.level = 16
L2_1.drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\231\146\131\230\156\136"
L3_1 = GadgetState
L3_1 = L3_1.ChestLocked
L2_1.state = L3_1
L2_1.isOneoff = true
L2_1.persistent = true
L3_1 = {}
L3_1.name = "chest"
L3_1.exp = 1
L2_1.explore = L3_1
L2_1.area_id = 6
L3_1 = {}
L3_1.config_id = 372008
L3_1.gadget_id = 70310006
L4_1 = {}
L4_1.x = 234.894
L4_1.y = 236.929
L4_1.z = 1016.842
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 0.0
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 19
L3_1.area_id = 6
L4_1 = {}
L4_1.config_id = 372009
L4_1.gadget_id = 70300089
L5_1 = {}
L5_1.x = 232.633
L5_1.y = 235.838
L5_1.z = 1024.38
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 12.34
L5_1.y = 0.0
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 19
L4_1.area_id = 6
L5_1 = {}
L5_1.config_id = 372011
L5_1.gadget_id = 70300088
L6_1 = {}
L6_1.x = 232.538
L6_1.y = 234.686
L6_1.z = 1030.195
L5_1.pos = L6_1
L6_1 = {}
L6_1.x = 0.0
L6_1.y = 61.958
L6_1.z = 0.0
L5_1.rot = L6_1
L5_1.level = 19
L5_1.area_id = 6
L6_1 = {}
L6_1.config_id = 372013
L6_1.gadget_id = 70220013
L7_1 = {}
L7_1.x = 232.523
L7_1.y = 237.156
L7_1.z = 1018.165
L6_1.pos = L7_1
L7_1 = {}
L7_1.x = 0.0
L7_1.y = 0.0
L7_1.z = 0.0
L6_1.rot = L7_1
L6_1.level = 19
L6_1.area_id = 6
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
L1_1[4] = L5_1
L1_1[5] = L6_1
gadgets = L1_1
L1_1 = {}
regions = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 1372003
L2_1.name = "ANY_MONSTER_DIE_372003"
L3_1 = EventType
L3_1 = L3_1.EVENT_ANY_MONSTER_DIE
L2_1.event = L3_1
L2_1.source = ""
L2_1.condition = "condition_EVENT_ANY_MONSTER_DIE_372003"
L2_1.action = "action_EVENT_ANY_MONSTER_DIE_372003"
L1_1[1] = L2_1
triggers = L1_1
L1_1 = {}
variables = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L3_1.config_id = 372017
L3_1.gadget_id = 70220025
L4_1 = {}
L4_1.x = 239.879
L4_1.y = 235.647
L4_1.z = 1022.589
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 275.313
L4_1.y = 92.478
L4_1.z = 270.0
L3_1.rot = L4_1
L3_1.level = 19
L3_1.area_id = 6
L2_1[1] = L3_1
L1_1.gadgets = L2_1
garbages = L1_1
L1_1 = {}
L1_1.suite = 1
L1_1.end_suite = 0
L1_1.rand_suite = false
init_config = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L4_1 = 372001
L5_1 = 372006
L6_1 = 372007
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L2_1.monsters = L3_1
L3_1 = {}
L4_1 = 372002
L5_1 = 372008
L6_1 = 372009
L7_1 = 372011
L8_1 = 372013
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L3_1[4] = L7_1
L3_1[5] = L8_1
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L4_1 = "ANY_MONSTER_DIE_372003"
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
condition_EVENT_ANY_MONSTER_DIE_372003 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2, L5_2, L6_2
  L2_2 = ScriptLib
  L2_2 = L2_2.SetGadgetStateByConfigId
  L3_2 = A0_2
  L4_2 = 372002
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
  L4_2 = 4001
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
action_EVENT_ANY_MONSTER_DIE_372003 = L1_1
