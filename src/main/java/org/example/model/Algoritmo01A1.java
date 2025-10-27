package org.example.model;

import java.util.Scanner;

public class Algoritmo01A1 {

    public void run(Scanner input) {
        float nota;
        float soma = 0;
        int i = 1;
        int totalNotas = 5;

        while (i <= totalNotas) {
            System.out.print("Digite a nota " + i + ": ");
            nota = input.nextInt();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                i++;
            } else {
                System.out.println("Nota inválida, digite novamente.");
            }
        }
        double media = soma / totalNotas;
        System.out.println("Média final: " + media);
    }
}
