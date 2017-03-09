SELECT emp.DepartmentID, dep.name COUNT(emp.EmployeeID) AS Count
FROM Employees emp, Departments dep
GROUP BY emp.DepartmentID
HAVING COUNT(emp.EmployeeID) < 3;