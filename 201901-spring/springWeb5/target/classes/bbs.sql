create table bbs (
boardnum number primary key
, name varchar2(20) not null
, password varchar2(20) not null
, content varchar2(100) not null
, inputdate varchar2(20) default sysdate);

create sequence bbsseq;