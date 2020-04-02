package com.orpuwupetup.zjazd3.scanner;

import java.util.Scanner;

public class XYZ  {

    public void startScanning() {

        Scanner scanner = new Scanner(System.in);

        try {
            while (scanner.hasNextLine()) {
                String line;

                if ((line = scanner.nextLine()).matches("Throw me")) {
                    throw new CustomMessageException("customowa wiadomość");
                } else {
                    System.out.println("Twoja wiadomosc to: " + line);
                }
            }
        } catch (CustomMessageException exception) {
            exceptionCatched();
        }

    }

    void exceptionCatched() {
        System.out.println("Catched");
    }
}
