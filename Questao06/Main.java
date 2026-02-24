//06) Elabore um algoritmo que leia dois vetores de dez posições e faça a multiplicação dos elementos de mesmo índice, colocando o resultado em um terceiro vetor, que deve ser mostrado como saída.
package Exercicios.Questao06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vet1 = new int[10];

        int[] vet2 = new int[10];

        int[] vet3 = new int[10];

        System.out.println("Digite os Numeros do 1 vetor");

        for (int i=0; i < 10; i++) {
            System.out.print((i+1) + "=");
            vet1[i] = sc.nextInt();
        }

        System.out.println("Digite os Numeros do 2 vetor");

        for (int i=0; i < 10; i++) {
            System.out.print((i+1) + "=");
            vet2[i] = sc.nextInt();
        }

        for (int i=0; i < 10; i++) {
            vet3[i] = vet1[i] * vet2[i];
        }

        System.out.println("Resultado:");

        for (int i=0; i < 10; i++) {
            System.out.println((i+1) + "=" + vet3[i]);
        }

        sc.close();
    }
}
