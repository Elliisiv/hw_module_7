package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HttpStatusImageDownloader {
    void downloadStatusImage(int code){
        String image = null;
        try {
            image = new HttpStatusChecker().getStatusImage(code);
            try (InputStream in = new URL(image).openStream()) {
                Files.copy(in, Paths.get("./" + code + ".jpg"));
                System.out.println("Image downloaded successfully for HTTP status " + code);
            } catch (IOException e) {
                System.out.println("Error downloading image: " + e.getMessage());
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
