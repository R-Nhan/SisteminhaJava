package Exercicios.Sisteminha;

import java.util.Scanner;

public class Sisteminha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D=1, aux, x=0, id=0, ler, qtd, idcliente, login=1;
        double caixa=0.0, total;
        String usuario, senha, user="admin", pass="1234";

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
        
        while (login!=0) {
            System.out.println("-------------------");
            System.out.println("    REGISTRE-SE    ");
            System.out.println("-------------------");
            System.out.println("Usuário: ");
            usuario = sc.next();
            if (usuario.equals(user)) {
                System.out.println("Senha: ");
                senha = sc.next();
                if (senha.equals(pass)) {
                    login = 0;
                } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Senha Incorreta!");
                }
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Usuario Incorreto!");
            }
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();

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
                        "ID:" + (i+1) +
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
                    System.out.println("--------------------------------");
                    System.out.println("SISTEMA FINALIZADO VOLTE SEMPRE");
                    System.out.println("--------------------------------");
                    D = 0;
                }

                System.out.print("\033[H\033[2J");
                System.out.flush(); 

                    break;
                case 2:
                    System.out.println("-----------------------");
                    for (int i=0; i < 10; i++){
                        System.out.println("ID:" + (i+1) + " Cliente: " + clientes[i]);
                    }
                    System.out.println("-----------------------");
                    System.out.println("Escolha uma das opcoes|");
                    System.out.println("0- Voltar para o Menu |");
                    System.out.println("1- Sair do Programa   |");
                    System.out.println("-----------------------");
                    x = sc.nextInt();
                    if (x == 1) {
                        System.out.println("--------------------------------");
                        System.out.println("SISTEMA FINALIZADO VOLTE SEMPRE");
                        System.out.println("--------------------------------");
                        D = 0;
                    }

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    break;
                case 3:
                    if (id < 10) {
                        System.out.println("------------CADASTRO------------");
                        System.out.println("Digite o nome: ");
                        clientes[id] = sc.next();
                        id++;

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("-------------------");
                        System.out.println("Clitente Cadastrado");
                        System.out.println("-------------------");
                    } else {

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Numero de Clientes Excedido!");
                    }
                    break;
                case 4:

                    System.out.println("-------------------------");
                    System.out.printf("Valor em Caixa: R$ %.2f\n" ,caixa);
                    
                    break;
                case 5:

                    if (clientes[0] == null) {
                        System.out.println("Sem cliente cadastrado!");
                        break;
                    }

                    System.out.println("-------------------------");
                    for (int i = 0; i < produto.length; i++) {
                        System.out.println(
                        "ID:" + (i+1) +
                        " - Produto:" + produto[i]);
                    }

                    System.out.println("-------------------------");
                    System.out.println("Digite o ID do produto que deseja comprar");
                    System.out.println("----------------------------------------");
                    
                    ler = sc.nextInt();

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("-------------------------");
                    System.out.println("Digite a quantidade do produto que deseja comprar");
                    System.out.println("----------------------------------------");
                    
                    qtd = sc.nextInt();

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    total = qtd * preco[(ler-1)];

                    System.out.println("---------RECIBO----------");
                    System.out.println("Produto: " + produto[(ler-1)]);
                    System.out.println("Valor: " + preco[(ler-1)]);
                    System.out.println("Quantidade: " + qtd);
                    System.out.printf("Total: %.2f\n", total);

                    System.out.println("----------------------------------------");
                    System.err.println("Informe o ID do cliente!");
                    System.out.println("----------------------------------------");
                    
                    idcliente = sc.nextInt();

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    if (clientes[(idcliente-1)] == null) {
                        System.out.println("ID INVALIDO!");
                        break;
                    }


                    System.out.println("----------------------------------------");
                    System.err.println("Deseja confirmar sua compra?");
                    System.out.println("1 - Sim 2 - Nao");
                    System.out.println("----------------------------------------");

                    x = sc.nextInt();

                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    
                    if (x == 1) {
                        if (quantidade[(ler-1)] >= qtd) { 
                            System.out.println("----------------------------------------");
                            System.err.println("Compra realizada com sucesso!");
                            System.out.println("----------------------------------------");
                            quantidade[(ler-1)] = quantidade[(ler-1)] - qtd;
                            caixa += qtd * preco[(ler-1)];

                        } else {
                            System.out.println("----------------------------------------");
                            System.err.println("Estoque insuficiente!");
                            System.out.println("----------------------------------------");
                        }
                    } else {
                        System.out.println("----------------------------------------");
                        System.err.println("Compra cancelada com sucesso!");
                        System.out.println("----------------------------------------");
                    }

                    break;
                case 6:

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    break;
                case 7:

                    System.out.println("--------------------------------");
                    System.out.println("SISTEMA FINALIZADO VOLTE SEMPRE");
                    System.out.println("--------------------------------");

                    D = 0;
                    break;                
            
                default:

                    break;
            }
        }

        sc.close();
    }
}
