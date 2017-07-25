* Cài đặt môi trường làm việc
* Công cụ lập trình Java
* Biên dịch & chạy Java trên dòng lệnh

## 1. Cài đặt môi trường làm việc

### 1.1 Tổ chức thư mục làm việc

```shell
cd ~
mkdir java
```

```shell
cd java
mkdir TechMaster
cd TechMaster
```

### 1.2 Cài đặt JDK

*Linux*

```shell

```

*Mac OS*

```shell
```


```shell
java -version
```

## 2. Công cụ lập trình Java

* Eclipse
* NetBean
* IntelliJ
* JCreator
* Sublime
* Vim
* Text editor bất kỳ

![](./materials/ides_matrix.png)

__Chú ý:__

*Trong 4 buổi học đầu tiên, học viên được yêu cầu sử dụng text editor đơn giản để lập trình*


## 3. Biên dịch & chạy Java trên dòng lệnh

### 3.1 HelloWorld

```java
public class HelloWorld{

  public static void main(String[] args){
     System.out.println("Hello World");
  }
}
```

```shell
javac HelloWorld.java
java HelloWorld
```


### 3.2 *javac* & *java*

Java là ngôn ngữ *biên dịch* (compiled programming language), với *mã nguồn* (source code) là các file có đuôi *.java*. Việc chạy một chương trình Java từ file *mã nguồn* đầu vào gồm 2 giai đoạn chính:

* Compile: *javac* (viết tắt của Java Compiler) tạo ra file *.class* từ các file *mã nguồn*
* Run: *java* nhận đầu vào là file *.class* có chứa method *main* và thực thi các lệnh trong hàm *main*

__Chú ý:__

*Một chương trình Java bất kỳ dù đơn giản hay phức tạp với cả 1.000.000 dòng code thì cũng đều xuất phát với một file *.class* có chứa hàm *main**

```java
public static void main(String[] args){
...
}
```