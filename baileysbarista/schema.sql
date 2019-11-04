drop table if exists hasClass;
drop table if exists hasChallenge;
drop table if exists hasSkill;
drop table if exists challenge;
drop table if exists classes;
drop table if exists skill;
drop table if exists users;

CREATE TABLE users(
id SERIAL PRIMARY KEY,
username TEXT NOT NULL,
hash BYTEA NOT NULL,
salt BYTEA NOT NULL, 
dateenrolled TIMESTAMP NOT NULL,
userType TEXT NOT NULL,
UNIQUE (username)
);

CREATE TABLE skill(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL
);

CREATE TABLE classes(
    id SERIAL PRIMARY KEY,
    classname TEXT NOT NULL,
    classdesc TEXT NOT NULL,
    skillid int REFERENCES skill(id) on DELETE CASCADE,
    startdate DATE,
    enrolled int,
    rep int
);

CREATE TABLE challenge(
    id SERIAL PRIMARY KEY,
    challengename TEXT,
    challengedesc TEXT,
    classid int REFERENCES classes(id) on DELETE CASCADE
);

CREATE TABLE hasClass(
    id SERIAL PRIMARY KEY,
    userid int REFERENCES users(id) on DELETE CASCADE,
    classid int REFERENCES classes(id) on DELETE CASCADE,
    class_status TEXT

);
CREATE TABLE hasSkill(
    id SERIAL PRIMARY KEY,
    userid int REFERENCES users(id) on DELETE CASCADE,
    skillid int REFERENCES skill(id) on DELETE CASCADE,
    endorse TEXT
);

CREATE TABLE hasChallenge(
    id SERIAL PRIMARY KEY,
    userid int REFERENCES users(id) on DELETE CASCADE,
    challengeid int REFERENCES challenge(id) on DELETE CASCADE,
    challengestatus text
);

