# AMS - My First Spring Boot Project

## Overview

AMS is my first web application built on the Spring MVC framework using Java version 17.0.6 and Maven 3.0.2. The application was created as a learning project to gain experience with key Spring MVC concepts and technologies. The application uses Spring Boot and Thymeleaf to implement the MVC layer.

## Getting Started

To run the project, you will need to have Maven and Java JDK 17 installed on your system. You can use your preferred Integrated Development Environment (IDE) to run the project. Here are the steps to run the project in Spring Tool Suite (STS):

### Step 1

Open STS and import the project.

### Step 2

Right-click on the project and select "Run As" > "Spring Boot App".

### Step 3

Once the application is running, you can access it by navigating to http://localhost:8081 in your web browser.

Note that the port number has been changed from the default 8080 to 8081.

## Available Endpoints

- http://localhost:8081/ Homepage
- http://localhost:8081/contact/details Contact Details - displays details about me
- http://localhost:8081/simple/info Simple Info - displays the number of hours the bootcamp used for learning Spring
- http://localhost:8081/simple/data List of Contacts - shows a list of contacts
- http://localhost:8081/provider/list List of Providers - displays a list of providers with options to add, view, edit, or delete them
- http://localhost:8081/provider/add Add Provider - allows you to add a new provider
- http://localhost:8081/details/{id} Provider Details - displays details about a specific provider based on their ID
- http://localhost:8081/provider/update/{id} Update Provider - allows you to update an existing provider based on their ID
- http://localhost:8081/provider/delete/{id} Delete Provider - allows you to delete an existing provider based on their ID

## Concepts Covered

The following concepts have been covered as part of this project :

### 1. The SpringBoot project structure
- Setting custom parameters for our project
- SpringBoot structure, default package, main class
- Resource/static and Resource/template folders
- Manage dependencies using Maven and pom.xml file
- Properties file, changing port
- Running SpringBoot project

### 2. The SpringBoot MVC Layer
- Create a custom controller, action, annotation
- Create a view/model and transfer data between view/controller
- Using Thymleaf templating engine
- Adding CSS file
- Deployment of the application on remote free server
- Adding unitary tests using JUnit

![Plan of the bootcamp](./Plan.png)

## Dependencies

The following dependencies were used in the creation of this project:

- Spring Boot
- Thymeleaf
- Spring Web

## Contributing

If you would like to contribute to the project, please fork the repository and create a pull request with your proposed changes. Be sure to follow the project's coding standards and include appropriate tests with your changes.

## License

This project is licensed under the MIT License - see the [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT) file for details. Feel free to use this code in your own projects or modify it to fit your specific needs.
