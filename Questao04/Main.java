//04) Receba 10 valores randômicos, em seguida imprima o maior e o menor valores do vetor.
package Exercicios.Questao04;

import java.util.Random;

public class Main {
    public static void main(String[] arg){
        
        int maior,menor;
        int[] vet = new int[10];
        Random r = new Random();

        maior = vet[0];
        menor = vet[0];

        for (int i = 0; i < 10; i++) {
            vet[i] = r.nextInt(100); 
        }

        maior = vet[0];
        menor = vet[0];

        for (int i=1; i < 10; i++) {
            if (vet[i]>maior) {
                maior = vet[i];
            }
            if (vet[i]<menor) {
                menor = vet[i];
            }
        }
        
        System.err.println("VETOR =");
        
        for (int i=0; i<10; i++) {
            System.out.print(vet[i] + " ");
        }
        System.err.println("\n==========");

        System.out.println("Maior "+maior);
        System.out.println("Menor "+menor);
        
    }
}
