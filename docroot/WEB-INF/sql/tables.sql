create table lrc_tb_CSDef_StepDef (
	compositeStepDefDBEId LONG not null,
	stepDefDBEId LONG not null,
	primary key (compositeStepDefDBEId, stepDefDBEId)
);

create table lrc_tb_CS_Step (
	compositeStepDBEId LONG not null,
	stepDBEId LONG not null,
	primary key (compositeStepDBEId, stepDBEId)
);

create table lrc_tb_CompositeStepDBE (
	compositeStepDBEId LONG not null primary key,
	currentStep INTEGER,
	compositeStepDefDBEId LONG
);

create table lrc_tb_CompositeStepDefDBE (
	compositeStepDefDBEId LONG not null primary key,
	stepsNumber INTEGER,
	sequential BOOLEAN,
	depth INTEGER
);

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
	StepType VARCHAR(75) null
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

create table lrc_tb_StepDef_CSDef (
	compositeStepDefDBEId LONG not null,
	compositeStepDefDBEId LONG not null,
	primary key (compositeStepDefDBEId, compositeStepDefDBEId)
);

create table lrc_tb_ToolDefDBE (
	toolDefDBEId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	toolName VARCHAR(75) null,
	compositeStepDefDBEId LONG
);

create table lrc_tb_ToolInstanceDBE (
	toolInstanceDBEId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	toolDefDBEId LONG,
	compositeStepDBEId LONG,
	toolTitle VARCHAR(75) null
);

create table lrc_tb_WS_Step (
	compositeStepDBEId LONG not null,
	stepDBEId LONG not null,
	primary key (compositeStepDBEId, stepDBEId)
);