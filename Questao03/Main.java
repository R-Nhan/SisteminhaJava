package Exercicios.Questao03;
// Uma rainha requisitou os serviços de um monge, 
// o qual exigiu o pagamento em grãos de trigo da seguinte maneira: 
// os grãos de trigo seriam dispostos em um tabuleiro de xadrez, 
// de tal forma que a primeira casa do tabuleiro tivesse um grão, 
// e as casas seguintes o dobro da anterior. 
// Construa um algoritmo que calcule quantos grãos de trigo a 
// Rainha deverá pagar ao monge.

import java.math.BigInteger;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        BigInteger graos = BigInteger.ONE;
        BigInteger soma = graos;

        for (int i = 2; i <= 64 ; i++) {
            graos = graos.multiply(BigInteger.TWO);
            soma = soma.add(graos);
        }

        NumberFormat formatador = NumberFormat.getInstance();
        String somaFormatada = formatador.format(soma);
        System.out.print("A Rainha devera pagar " + somaFormatada + " graos.");
    }
}
