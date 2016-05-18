create index IX_BBECD760 on lrc_tb_Instance (groupId);
create index IX_B1A01F1F on lrc_tb_Instance (groupId, name);
create index IX_7D23C6C4 on lrc_tb_Instance (userId);

create index IX_4241BE28 on lrc_tb_ToolInstance (groupId);
create index IX_560ECFE7 on lrc_tb_ToolInstance (groupId, name);
create index IX_68B2E6FC on lrc_tb_ToolInstance (userId);

create index IX_B22AD0B4 on lrc_tb_WrapperStep (wrapperStepId);