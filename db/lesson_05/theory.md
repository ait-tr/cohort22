## Типы данных

**Числовые**

- `int` - целое
- `decimal(3, 2)` - дробное
    - от `-999.99` до `999.99`

## Группировка в SQL (механизм агрегации)

**Категории запросов**

1. **CRUD** - простые запросы
2. **Aggregation** (получение вычисленных данных: итоги, аналитика, статистика)

**Группировка** - объединение (группировка) записей на основе общего признака с целью получения обобщенных данных

**Пример. Найти сред/стоимость товара для каждой категории**

```sql
SELECT
	CategoryID,
	AVG(Price) AS avg_price

FROM Products

**GROUP BY CategoryID**

--
SELECT
	SupplierID,
	AVG(Price) AS avg_price

FROM Products

**GROUP BY SupplierID**
```

**Задача. Вывести в порядке убывания сред/стоимость товара для каждого поставщика**

проекция: `имя_поставщика`, `ср/цена`

```sql
SELECT
	Suppliers.SupplierName,
	AVG(Products.Price) AS avg_price

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID

**GROUP BY Products.SupplierID**

ORDER BY avg_price DESC
```

**Задача. Вывести ТОП-2 поставщиков, которые привезли больше всего товаров**

проекция: `название_поставщика`, `ко-во_поставленных_товаров`

```sql
SELECT
	Suppliers.SupplierName,
	COUNT(*) AS total_products

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID

**GROUP BY Products.SupplierID**

ORDER BY total_products DESC
LIMIT 2
```

**Пример. Вывести список стран клиентов**

```sql
SELECT DISTINCT
	Country
FROM Customers
ORDER BY Country

--
SELECT
		Country,
    COUNT(*) AS total_customers

FROM Customers

**GROUP BY Country**

ORDER BY total_customers DESC
```

**Задача. Вывести товары, привезенные не из `USA`**

```sql
SELECT *

FROM Products

JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID

WHERE
	 NOT Suppliers.Country='USA'
 -- Suppliers.Country!='USA'
 -- Suppliers.Country<>'USA'
```

**Задача. Вывести стоимость каждого заказа в упорядоченном виде**

проекция: `номер_заказа`, `сумма_заказа`

```sql
SELECT
		OrderDetails.OrderID,
    SUM(OrderDetails.Quantity * Products.Price) AS order_cost

FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID

**GROUP BY OrderDetails.OrderID**

ORDER BY order_cost DESC
```

**Задача. Вывести стоимость заказа от `5000` EUR в упорядоченном виде**

проекция: `номер_заказа`, `сумма_заказа`

```sql
SELECT
		OrderDetails.OrderID,
    SUM(OrderDetails.Quantity * Products.Price) AS order_cost

FROM OrderDetails

JOIN Products ON OrderDetails.ProductID=Products.ProductID

GROUP BY OrderDetails.OrderID
**HAVING order_cost >= 5000 -- фильтрация агрегированных данных**

ORDER BY order_cost DESC
```

## Оператор `HAVING`

- аналог `WHERE`, который позволяет отфильтровать агрегированные данные

**Задача. Вывести страны, в которые было отправлено `3` и более заказов**

проекция: `страна`, `ко-во заказов`

```sql
SELECT
		Customers.Country,
    COUNT(*) AS total_orders
FROM Orders

JOIN Customers ON Orders.CustomerID=Customers.CustomerID

GROUP BY Customers.Country
HAVING total_orders>=3

ORDER BY total_orders DESC
```

## Онлайн-игры

**Основные сущности**

- игроки

```sql
table players {
  player_id int [pk, increment]
  created_at timestamp
  username varchar(64)
  scores int
}
```

- матчи (партии)
- карты
- чаты
- сообщения