package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
//        HttpStatusChecker checker = new HttpStatusChecker();
//        String statusImage = checker.getStatusImage(404);
//        System.out.println(statusImage);

      //  HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
      //  downloader.downloadStatusImage(101);

        HttpImageStatusCli statusCli = new HttpImageStatusCli();
        statusCli.askStatus();

    }
}