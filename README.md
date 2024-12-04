# **User Management Project**

### Overview:
The **User Management** project is a backend service designed to provide a robust and scalable solution for managing user data through RESTful APIs. 
This service allows you to perform basic **CRUD (Create, Read, Update, Delete)** operations on user information, with a PostgreSQL database for persistent data storage. 
It utilizes **Spring Boot** for fast development, **Spring Data JPA** for easy database interaction, **Lombok** for boilerplate code reduction, and **Spring Validation** for ensuring data integrity.

### Technologies Used:
- **Spring Boot**: The framework used for building the application, providing a robust environment for development.
- **PostgreSQL**: The relational database used for storing user data.
- **Spring Data JPA**: Simplifies database operations using the JPA (Java Persistence API) and integrates with PostgreSQL.
- **Spring Web**: Used to create RESTful APIs that allow interaction with the service.
- **Lombok**: A library used to minimize boilerplate code such as getters, setters, constructors, and toString methods.
- **Spring Validation**: Ensures that user inputs such as email and password conform to the required format before being processed.

### Features:
1. **Create User**:
    - **API Endpoint**: `POST /api/v1/users`
    - **Description**: Allows the creation of a new user by accepting necessary details such as username, email, and password.

2. **Get All Users**:
    - **API Endpoint**: `GET /api/v1/users`
    - **Description**: Retrieves a list of all users in the system.

3. **Get User by ID**:
    - **API Endpoint**: `GET /api/v1/users/{id}`
    - **Description**: Retrieves user details based on the provided user ID.

4. **Update User Information**:
    - **API Endpoint**: `PUT /api/v1/users/{id}`
    - **Description**: Updates the information of an existing user by their ID. It allows modification of fields like email and password.

5. **Delete User**:
    - **API Endpoint**: `DELETE /api/v1/users/{id}`
    - **Description**: Deletes a user from the system based on their ID.

### Database:
- **PostgreSQL** is used as the relational database for storing user information. 
The user entity contains basic details such as `id`, `username`, `email`, and `password`.
- **Spring Data JPA** makes it easy to interact with PostgreSQL by abstracting database operations and handling them with minimal code.

### Validation:
- **Spring Validation** ensures that inputs for user data such as `email` and `password` follow the correct format and constraints. It validates the provided information during user creation and updating processes.

### Example Use Cases:
- **Creating a new user**: A user can register with their email and password.
- **Retrieving user details**: A client can request details of a user either by ID or fetch all users from the system.
- **Updating user details**: A user can modify their profile by updating their email or password.
- **Deleting a user**: An admin can remove a user from the system entirely.

### How to Run:
1. Clone the repository to your local machine.
2. Set up PostgreSQL and configure the `application.properties` file with the database connection details.
3. Build the project using **Maven** or **Gradle** and run the Spring Boot application.
4. The APIs will be available on `http://localhost:8080`.

---

This project will serve as a foundational user management system where you can perform essential operations, ensuring a smooth and scalable solution for user management in any web application.
