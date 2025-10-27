package org.example.model;

import java.util.Scanner;

public class Algoritmo02A1 {
/*
TODO(
    MODIFIQUE O ALGORITMO PARA APLICAR UM DESCONTO DE 22% CASO A PESSOA
    TENHA BAIXA RENDA (SALÁRIO < 3000) E FOR ESTUDANTE. Os demais descontos
    se mantém da forma atual. )
 */
    public void run(Scanner input) {
        int idade = 20;
        double renda = 1000.0;
        boolean estudante = true;
        double desconto = 0;

        if (idade < 18)
            desconto = 0.15;
        else if (idade >= 18 && idade <= 25)
            if (renda < 3000)
                desconto = 0.10;
            else if (estudante = true)
                desconto = 0.12;
            else
                desconto = 0.05;
        else
            desconto = 0.02;

        System.out.println("Desconto aplicado: " + desconto * 100 + "%");
    }
}

