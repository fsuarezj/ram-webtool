create unique index IX_DC6DB0F7 on lrc_tb_InstalledStep (stepType);

create index IX_92ADE7B4 on lrc_tb_StepDBE (stepDBEId);

create index IX_E82A48C0 on lrc_tb_StepDefDBE (stepDefDBEId);

create index IX_37079E58 on lrc_tb_ToolDefDBE (toolDefDBEId);
create index IX_A0E2BFC6 on lrc_tb_ToolDefDBE (toolName);

create index IX_7003C694 on lrc_tb_ToolInstanceDBE (toolInstanceDBEId);

create index IX_46873517 on lrc_tb_WSDef_StepDef (stepDefDBEId);
create index IX_7916F6D2 on lrc_tb_WSDef_StepDef (wrapperStepDefDBEId);

create index IX_742F32E0 on lrc_tb_WS_Step (stepDBEId);
create index IX_B48FB65D on lrc_tb_WS_Step (wrapperStepDBEId);

create index IX_792FA474 on lrc_tb_WrapperStepDBE (wrapperStepDBEId);

create index IX_15832034 on lrc_tb_WrapperStepDefDBE (wrapperStepDefDBEId);