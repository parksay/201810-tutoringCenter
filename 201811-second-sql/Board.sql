create table userinfo (
userid varchar2(20) primary key, --id
name varchar(20) not null, --이름
psw varchar(100) not null,--비밀번호
phone varchar(20), --전화번호
address varchar(100) ); --주소

insert into userinfo values ('idididid', '홍길동asasdfknmkiasdfmlk', 'aaa', '010-2341-3452', '서울시 중구 세종대로 39');
insert into userinfo values ('홍길동쓰', '홍길동', '파팍', '010-2341-3452', '우리집');
insert into userinfo values ('aaa', 'bbb', '퓨', '010-2341-3452', '우리집');
insert into userinfo values ('adfshi', '아이디', '캭', '010-5841-2552', '쟝');
insert into userinfo values ('idid', 'iddidd', '큐', '010-5841-2552', '마지막');

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
boardseq.nextval, 'idid', '제목헤헿', '에헤라이디야', '142', '') ;
insert into board (num, id, title, content, hits, inputdate) values(
boardseq.nextval, '파팍', '제목쓰', '내레내레내레내용', '84', '') ;
insert into board (num, id, title, content, hits ) values(
boardseq.nextval, '메롱', '헤', '글내용', '485') ;
insert into board (num, id, title, content, hits ) values(
boardseq.nextval, 'adfshi', '오호예', '내료료료요요룡', '3') ;


create table reply (
num number primary key,
bnum number,
id varchar2(20) not null,
text varchar2(100) not null,
inputdate date default sysdate,
foreign key (bnum) references board(num) on delete cascade );

create sequence replyseq;

insert into reply(num, bnum, id, text, inputdate) values (replyseq.nextval, 1, 'ididid', '리플임', '');
insert into reply(num, bnum, id, text, inputdate) values (replyseq.nextval, 2, 'idididid', '리플이라능', '');
insert into reply(num, bnum, id, text, inputdate) values (replyseq.nextval, 2, 'ididid', '리플리플리플플리플리', '');
insert into board (num, id, title, content, hits) values (boardseq.nextval, '메롱','메로나롱', '메주롱', '67');
insert into reply values (replyseq.nextval, 9, '아이디롱', '리플이다롱', '');
insert into reply (num, bnum, id, text) values (replyseq.nextval, 11, '메롱', '리플이네');
insert into reply (num, bnum, id, text) values (replyseq.nextval, 12, '메롱', '뭐라는 거 ㅋㅋㅋㅋ');
--부모 값 삭제하는 거 해보기
delete from board where num = 8; 

--게시판에 글을 한 번이라도 쓴 사람들 명단, 이름으로 가나다순
select distinct id from board order by id desc;

--게시글에 달린 리플 수를 [번호, 제목, 리플 수] 형식으로 출력
select num, title, ( select count(num) from reply where reply.num = board.num) from board;
--각 행을 실행할 때마다  서브 쿼리를 실행. 100개 행을 만들 거면, 서브 쿼리 100번 실행. 각 로우마다.

--'aaa'라는 사람이 쓴 글 중에 조회수가 가장 높은 글보다, 조회수가 높은 글들.
select id,title, hits from board where hits <= (select hits from (select hits from board where id = 'aaa' order by hits) where rownum = 1 );
--전체 평균보다 조회수가 10 이상 많은 글 목록
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
insert into board values (boardseq.nextval, 'ididid', '피슈','컨텐츠', '153','');
create table grouptest (
title varchar2(100),
spend number(3),
earn number(3)
);
insert into grouptest values ('식비','142','321');
insert into grouptest values ('교육비','654','153');
insert into grouptest values ('교통비','851','135');
insert into grouptest values ('식비','105','121');
insert into grouptest values ('식비','532','341');
insert into grouptest values ('교통비','354','525');
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