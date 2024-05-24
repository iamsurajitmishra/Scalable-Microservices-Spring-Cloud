
# Spring-Cloud-Microservices




## Tech Stack


**Server:** Spring-Boot, JPA, Hibernate, Spring-Boot-REST-API

**Client:** Postman, Browser

**Database:** MySQL



## Spring-Cloud-Architechture

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## Microservices-Communication

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## Service-Discovery-using-Netflix-Eureka-Server

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## API-Gateway

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


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

