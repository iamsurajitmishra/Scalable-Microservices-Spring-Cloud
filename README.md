
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


## Microservices-Communication

![Microservices-communication](https://github.com/iamsurajitmishra/Spring-Cloud-microservices/blob/master/design-screen-shot/spring-cloud-microservice-communication.png)


## Service-Discovery-using-Netflix-Eureka-Server

![Netflix-Eureka-Server => Service registry & Discovery](https://github.com/iamsurajitmishra/Spring-Cloud-microservices/blob/master/design-screen-shot/spring-cloud-Netflix-Eureka-Server.png)


## API-Gateway architechture

![API-GATE-WAY](https://github.com/iamsurajitmishra/Spring-Cloud-microservices/blob/master/design-screen-shot/API-Gate-Way.png)

### [Centralized server link](https://github.com/iamsurajitmishra/config-server-repo/tree/main) 

### [Config-Server-manual-refresh](https://github.com/iamsurajitmishra/Scalable-Microservices-Spring-Cloud/blob/master/design-screen-shot/config-server-refresh-manually.png) 

## Rabbitmq integration with spring cloud bus - 

### INSTALL rabbitmq
* pull rabbitmq docker image
  *  docker pull rabbitmq:3.11.0
  *  docker run --rm  -it -p 5672:5672 rabbitmq:3.11.0
    
### dependency needed to add
'''
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-bus-amqp</artifactId>
		</dependency>
'''



### [Config-Server-auto-refresh-refresh](https://github.com/iamsurajitmishra/Scalable-Microservices-Spring-Cloud/blob/master/design-screen-shot/config-server-refresh-manually.png) 


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

