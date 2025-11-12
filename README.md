🎓 Student Management Application (Spring Boot)

This is a backend-only Spring Boot project for managing students, built as part of my Spring Boot learning journey at AccioJob 🚀

🧩 About

This project demonstrates how to build a modular Spring Boot REST API following clean backend architecture principles.
It includes multiple layers — Controller, Service, DTO, and Model — ensuring clear separation of concerns and scalability.
All APIs are tested using Postman (no frontend integration yet).

⚙️ Tech Stack

Java ☕

Spring Boot 🌿

Spring Web (REST APIs)

Spring Security (for password encryption)

Postman (API testing)

🔐 User Authentication Module (New Feature)

Recently added a complete User Authentication System with registration and login functionalities.

🧱 Features Implemented

User Registration API (/auth/register)

Accepts username, email, password, and role

Encrypts password using BCryptPasswordEncoder

Stores users temporarily in-memory (no DB yet)

User Login API (/auth/login)

Verifies username and encrypted password

Returns login success or failure message

View All Users API (/auth/users)

Lists all registered users

Passwords are hidden using @JsonIgnore

⚙️ Concepts Demonstrated

Layered architecture: Controller → Service → DTO → Model

Password encryption with Spring Security (BCrypt)

Custom configuration for PasswordEncoder and SecurityFilterChain

In-memory data handling using ArrayList

Disabled default Spring login for easy Postman testing

🧪 Tested Endpoints
Method	Endpoint	Description
POST	/auth/register	Register a new user
POST	/auth/login	Login with username & password
GET	/auth/users	View all registered users
🧠 Learning Goals

Build real-world backend APIs using Spring Boot

Understand API flow and service layering

Learn password encryption and secure login handling

Practice clean coding and scalable folder structure

🚀 Next Steps

Integrate MySQL Database using Spring Data JPA

Add JWT-based Authentication

Introduce entities: Student, Teacher, and Course

Implement Role-Based Access Control (RBAC)
