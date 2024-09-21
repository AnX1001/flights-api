# SpringBoot app

The app is using Maven Wrapper (mvnw), which is bundled with the the project. No need to install Maven globally. 

Run the Spring Boot app: 
```
./mvnw clean install spring-boot:run
```

# Application Structure

- **Entry of application**: `FlightInfoApplication.java`
  - Starts the Spring Boot application and sets up the environment.
  
- **Defines endpoints**: `FlightController.java`
  - Handles HTTP requests and defines routes.

- **Provides the data**: `FlightService.java`
  - Contains business logic and provides the data (currently hardcoded).

- **Shapes the data**: `Flight.java`
  - Models the data structure for a flight, defining fields like flight number, origin, and destination.
