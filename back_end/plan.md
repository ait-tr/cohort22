Backend class plan
==================

1. What is backend and how frontend interacts with backend.
   HTTP protocol basics - methods, headers, body, http vs https.
   Making http requests with curl command.
2. Spring framework, parts of the Spring framework. Spring Boot.
   How to generate Spring app. Simple Spring MVC app.
   Dependency management with Maven and Gradle. Running spring apps with Maven/Gradle.
   Compiling Spring app to jar file.
3. MVC design pattern and it's implementation in Spring. @Controller annotation. Server-side rendering.
4. Dependency injection and inversion of control. Spring context. Beans, how we can create beans.
   @Bean annotation. Singleton pattern. 3-tier architecture. Spring testing approach and @SpringBootTest
5. REST and REST API. @RestController vs @Controller. @RequestMapping and other mapping annotations
   (@GetMapping, @PostMapping). Mapping http requests. @Header, @PathVariable, @RequestParam
6. DTOs. Mapping request body (@RequestBody). Lombok. SwaggerUI.
7. Services tier and data access tiers. @Service, @Component, @Repository.
   How we can configure Spring app with application.properties. Overriding properties with env variables.
   Spring profiles.
8. Connecting Spring app with SQL Databases. JPA and Spring Data JPA. Entities and repositories.
   Mapping Entities to DTOs and back.
9. Entities in deps. Associated attributes (@OneToOne, @OneToMany, @ManyToMany)
10. Repositories in deps. Methods naming, JPA and native queries
11. Spring Security. ROLE based access to controller methods.
12. Module project - building a 3-tiered Spring Boot app, storing data in DB, secured with Spring Security.
