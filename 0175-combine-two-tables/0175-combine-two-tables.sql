# Write your MySQL query statement below
select firstName,lastName,city,state from Address a right outer join Person p on a.personId =p.personId;