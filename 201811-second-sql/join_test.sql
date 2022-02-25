--[hr ���� ����]

--��ü ���� ���
select * from employees;

--60�� �μ��� ������
select * from employees where department_id = 60;

--���� A�� �����ϴ� ����
select * from employees where upper(last_name) like upper('A%');
select * from employees where last_name like 'A%' or last_name like 'a%';

--����� 100~200���� ����
select * from employees where employee_id between 100 and 200;

--�Ի� �⵵��  2006���� ����
select * from employees where to_char(hire_date, 'yyyy') = '2006';

--2007�� �Ի� �ο�
select count(*) from employees where to_char(hire_date, 'yyyy') = '2007';

--�޿��� 7000 �Ѵ� ����
select * from employees where salary > 7000;

--��ü ��� �޿�
select avg(salary) from employees;

--�μ��� ��� �޿�
select department_id, avg(salary) from employees group by department_id;

--��ü ��� �޿����� ���� �޴� ����
select * from employees where salary > (select avg(salary) from employees);

--�� �μ��� �ְ� �����ݾ�
select department_id, max(salary) from employees group by department_id order by department_id asc;

--�� �μ��� �ְ� ������

--�޿��� 10000 �̻��� ������ �̸��� �μ�, �� �μ��� ��� �޿�
select first_name , department_id , round( (select avg(salary) from employees e1 where e1.department_id = e2.department_id) , 1 ) from employees e2 where salary > 10000;

--���� �� �ٽ�
select first_name, last_name, salary, (select department_name from departments where e1.department_id = departments.department_id) as department_name , (select avg(salary) from employees e2 where e2.department_id = e1.department_id)
from employees e1 where employee_id in (select employee_id from employees where salary > 10000);

--��� ���� 3�� �̻��� �μ��� ��� �޿��� �Ҽ��� �Ʒ� �� �ڸ����� (�μ��� ����)
--�μ��� �޿� ��� (�޿��� 3000 ������ ������ �����ϰ� ��� ��. ��� �޿��� 5000 �̻��� �μ��� ���)
--employees e, 
select employee_id from employees group by department_id;
select * from departments d;
select * from locations l ;
select * from employees e ;
select * from departments d , locations l where d.location_id = l.location_id;
select country_id , city ,  count(*) from employees e , departments d , locations l where e.department_id = d.department_id and d.location_id = l.location_id group by country_id, city order by country_id, city;
--�̸����� ���
select department_name from employees e, departments d where e.department_id = d.department_id and group by department_name having count(department_name) > 3;

select department_id, avg(salary) from employees e1 where salary > 3000 group by department_id ;
--���� ���� 1 �Ǵ� 3 �Ǵ� 5���� �μ��� �̸��� �����Ͽ� ���
select department_name from departments d, employees e where d.department_id = e.department_id and count(department_name) in (1, 3, 5) group by department_name;

select
    first_name
    , commission_pct
    , nvl(commission_pct, 0)
    , case 
        when salary > 10000 then '����'
        when salary < 5000 then '������'
        else '����'
        end
    , department_id
    , salary 
    from employees;

select num, id, title
    , case
        when hits > 100 then '�α��'
        else '��'
        end
    , case
        when sysdate - inputdate < 10 then '�ֽű�'
        else '��'
        end
    from board;
    --���� ���� 1 �Ǵ� 3 �Ǵ� 5���� �μ��� �̸��� �����Ͽ� ���
select department_name,HIRE_DATE from departments d, employees e
where d.department_id = e.department_id and to_char(e.HIRE_DATE, 'mm') in ('01', '03', '05');

    --���� ���� 1 �Ǵ� 3 �Ǵ� 5���� �μ��� �̸��� �����Ͽ� ���
select department_name from departments d, employees e
where d.department_id = e.department_id and
(select count(department_id)  from employees e2
 where e2.department_id = e.department_id) in (1, 3, 5);