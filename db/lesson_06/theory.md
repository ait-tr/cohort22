**Справочная информация**

- [БД “песочница: интернет-магазин”](https://raw.githubusercontent.com/AndreiBakhtinov/GenTech/master/w3schools.sql)
- [Схема “игра: шахматы”](https://dbdiagram.io/d/6467c575dca9fb07c46a1047)
- [Схема “кинотеатр”](https://dbdiagram.io/d/642ead758615191cfa8beab4)
- [Онлайн-проектирование](https://dbdiagram.io/d/)
- [Хеширование паролей](https://www.kaspersky.ru/blog/the-wonders-of-hashing/3633/)

## Работа с датой/времени

**Выборка по году**

```sql
SELECT *
FROM Orders
WHERE
	YEAR(OrderDate) = 1996;
```

**Выборка за период**

```sql
SELECT *
from orders
WHERE
	OrderDate BETWEEN '1996-07-01' AND '1996-07-30'
```

```sql
SELECT *
from orders
WHERE
	YEAR(OrderDate)	BETWEEN 1996 AND 1997
```

```sql
SELECT *
from orders
WHERE
	OrderDate BETWEEN
	DATE_SUB(NOW(), INTERVAL 1 YEAR)
  AND NOW()
```

```sql
SELECT *,
		WEEKDAY(OrderDate),
    DAYNAME(OrderDate)
from orders
```

**Задача. Вычислить `ко-во заказов` по каждому `дню недели`**

```sql
SELECT 
		COUNT(*) AS total_orders,
    DAYNAME(OrderDate) AS day_name
from orders
GROUP BY day_name
ORDER BY total_orders DESC
```

**Задача. Вычислить `ко-во заказов` по каждому `году`**

```sql
SELECT 
		COUNT(*) AS total_orders,
		YEAR(OrderDate) AS `year`
from orders
GROUP BY `year`
ORDER BY total_orders DESC
```

**Задача. Вывести три последних заказа**

```sql
SELECT *
from orders
ORDER BY OrderDate DESC
LIMIT 3
```

## Проектирование БД

1. На одном сервере могут находиться несколько **СУБД (DBMS)**
- **сетевой порт** - сетевой идентификатор процесса (программы)
1. В одной **СУБД** может находиться несколько **БД**
2. В одной **БД** может храниться несколько типов сущностей (объектов)
3. Стандартный подход: **ОДНА БД == ОДИН ПРОЕКТ**
4. Стандартный подход: **ОДНА СУЩНОСТЬ == ОДНА ЗАПИСЬ**

## Первичный ключ (primary key)

- Является идентификатором каждой сущности

**Свойства**

- уникальный
- неизменяемый
- ненулевой

**Стандартные подходы к определению значения**

1. Авто-инкремент
2. Случайные значения (`UUID`, `GUID`, `ULID`)

## Унификация хранимых данных

Приведение к единому виду

- например, **номер телефона**

## Общие этапы проектирования БД

1. Анализ предметной области (бизнес-процессов)
2. Выделение сущностей и их свойств (характеристик)
3. Связывание сущностей между собой (установление связей)
    1. с помощью ключевых полей (`первичный` и `внешний` ключи)
4. Проверка решения (гипотезы)

## Базовые виды связей между сущностями

- `1:1` (один к одному)
- `1:M` (один ко многим)
- `M:M` (многие ко многим)

**Задача. Описать связи (включая их тип) между таблицами БД “песочница: интернет-магазин”**

```sql
OrderDetails.OrderID (M:1) Orders.OrderID
OrderDetails.ProductID (M:1) Products.ProductID

Orders.CustomerID (M:1) Customers.CustomerID
Orders.EmployeeID (M:1) Employees.EmployeeID
Orders.ShipperID (M:1) Shippers.ShipperID

Products.SupplierID (M:1) Suppliers.SupplierID
Products.CategoryID (M:1) Categories.CategoryID
```

## Проектирование БД “кинотеатр”

**Сущности:**

- `halls` (залы)
- `movies` (фильмы)
- `tickets` (билеты)
- `users` (онлайн-пользователи)
- `timetable` (расписание сеансов)

## Популярные способы авторизации

1. Внешний сервис
2. Пароль
    1. хранят в закрытом (”хешированном”) виде
    2. напр., `SHA`
3. `OTP`