create table TM_NF_NotFound (
	notFoundId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	classNameId LONG,
	keywords VARCHAR(75) null
);