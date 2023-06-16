# Docker #1 / Jun 16, 2023

## Базовые компоненты любого проекта

- `FE` интерфейс
- `BE` бизнес-логика
- `DB` хранилище
- `Deployment` развертывание (напр., с помощью **`Docker`**)

## Установка Docker

[Get Docker](https://docs.docker.com/get-docker/)

## Регистрация на Docker Hub

[Docker Hub Container Image Library | App Containerization](https://hub.docker.com/)

!https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9ba45d82-26c9-4abd-8c8a-c1721beef2fb/DockerArchitecture_1.webp

## Что такое Docker

- прикладное ПО  (приложение) - появилось в 2013
- представляет собой платформу для контейнеризации приложений
- это открытая платформа для автоматизации разработки, доставки и запуска приложений внутри **контейнеров**
- предоставляет среду, в которой приложения и все их зависимости могут быть упакованы и запущены в изолированном и переносимом контейнере

## Основные термины

- **Образ (image)** - выполняемый пакет, который включает все необходимое для запуска приложения, ключая код приложения, среду выполнения и зависимости
- **Контейнер (container)** - экземпляр образа (процесс), который выполняется в изолированной среде
    - обеспечивает уровень изоляции от других приложений и основной системы
- **`Dockerfile`** - текстовый файл, содержащий инструкции для построения **Docker-образа**
    - определяет код и зависимости (состав), которые должны быть включены в образ
- **Docker Hub** - самый распространенный реестр образов
    - позволяет делиться собственными образами и хранит базовые (стандартные) образы
- **Docker CLI** - командный интерфейс работы с Docker
- **Docker Desktop** - GUI-интерфейс работы с Docker

## Основные команды

- `docker login` авторизация на **Docker Hub**
- `docker version` просмотр версии
- `docker run hello-world` запуск тестовый контейнер на основе стандартного образа
    - `docker run -p <host_port>:<container_port> <application_name>`
- `docker run -it ubuntu bash` запуск **bash**  в режиме песочницы
- `docker images` просмотр имеющихся образов
- `docker rmi -f <image_id>` удалить образ
- `docker build -t <название_приложения> .` создать (собрать) образ
- `docker tag <app_name> <docker_hub_username>/<repo_name>` привязка к репо на **Docker Hub**
- `docker push <docker_hub_username>/<repo_name>` выгрузить на **Docker Hub**

## Базовый подядок с Docker

1. Открыть имеющийся проект (или создать новый)
2. Создать `Dockerfile`
3. Создать (собрать) образ (на основе `Dockerfile`)
4. Запустить контейнер на основе образа

## Тестовый проект #1 (на Python)

```python
## файл app.py

from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello():
    return 'Hello, FRIEND!'

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0')
```

```docker
## Dockerfile
# Указываем базовый образ
FROM python:3.8-slim

# Устанавливаем зависимости
RUN pip install --no-cache-dir flask

# Копируем файлы в рабочую директорию контейнера
COPY . /app
WORKDIR /app

# Указываем команду, которая будет выполняться при запуске контейнера
CMD ["python", "app.py"]
```

## Тестовый проект #2 (на Java)

`git clone https://github.com/spring-projects/spring-petclinic.git`

```docker
## Dockerfile

FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
```

**Dockerfile for gradle #1 (?)**

```docker
FROM gradle:jdk11 as gradleimage
COPY . /home/gradle/source
WORKDIR /home/gradle/source
RUN gradle build

FROM openjdk:11-jre-slim
COPY --from=gradleimage /home/gradle/source/build/libs/demo.jar /app/
WORKDIR /app
ENTRYPOINT ["java", "-jar", "demo.jar"]
```

**Dockerfile for gradle #2 (?)**
```docker
FROM gradle:4.7.0-jdk8-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon 

FROM openjdk:8-jre-slim

EXPOSE 8080

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]
```