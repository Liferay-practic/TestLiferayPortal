create table liferay_db_TestNotice (
	noticeId LONG not null primary key,
	noticeText VARCHAR(75) null,
	ownerId LONG
);

create table liferay_db_TestUser (
	customUserId LONG not null primary key,
	name VARCHAR(75) null,
	mail VARCHAR(75) null,
	message VARCHAR(75) null
);