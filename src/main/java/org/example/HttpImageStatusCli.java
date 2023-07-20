package org.example;

import java.io.IOException;
import java.util.Scanner;

public class HttpImageStatusCli {
    void askStatus() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP status code");

        String code =scanner.nextLine();
        while (!code.matches("[0-9]{3}")){
            System.out.println("Please enter valid number");
            code = scanner.nextLine();
        }
        scanner.close();
        try {
            new HttpStatusImageDownloader().downloadStatusImage(Integer.parseInt(code));
            System.out.println("Image download!");
        } catch (Exception e) {
            throw new Exception ("There is not image for HTTP status " + code);
        }

    }
}
