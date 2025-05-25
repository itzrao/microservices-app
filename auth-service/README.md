# Auth Service

## Overview

The Auth Service provides user authentication and authorization using JWT tokens. It supports:

- User registration
- User login
- Role-based access control
- JWT token generation and validation
- Service registration with Eureka
- Externalized configuration from Config Server

## Technology Stack

- Spring Boot
- Spring Security
- JWT (JJWT library)
- MySQL
- Eureka Client
- Spring Cloud Config Client

## Running Locally

### Prerequisites

- Java 17+
- Maven
- MySQL running locally with database `authdb`
- Eureka Server running at `http://localhost:8761`
- Config Server running at `http://localhost:8888`

### Setup MySQL

```sql
CREATE DATABASE authdb;
CREATE USER 'authuser'@'localhost' IDENTIFIED BY 'yourpassword';
GRANT ALL PRIVILEGES ON authdb.* TO 'authuser'@'localhost';
FLUSH PRIVILEGES;


Update bootstrap.yml datasource username and password accordingly.

Steps
1. Clone this repo.

2. Navigate to auth-service folder.

3. Run the service:
./mvnw spring-boot:run

The service will start at http://localhost:9001 and register with Eureka.

APIs
POST /api/auth/register

Register new user. Request body:
{
  "username": "testuser",
  "email": "test@example.com",
  "password": "yourpassword"
}
POST /api/auth/login

Login with credentials. Request body:

{
  "username": "testuser",
  "password": "yourpassword"
}
Response:

{
  "id": 3,
  "username": "testuser",
  "email": "test@example.com",
  "roles": ["ROLE_USER"],
  "accessToken": "jwt-token",
  "tokenType": "Bearer"
}
Notes
Passwords are stored encrypted using BCrypt.

Use Authorization: Bearer <accessToken> header for accessing protected resources.

All configuration is externalized via Config Server.