create table userinfo(
id varchar2(20) primary key,
name varchar2(20) not null,
password varchar2(20) not null,
phone varchar2(20),
address varchar2(100)
);

insert into userinfo values ( 'aaa', 'ȫ�浿', '111', '010-1111-1111', '����� 111����');
insert into userinfo values ( 'bbb', '�谩��', '222', '010-2222-2222', '����� 222����');
insert into userinfo values ( 'ccc', '�۸۸�', '333', '010-3333-3333', '����� 333����');

create table board(
num number primary key,
id varchar2(20) not null,
title varchar(100) not null,
content varchar2(4000) not null,
hits number default 0,
inputdate  date default sysdate,
foreign key(id) references userinfo(id) on delete cascade
);

create sequence boardseq;
insert into board (num, id, title, content, hits, inputdate) values(
boardseq.nextval, 'aaa', 'a1a1a1', 'aaaa11111', '42', '') ;
insert into board (num, id, title, content, hits, inputdate) values(
boardseq.nextval, 'bbb', 'b1b1b1', 'bbb1111', '142', '') ;
insert into board (num, id, title, content, hits, inputdate) values(
boardseq.nextval, 'ccc', 'c1c1c1', 'cccc11111', '84', '') ;
insert into board (num, id, title, content, hits ) values(
boardseq.nextval, 'bbb', 'b2b2b2', 'bbbb222', '485') ;
insert into board (num, id, title, content, hits ) values(
boardseq.nextval, 'ccc', 'c2c2c2', 'cccc222', '3') ;

create table reply (
num number primary key,
bnum number,
id varchar2(20) not null,
text varchar2(100) not null,
inputdate date default sysdate,
foreign key (bnum) references board(num) on delete cascade );