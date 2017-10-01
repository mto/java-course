* Java Servlet
* Apache Tomcat

## 1. Java Servlet

https://docs.oracle.com/javaee/7/api/overview-summary.html

Java Servlet là một phần của Java Enterprise Edition cung cấp các API căn bản cho việc phát triển bất kỳ ứng dụng có mô hình *client-server* nào trong Java.

Core packages của Java Servlet bao gồm:

* javax.servlet
* javax.servlet.http
* javax.servlet.annotation

### 1.1. *servlet*

Khái niệm trung tâm của Java Servlet API là *servlet*. Mỗi *servlet* có thể nhìn nhận như một server agent trong mô hình tương tác *client-server*

Các key classes để mô phỏng giao tiếp *client-server* bao gồm:

* javax.servlet.Servlet
* javax.servlet.ServletRequest
* javax.servlet.ServletResponse

Mặc dù thiết kế của Servlet API cho phép phát triển ứng dụng *client-server* với bất kỳ *communication protocol* nào, Servlet API được sử dụng chính cho việc phát triển *web application*.

Về bản chất thì *web application* là ứng dụng *client-server* với *communication protocol* là HTTP

![](./materials/servlet_architecture.png)

Các key classes trong Servlet API dùng cho việc xây dựng *web application* bao gồm:

* javax.servlet.http.HttpServlet
* javax.servlet.http.HttpServletRequest
* javax.servlet.http.HttpServletResponse

### 1.2. Servlet container

*servlet* không chạy *standalone* được mà cần phải thông qua các ứng dụng đặc biệt được gọi là *servlet container*.

Các bước thực thi để chạy *servlet* trong *servlet container* bao gồm:

* Đóng gói các servlet trong các file Web Application Archive (.war)
* Deploy file .war vào *servlet container*
* Start (nếu chưa start) *servlet container*

Các *servlet container* phổ biến bao gồm:

* Apache Tomcat
* Jetty
* GlashFish
* JBoss
* WebLogic


Trong phạm vi khoá học này, ta sẽ sử dụng *Apache Tomcat*

## 2. Thực hành viết *web application* với Servlet API

Trong phần này, các học viên được yêu cầu:

* Phát triển web application *hello*
* Chạy *hello* trên Apache Tomcat

### 2.1. Cài đặt Apache Tomcat

![](./materials/apache_tomcat.jpg)

http://tomcat.apache.org/tomcat-7.0-doc/

__Bài tập 1:__

*Cài đặt Apache Tomcat 7 và chạy Apache Tomcat từ terminal*

### 2.2. Tạo Maven project *hello*

__Bài tập 2:__

*Tạo Maven project hello với file pom.xml như dưới đây và import vào IntelliJ*

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.techmaster.hello</groupId>
    <artifactId>hello</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>war</packaging>

    <dependencies>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>3.1.0</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

__Bài tập 3:__

*Tìm hiểu vai trò của các tham số sau trong file pom.xml*

* packaging
* scope

### 2.3. Tạo class

```java
package com.techmaster.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 10/1/17
 */
@WebServlet(value = "GreetingServlet", urlPatterns = "/greeting")
public class GreetingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer w = resp.getWriter();
        w.write("Hello World");
        w.flush();
        w.close();
    }
}
```

__Bài tập 4:__

*Tạo class GreetingServlet như trên và chạy lệnh build với Maven*

__Bài tập 5:__

*Copy file .war trong thư mục target của Maven vào thư mục **webapps** của Tomcat và restart Tomcat, sau đó mở trình duyệt và kiểm tra kết quả với*

```shell
http://localhost:8080/hello/greeting
```

__Bài tập 6:__

*Thay đổi hàm doGet trong GreetingServlet theo hướng write ra HTML content và kiểm tra kết quả trên trình duyệt*

__Bài tập 7:__

*Thay đổi hàm doGet để kết quả trả về thay đổi theo tham số gửi lên trong request từ trình duyệt*

```shell
http://localhost:8080/hello/greeting?name=Techmaster
```