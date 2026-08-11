Task Tracker
------------

A simple and clean task tracking website built with Spring Boot, PostgreSQL, and Hibernate/JPA. Create task lists, add tasks, track progress, and manage everything in one place.

Features
---------
- Create, edit, and delete task lists
- Add, update, and remove tasks within a list
- Track task progress / completion status
- Persistent storage with PostgreSQL


Tech Stack
-----------
- Java 21
- Spring Boot
- Maven (build tool)
- PostgreSQL (database)
- Hibernate / Spring Data JPA  (ORM & data access)

Prerequisites
-------------
- JDK 21
- Maven 
- PostgreSQL installed and running locally (or a connection string to a hosted instance)

Getting Started
----------------

1. Clone the repository

    git clone 
    cd task-tracker

2. Create the database

    CREATE DATABASE task_tracker;

3. Configure the connection

    Update src/main/resources/application.properties with your database credentials
    Update docker-compose.yml if you are using docker images


4. Build the project

5. Run the application

    The app will be available at `http://localhost:8080`.















