/*01) Sejam informadas 5 notas no vetor "notas". Posteriormente acesse o mesmo vetor e calcule a média aritmédia entre as notas. Mostre a média ao final. */
package Exercicios.Questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];

        double media=0;

        for(int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º numero: ");
            notas[i] = sc.nextDouble();
        }

        for(int i = 0; i < 5; i++) {
            media = media + notas[i];
        }

        System.out.println("A media e");
        System.out.println(media/5);

        sc.close();
    }
}
