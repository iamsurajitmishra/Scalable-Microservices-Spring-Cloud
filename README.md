
# Scalable Microservices With Spring Cloud




## Tech Stack


**Server:** Spring-Boot embeded Tomcat Server, Spring-Boot-REST-API

**Client:** Postman, Browser

**Database:** MySQL,JPA, Hibernate

**Service Discovery:** Spring Cloud relies on services like Eureka Server to help register and locate microservices within the application.

**Configuration Management:** It integrates with Spring Cloud Config Server for centralized configuration management. Individual microservices use the Spring Cloud Config Client to fetch their configurations.

**Routing:** Tools like Spring Cloud Gateway can be used to provide a single entry point for API requests and route them to appropriate microservices.

**Resilience:** Libraries like resilience4j can be used to implement features like circuit breakers and fault tolerance for handling service failures gracefully.

**Other functionalities:** Spring Cloud offers various other tools for distributed messaging, task execution, and monitoring in a microservices architecture.



## Spring-Cloud-Architechture

![Spring-Cloud-Architechture](https://github.com/iamsurajitmishra/Spring-Cloud-microservices/blob/master/design-screen-shot/spring-cloud-architechture.png)

## API-Gateway architechture

![API-GATE-WAY](https://github.com/iamsurajitmishra/Spring-Cloud-microservices/blob/master/design-screen-shot/API-Gate-Way.png)

## Microservices-Communication

![Microservices-communication](https://github.com/iamsurajitmishra/Spring-Cloud-microservices/blob/master/design-screen-shot/spring-cloud-microservice-communication.png)


## Service-Discovery-using-Netflix-Eureka-Server

![Netflix-Eureka-Server => Service registry & Discovery](https://github.com/iamsurajitmishra/Spring-Cloud-microservices/blob/master/design-screen-shot/spring-cloud-Netflix-Eureka-Server.png)


### Config-Server manual refresh

![Config-Server-manual-refresh](https://github.com/iamsurajitmishra/Scalable-Microservices-Spring-Cloud/blob/master/design-screen-shot/config-server-refresh-manually.png) 

### Config-Server auto refresh

![Config-Server-auto-refresh](https://github.com/iamsurajitmishra/Scalable-Microservices-Spring-Cloud/blob/master/design-screen-shot/config-server-message-brokerpng.png) 

## Rabbitmq integration with spring cloud bus - 
```
### INSTALL rabbitmq
* pull rabbitmq docker image
  *  docker pull rabbitmq:3.11.0
  *  docker run --rm  -it -p 5672:5672 rabbitmq:3.11.0
```
 
### Add amqp dependency inside pom.xml
```
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-bus-amqp</artifactId>
		</dependency>
```

### Running Zipkin -> Distributed tracing

#### Pull zipkin docker image
```
docker pull openzipkin/zipkin
```

#### Run zipkin container
```
docker run -d -p 9411:9411 openzipkin/zipkin

```


### [Centralized Config server repository](https://github.com/iamsurajitmishra/config-server-repo/tree/main) 

### Circuit-Breaker-Pattern
![Circuit-Breaker-Pattern](https://github.com/iamsurajitmishra/Scalable-Microservices-Spring-Cloud/blob/master/design-screen-shot/circuit-breaker-pattern.png) 


## Service-Host

#### employee-service -> http://localhost:9090
#### department-service -> http://localhost:8080
#### api-gate-way -> http://localhost:2000
#### config-server -> http://localhost:3000
#### service-discovery-> http://localhost:8761


## API Reference

#### Get all items

```http
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### add(num1, num2)

Takes two numbers and returns the sum.

