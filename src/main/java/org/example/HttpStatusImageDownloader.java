package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HttpStatusImageDownloader {
    void downloadStatusImage(int code){
        String image = null;
        try {
            image = new HttpStatusChecker().getStatusImage(code);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try (InputStream in = new URL(image).openStream()){
            Files.copy(in, Paths.get("./"+ code + ".jpg"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
