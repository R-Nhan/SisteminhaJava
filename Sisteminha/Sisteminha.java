package Exercicios.Sisteminha;

import java.util.Scanner;

public class Sisteminha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D=1,aux, x=0;

        String[] clientes = new String[10];

        String[] produto = {
            "Feijão",
            "Arroz",
            "Macarrão",
            "Café",
            "Tapioca"
        };

        double[] preco = {2.25, 1.75, 2.35, 2.15, 2.45};

        int[] quantidade = {40, 45, 60, 48, 50};

        while (D!=0) {
        System.out.println("----------------------------------------");
        System.out.println("                MENU                    ");
        System.out.println("----------------------------------------");
        System.out.println("1 - Mostrar produtos em Estoque");
        System.out.println("2 - Mostrar clientes");
        System.out.println("3 - Cadastrar Novo Cliente");
        System.out.println("4 - Mostrar dinheiro em Caixa");
        System.out.println("5 - Vender Produtos");
        System.out.println("6 - Limpar tela");
        System.out.println("7 - Sair");
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.print("O que você deseja fazer? Escolha: ");
        aux = sc.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();
            switch (aux) {
                case 1:
                    System.out.println("---------------------------- PRODUTOS -----------------------------");

                for (int i = 0; i < produto.length; i++) {
                    System.out.println(
                        "ID:" + i +
                        " - Produto:" + produto[i] +
                        " - Preço: R$" + preco[i] +
                        " - Quantidade em estoque: " + quantidade[i]
                    );
                }
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Escolha uma das opcoes|");
                System.out.println("0- Voltar para o Menu |");
                System.out.println("1- Sair do Programa   |");
                System.out.println("-----------------------");
                x = sc.nextInt();
                if (x == 1) {
                    D = 0;
                }
                System.out.print("\033[H\033[2J");
                System.out.flush(); 

                    break;
                case 2:
                    System.out.println("-----------------------");
                    for (int i=0; i < 10; i++){
                        System.out.println("ID:" + i + " Cliente: " + clientes[i]);
                    }
                    System.out.println("-----------------------");
                    System.out.println("Escolha uma das opcoes|");
                    System.out.println("0- Voltar para o Menu |");
                    System.out.println("1- Sair do Programa   |");
                    System.out.println("-----------------------");
                    x = sc.nextInt();
                    if (x == 1) {
                        D = 0;
                    }

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:

                    D = 0;
                    break;                
            
                default:

                    break;
            }
        }


        sc.close();
    }
}
