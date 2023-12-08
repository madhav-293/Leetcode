# Write your MySQL query statement below
select name from Customer where referee_id is null or referee_id not in (2);