* *Multithreading* trong Java

![](./materials/multithreaded_program.png)


### 1.1. Download đồng thời nhiều website

Trong mục này, các học viên được yêu cầu sử dụng class *DownloadBot* được cung cấp để giả lập việc:

* Tải lần lượt các pages từ 2 website
* Tải đồng thời các pages từ 2 website

```java
package com.techmaster.javacourse;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 9/27/17
 */
public class DownloadBot {

    private final static String[] PAGES = new String[]{"home", "news", "videos", "health", "blog"};

    private String rootURL;

    public DownloadBot(String rootURL) {
        this.rootURL = rootURL;
    }

    public void startDownload() {
        System.out.println("Start downloading " + rootURL + " on thread: " + Thread.currentThread());
        for (String page : PAGES) {
            System.out.println("Downloading content of: " + rootURL + "/" + page);
        }
        System.out.println();
    }
}

```



__Bài tập 1:__

*Tạo hàm main trong class DownloadBot như dưới đây và nhận xét về thứ tự các message in ra màn hình*

```java
public static void main(String[] args){
    DownloadBot vnx = new DownloadBot("http://vnexpress.net");
    DownloadBot soha = new DownloadBot("http://soha.vn");

    System.out.println();

    vnx.startDownload();
    soha.startDownload();
}
```

__Bài tập 2:__

*Cập nhật hàm main như dưới đây và làm lại yêu cầu của bài tập 1*

```java
public static void main(String[] args){
    final DownloadBot vnx = new DownloadBot("http://vnexpress.net");
    final DownloadBot soha = new DownloadBot("http://soha.vn");

    System.out.println();

    Thread vnxThread = new Thread(){
        @Override
        public void run() {
            vnx.startDownload();
        }
    };
    vnxThread.setName("VNX-Thread");

    Thread sohaThread = new Thread(){
        @Override
        public void run() {
            soha.startDownload();
        }
    };
    sohaThread.setName("SOHA-Thread");

    vnxThread.start();
    sohaThread.start();

    //vnx.startDownload();
    //soha.startDownload();
}
```


### 1.2. Khởi tạo *thread* trong Java

### 1.3. Contextual *thread*

Một đoạn code bất kỳ được thực thi trên một *thread* nào đó, gọi là *contextual thread*. Java cho phép truy cập vào *contextual thread* thông qua đoạn mã sau:

```java
Thread.currentThread();
```
### 1.4. *java.util.concurrent.ExecutorService*

### 1.5. *visibility* & *atomicity*

### 1.6. *daemon* thread

JVM sẽ dừng khi mọi non-daemon thread kết thúc

### 1.7. Công cụ JVisualVM


