CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE M INT DEFAULT N-1;
    
  RETURN (
      
      SELECT DISTINCT Salary AS getNthHighestSalary
      FROM Employee ORDER BY Salary DESC LIMIT M,1
      
  );
END
