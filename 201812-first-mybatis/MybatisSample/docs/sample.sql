--ȸ������ �׽�Ʈ ���̺�
create table persontest (
	num			 number	 primary key,	--�Ϸù�ȣ
	name		 varchar2(20)  not null,	--�̸�
	age			 number	 default 0,		--����
	phone		 varchar2(20),			--��ȭ��ȣ
	address		 varchar2(100)			--�ּ�
);

--�Է� ��
insert into persontest values (1, 'ȫ�浿', 20, '010-111-2222', '����� ������ �Ｚ�� 11');
