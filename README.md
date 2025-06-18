// README.md
# Student Fee Microservices

## Overview
This project demonstrates a microservices architecture for managing student fee collection using Spring Boot. It includes:

- **Student Service**: Add and view student details
- **Fee Service**: Collect and view fee receipts
- **Eureka Server**: Service discovery
- **API Gateway**: Routing for services
- **Swagger**: API documentation
- **Postman**: Request testing

## Project Structure
- `eureka-server` – Service registry
- `api-gateway` – API routing
- `student-service` – Student microservice
- `fee-service` – Fee microservice
- `postman-collection` – Contains Postman JSON file

## Start Order
Start these services in order using `mvn spring-boot:run` or your IDE:
1. `eureka-server`
2. `student-service`
3. `fee-service`
4. `api-gateway`

## URLs

### Eureka Dashboard
- http://localhost:8761

### Swagger Docs
- Student Service: http://localhost:8081/swagger-ui.html
- Fee Service: http://localhost:8082/swagger-ui.html

### Postman Collection
Import `Student Fee Microservices.postman_collection` in Postman and use:
- Add Student
- Collect Fee
- View Receipts

## H2 Console Access
- Student Service: http://localhost:8081/h2-console
- Fee Service: http://localhost:8082/h2-console

Use:
- JDBC URL: `jdbc:h2:mem:testdb`
- User: `sa`
- Password: *(leave blank)*

## Build & Run
Use Maven:
```bash
mvn clean install
```
Then run each service individually as spring boot application.

---

This project is modular, lightweight, and easy to extend. Perfect for learning Spring microservices with service discovery, routing, documentation, and testing support.
