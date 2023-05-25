#!/bin/bash -x

docker rm mysql

docker run -d -p 3306:3306 --name mysql \
  -e MYSQL_ROOT_PASSWORD=secret \
  -e MYSQL_DATABASE=events \
  -e MYSQL_USER=webapp \
  -e MYSQL_PASSWORD=secret \
  mysql/mysql-server:latest
