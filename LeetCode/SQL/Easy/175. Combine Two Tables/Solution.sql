# Write your MySQL query statement below
SELECT p.firstName, p.lastname, a.city, a.state from person p LEFT JOIN address a
ON p.personId=a.personId