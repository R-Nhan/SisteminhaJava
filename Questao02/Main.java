//02) Leia um vetor de 20 posições e mostre-o. Em seguida, mostre o conteúdo em ordem decrescente.

package Exercicios.Questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[20];

        int organizador = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i+1) + "º numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            System.out.println((i+1) + "º = " + vetor[i]);
        }
        
        System.out.println("\n Ordem decrescente:\n");

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (vetor[i] > vetor[j]) {
                    organizador = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = organizador;
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.println((i+1) + "º = " + vetor[i]);
        }

        sc.close();
    }
}