create table lrc_tb_InstalledStep (
	stepType VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	namespace VARCHAR(75) null,
	className VARCHAR(75) null
);

create table lrc_tb_StepDBE (
	stepDBEId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	StepDefDBEId LONG
);

create table lrc_tb_StepDefDBE (
	stepDefDBEId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	stepType VARCHAR(75) null
);

create table lrc_tb_ToolDefDBE (
	toolDefDBEId LONG not null primary key,
	toolName VARCHAR(75) null
);

create table lrc_tb_ToolInstanceDBE (
	toolInstanceDBEId LONG not null primary key,
	toolDefDBEId LONG
);

create table lrc_tb_WSDef_StepDef (
	stepDefDBEId LONG not null,
	wrapperStepDefDBEId LONG not null,
	primary key (stepDefDBEId, wrapperStepDefDBEId)
);

create table lrc_tb_WS_Step (
	stepDBEId LONG not null,
	wrapperStepDBEId LONG not null,
	primary key (stepDBEId, wrapperStepDBEId)
);

create table lrc_tb_WrapperStepDBE (
	wrapperStepDBEId LONG not null primary key,
	currentStep INTEGER
);

create table lrc_tb_WrapperStepDefDBE (
	wrapperStepDefDBEId LONG not null primary key,
	stepsNumber INTEGER,
	sequential BOOLEAN,
	depth INTEGER
);