```sql
SELECT
	CustomerName,
	Country
FROM Customers
WHERE NOT Country='USA'
```

```sql
UPDATE Suppliers
SET
	ContactName='Ivan Ivanov',
	Phone='0000000000'
WHERE
	Country IN ('Japan', 'Spain')
```

### SQL `JOIN`: горизонтальное объединение таблиц

**Внешний ключ** - поле для связи между таблицами


```sql
SELECT <проекция>
FROM <таблица_1>
JOIN <таблица_2> ON <таблица_1.внешний_ключ>=<таблица_2.первичный_ключ>
```

**Пример. Вывести номера заказов и имена покупателей**

```sql
SELECT
		OrderID,
    CustomerName
FROM Orders
**JOIN Customers ON Orders.CustomerID=Customers.CustomerID**
```

**Пример. Вывести информацию о товарах:**

- название_товара
- стоимость_товара
- название_поставщика
- страну_поставщика

```sql
SELECT
		Products.ProductName,
    Products.Price,
    Suppliers.SupplierName,
    Suppliers.Country
FROM Products
**JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID**
```

**Задача. Вывести информацию о товарах:**

- название_товара
- стоимость_товара_в_долларах
- название_категории

```sql
SELECT
		Products.ProductName,
    Products.Price * 1.1 AS Price_usd,
    Categories.CategoryName
FROM Products
**JOIN Categories ON Products.CategoryID=Categories.CategoryID**
```

**Задача. Вывести все заказы, которые повезет `Speedy Express`**

```sql
SELECT * 
FROM Orders
**JOIN Shippers ON Orders.ShipperID=Shippers.ShipperID**
WHERE ShipperName='Speedy Express'
```

**Задача. Вывести самый дорогой товар из категории `Beverages`**

```sql
SELECT * 
FROM Products
JOIN Categories ON Products.CategoryID=Categories.CategoryID
WHERE CategoryName='Beverages'
ORDER BY Price DESC
LIMIT 1
```

**Задача. Вывести заказы клиентов из `USA`, `Germany`, `UK`**

- полное_имя_клиента
- страна_клиента
- полное_имя_менеджера

```sql
SELECT
	Customers.CustomerName,
	Customers.Country,
	Employees.FirstName,
	Employees.LastName 
FROM Orders
**JOIN Customers ON Orders.CustomerID=Customers.CustomerID
JOIN Employees ON Orders.EmployeeID=Employees.EmployeeID**
WHERE Customers.Country IN ('Germany', 'UK', 'USA');
```

**Задача. Вывести информацию о товарах с ценой от `10` до `150` EUR, которые были поставлены из `Japan`:**

- название_товара
- цена_товара
- цена_со_скидкой_15_процентов
- название_поставщика

```sql
SELECT
		ProductName,
    Price,
    Price * .85 AS Price_discount_15_perc,
    SupplierName
FROM Products
**JOIN Suppliers ON Products.SupplierID=Suppliers.SupplierID**
WHERE Country ='Japan' AND Price BETWEEN 10 AND 150
```

## Структура SQL

- `**DQL` (Data Query Language)**
    - `SELECT` - чтение
- `**DDL` (Data Definition Language)**
    - `CREATE` - создать объект (напр., БД, таблица и т.д.)
    - `DROP` - удалить
    - `ALTER` - изменить
    - `RENAME` - переименовать
- `**DML` (Data Manipulation Language)**
    - `INSERT INTO` - добавить записи
    - `UPDATE` - изменить записи
    - `DELETE` - удалить записи
- **`DCL` (Data Control Language)**
- **`TCL` (Transaction Control Language)**

## Создание БД

```sql
CREATE DATABASE db_name;
CREATE DATABASE IF NOT EXISTS db_name;
```

## Создание таблиц

```sql
CREATE TABLE <название_таблицы> (<структура>);

CREATE TABLE users (
	// название_поля тип_данных доп_хар-ки
	user_id int доп_хар-ки
);
```

## Основные типы данных в MySQL

- каждый столбец (поле) таблицы должен иметь указание на тип данных

### Числовые

- `int` / `integer`
- `decimal(x, y)`
    - `x` - ко-во цифр до запятой
    - `y` - ко-во цифр после запятой

### Строковые

- `varchar(x)`
    - `x` - макс. ко-во символов
- `text(x)`
    - `x` - макс. ко-во символов

### Логические

- `bool`

### Дата / время

- `datetime` / `timestamp`
- `date`
- `time`

**Создание таблицы `users`**

```sql
CREATE TABLE users(
  user_id int,
  created_at timestamp,
  email varchar(64),
  is_blocked bool,
  username varchar(64)
);
```

**Задача. Создать таблицу `videos`**

```sql
CREATE TABLE videos (
  video_id int,
  created_at timestamp,
  title varchar(128),
  duration_secs int,
  link varchar(128),
  author_id int,
  description varchar(64),
  is_approved bool
 );
```

## Удаление таблиц

`DROP TABLE table_name;`

`DROP TABLE IF EXISTS table_name;`

**Задача. Добавить трех пользоватей в таблицу `users`**

```sql
INSERT INTO users(user_id, created_at, email, is_blocked, username)
VALUES
		(1, CURRENT_TIMESTAMP, NULL, false, 'ivanivanov'),
    (2, CURRENT_TIMESTAMP, NULL, false, 'petrpetrov'),
    (3, CURRENT_TIMESTAMP, NULL, false, 'anonym');
```

**Функция `CURRENT_TIMESTAMP` - текущее значение даты/времени**

**Справочная информация**

- [как использовать MySQL WorkBench](https://www.youtube.com/watch?v=fUK94jOFwBc)