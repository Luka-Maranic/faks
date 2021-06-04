create table if not exists users (
    id identity,
    userName varchar(100) not null unique,
    fullName varchar(100) not null,
    email varchar(100) not null,
    password varchar(100) not null,
    active boolean not null
);

create table if not exists question (
    id identity,
    question varchar(200) not null unique,
    correctAnswer varchar(200) not null,
    score bigint not null
);

create table if not exists qestionnaire (
    id identity,
    name varchar(200) not null unique,
    score bigint not null
);

create table if not exists results (
    id identity,
    name varchar(200) not null unique,
    totalScore bigint not null,
    answers bigint not null
);

create table if not exists answers (
    id identity,
    question varchar(200) not null unique,
    correctAnswer boolean not null,
    score bigint not null,
    results bigint not null
);

create table if not exists role (
    id identity,
    name varchar(100) not null unique,
    role bigint not null
);
