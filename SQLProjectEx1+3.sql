-- 1.1
SELECT c.CustomerID, c.CompanyName, c.Address FROM Customers c
WHERE c.City IN ('Paris', 'London');

-- 1.2
SELECT * FROM Products p
WHERE p.QuantityPerUnit LIKE '%bottle%';

-- 1.3
SELECT p.*, s.CompanyName, s.Country FROM Products p
INNER JOIN Suppliers s ON p.SupplierID = s.SupplierID
WHERE p.QuantityPerUnit LIKE '%bottle%';

-- 1.4
SELECT COUNT(*) AS "Number of Products", c.CategoryName FROM Products p
INNER JOIN Categories c ON p.CategoryID = c.CategoryID
GROUP BY c.CategoryName
ORDER BY 1 DESC;

-- 1.5
SELECT CONCAT(e.TitleOfCourtesy, ' ', e.FirstName, ' ', e.LastName) AS "Full Name", e.City
FROM Employees e;

-- 1.6
SELECT ROUND(SUM(od.UnitPrice* od.Quantity * (1-od.Discount)), 2) AS "Net Total", r.RegionDescription
FROM [Order Details] od
INNER JOIN Orders o ON od.OrderID = o.OrderID
INNER JOIN Employees e ON o.EmployeeID = e.EmployeeID
INNER JOIN EmployeeTerritories et ON e.EmployeeID = et.EmployeeID
INNER JOIN Territories t ON t.TerritoryID = et.TerritoryID
INNER JOIN Region r ON r.RegionID = t.RegionID
GROUP BY r.RegionDescription
HAVING SUM(od.UnitPrice* od.Quantity * (1-od.Discount)) > 1000000;

-- 1.7
SELECT COUNT(*) AS "Orders with Freight above 100 or Country USA/UK"
FROM Orders o
WHERE o.Freight > 100 AND o.ShipCountry IN ('USA', 'UK');

-- 1.8
SELECT TOP 1 OrderID, UnitPrice* Quantity * (Discount) AS "Discount Applied"
FROM [Order Details]
ORDER BY 2 DESC;



-- 3.1
SELECT CONCAT(A.FirstName, ' ', A.LastName) AS "Employee Name", CONCAT(B.FirstName, ' ', B.LastName) AS "Reports To" 
FROM Employees A
LEFT JOIN Employees B ON A.ReportsTo = B.EmployeeID

-- 3.2
SELECT s.CompanyName, ROUND(SUM(od.UnitPrice* od.Quantity * (1-od.Discount)),2) AS "Supplier Sales"
FROM Suppliers s
INNER JOIN [Products] p ON s.SupplierID = p.SupplierID
INNER JOIN [Order Details] od ON p.ProductID = od.ProductID
GROUP BY s.CompanyName
HAVING SUM(od.UnitPrice* od.Quantity * (1-od.Discount)) > 10000
ORDER BY 2 DESC;

-- 3.3
SELECT TOP 10 c.CompanyName, ROUND(SUM(od.UnitPrice* od.Quantity * (1-od.Discount)),2) AS "Customer Sales"
FROM Customers c
INNER JOIN Orders o ON c.CustomerID = o.CustomerID
INNER JOIN [Order Details] od ON o.OrderID = od.OrderID
WHERE YEAR(o.OrderDate) IN
(
    SELECT YEAR(MAX(o.OrderDate))
    FROM Orders o
)
AND o.ShippedDate IS NOT NULL
GROUP BY c.CompanyName
ORDER BY 2 DESC;

-- 3.4
SELECT YEAR(ORDERDATE) AS 'Year', MONTH(OrderDate) AS 'Month', AVG(DATEDIFF(dd, OrderDate, ShippedDate)) AS "Average shipping time"
FROM Orders
WHERE ShippedDate IS NOT NULL
GROUP BY MONTH(OrderDate), YEAR(OrderDate);