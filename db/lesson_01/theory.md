### Базовый состав типового проекта

- `FE` - интерфейс
    - `API` - машино-чит.
    - Веб-сайт - человеко-чит.
    - Приложения - человеко-чит.
- `BE` - бизнес-логика
- `**DB` - хранилище**
- `Deployment` - развертывание


### Основная задача любого разработчика

Автоматизация бизнес-процессов

### Базы данных (Data Bases, DB)

**БД (DB)** - структурированный набор данных, предназначенный для автоматизированной обработки

- фактически, представляет собой **данные**
- цифровая копия сущностей (объектов) реального мира

**СУБД (DBMS, Data Base Management Software)** - прикладное ПО (приложение)

- Система Урпавления Базой Данных

### Схема работы с БД

`BE → DBMS → DB`

### Типы СУБД

- Первичная (primary) - напр., `MySQL`
- Вторичная (secondary) - напр., `Redis`

### Модели данных (БД)

Это способ описания (хранения, структурирования) данных

1. Реляционная (табличная) - напр., `MySQL`
2. Документная (документ - ассоц/массив) - напр., `MongoDB`
3. Графовая (теория графов) - напр., `OrientDB`
4. Плоская - напр., `Redis`

### Типы операций в СУБД

- Чтение
- Запись

### Категории операций в СУБД

1. `CRUD` (Create, Read, Update, Delete)
2. Aggregation (аналитика, итоги, статистика) - вычисленные данные

### Способы подключения к СУБД

1. Из программного кода (BE) - целевой способ
2. Из `GUI/CLI`-клиентов - вспомогательный способ

**Самая распространенная архитектура (подход) хранения данных**

**ОДНА СУЩНОСТЬ (ОБЪЕКТ) == ОДНА ЗАПИСЬ**

### SQL: CRUD

`SQL` - язык структурированных запросов

**Проекция** - инструмент оптимизации запросов. Применяется для:

- уменьшение времени запроса
- снижение нагрузки на выч/ресурсы

**Read**

`SELECT`

`SELECT DISTINCT` (только уникальные значения)

```sql
SELECT City, Country
FROM Customers
```

```sql
SELECT DISTINCT Country
FROM Suppliers
```

**Вывести пользователей из Германии**

```sql
SELECT *
FROM Customers
**WHERE Country='Germany' -- фильтрация по стране**
```

### Логические операторы в SQL

`AND`

`OR`

`NOT`

```sql
SELECT *
FROM Customers
WHERE Country='Germany' AND PostalCode='12209'
```

**Задача. Вывести клиентов из `Germany` и `France`**

```sql
SELECT *
FROM Customers
WHERE Country='Germany' OR Country='France'
```

**Задача. Вывести клиентов не из `Germany`**

```sql
SELECT *
FROM Customers
WHERE NOT Country='Germany'
```

**Задача. Вывести клиентов, кроме тех, что из `UK` и `USA`**

```sql
SELECT *
FROM Customers
WHERE NOT Country='UK' AND NOT Country='USA'
```

### Оператор `IN`

Проверка принадлежности к списку значений

```sql
SELECT *
FROM Customers
WHERE NOT Country IN ('UK', 'USA', 'Span')
-- WHERE NOT Country='UK' AND NOT Country='USA' AND NOT Country='Spain'
```

### Операторы сравнения

`=`

`!=`  `<>` не равно

`>`

`<`

`>=`

`<=`

```sql
SELECT *
FROM Products
WHERE Price<=100
```

**Задача. Вывести товары в диапазоне цены: от 50 до 100 (EUR)**

```sql
SELECT *
FROM Products
WHERE Price>=50 AND Price<=100
```

**Задача. Вывести название и стоимость товаров из категорий `1` и `3` со стоимостью до `50` (EUR)**

```sql
SELECT
		ProductName,
    Price
FROM Products
WHERE
		CategoryID IN (1, 3)
    AND
    Price<=50;
```

### Сортировка

`ORDER BY`

```sql
SELECT *
FROM Products
**ORDER BY Price ASC**
-- **ASC** по возрастанию (по умолчанию)
-- **DESC** по убыванию
```

**Пример**

```sql
SELECT *
FROM Products
WHERE Price>=50 AND Price<=100
**ORDER BY Price DESC**
```

### Лимитирование вывода

`LIMIT`

```sql
SELECT *
FROM Products
ORDER BY Price DESC
**LIMIT 10**
```

### Псевдонимы в SQL

Оператор `AS`

```sql
SELECT 
		Price **AS** Price_eur,
    Price * 1.09 **AS** Price_usd
FROM Products
```

**Задача. Вывести названия товаров, а также их стоимость:**

- полную
- со скидкой `25%`
- с наценкой `15%`

```sql
SELECT
		ProductName,
    Price AS Price_full,
    Price * .75 AS Price_low,
    Price * 1.15 AS Price_up
FROM Products
```

**Задача. Вывести название и стоимость в `USD` самого дорогого товара из `5` категории**

```sql
SELECT
		ProductName,
   	Price * 1.09 AS Price_usd
FROM Products
WHERE CategoryID=5
ORDER BY Price DESC
LIMIT 1
```

### **SQL: Update**

```sql
UPDATE Customers
SET ContactName='Ivanov Ivan'
WHERE CustomerID=1
```

**Задача. У всех пользователей не из `UK` очистить контактное имя**

```sql
UPDATE Customers
SET ContactName=''
WHERE NOT Country='UK'
```

**Задача. У всех товаров от `50` до `60` (EUR) очистить `название` и установить `категорию 2`**

```sql
UPDATE Products
SET ProductName='',
	  CategoryID=2
WHERE Price>=50 AND Price<=60
```

**Задача. У поставщиков из `USA` и `Japan` очистить почтовый индекс**

```sql
UPDATE Suppliers
SET PostalCode=''
WHERE Country IN ('USA', 'Japan');
```

### Справочная информация

[SQL](https://ru.wikipedia.org/wiki/SQL)

[Песочница](https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all)

[Ссылка на конспект в Notion](https://www.notion.so/DB-1-Apr-21-2023-cdd3fa98df6f4051a9fd14b58ac215a1)