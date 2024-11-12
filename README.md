# User Management System

This project is a User Management System built using Spring Boot and MySQL, designed to demonstrate CRUD operations (Create, Read, Update, Delete) for user data. The application is structured with the MVC (Model-View-Controller) pattern, and data is managed using JPA and Hibernate for Object-Relational Mapping (ORM). The project will be deployed to Heroku for cloud hosting.

# Project Overview
* Frameworks & Tools: Spring Boot, MySQL, Hibernate, JPA, Gradle, Lombok, and Postman.
* Core Functionality: Basic CRUD operations for user management (e.g., adding and listing users).
* Deployment: Cloud deployment using Heroku, with database services set up on AWS RDS.

# Project Structure

1. Server Side:
  * Spring Boot is the primary framework for backend development.
  * Follows an MVC structure:
      * Model: Defines entity classes for database tables.
      * Repository: Interfaces extend CrudRepository and JpaRepository for database operations.
      * Service: Handles business logic and interacts with repositories.
      * Controller: Manages API endpoints for client requests.
  * Uses MySQL as the database, hosted on localhost and AWS RDS for cloud.
  * Incorporates Lombok for clean code with annotations like @Data to simplify boilerplate code.
  * Gradle manages project dependencies.
2. Client Side:
  * API Testing: Endpoints will be tested using Postman to simulate HTTP requests (GET, POST, PUT, DELETE).
  * Authorization and basic HTTP methods are configured in Postman for testing.
3. Deployment:
  * The project will be deployed to Heroku via GitHub integration for easy version control and continuous deployment.

# Goals
* Set up a functional user management system using Spring Boot and MySQL.
* Gain hands-on experience with CRUD operations, API creation, and ORM with JPA/Hibernate.
* Deploy and manage a Spring Boot application on the cloud with Heroku and AWS RDS.
