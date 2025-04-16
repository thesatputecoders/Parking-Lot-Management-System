# Parking Lot Management System

## Overview
The Parking Lot Management System is a Spring Boot application designed to manage real-time parking slot allocation and billing. It provides a set of REST APIs to facilitate vehicle entry and exit, monitor slot availability, allocate slots based on vehicle type, and generate daily reports of parking usage and billing.

## Features
- **Vehicle Management**: Handle vehicle entry and exit, and allocate parking slots based on vehicle type (bike, car, truck).
- **Real-time Slot Availability**: Check the availability of parking slots in real-time.
- **Admin Functionalities**: Admins can add and update parking slots.
- **Billing and Reporting**: Generate daily reports of parking usage and billing information.

## Technologies Used
- **Spring Boot**: Framework for building the application.
- **MySQL**: Database for storing parking slot and vehicle information.
- **Hibernate**: ORM for database interactions.
- **Spring Data JPA**: Simplifies data access and repository management.

## Project Structure
```
parking-lot-management-system
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── parkinglot
│   │   │           ├── controller
│   │   │           ├── dto
│   │   │           ├── entity
│   │   │           ├── exception
│   │   │           ├── repository
│   │   │           ├── service
│   │   │           └── ParkingLotManagementSystemApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
│   └── test
│       └── java
│           └── com
│               └── parkinglot
│                   └── ParkingLotManagementSystemApplicationTests.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the Repository**:
   ```
   git clone <repository-url>
   cd parking-lot-management-system
   ```

2. **Configure Database**:
   Update the `src/main/resources/application.properties` file with your MySQL database connection details.

3. **Run the Application**:
   Use the following command to run the application:
   ```
   mvn spring-boot:run
   ```

4. **Access the API**:
   The application will be available at `http://localhost:8080`. You can use tools like Postman or curl to interact with the REST APIs.

## API Endpoints
- **Vehicle Entry**: `POST /api/vehicles/entry`
- **Vehicle Exit**: `POST /api/vehicles/exit`
- **Check Slot Availability**: `GET /api/slots/availability`
- **Allocate Slot**: `POST /api/slots/allocate`
- **Admin Add/Update Slot**: `POST /api/admin/slots`
- **Generate Daily Report**: `GET /api/reports/daily`

