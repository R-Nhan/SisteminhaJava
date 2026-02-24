//07) Leia vários números e informe quantos desses números entre 100 e 200 foram digitados. Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua execução.
package Exercicios.Questao07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aux = 1,soma = 0;

        while (aux != 0) {
            System.out.println("===============================");
            System.out.println("Digite um numero! (0 para sair)");
            System.out.println("===============================");
            aux = sc.nextInt();
            if (aux > 100 && aux < 200) {
                soma++;
            }
            System.out.println("\n====================================");
            System.out.println(soma + " Numeros entre 100 e 200 digitados");
            System.out.println("====================================\n");
        } 

        sc.close();       
    }
}
