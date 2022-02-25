create table bbs (
boardnum number primary key
, name varchar2(20) not null
, password varchar2(20) not null
, content varchar2(100) not null
, inputdate varchar2(20) default sysdate);

create sequence bbsseq;

insert into bbs (boardnum, name, password, content) values
		(bbsseq.nextval, 'ccc', 'ccc', 'adfsjkoa
        sd fp0asd
        [pdaos');
commit;

select * from bbs;
select * from bbs order by boardnum desc;

		delete from bbs where boardnum = '3' and password like '2';
rollback;



-- SC IT ������ �� ���α׷� Step Project : web6

-- �� ���� ���̺�
create table customer (
	custid		varchar2(20) primary key,	--�� ���̵�
	password	varchar2(20) not null,		--��й�ȣ
	name		varchar2(30) not null,		--�� �̸�
	email		varchar2(30),			--�� �̸���
	division	varchar2(30) not null,		--������ : personal(����), company(���)
	idno		varchar2(20) unique,	 	--�ĺ���ȣ (����: �ֹι�ȣ, ����: ����� ��ȣ)	
	address		varchar2(100)			--�ּ�
);

-- �׽�Ʈ�� �� ������ 
insert into customer values ('aaa','aaa', 'ȫ�浿', 'aaa@aaa.com', 'personal', '801230-1234567', '�����');

-- �Խ��� ���� ��
create table board (
	boardnum		number	primary key,		--�۹�ȣ
	id				varchar2(20) not null,	--�ۼ��� ID
	title			varchar2(100) not null,		--������
	content			varchar2(2000) not null,	--�۳���
	inputdate		date	default sysdate,	--�ۼ���¥,�ð�
	hits			number 	default 0,		--��ȸ��
	originalfile		varchar2(200),			--÷�����ϸ� (���� �̸�)
	savedfile		varchar2(100)			--÷�����ϸ� (���� ����� �̸�)
);

-- �Խ��� �Ϸù�ȣ�� ����� ������ 
create sequence board_seq start with 1 increment by 1;

-- ���� ����
create table reply (
	replynum		number	primary key,		--���ù�ȣ
	boardnum		number not null,			--���� �۹�ȣ
	id				varchar2(20) not null,		--�ۼ��� ID
	text			varchar2(200) not null,		--���ó���
	inputdate		date 	default sysdate,	--�ۼ���¥
	constraint reply_fk foreign key(boardnum) 
		references board(boardnum) on delete cascade
);

-- ���ÿ� ����� ������
create sequence reply_seq start with 1 increment by 1;

-- �� ���� ��
insert into board (boardnum, id, title, content) values (board_seq.nextval, 'aaa', '������', '�۳���');
	
-- ���� ���� ��
insert into reply (replynum, boardnum, id, text) values (reply_seq.nextval, 1, 'bbb', '������ ����...');
	
-- �˻� ��
select * from customer order by custid;
select * from board order by boardnum desc;
select * from reply order by replynum desc;
