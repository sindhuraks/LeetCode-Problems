SELECT w.id FROM Weather w
INNER JOIN Weather w1
ON DATEDIFF(w.recordDate,w1.recordDate) = 1
WHERE w.Temperature > w1.Temperature;
