## **MongoDB GUI Client**

[Download Studio 3T for MongoDB | Windows, macOS & Linux](https://studio3t.com/download/)

## MongoDB: документо-ориентированная СУБД

**Принципиальные отличия MongoDB от `RDBMS`**

1. Другой язык для выполнения запросов (`NoSQL` - `Query API`)
2. Модель данных - **ДОКУМЕНТНАЯ** (документ - ассоц/массив)
3. Динимическая схема данных (без схемы, `schemaless`) - каждый документ может иметь свой набор полей
4. Для хранения использует `JSON` и `Binary JSON` (`BSON`)
5. Позволяет хранить вложенные структуры данных

## Масштабирование

- горизонтальное (количество)
- вертикальное (качество)

## Базовые структуры данных

1. Скаляр (скалярное значение)
2. Массив (список значений)
3. Ассоц/массивы (пары ключ-значение)
4. Множество (список **уникальных** значений)

## MongoDB: CRUD

**Create**

- `insertOne()` добавить один документ
    - один аргумент
        - ассоц/массив (объект)
- `insertMany()` добавить несколько документов
    - один аргумент
        - массив ассоц/массивов

**Read**

- `findOne()` найти (выбрать) один документ
- `find()` найти (выбрать) несколько документов
    - аргументы
        - `filter`
        - `projection`
- `countDocuments()` ко-во совпадений
    - аргументы
        - `filter`

**Update**

- `updateOne()` изменить один документ
- `updateMany()` изменить несколько документов
    - аргументы
        - `filter`
        - `action`

**Delete**

- `deleteOne()` удалить один документ
- `deleteMany()` удалить несколько документов
    - аргументы
        - `filter`
        
        ![Screenshot from 2023-06-09 20-21-44.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f23aa327-0173-419e-a162-1451163f279a/Screenshot_from_2023-06-09_20-21-44.png)
        

**Пример. Добавление клиента**

```jsx
db.clients.insertOne({
    id: 'x555',
    name: 'Ivan Ivanov',
    country: 'USA'
})
```

**Пример. Вывести всех клиентов**

```jsx
db.clients.find()
```

**Пример. Вывести клиентов из `USA`**

```jsx
// без проекции
db.clients.find(
    {country: 'USA'} // filter
)

// с проекцией
db.clients.find(
    {country: 'USA'}, // filter
    {name: 1, _id: 0} // projection
)
```

**Пример. Вывести указанного клиента**

```jsx
db.clients.findOne(
    {id: 'x555'} // filter
)
```

**Пример. Вычислить ко-во клиентов из `USA`**

```jsx
db.clients.countDocuments(
    {country: 'USA'} // filter
)
```

**Пример. Авторизация клиента**

```jsx
db.clients.countDocuments({
	email: 'user@example.org',
	password: '_password_hash_',
	is_blocked: {$ne: true}
})
```

**Пример. Удалить клиентов из `China`**

```jsx
db.clients.deleteMany(
    {country: 'China'} // filter
)
```

**Задача. Вывести имена заблокированных клиентов**

```jsx
db.clients.find(
    {is_blocked: true}, // filter
    {name: 1, _id: 0} // projection
)
```

## Базовые операторы модификации (`updateOne` / `updateMany()`)

`$set` установить поля

`$unset` удалить (снять) поля

`$inc` инкремент полей (увеличить/уменьшить)

`$mul` умножение

**Пример. Заблокировать клиентов из `USA`**

```jsx
db.clients.updateMany(
	{country: 'USA'}, // filter
	{
		$set: {
			is_blocked: true
		}
	} // action
)
```

**Задача. Разблокировать всех клиентов**

```jsx
db.clients.updateMany(
    {}, // filter
    {
        $unset: {
            is_blocked: null
        }
    } // action
)
```

## Операторы сравнения

`$eq` равно (equal)

`$ne` не равно (not equal)

`$gt` больше (greater than)

`$gte` больше или равно (greater than or equal)

`$lt` меньше (less than)

`$lte` меньше или равно (less than or equal)

**Пример. Вывести транзакции от `100` EUR (проекция: `сумма`)**

```jsx
db.txs.find(
    {
        currency: 'eur',
        amount: {$gte: 100}
    }, // filter
    {amount: 1, _id: 0} // projection
)
```

**Задача. Вывести `USD`-транзакции до `1000` (проекция: `сумма` и `комментарий`)**

```jsx
db.txs.find(
    {
        currency: 'usd',
        amount: {$lte: 1000}
    }, // filter
    {amount: 1, comment: 1, _id: 0} // projection
)
```

**Задача. Вывести `USD`-транзакции от `10` до `200` (проекция: `сумма` и `комментарий`)**

```jsx
db.txs.find(
    {
        currency: 'usd',
        amount: {$gte: 10, $lte: 200}
    }, // filter
    {amount: 1, comment: 1, _id: 0} // projection
)
```

**Задача. Вывести товары, которых на складе больше `5` (проекция: `сумма`, `название`, `ко-во`)**

```jsx
db.goods.find(
    {quantity: {$gt: 5}},
    {price: 1, quantity: 1, title: 1, _id: 0}
)
```

**Пример. Увеличить стоимость товара с ID `g40495` на `20` EUR**

```jsx
db.goods.updateOne(
	{id: 'g40495'},
	{
		$inc: {price: 20}
	}
)
```

**Задача. Уменьшить ко-во товара с ID `g40495`на складе на `2` единицы**

```jsx
db.goods.updateOne(
	{id: '**g40495**'}, // filter
	{
		$inc: {quantity: -2}
	} // action
)
```

**Задача. Вывести `название` и `ко-во товаров`, остаток по которым - от `10`**

```jsx
db.goods.find(
  { quantity: { $gte: 10 } },
  { title: 1, quantity: 1, _id: 0 }
)
```

**Пример. Применить скидку к товару (уменьшить стоимость) с ID `g40495` в `10%`**

```jsx
db.goods.updateOne(
	{id: 'g40495'},
	{
	    $mul: {
	        price: .9
	    }
	}
)
```

**Задача. Увеличить стоимость на `12.5%` у всех товаров от `100` EUR и количеством от `3` единиц**

```jsx
db.goods.updateMany(
	{ // filter
		price: {$gte: 100},
		quantity: {$gte: 3}
	},
	{ // action
		$mul: {
			price: 1.125
		}
	}
)
```

**Задача. Добавить (установить) клиенту с id `x459595` два произвольных email-адреса**

```jsx
db.clients.updateOne(
	{id: '**x459595**'},
	{
		$set: {
			email: ['1@example.org', '2@example.org']
		}
	}
)
```

## Справочная информация

- как установить MongoDB
    - [Windows](https://timeweb.cloud/tutorials/mongodb/ustanovka-mongodb-na-raznye-os-windows-ubuntu-centos)
    - [Mac](https://www.imymac.com/ru/mac-tips/install-mongodb-mac.html)