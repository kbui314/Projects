drop table if exists hasClass;
drop table if exists hasChallenge;
drop table if exists hasSkill;
drop table if exists challenge;
drop table if exists classes;
drop table if exists skill;
drop table if exists users;

CREATE TABLE users(
id SERIAL PRIMARY KEY,
username TEXT,
hash BYTEA,
salt BYTEA, 
dateenrolled DATE,
userType TEXT
);

CREATE TABLE skill(
    id Serial PRIMARY KEY,
    name TEXT
);

CREATE TABLE classes(
    id SERIAL PRIMARY KEY,
    classname TEXT,
    classdesc TEXT,
    skillid int REFERENCES skill(id),
    startdate DATE,
    enrolled int
);

CREATE TABLE challenge(
    id SERIAL PRIMARY KEY,
    challengename TEXT,
    challengedesc TEXT,
    classid int REFERENCES classes(id)
);

CREATE TABLE hasClass(
    id SERIAL PRIMARY KEY,
    userid int REFERENCES users(id),
    classid int REFERENCES classes(id),
    status TEXT

);
CREATE TABLE hasSkill(
    id SERIAL PRIMARY KEY,
    userid int REFERENCES users(id),
    skillid int REFERENCES skill(id),
    endorse TEXT
);

CREATE TABLE hasChallenge(
    id SERIAL PRIMARY KEY,
    userid int REFERENCES users(id),
    challid int REFERENCES challenge(id)
);

