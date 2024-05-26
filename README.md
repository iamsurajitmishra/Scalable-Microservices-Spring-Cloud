
# Spring-Cloud-Microservices




## Tech Stack


**Server:** Spring-Boot, JPA, Hibernate, Spring-Boot-REST-API, Feign-Client for microservice communication
Netfix-Eureka-Server service registry and discovery.

**Client:** Postman, Browser

**Database:** MySQL



## Spring-Cloud-Architechture

![Spring-Cloud-Architechture](https://github.com/iamsurajitmishra/Spring-Cloud-microservices/blob/master/design-screen-shot/spring-cloud-architechture.png)


## Microservices-Communication

![Microservices-communication](https://github.com/iamsurajitmishra/Spring-Cloud-microservices/blob/master/design-screen-shot/spring-cloud-microservice-communication.png)


## Service-Discovery-using-Netflix-Eureka-Server

![Netflix-Eureka-Server => Service registry & Discovery](https://github.com/iamsurajitmishra/Spring-Cloud-microservices/blob/master/design-screen-shot/spring-cloud-Netflix-Eureka-Server.png)


## API-Gateway architechture

![API-GATE-WAY](https://github.com/iamsurajitmishra/Spring-Cloud-microservices/blob/master/design-screen-shot/API-Gate-Way.png)

### [Centralized server link](https://github.com/iamsurajitmishra/config-server-repo/tree/main) 

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

