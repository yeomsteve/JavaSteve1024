-- drop database if exists shoppingmall;
create database if not exists shoppingmall;
use shoppingmall;

-- drop table if exists member;
create table if not exists member(
	me_id varchar(15) primary key,
	me_pw varchar(20) not null,
	me_name varchar(20) not null,
	me_birth date not null,
	me_authority varchar(6) not null default 'MEMBER'
-- 권한 : 회원(MEMBER), 관리자(ADMIN)
);

-- drop table if exists product_category;
create table if not exists product_category(
	pc_num int auto_increment primary key,
	pc_name varchar(10) not null
);

-- drop table if exists product;
create table if not exists product(
	pr_num int auto_increment primary key,
	pr_title varchar(50) not null,
	pr_contents longtext not null,
	pr_amount int not null default 0,    
	pr_price int not null,
    pr_pc_num int not null,
    constraint fk_pr_pc_name
		foreign key(pr_pc_num)
		references product_category(pc_num)
);
-- drop table if exists board_category;
create table if not exists board_category(
	bc_num int auto_increment primary key,
	bc_name varchar(10) not null
);
-- drop table if exists board;
create table if not exists board(
	bo_num int auto_increment primary key,
	bo_title varchar(50) not null,
	bo_contents longtext not null,
    bo_reg_date datetime not null default now(),
    bo_views int not null default 0,
    bo_me_id varchar(15) not null,
    bo_bc_num int not null,
    constraint fk_bo_me_id
		foreign key(bo_me_id)
		references member(me_id),
     constraint fk_bo_bc_num
		foreign key(bo_bc_num)
		references board_category(bc_num)    
);
-- drop table if exists buy;
create table if not exists buy(
	bu_num varchar(20) primary key,
    bu_state varchar(10) not null default '결제 완료',
    bu_amount int not null default 1,
    bu_address varchar(50) not null,
    bu_post_num varchar(10) not null,
    bu_me_id varchar(15) not null,
    bu_pr_num int not null,
	constraint fk_bu_me_id
		foreign key(bu_me_id)
		references member(me_id),
	constraint fk_bu_pr_num
		foreign key(bu_pr_num)
		references product(pr_num)
);
-- drop table if exists inquiry;
create table if not exists inquiry(
	in_num int auto_increment primary key,
    in_contents longtext not null,
    in_reply longtext,
    in_pw char(4),
    in_me_id varchar(15) not null,
    in_pr_num int not null,
     constraint fk_in_me_id
		foreign key(in_me_id)
		references member(me_id),
      constraint fk_in_pr_num
		foreign key(in_pr_num)
		references product(pr_num)   
);

