# Write your MySQL query statement below
SELECT  Distinct MAX(salary) as SecondHighestSalary 
FROM Employee where salary<(Select max(salary) from employee);
