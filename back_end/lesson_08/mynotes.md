TODO
- Проверить опции логирования SQL
- Дописать про JPA вообще

https://hub.docker.com/_/mysql

```
docker run -d -p 3306:3306 --name mysql-docker-container -e MYSQL_ROOT_PASSWORD=sergey -e MYSQL_DATABASE=mydb -e MYSQL_USER=apopov -e MYSQL_PASSWORD=mypass mysql/mysql-server:latest
```
```
docker run -it --network=host --rm mysql mysql -h127.0.0.1 -uapopov -p
```

0. Убеждаемся, что база запущена
    - Создаем БД
    - Пользователя
1. Добавляем зависимости
2. Настроиваем в спринге
    - application.properties

