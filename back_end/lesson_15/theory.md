## Тестирование контроллеров

## 01. Подключение необходимых библиотек

* Для успешной работы тестов необходимо подключить следующие библиотеки:

```
testImplementation 'org.springframework.boot:spring-boot-starter-test:2.7.12'
testImplementation 'org.springframework.security:spring-security-test:5.7.7'
testImplementation 'org.hamcrest:hamcrest-all:1.3'
```

## 02. Настройка конфигурации для тестов

### Properties

* Мы исключаем из тестирования взаимодействие с базой данных. При этом мы будем полностью запускать SpringBoot-приложение. 
* Необходимо подготовить файл `application-test.properties` и разместить его в `resources` внутри папки `test`. Внутри данного файла следует оставить только необходимые для запуска приложения настройки.

### Отключение взаимодействия Spring Security с базой данных

* Создадим класс `TestConfig` внутри пакета `de.ait.todo.test.config` (см. пример в приложенном коде)

Рассмотрим указанные аннотации и классы:

* `@TestConfiguration` - показывает, что данный класс-конфигурация должен использоваться только в тестовом окружении.
* `@EnableAutoConfiguration(exclude..` - отключаем автоконфигурацию базы данных (+ репозитории)

* Объявляем бин, который с помощью `@Primary` будет "перекрывать" в тестовом окружении конфигурацию основного Spring Security.
```
@Bean
    @Primary
    public UserDetailsService userDetailsService() {
         return new InMemoryUserDetailsManager() {
         ...
    }
```

* В данном случае вместо взаимодействия с базой данных, Spring Security будет хранить пользователей внутри оперативной памяти.

### 03. Тестирование endpoint-а profile

* Рассмотрим пример конкретного тестового класса и его аннотации (см. `UsersControllerTest` в приложенном коде)
* `@SpringBootTest(classes = TestConfig.class)` - показываем, что данный тест должен запускать полноценное SpringBoot-приложение с использованием конфигурации, созданной ранее
* `@AutoConfigureMockMvc` - включаем возможность тестирования наших enpoint-ов в режиме отправки запросов и получения ответов.
* `@ActiveProfiles("test")` - подключаем настройки из `application-test.properties` файла.

* Подключаем инструмент для тестирования

```java
@Autowired 
private MockMvc mockMvc;
```

* Мы не будем использовать полноценные репозитории для работы с бд, вместо этого используем mock-объекты:

```
    @MockBean
    private UsersRepository usersRepository;

    @MockBean
    private TasksRepository tasksRepository;
```

* Явно пропишем поведение для метода `findById` репозитория (stubbing):

```
@BeforeEach
    void setUp() {
        when(usersRepository.findById(1L)).thenReturn(
                Optional.of(User.builder()
                                .id(1L)
                                .role(User.Role.ADMIN)
                                .email("admin")
                .build()));
    }
```

* `@WithUserDetails(value = "admin")` - тестирование будет проводиться с использованием пользователя `admin` (ранее он был указан в конфигурационном классе `TestConfig`)

* Отправляем запрос на необходимый URL, печатаем данные запроса и ответа и проверяем JSON, полученный в ответ:

```
mockMvc.perform(get("/api/users/my/profile")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.email", is("admin")))
                .andExpect(jsonPath("$.role", is("ADMIN")));
```

* Общая схема работы теста:

![image](https://raw.githubusercontent.com/ait-tr/cohort22/main/back_end/lesson_15/img/1.png)