### Базовый состав типового проекта

- `DB` - хранилище
- `BE` - бизнес-логика
- `FE` - интерфейс
    - Веб-сайты - человеко-чит.
    - Приложения - человеко-чит.
    - `API` - машино-чит.
- `Deployment` - развертывание

### Чем отличается БД от СУБД?

**БД** - данные, как таковые

- Цифровая копия сущностей (объектов) реального мира

**СУБД** - прикладное ПО (приложение)

### Взаимодействие с СУБД (DBMS)

`BE → DBMS (DB) →BE`

### Реляционная модель данных

- табличная

**Задача. Вывести список стран клиентов**

```jsx
SELECT DISTINCT
	Country
FROM Customers
```

**Проекция** - инструмент оптимизации запросов. Применяется для:

- уменьшение времени запроса
- снижение нагрузки на выч/ресурсы

**Задача. Вывести имена и страны клиентов не из `USA`**

```jsx
SELECT
	CustomerName,
	Country
FROM Customers
WHERE NOT Country='USA'
```

**Задача. Вывести клиентов из `UK` и `USA`**

```jsx
SELECT *
FROM Customers
WHERE Country IN ('USA', 'UK')
```

**Задача. Вывести товары с ценой до `20` EUR в порядке убывания**

```jsx
SELECT * -- проекция
FROM Products
WHERE Price<=20 -- фильтр
ORDER BY Price DESC -- сортировка по убыванию (цены)
```

**Задача. Вывести товары из категории `5` с ценой в `USD` и скидкой `7.5%`**

```sql
SELECT
				ProductName,
        Price * 1.1 * (1-.075) AS Price_usd
FROM Products
WHERE CategoryID=5
```

**Задача. Вывести `название` и `стоимость` самого дешевого товара из категории `8`**

```sql
SELECT
	ProductName,
	Price
FROM Products

WHERE CategoryID=8

ORDER BY Price ASC

LIMIT 1
```

### SQL: CRUD

**Create**

`INSERT INTO`

**Read**

`SELECT`

`SELECT DISTINCT`

**Update**

`UPDATE`

**Delete**

`DELETE FROM`

**Задача. Для поставщиков из `Japan` и `Spain` изменить `телефон` и `контактное_имя` на произвольные значения**

```sql
UPDATE Suppliers
SET
	ContactName='Ivan Ivanov',
	Phone='0000000000'
WHERE
	Country IN ('Japan', 'Spain')
```

**Задача. У всех товаров от `50` до `60` (EUR) очистить `название` и установить `категорию 2`**

```sql
UPDATE Products
SET
		ProductName='',
	  CategoryID=2
WHERE Price BETWEEN 50 AND 60
-- WHERE Price>=50 AND Price<=60
```

### Оператор диапазона

`BETWEEN`

```sql
SELECT *
FROM Products
WHERE Price BETWEEN 10 AND 100
```

### SQL: Delete

**Пример. Удаление клиента `1`**

```sql
DELETE FROM Customers
WHERE Customer=1
```

**Задача. Удалить товары из категории `3` с ценой от `50` до `55`** 

```sql
DELETE FROM Products
WHERE
		CategoryID=3
    AND
		Price BETWEEN 50 AND 55
```

### Первичный ключ в БД

Это поле, которое однозначно идентифицирует каждую запись

- в качестве значения используют
    - авто-инкремент
    - случайные значения (стандарт `UUID` и т.д.)

**Свойства:**

- уникальность
- непустой
- неизменяемость

### SQL: Create

**Пример. Добавление нового клиентов**

```sql
INSERT INTO Customers(CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES
	('Ivan Ivanov', NULL, NULL, NULL, NULL, NULL),
	('Petr Petrov', NULL, NULL, NULL, NULL, NULL);
```

**Задача. Добавить нового поставщика из `China`**

```sql
INSERT INTO Suppliers(SupplierName ,ContactName, Address, City, PostalCode,  Country,Phone)
VALUES
	('AliExpress','Chan Li', NULL, NULL, NULL, 'China', NULL);
```

### Операторы `IS NULL` и `IS NOT NULL`

Проверка на **неопределенное значение**

**Пример**

```sql
SELECT *
FROM Suppliers
WHERE City IS NULL
```

**Задача. У товаров из категории `1` очистить поле `Price`**

```sql
UPDATE Products
SET
	Price=NULL
WHERE CategoryID=1
```

**Задача. Вывести самый дорогой товар у которого поле `Unit` неопределено**

```sql
SELECT *
FROM Products
WHERE
	Unit is NULL
ORDER BY Price DESC -- `ASC`
LIMIT 1
```


### Ссылки

- [Супер-песочница](https://sqliteonline.com/)
- [Как установить MySQL](https://timeweb.cloud/tutorials/mysql/kak-ustanovit-mysql-na-windows) - Windows
- [Как установить MySQL](https://vladster.net/ru/%D0%BA%D0%B0%D0%BA-%D1%83%D1%81%D1%82%D0%B0%D0%BD%D0%BE%D0%B2%D0%B8%D1%82%D1%8C-mysql-%D1%81%D0%B5%D1%80%D0%B2%D0%B5%D1%80-%D0%BD%D0%B0-mac-os-x/) - Mac