# StudentHub-SpringORM

## Overview

StudentHub-SpringORM is a console-based Student Management System built using Java, Spring Framework, Spring ORM, Hibernate, Maven, and MySQL. The application demonstrates complete CRUD (Create, Read, Update, Delete) operations while following a layered architecture using the DAO design pattern.

The project focuses on understanding Spring ORM integration with Hibernate, dependency injection, bean management, and database persistence.

---

## Features

- Create a new student record
- View all students
- Search a student by ID
- Update existing student details
- Delete a student record
- Persistent storage using MySQL
- Layered architecture using DAO Pattern
- Spring Dependency Injection
- HibernateTemplate for ORM operations

---

## Tech Stack

| Technology | Version |
|------------|---------|
| Java | 21 |
| Spring Framework | 5.x |
| Spring ORM | 5.x |
| Hibernate | 5.x |
| Maven | Latest |
| MySQL | 8.x |
| JDBC | Java Database Connectivity |
| XML Configuration | Spring Bean Configuration |

---

## Project Architecture

```
                  User
                    │
                    ▼
          Console Application
                    │
                    ▼
                App.java
                    │
                    ▼
              Student DAO
                    │
                    ▼
          HibernateTemplate
                    │
                    ▼
               Hibernate
                    │
                    ▼
             MySQL Database
```

---

## Project Structure

```
StudentHub-SpringORM
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── entity
│   │   │   ├── dao
│   │   │   └── App.java
│   │   │
│   │   └── resources
│   │       └── applicationContext.xml
│
├── pom.xml
├── .gitignore
└── README.md
```

---

## Database Schema

**Database**

```
springorm
```

**Student Table**

| Column | Data Type |
|----------|-----------|
| id | INT |
| name | VARCHAR |
| city | VARCHAR |

---

## How to Run

### Clone the Repository

```bash
git clone https://github.com/<your-username>/StudentHub-SpringORM.git
```

### Navigate to the Project

```bash
cd StudentHub-SpringORM
```

### Create the Database

```sql
CREATE DATABASE springorm;
```

### Configure Database Credentials

Update the database username and password in the Spring configuration file.

### Build the Project

```bash
mvn clean install
```

### Run the Application

Execute the `App.java` file.

---

## Sample Menu

```
1. Add Student
2. Display All Students
3. Search Student
4. Delete Student
5. Update Student
6. Exit
```

---

## Concepts Covered

- Spring IoC Container
- Dependency Injection
- Spring ORM
- Hibernate ORM
- HibernateTemplate
- DAO Pattern
- XML Bean Configuration
- Maven Dependency Management
- CRUD Operations
- MySQL Integration
- Layered Architecture

---

## Future Enhancements

- Spring MVC
- Spring Boot
- REST APIs
- Spring Security with JWT
- Bean Validation
- Docker
- Unit Testing
- Logging
- Microservices

---

## Author

**Ankur Gautam**

B.Tech Computer Science and Engineering

Aspiring Java Backend Developer
