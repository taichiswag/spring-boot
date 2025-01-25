# Spring Boot Security Custom DB Login & Signup

This project demonstrates how to implement Spring Security with a custom `UserDetailsService` and a custom login page, along with user signup functionality. It uses a MySQL database to store user credentials and roles.

## Features
- Custom login page with Spring Security.
- User registration (signup) functionality.
- Custom `UserDetailsService` to fetch user details from the database.
- Role-based access control.

## Dependencies
- **spring-boot-starter-web**: Required for building web applications with Spring Boot.
- **spring-boot-starter-data-jpa**: Provides support for JPA and database interactions.
- **tomcat-embed-jasper**: Enables JSP support for rendering custom login pages.
- **spring-boot-starter-security**: Adds Spring Security to the project.
- **jstl**: JavaServer Pages Standard Tag Library for JSP pages.
- **mysql-connector-java**: MySQL database driver for connecting to the MySQL database.

## Setup
1. Clone the repository.
2. Configure your MySQL database in `application.properties`.
3. Run the application using `mvn spring-boot:run`.
4. Access the application at `http://localhost:8080`.

## Usage
- Directly access `http://localhost:8080` to view the custom login page.
- Use the **Signup** link on the login page to register a new user.
- Log in with your credentials to access secured endpoints based on user roles.

## License
This project is open-source and available under the MIT License.