🏦 Wallet Management Project
📌 프로젝트 개요

Wallet Management는 개인 자산 관리를 위한 Spring Boot 기반 REST API 프로젝트입니다.
사용자는 회원(User) 등록 → 계좌(Account) 생성 → 거래(Transaction) 기록 → 카테고리(Category) 관리의 흐름으로 데이터를 관리할 수 있습니다.

백엔드는 Spring Boot + MyBatis + MySQL 구조로 작성되었으며, RESTful API를 제공하여 Postman 등 클라이언트에서 손쉽게 테스트할 수 있습니다.

⚙️ 기술 스택

Language: Java 17

Framework: Spring Boot 3.x

ORM / Persistence: MyBatis

Database: MySQL 8.x

Build Tool: Maven/Gradle

Test Tool: Postman
```
📂 프로젝트 구조
walletManagement/
 ├── src/main/java/com/wallet/walletManagement
 │    ├── model/        # Entity 클래스 (User, Account, Category, Transaction)
 │    ├── repository/   # MyBatis Mapper 인터페이스
 │    ├── service/      # 비즈니스 로직
 │    ├── Controller/   # REST API Controller
 │    └── WalletManagementApplication.java
 ├── src/main/resources
 │    ├── mapper/       # MyBatis XML Mapper 파일
 │    └── application.properties
 └── pom.xml (or build.gradle)
```


📡 API Endpoints
1. User API

POST /api/users → 사용자 등록

GET /api/users → 전체 사용자 조회

GET /api/users/{id} → 특정 사용자 조회

PUT /api/users/{id} → 사용자 정보 수정

DELETE /api/users/{id} → 사용자 삭제

2. Account API

POST /api/accounts → 계좌 생성

GET /api/accounts → 전체 계좌 조회

GET /api/accounts/{id} → 특정 계좌 조회

PUT /api/accounts/{id} → 계좌 수정

DELETE /api/accounts/{id} → 계좌 삭제

3. Category API

POST /api/categories → 카테고리 추가

GET /api/categories → 카테고리 전체 조회

GET /api/categories/{id} → 특정 카테고리 조회

GET /api/categories/type/{type} → 타입별 조회

PUT /api/categories/{id} → 카테고리 수정

DELETE /api/categories/{id} → 카테고리 삭제

4. Transaction API

POST /api/transactions → 거래 등록

GET /api/transactions → 거래 전체 조회

GET /api/transactions/{id} → 특정 거래 조회

GET /api/transactions/account/{accountId} → 특정 계좌의 거래 조회

GET /api/transactions/range?start=...&end=... → 특정 기간 거래 조회

PUT /api/transactions/{id} → 거래 수정

DELETE /api/transactions/{id} → 거래 삭제

🚀 실행 방법

MySQL에 DB 및 계정 생성

CREATE DATABASE walletdb;
CREATE USER 'walletuser'@'localhost' IDENTIFIED BY '비밀번호';
GRANT ALL PRIVILEGES ON walletdb.* TO 'walletuser'@'localhost';
```

application.properties 설정

spring.datasource.url=jdbc:mysql://localhost:3306/walletdb?serverTimezone=Asia/Seoul&useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=walletuser
spring.datasource.password=비밀번호
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

```
프로젝트 실행

./mvnw spring-boot:run


Postman으로 API 요청 테스트

✅ 주요 기능

사용자(User) 등록 및 관리

계좌(Account) 생성, 수정, 삭제

카테고리(Category) 관리

거래(Transaction) 등록, 수정, 조회 (기간별/계좌별 지원)

DB 관계 기반으로 User → Account → Transaction → Category 연동
