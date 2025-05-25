# Config Server

## Overview

This is the **Spring Cloud Config Server** that provides centralized configuration management for all microservices. It serves configuration properties stored in a Git repository.

## Features

- Serves configuration files based on application name and profile.
- Externalizes configuration from microservices.
- Provides a REST endpoint to fetch configurations dynamically.

## Running Locally

### Prerequisites

- Java 17+
- Maven

### Steps

1. Clone this repo.
2. Navigate to `config-server` folder.
3. Run the server:

   ```bash
   ./mvnw spring-boot:run
4. The Config Server will start at http://localhost:8888.

5. Test configuration retrieval for an app:

http://localhost:8888/application/default
