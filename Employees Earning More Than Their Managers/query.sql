SELECT e.Name AS Employee
FROM Employee e INNER JOIN Employee e1 
ON e.ManagerId = e1.Id
WHERE e.Salary > e1.Salary;