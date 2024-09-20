# 🎬 Movie Review Management System

A Spring Boot-based RESTful API designed to manage movie reviews efficiently, built with MongoDB Atlas for cloud storage. This project features robust API endpoints for handling movie data and reviews, all tested using Postman to ensure data accuracy and reliability.

## 🚀 Features
- **RESTful API Endpoints**: Efficient movie review management using Spring Boot.
- **MongoDB Atlas Integration**: Scalable cloud storage for all movie and review data.
- **Data Retrieval Optimization**: Fast and reliable database queries for enhanced performance.
- **Postman API Testing**: Comprehensive testing to validate data handling and ensure backend reliability.

## 🛠️ Technologies Used
- **Java**
- **Spring Boot** 
- **MongoDB Atlas** 
- **RESTful API** 
- **Postman**

## 📝 Endpoints
### 1. **Movies Endpoint**
- **GET /movies**: Fetch all movies in the database.
- **POST /movies**: Add a new movie.
- **PUT /movies/{id}**: Update movie details by ID.
- **DELETE /movies/{id}**: Delete a movie by ID.

### 2. **Reviews Endpoint**
- **GET /movies/{id}/reviews**: Fetch all reviews for a movie.
- **POST /movies/{id}/reviews**: Add a review for a movie.
- **DELETE /movies/{id}/reviews/{reviewId}**: Delete a review by ID.

## 💾 Database Configuration
The project is configured to use **MongoDB Atlas** for cloud storage. The MongoDB cluster can be easily scaled and provides high availability.

### MongoDB Atlas Setup:
1. Create a MongoDB Atlas account at [https://www.mongodb.com/cloud/atlas](https://www.mongodb.com/cloud/atlas).
2. Configure your connection URI and add it to the `application.properties` file as follows:
   ```properties
   spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster-url>/<database>?retryWrites=true&w=majority
