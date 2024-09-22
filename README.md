# FlightInfo API

## Overview

The FlightInfo API is a Spring Boot application that provides flight information.

The app is using Maven Wrapper (mvnw), which is bundled with the the project. No need to install Maven globally.

The application runs on **port 9090** by default.

Run the Spring Boot app:

```
./mvnw clean install spring-boot:run
```

# Application Structure

- **Entry of application**: `FlightInfoApplication.java`
  - Starts the Spring Boot application and sets up the environment.
- **Defines endpoints**: `FlightController.java`

  - Handles HTTP requests and defines routes.

- **Shapes the data**: `Flight.java`
  - Models the data structure for a flight, defining fields like flight number, origin, and destination.
