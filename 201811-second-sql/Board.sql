create table userinfo (
userid varchar2(20) primary key, --id
name varchar(20) not null, --�̸�
psw varchar(100) not null,--��й�ȣ
phone varchar(20), --��ȭ��ȣ
address varchar(100) ); --�ּ�

insert into userinfo values ('idididid', 'ȫ�浿asasdfknmkiasdfmlk', 'aaa', '010-2341-3452', '����� �߱� ������� 39');
insert into userinfo values ('ȫ�浿��', 'ȫ�浿', '����', '010-2341-3452', '�츮��');
insert into userinfo values ('aaa', 'bbb', 'ǻ', '010-2341-3452', '�츮��');
insert into userinfo values ('adfshi', '���̵�', 'Ľ', '010-5841-2552', '��');
insert into userinfo values ('idid', 'iddidd', 'ť', '010-5841-2552', '������');

select * from userinfo;
select * from board;
create table board (
num     number primary key,
id      varchar2(20) not null,
title   varchar2(100) not null,
content varchar2(4000) not null,
hits    number default 0,
inputdate date default sysdate) ;

create sequence boardseq;
insert into board (num, id, title, content, hits, inputdate) values(
boardseq.nextval,
'aaa',
'titititle',
'cococococontent',
'42',
'') ;
insert into board (num, id, title, content, hits, inputdate) values(
boardseq.nextval, 'aaa', 'titititle', 'cococococontent', '42', '') ;
insert into board (num, id, title, content, hits, inputdate) values(
boardseq.nextval, 'idid', '�������m', '������̵��', '142', '') ;
insert into board (num, id, title, content, hits, inputdate) values(
boardseq.nextval, '����', '����', '����������������', '84', '') ;
insert into board (num, id, title, content, hits ) values(
boardseq.nextval, '�޷�', '��', '�۳���', '485') ;
insert into board (num, id, title, content, hits ) values(
boardseq.nextval, 'adfshi', '��ȣ��', '���������', '3') ;


create table reply (
num number primary key,
bnum number,
id varchar2(20) not null,
text varchar2(100) not null,
inputdate date default sysdate,
foreign key (bnum) references board(num) on delete cascade );

create sequence replyseq;

insert into reply(num, bnum, id, text, inputdate) values (replyseq.nextval, 1, 'ididid', '������', '');
insert into reply(num, bnum, id, text, inputdate) values (replyseq.nextval, 2, 'idididid', '�����̶��', '');
insert into reply(num, bnum, id, text, inputdate) values (replyseq.nextval, 2, 'ididid', '���ø��ø����ø��ø�', '');
insert into board (num, id, title, content, hits) values (boardseq.nextval, '�޷�','�޷γ���', '���ַ�', '67');
insert into reply values (replyseq.nextval, 9, '���̵��', '�����̴ٷ�', '');
insert into reply (num, bnum, id, text) values (replyseq.nextval, 11, '�޷�', '�����̳�');
insert into reply (num, bnum, id, text) values (replyseq.nextval, 12, '�޷�', '����� �� ��������');
--�θ� �� �����ϴ� �� �غ���
delete from board where num = 8; 

--�Խ��ǿ� ���� �� ���̶� �� ����� ���, �̸����� �����ټ�
select distinct id from board order by id desc;

--�Խñۿ� �޸� ���� ���� [��ȣ, ����, ���� ��] �������� ���
select num, title, ( select count(num) from reply where reply.num = board.num) from board;
--�� ���� ������ ������  ���� ������ ����. 100�� ���� ���� �Ÿ�, ���� ���� 100�� ����. �� �ο츶��.

--'aaa'��� ����� �� �� �߿� ��ȸ���� ���� ���� �ۺ���, ��ȸ���� ���� �۵�.
select id,title, hits from board where hits <= (select hits from (select hits from board where id = 'aaa' order by hits) where rownum = 1 );
--��ü ��պ��� ��ȸ���� 10 �̻� ���� �� ���
select id, title, hits from board where hits < (select avg(hits) from board);

select id, ( select count(id) from board) from board group by id;
select id, count(id) as count_board, ( select count(id) from reply where board.id = reply.id ) as count_repply from board group by id;

select id
, (select name from userinfo where userinfo.userid in (select id from board)) as name
,  count(id) as count_board
, (select count(id) from reply where board.id = reply.id ) as count_reply 
from board group by id;

select name from userinfo where userinfo.userid in (select id from board) ;

commit;
select id, num, ( select count(bnum) from reply where bnum = board.num )
from board;
select id, ( select count(bnum) from reply where reply.id = board.id ) 
from board group by id;


select * from reply;
delete from reply where id = 'idididid';
select * from board;
delete from board where num = 1 or num =2 or num = 5 or num =12 or num =13;
select * from userinfo;
insert into board values (boardseq.nextval, 'ididid', '�ǽ�','������', '153','');
create table grouptest (
title varchar2(100),
spend number(3),
earn number(3)
);
insert into grouptest values ('�ĺ�','142','321');
insert into grouptest values ('������','654','153');
insert into grouptest values ('�����','851','135');
insert into grouptest values ('�ĺ�','105','121');
insert into grouptest values ('�ĺ�','532','341');
insert into grouptest values ('�����','354','525');
select * from grouptest;
select title, count(spend),sum(spend) from grouptest group by title;
commit;

select id, (select name from userinfo where board.id = userinfo.userid) from board;
select * from userinfo;
select * from board;
select * from reply;
select * from board, userinfo where userinfo.userid = board.id;
select * from board, userinfo;
select * from board, reply where board.num = reply.bnum;
select * from board, userinfo, reply where board.id = userinfo.userid and userinfo.userid = reply.id;