//03) Uma rainha requisitou os serviços de um monge, o qual exigiu o pagamento em grãos de trigo da seguinte maneira: os grãos de trigo seriam dispostos em um tabuleiro de xadrez, de tal forma que a primeira casa do tabuleiro tivesse um grão, e as casas seguintes o dobro da anterior. Construa um algoritmo que calcule quantos grãos de trigo a Rainha deverá pagar ao monge.
package Exercicios.Questao03;

public class Main {
    public static void main(String[] args) {
        
        long aux;

        System.out.println("===================");
        System.out.println("PAGAMENTOS EM GRÃOS");
        System.out.println("===================");

        aux = 1;

        for (int i=1; i < 64; i++) {
            aux = aux * 2 + 1;
        }



        System.out.println("Total de grãos: " + aux);

    }
}
