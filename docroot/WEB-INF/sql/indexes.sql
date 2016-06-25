create index IX_592FE45A on lrc_tb_CSDef_StepDef (compositeStepDefDBEId);
create index IX_C495B03 on lrc_tb_CSDef_StepDef (stepDefDBEId);

create index IX_8B692BD5 on lrc_tb_CS_Step (compositeStepDBEId);
create index IX_5B8A7374 on lrc_tb_CS_Step (stepDBEId);

create index IX_1840210C on lrc_tb_CompositeStepDBE (compositeStepDBEId);

create index IX_3E468774 on lrc_tb_CompositeStepDefDBE (compositeStepDefDBEId);

create unique index IX_DC6DB0F7 on lrc_tb_InstalledStep (stepType);

create index IX_92ADE7B4 on lrc_tb_StepDBE (stepDBEId);

create index IX_E82A48C0 on lrc_tb_StepDefDBE (stepDefDBEId);

create index IX_D2C971DA on lrc_tb_StepDef_CSDef (compositeStepDefDBEId);

create index IX_37079E58 on lrc_tb_ToolDefDBE (toolDefDBEId);
create index IX_A0E2BFC6 on lrc_tb_ToolDefDBE (toolName);

create index IX_56F9B982 on lrc_tb_ToolInstanceDBE (groupId, toolDefDBEId);
create index IX_5D83B5DA on lrc_tb_ToolInstanceDBE (toolDefDBEId);
create index IX_7003C694 on lrc_tb_ToolInstanceDBE (toolInstanceDBEId);

create index IX_C5A705E9 on lrc_tb_WS_Step (compositeStepDBEId);
create index IX_742F32E0 on lrc_tb_WS_Step (stepDBEId);