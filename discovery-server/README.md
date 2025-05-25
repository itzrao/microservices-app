# Discovery Server (Eureka)

## Overview

This service runs **Eureka Server**, which is a Service Registry for microservices. All microservices register here for dynamic discovery.

## Features

- Service registration and discovery.
- Provides a dashboard to view registered instances.
- Enables load balancing and fault tolerance in microservices.

## Running Locally

### Prerequisites

- Java 17+
- Maven

### Steps

1. Clone this repo.
2. Navigate to `discovery-server` folder.
3. Run the server:

   ```bash
   ./mvnw spring-boot:run
4. Eureka Server will start at http://localhost:8761.

5. Visit the dashboard to see registered services.