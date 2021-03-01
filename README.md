## Project CEP

Challenge proposed by [@Scarabe](https://github.com/Scarabe)

    Criar uma aplicação java

    Você irá receber um |número| de CEP ex: 17065000 via uma api rest, ela deverá validar a quantidade de digitos enviados, será sempre 8 digitos
    com esse número deverá, utilizando o feign, recuperar os dados do cep utilizando a api https://viacep.com.br/ws/01001000/json/, retornar todos os
    dados obtidos na api.
    
    localhost:8080/cep/{CEP} -> passa por uma validação de digitos e o mesmo cep é utilizado para consulta no https://viacep.com.br/ws/%7BCEP%7D/json/ -> retorna ao requisitante todos os dados.
        
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

- [ ] Dar replace no traço por "" (vazio), validar se string contém apenas dígitos (regex), validar a quantidade de dígitos
- [ ] Exceptions
- [ ] Testes
- [ ] DB Mongo