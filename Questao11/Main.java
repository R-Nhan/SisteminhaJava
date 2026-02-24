//11) Vetor de 10 posições com nome de produtos, outro vetor com valor dos respectivos produtos. Faça um programa que busque pelo nome do produto, caso seja encontrado, mostrar o nome e valor do produto. O programa só deverá ser encerrado caso o usuário informe que deseja sair.
package Exercicios.Questao11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String aux;
        int D=1, opcao;

        String[] produtos = {
            "Arroz",
            "Feijao",
            "Macarrao",
            "Leite",
            "Cafe",
            "Acucar",
            "Oleo",
            "Farinha",
            "Manteiga",
            "Pao"
        };

        double[] valores = {
            22.50,
            8.99,
            5.49,
            4.79,
            15.30,
            3.89,
            7.20,
            6.40,
            9.99,
            0.75
        };

        while (D != 0) {

            System.err.println("=================");
            System.err.println("ESCOLHA UMA OPCAO");
            System.err.println("1 CONSULTAR      ");
            System.err.println("2 SAIR           ");
            System.err.println("=================");

            opcao = sc.nextInt();

            switch (opcao) {

            case 1:
                System.out.println("=====================================");
                System.out.println("DIGITE O PRODUTO QUE DESEJA CONSULTAR");
                System.out.println("=====================================");
                
                System.out.println("PRODUTOS: ");

                for (int i=0; i<10; i++){
                    System.out.print("->"+produtos[i]+" ");
                }

                System.out.print("\n-> ");
                aux = sc.next();

                for (int i=0; i<10; i++) {
                    if (produtos[i].equalsIgnoreCase(aux)) {
                        System.out.println("\nPRODUTO = "+produtos[i]+"\nVALOR = R$"+ valores[i]);
                    }
                }
                break;
            case 2:
                System.out.println("PROGRAMA FINALIZADO!");
                D = 0;
                break;
            default:
                System.out.println("DIGITE UMA OPCAO VALIDA");
                break;
            }
        }

        sc.close();
    }
}
