package org.example;

import org.example.model.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Revisao01 revisao01 = new Revisao01();
//
//        revisao01.run(new Scanner(System.in));
//
//        Revisao02 revisao02 = new Revisao02();
//
//        revisao02.run(new Scanner(System.in));

//        Algoritmo01A1 a01a1 = new Algoritmo01A1();
//        a01a1.run(new Scanner(System.in));
//
//        Algoritmo02A1 algoritmo02A1a1 = new Algoritmo02A1();
//        algoritmo02A1a1.run(new Scanner(System.in));

        Calculadora calculadora = new Calculadora();
        int parcelaA;
        int parcelaB;
        int resultado;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nInforme o valor da parcela A: ");
        parcelaA = sc.nextInt();

        System.out.print("\n\nInforme o valor da parcela B: ");
        parcelaB = sc.nextInt();

        resultado = calculadora.somaInteiros(parcelaA, parcelaB);

        System.out.println("\n\n " + parcelaA + " + " + parcelaB + " = " + resultado);


    }
}