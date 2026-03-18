# Transaction Processing Microservice

![Java](https://img.shields.io/badge/Java-17+-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Build](https://img.shields.io/badge/Build-Maven-blue)
![Database](https://img.shields.io/badge/Database-H2-lightgrey)
![Status](https://img.shields.io/badge/Status-Active-success)
![License](https://img.shields.io/badge/License-MIT-purple)

A high-performance **Spring Boot microservice** designed to process banking transactions such as deposits, withdrawals, and transaction history retrieval.

Built with scalability and clarity in mind, this project demonstrates **real-world backend architecture patterns** and handles **5000+ transactions efficiently**.

---

## Why This Project?

Modern financial systems demand:

- Fast and reliable transaction handling  
- Clean, maintainable architecture  
- Efficient data persistence  
- High throughput under load  

This microservice is built to **simulate production-like workloads** and showcase:

- Backend system design skills  
- Transaction management logic  
- API structuring best practices  

---

## Features

- 💰 Deposit money into an account  
- 💸 Withdraw money with balance validation  
- 📜 Retrieve complete transaction history  
- Layered architecture:
  - Controller  
  - Service  
  - Repository  
-  Handles **5000+ transactions workload simulation**  
- In-memory H2 database  
- RESTful APIs  

---

## Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Maven**
- **H2 Database**

---

##  Project Structure
```
src/
├── controller/
├── service/
├── repository/
├── model/
└── dto/
```

---

##  API Endpoints

### ➤ Deposit
```
POST /api/transactions/withdraw
```

### ➤ Get Transaction History
```
GET /api/transactions/history/{accountId}
```

---
## ⚙️ Running the Project
```
# Clone the repository
git clone https://github.com/your-username/transaction-microservice.git

# Navigate into the project
cd transaction-microservice

# Run the application
mvn spring-boot:run

Access H2 Console:
http://localhost:8080/h2-console
```
