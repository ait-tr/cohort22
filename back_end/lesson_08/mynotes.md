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


==
$ docker exec -it mysql mysql -uroot -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 32
Server version: 8.0.32 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE USER 'root'@'%' IDENTIFIED BY 'secret';
Query OK, 0 rows affected (0.01 sec)

mysql> GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;
Query OK, 0 rows affected (0.01 sec)

===
