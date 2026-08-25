# Write your MySQL query statement below
SELECT MAX(salary) as SecondHighestSalary 
FROM Employee where salary<(Select max(salary) from employee);
