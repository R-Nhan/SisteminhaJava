//05) Dois vetores, o primeiro com nome de 10 times e o segundo com mensagens aleatórias. O usuário deverá informar o código que mostrará o time e uma mensagem sorteada do segundo vetor, mostrar na tela. Pesquise sobre java.util.Random
package Exercicios.Questao05;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int aux,msg;

        String[] times = {
            "Flamengo",
            "Palmeiras",
            "Corinthians",
            "São Paulo",
            "Santos",
            "Vasco",
            "Grêmio",
            "Internacional",
            "Cruzeiro",
            "Atlético Mineiro"
        };

        String[] mensagens = {
            "vai ganhar o próximo jogo!",
            "está em ótima fase!",
            "precisa melhorar a defesa.",
            "tem uma torcida incrível!",
            "vai brigar pelo título!",
            "não vive um bom momento.",
            "é favorito no clássico!",
            "vai surpreender nesta rodada!",
            "tem um elenco forte.",
            "vai dar trabalho aos adversários!"
        };

        System.err.println("====================================");
        System.out.println("Escolha o Codigo do seu time (1 a 9)");
        System.err.println("====================================");

        aux = sc.nextInt();
        msg = r.nextInt(9);

        while (aux > 9 || aux < 1) {
            System.out.println("Defina um codigo válido!");
            aux = sc.nextInt();
        }

        System.out.println("TIME: "+times[aux]);
        System.out.println("MENSAGEM: "+mensagens[msg]);

        sc.close();
    }
}
