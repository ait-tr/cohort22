## Отличие БД от СУБД

- **БД** - данные, как таковые
- **СУБД** - приложение (прикладное ПО)

## Модель данных

- способ описания (структурирования) данных
- напр., реляционная (табличная)

## Назначение `JOIN`

- выполняет горизонтальное объедение таблиц
- по внешнему ключу

## `DDL`

- набор операторов для определения схемы БД

## Категории операций

1. `CRUD`
2. Aggregation - получение вычисленных данных

## Агрегация в SQL

- `COUNT()` - расчет ко-ва строк
- `AVG()` - расчет сред/ариф. знач.
- `MAX()` - расчет макс. значения
- `MIN()` -  расчет мин. значения
- `SUM()` -  расчет суммы

**Пример. Найти ко-во клиентов**

```sql
-- всего
SELECT COUNT(*) AS total_clients
FROM Customers

-- из Germany
SELECT COUNT(*) AS total_clients
FROM Customers
WHERE Country='Germany'
```

**Пример. Средняя стоимость товаров**

```sql
SELECT AVG(Price) AS avg_price
FROM Products

-- статистика
SELECT
		AVG(Price) AS avg_price,
    MIN(Price) AS min_price,
    MAX(Price) AS MAX_price,
    COUNT(*) AS total_products,
    SUM(Price) AS products_sum
FROM Products
```

**Задача. Вывести ко-во поставщиков из `USA`**

```sql
SELECT
	COUNT(*) AS total_suppliers
FROM Suppliers
WHERE Country='USA'
```

**Задача. Вывести ко-во поставщиков из `USA`, `UK`, `Japan`**

```sql
SELECT
	COUNT(*) AS total_suppliers
FROM Suppliers
WHERE Country IN ('USA', 'UK', 'Japan')
```

**Задача. Посчитать стоимость заказа `10248`**

```sql
SELECT
	SUM(Products.Price * OrderDetails.Quantity) AS order_cost

FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID

WHERE OrderDetails.OrderID=10248
```

**Задача. Вывести среднюю стоимость товаров от поставщика `3`**

```sql
SELECT
	Suppliers.SupplierName,
	AVG(Products.Price) AS avg_price

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID

WHERE Suppliers.SupplierID=3
```

**Задача. Вывести среднюю стоимость напитка из `USA`**

```sql
SELECT 
	AVG(Price) AS avg_price

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID
JOIN Categories ON Products.CategoryID=Categories.CategoryID

WHERE
	Categories.CategoryName='Beverages'
	AND
	Suppliers.Country='USA'
```

**Задача. Вывести список стран, которые поставляют морепродукты**

```sql
SELECT DISTINCT
	Suppliers.Country

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID
JOIN Categories ON Products.CategoryID=Categories.CategoryID

WHERE
	Categories.CategoryName='Seafood'
```

**Задача. На какую сумму было отправлено товаров клиентам в `USA`**

```sql
SELECT
	SUM(Products.Price * OrderDetails.Quantity) AS total_sold_to_usa

FROM OrderDetails

JOIN Orders ON OrderDetails.OrderID=Orders.OrderID
JOIN Customers ON Orders.CustomerID=Customers.CustomerID
JOIN Products ON OrderDetails.ProductID=Products.ProductID

WHERE Customers.Country='USA'
```

**Задача. Вывести `стоимость` и `название` двух самых дешевых товаров из `Germany`**

```sql
SELECT
	Products.ProductName,
	Products.Price

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID

WHERE Suppliers.Country='Germany'

ORDER BY Products.Price ASC
LIMIT 2
```

**Задача. Вывести ко-во заказов, которое компания `Speedy Express` доставила в `Brazil`**

```sql
SELECT
	COUNT(*) AS total_shipped_to_brazil

FROM Orders

JOIN Shippers ON Orders.ShipperID=Shippers.ShipperID
JOIN Customers ON Orders.CustomerID=Customers.CustomerID

WHERE
		Shippers.ShipperName='Speedy Express'
    AND
    Customers.Country='Brazil'
```

## Ссылки

- [проектирование БД](https://dbdiagram.io/d/)
- [пример схемы БД](https://dbdiagram.io/d/645e8821dca9fb07c4fe5542)