## Project CEP

Challenge proposed by [gscarabelo](https://github.com/Scarabe)

    Criar uma aplicação java

    Você irá receber um |número| de CEP ex: 17065000 via uma api rest, ela deverá validar a quantidade de digitos enviados, será sempre 8 digitos
    com esse número deverá, utilizando o feign, recuperar os dados do cep utilizando a api https://viacep.com.br/ws/01001000/json/, retornar todos os
    dados obtidos na api.
    
    localhost:8080/cep/{CEP} -> passa apor uma validação de digitos e o mesmo cep é utilizado para consulta no https://viacep.com.br/ws/%7BCEP%7D/json/ -> retorna ao requisitante todos os dados.
        
    Gerenciaddor de dependencias
    - Maven <- usado na empresa
    - Gradlew <- preferencia pessoal (responder a pergunta do porque o gradlew é melhor)

    Tecnlogias
    - spring-boot-starter-web - spring boot  (processo-service)
    - spring-cloud-starter-openfeign - feign (processo-service)

    Arquitetura do projeto a ser utilizada é a MVC.
    Controller <- endpoints rest
    Service <- Camada de regras de negocio
    Integration <- Camada feign
    Dto <- Onde os dtos ficam agrupados

## In Progress

- [x] Validar a quantidade de digitos enviados
- [ ] Exceptions
- [ ] Testes unitários
- [ ] Swagger
- [ ] MongoDB repository

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.2/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.2/gradle-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#using-boot-devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

