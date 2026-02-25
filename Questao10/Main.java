//10) Faça um programa que receba 6 números inteiros e mostre: ´
/*• Os números pares digitados; ´
• A soma dos números pares digitados; ´
• Os números ímpares digitados;
• A quantidade de números ímpares digitados;*/

package Exercicios.Questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[6];
        int somapar=0, qtdimpar=0;

        System.out.println("DIGITE OS 6 NUMEROS");

        for (int i=0; i < 6; i++) {
            System.out.print((i+1) + "= ");
            vet[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");
        for (int i=0; i < 6; i++) {
            if (vet[i]%2==0) {
                System.out.print(vet[i]+" ");
                somapar = somapar + vet[i];
            }
        }

        System.out.println("\nSOMA DOS NUMEROS PARES:");
        System.out.println(somapar);

        System.out.println("\nNUMEROS IMPARES:");
        for (int i=0; i < 6; i++) {
            if (vet[i]%2==1) {
                System.out.print(vet[i]+" ");
                somapar = somapar + vet[i];
                qtdimpar++;
            }
        }

        System.out.println("\nQUANTIDADE DE NUMEROS IMPARES: "+qtdimpar);

        sc.close();
    }
}
