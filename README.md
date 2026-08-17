# Spring ORM Student Management System

A console-based Student Management System built using **Java and Spring ORM**. The application demonstrates Spring's IoC container, DAO pattern, and CRUD operations for managing student records.

## Features

- Add student
- Display all students
- Find student by ID
- Update student details
- Delete student
- Console-based interactive menu
- Spring XML-based configuration
- DAO-based database operations

## Technologies Used

- Java
- Spring Framework
- Spring ORM
- Spring IoC / Dependency Injection
- XML Configuration
- DAO Pattern
- Maven

## Architecture

```text
Console
   ↓
App.java
   ↓
StudentDao
   ↓
Spring ORM / Persistence
   ↓
Database
```

## Project Structure

```text
src/main/java/com/spring/orm
├── App.java
├── dao
│   └── StudentDao.java
└── entities
    └── Student.java

src/main/resources
└── config.xml
```

## How It Works

The application loads the Spring configuration using `ApplicationContext`:

```java
ApplicationContext context =
        new ClassPathXmlApplicationContext("config.xml");
```

The `StudentDao` bean is retrieved from the Spring container and is used to perform CRUD operations.

## Console Menu

```text
1. Add Student
2. Display All Students
3. Get Student Details
4. Delete Student
5. Update Student
6. Exit
```

## Getting Started

### Prerequisites

- Java JDK
- Maven
- Configured database

### Run

Clone the repository and run the `App.java` main class.

The application will start with an interactive console menu.

## Concepts Demonstrated

- Spring IoC Container
- Dependency Injection
- Spring ORM
- DAO Pattern
- CRUD Operations
- XML-based Spring Configuration
- Exception Handling



## Author

**Ankur Gautam**

GitHub: [@ankur15k](https://github.com/ankur15k)
