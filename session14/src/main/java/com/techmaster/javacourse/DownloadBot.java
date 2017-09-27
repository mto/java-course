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
}
