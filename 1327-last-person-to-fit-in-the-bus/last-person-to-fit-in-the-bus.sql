# Write your MySQL query statement below
select person_name from (select person_name,sum(weight) over(order by turn) s from queue)t where s<=1000 order by s desc limit 1;
