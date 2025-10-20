package org.example.model;

import java.util.Scanner;

public class Revisao02 {
    public void run(Scanner input) {

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.printf("\n%d^2 = %d\n\n", i, i * i);
            } else {
                System.out.printf("\n%d^2 = %d\n\n", i, (i * i * i));
            }
        }
    }
}
