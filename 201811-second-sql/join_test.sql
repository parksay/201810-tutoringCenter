--[hr 계정 연습]

--전체 직원 목록
select * from employees;

--60번 부서의 직원들
select * from employees where department_id = 60;

--성이 A로 시작하는 직원
select * from employees where upper(last_name) like upper('A%');
select * from employees where last_name like 'A%' or last_name like 'a%';

--사번이 100~200번인 직원
select * from employees where employee_id between 100 and 200;

--입사 년도가  2006년인 직원
select * from employees where to_char(hire_date, 'yyyy') = '2006';

--2007년 입사 인원
select count(*) from employees where to_char(hire_date, 'yyyy') = '2007';

--급여가 7000 넘는 직원
select * from employees where salary > 7000;

--전체 평균 급여
select avg(salary) from employees;

--부서별 평균 급여
select department_id, avg(salary) from employees group by department_id;

--전체 평균 급여보다 많이 받는 직원
select * from employees where salary > (select avg(salary) from employees);

--각 부서별 최고 연봉금액
select department_id, max(salary) from employees group by department_id order by department_id asc;

--각 부서별 최고 연봉자

--급여가 10000 이상인 직원의 이름과 부서, 그 부서의 평균 급여
select first_name , department_id , round( (select avg(salary) from employees e1 where e1.department_id = e2.department_id) , 1 ) from employees e2 where salary > 10000;

--위에 꺼 다시
select first_name, last_name, salary, (select department_name from departments where e1.department_id = departments.department_id) as department_name , (select avg(salary) from employees e2 where e2.department_id = e1.department_id)
from employees e1 where employee_id in (select employee_id from employees where salary > 10000);

--사원 수가 3명 이상인 부서의 평균 급여를 소수점 아래 한 자리까지 (부서명도 같이)
--부서별 급여 평균 (급여가 3000 이하인 직원을 제외하고 계산 함. 평균 급여가 5000 이상인 부서만 출력)
--employees e, 
select employee_id from employees group by department_id;
select * from departments d;
select * from locations l ;
select * from employees e ;
select * from departments d , locations l where d.location_id = l.location_id;
select country_id , city ,  count(*) from employees e , departments d , locations l where e.department_id = d.department_id and d.location_id = l.location_id group by country_id, city order by country_id, city;
--이름으로 출력
select department_name from employees e, departments d where e.department_id = d.department_id and group by department_name having count(department_name) > 3;

select department_id, avg(salary) from employees e1 where salary > 3000 group by department_id ;
--직원 수가 1 또는 3 또는 5명인 부서의 이름을 정렬하여 출력
select department_name from departments d, employees e where d.department_id = e.department_id and count(department_name) in (1, 3, 5) group by department_name;

select
    first_name
    , commission_pct
    , nvl(commission_pct, 0)
    , case 
        when salary > 10000 then '고연봉'
        when salary < 5000 then '저연봉'
        else '보통'
        end
    , department_id
    , salary 
    from employees;

select num, id, title
    , case
        when hits > 100 then '인기글'
        else '글'
        end
    , case
        when sysdate - inputdate < 10 then '최신글'
        else '글'
        end
    from board;
    --직원 수가 1 또는 3 또는 5명인 부서의 이름을 정렬하여 출력
select department_name,HIRE_DATE from departments d, employees e
where d.department_id = e.department_id and to_char(e.HIRE_DATE, 'mm') in ('01', '03', '05');

    --직원 수가 1 또는 3 또는 5명인 부서의 이름을 정렬하여 출력
select department_name from departments d, employees e
where d.department_id = e.department_id and
(select count(department_id)  from employees e2
 where e2.department_id = e.department_id) in (1, 3, 5);