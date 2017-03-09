SELECT emp.DepartmentID, dep.name SUM(emp.Salary) AS SumSalary
FROM Employees emp, Departments dep
GROUP BY emp.DepartmentID;