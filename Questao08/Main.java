//08) Leia um vetor de 10 posições e verifique se existem valores iguais (no mesmo vetor) e os escreva na tela.
package Exercicios.Questao08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + ": ");
            v[i] = sc.nextInt();
        }

        System.out.println("\nValores repetidos:");

        boolean encontrou = false;

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (v[i] == v[j]) {
                    System.out.println(v[i]);
                    encontrou = true;
                    break; 
                }
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum valor repetido.");
        }

        sc.close();
    }
}
