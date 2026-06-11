# Write your MySQL query statement below
select email from person group By email having count(email)>1