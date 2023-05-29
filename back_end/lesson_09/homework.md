## Homework

### Part 1

Включить логирование SQL-запросов

https://www.baeldung.com/sql-logging-spring-boot

```
logging.level.org.hibernate.SQL=debug
logging.level.org.hibernate.orm.jdbc.bind=trace
```

2. Выделить жары в отдельную сущность
    - Добавить Entity + Repository
    - Проверить, что создалась таблица. Найти SQL создания таблицы в логе 

### Part 2

1. Выделить жанры в отдельную сущность
    - Добавить Entity + Repository
    - Добавить Service
    - Сделать контроллер для добавления и просмотра(GET genres/{id} и POST genres)
2. Связать через @OneToMany и @ManyToOne Genre и Artist
3. Построить ER-диаграмму в workbench

