## Homework

### Part 1

Включить логирование SQL-запросов

https://www.baeldung.com/sql-logging-spring-boot

```
logging.level.org.hibernate.SQL=debug
logging.level.org.hibernate.orm.jdbc.bind=trace
```

2. Выделить жанры в отдельную сущность
    - Добавить Entity + Repository
    - Проверить, что создалась таблица. Найти SQL создания таблицы в логе 

### Part 2

1. Выделить жанры в отдельную сущность
    - Добавить Entity + Repository
    - Добавить Service
    - Сделать контроллер для добавления и просмотра(GET genres/{id} и POST genres)
2. Связать через @OneToMany и @ManyToOne Genre и Artist
3. Построить ER-диаграмму в workbench
4. Переписать Endpoint API для добавления(post) и обвновления(put) Atrist. Он должен принимать имя артиста и id жанра
5. Сделать Endpoint API который вернет всех артистов для genre_id /genre/{id}/artists

Доп. занятие:

- Связать Artist с Event.
    - Переписать Endpoint API для добавления(post) и обновления(put) Event. Теперь он должен принимать имя, placeId и artistId
