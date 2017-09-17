* Cài đặt & sử dụng MySQL
* JDBC - Java Database Connectivity
* Ứng dụng *vscraper*

## 1. MySQL

![](./materials/mysql.jpg)

MySQL: Hệ quản trị *cơ sở dữ liệu quan hệ* (RDBMS - Relational Database Management System)

MySQL phổ biến vì các lý do:

* Dễ dùng
* Đủ dùng (trong hầu hết các trường hợp)

### 1.1. Cài đặt MySQL

https://dev.mysql.com/downloads/mysql/

### 1.2. MySQL Workbench

https://dev.mysql.com/downloads/workbench/

MySQL Workbench: Công cụ tương tác với MySQL qua giao diện

### 1.3. SQL Query Language

https://www.tutorialspoint.com/sql/

## 2. JDBC - Java Database Connectivity

![](./materials/jdbc.png)

### 2.1. Package *java.sql* & *javax.sql*

https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html
https://docs.oracle.com/javase/8/docs/api/javax/sql/package-summary.html

### 2.2. JDBC connector

*Danh sách các thư viện JDBC connectors theo RDBMS*

|RDBMS|JDBC connector|
|---|---|
|MySQL|https://mvnrepository.com/artifact/mysql/mysql-connector-java|
|PostgreSQL|https://mvnrepository.com/artifact/org.postgresql/postgresql|
|OracleDB|http://www.oracle.com/technetwork/database/application-development/index-099369.html|


### 2.3. Kết nối Java application với MySQL

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>5.1.44</version>
</dependency>
```

### 2.4. java.sql.Connection

### 2.5. java.sql.Statement

### 2.6. java.sql.PreparedStatement

## 3. Ứng dụng *vscraper*

### 3.1. Tạo *schema* & *user*

* Tạo schema *vscraper*
* Tạo user *techmaster*
* Phân quyền cho *techmaster* trên *vscraper*

### 3.2. Tạo bảng trong *vscraper*

Tạo các bảng trong *vscraper*

* *websites*
* *video_links*
* *news_articles*
* *sport_articles*

### 3.3. Bóc tách dữ liệu và lưu vào *vscraper*

Dùng Jsoup tách dữ liệu từ các file .html và lưu vào *vscraper*