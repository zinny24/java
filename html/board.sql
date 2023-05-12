drop database groupware;

create database groupware;
show databases;
use groupware;

show tables;

create table board(
bid int not null auto_increment,
title varchar(255) not null,
name varchar(20) not null,
content text,
regdate datetime,
primary key(bid)
);

desc board;




















