//12) Vetor de 10 posições com nomes de clientes e que permita mostrar todos ou inserir um novo no vetor (em posição livre) a qualquer momento.
package Exercicios.Questao12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] clientes = new String[10];

        int aux=1, D, posicao;

        String nome;

        while (aux!=0) {
            System.out.println("=======================");
            System.out.println("ESCOLHA UMA DAS OPCOES:");
            System.out.println("1- Listar");
            System.out.println("2- Inserir Cliente");
            System.out.println("3- Sair");
            System.out.println("=======================");
            D = sc.nextInt();

            switch (D) {
                case 1:
                    for (int i=0; i<clientes.length; i++){
                        System.out.println((i+1)+"= "+clientes[i]);
                    }
                    break;
                case 2:
                    System.out.println("========================");
                    System.out.println("DIGITE O NOME DO CLIENTE");
                    System.out.println("========================");

                    nome = sc.next();

                    System.out.println("========================");
                    System.out.println("DIGITE A POSICAO DO CLIENTE");
                    System.out.println("========================");

                    posicao = sc.nextInt();

                    for (int i=0; i<10; i++){
                        if ((i+1)==posicao) {
                            clientes[i] = nome;
                        }
                    }

                    break;
                case 3:
                    aux = 0;
                    System.out.println("PROGRAMA FINALIZADO!");
                    break;
                default:
                    System.out.println("DIGITE UMA OPCAO VALIDA");
                    break;
            }
        }



        sc.close();
    }
}
