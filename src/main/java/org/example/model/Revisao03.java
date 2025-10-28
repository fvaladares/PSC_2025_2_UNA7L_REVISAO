package org.example.model;

import java.util.Scanner;

public class Revisao03 {
    public void run(Scanner sc) {

        double nota1 = 0, nota2 = 0, nota3 = 0;
        double media = 0;
        String nome;
        boolean aprovado = false;
        boolean recuperacao = false;

        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.print("\nDigite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("\nDigite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("\nDigite a terceira nota: ");
        nota3 = sc.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + media);

        if (media >= 7.0) {
            aprovado = true;
            recuperacao = false;
        } else if (media >= 4.0) {
            System.out.println("Aluno em recuperação.");
            aprovado = false;
            recuperacao = true;
        } else {
            aprovado = false;
            recuperacao = false;
        }

        if (aprovado = true) {
            System.out.println("Aluno " + nome + " aprovado com média " + media);
        } else {
            if (recuperacao) {
                int tentativas = 0;
                while ((tentativas < 3) && (aprovado == false)) {

                    System.out.println("Digite a nova terceira nota: ");
                    nota3 = sc.nextDouble();
                    media = (nota1 + nota2 + nota3) / 3;
                    if (media >= 7.0) {
                        aprovado = true;
                    }
                    tentativas += 1;
                }
            } else {
                System.out.println("Aluno " + nome + " reprovado com média " + media);
            }
        }

        if (aprovado) {
            System.out.println("Resultado final: aluno(a) " + nome + " aprovado(a)! Média = " + media);
        }
    }
}



