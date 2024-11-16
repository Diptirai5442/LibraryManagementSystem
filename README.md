# LibraryManagementSystem

Create a secure Library Management System with role-based access control. The 
system will manage books, authors, and user accounts with different permission levels.

## Table of Contents

 Controllers handle HTTP requests
 Services contain business logic
 Repositories manage database operations
 Entities define data models
 Security configurations protect endpoints

## Add Dependencies

 Spring Boot
 Spring Security 
 Java 
 Maven/Gradle
 H2 Database
 Spring Data JPA
 JWT for authentication
 Spring Web

## Security Requirements

 Implement user registration and authentication
 Support three roles: ADMIN, LIBRARIAN, USER
 Use JWT tokens for authentication
 Implement password encryption using BCrypt
 Role-Based Access Control: 
 ADMIN: Full access to all endpoints
 LIBRARIAN: Can manage books and authors
 USER: Can only view books and authors
 Security Configurations: 
 Configure CORS and CSRF protection
 Set secure HTTP headers
 Handle session management

## Entity Requirements

User Entity:

- id (Long)
- username (String, unique)
- password (String, encrypted)
- email (String, unique)
- role (Enum: ADMIN, LIBRARIAN, USER)
- enabled (boolean)
- createdAt (LocalDateTime)

## Book Entity:

Book Entity: 

- id (Long)
- title (String)
- isbn (String, unique)
- publishedDate (LocalDate)
- price (BigDecimal)
- authorId (Long)
- createdBy (String)
- lastModifiedBy (String)

## Author Entity:

Author Entity:

- id (Long)
- firstName (String)
- lastName (String)
- email (String)
- birthDate (LocalDate)

## API Requirements

Authentication Endpoints:
Book Endpoints:
Author Endpoints:
