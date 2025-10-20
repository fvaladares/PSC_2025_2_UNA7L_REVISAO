package org.example.model;

import java.util.Scanner;

public class Revisao01 {

    public void run(Scanner input) {
        int acumulador = 1;
        int entrada;
        int contador = 0;

        do{
            System.out.println();
            System.out.print("Informe um valor: ");
            entrada = input.nextInt();

            if (entrada >= 0) {
                acumulador = acumulador + entrada;
            }
            contador++;
        }while (entrada != -999);

        System.out.println();
        System.out.println("Resultado do processamento: " +
                ((float)acumulador/contador));
    }
}
