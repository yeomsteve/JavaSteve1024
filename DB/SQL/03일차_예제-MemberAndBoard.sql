-- test 데이터베이스 생성alter
-- create database test;
-- test 데이터베이스가 존재하지않으면 test데이터베이스 생성
create database if not exists test;
-- test 데이터베이스 선택
use test;
-- test 데이터베이스 삭제
-- drop database test;
-- test 데이터베이스가 존재하면 test데이터베이스 삭제
-- drop database if exists test;
-- member 테이블 생성
-- 속성으로 id(최대문자열13, 기본키), 비번(최대문자열20), 이름을 가짐
create table if not exists member(
	id varchar(13) primary key,
    pw varchar(20) not null,
    name varchar(30) not null    
);
-- auto_increment : 기본키만 가능, 테이블당 최대 1개만 설정
-- 자동 증가
create table if not exists board(
	num int auto_increment primary key,
    title varchar(50) not null,
    contents longtext not null,
    writer varchar(13) not null,
    -- board 테이블에 writer속성을 member테이블에 id와 연결(외래키 설정)board2
    foreign key(writer) references member(id)
);
-- board 테이블에 조회수 추가
alter table board add views int default 0;
-- board 테이블에 조회수 삭제
alter table board drop views;
-- board 테이블에 잘못된 조회수 추가
alter table board add views varchar(10);
-- board 테이블에 잘못된 조회수를 올바르게 수정
alter table board modify views int default 0;
-- 조회수 이름을 views2로 수정
alter table board change views views2 int default 0;
-- views2를 views로 수정
alter table board change views2 views int default 0;
-- board 테이블에 있는 writer 제약조건을 삭제
alter table board drop constraint board_ibfk_1;
-- board 테이블에 writer와 member테이블에 id를 외래키로 연결(제약조건 추가)
alter table board 
	add constraint fk_board_writer foreign key(writer) references member(id); 
-- 워크벤치에서 추가한 board2테이블 삭제
drop table if exists board2;


create database if not exists shoppingmall;
use shoppingmall;
create table if not exists members(
id varchar(13) primary key,
pw varchar(20) not null,
name text(13) not null,
dob varchar(20) not null,
auth varchar(1) not null
);
create table if not exists product(
productnum int(20) primary key,
productnam varchar(30) not null,
productdet varchar(30) not null,
productcnt int(20) not null,
productpri int(20) not null,
productidnum int(20) not null
);
create table if not exists boardid(
boardidnum int(20) auto_increment primary key,
boardidname varchar(30) not null
);
create table if not exists boards(
boardnum int(20) not null,
title varchar(30) not null,
contents varchar(30) not null,
writer varchar(20) not null,
date varchar(20) not null,
view int(20) auto_increment,
foreign key(boardidnum) references member(boardidnum)

);


    
    
    