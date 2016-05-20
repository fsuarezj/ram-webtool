create table lrc_tb_Instance (
	instanceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	step INTEGER
);

create table lrc_tb_ToolInstance (
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	toolInstanceId LONG not null primary key,
	wrapperStepId LONG
);

create table lrc_tb_WrapperStep (
	wrapperStepId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStep INTEGER,
	sequential BOOLEAN,
	stepsNumber INTEGER
);