with Temp as (select d.name as department,e.name as employee,e.salary,
DENSE_RANK() over(partition by e.departmentId order by e.salary desc) as sino
from employee e join department d
on e.departmentId = d.id)
select department,employee,salary from temp where sino <=3;