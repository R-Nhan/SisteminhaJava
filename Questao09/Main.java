//09) Encontre o quinto número maior que 1000, cuja divisão por 11 tenha resto 5.
package Exercicios.Questao09;

public class Main {
    public static void main(String[] args) {

        int num=0, aux=1000;

        while (num < 5) {
            if (aux%11==5) {
                num++;
            } 
            aux++;
        }
        System.out.println("o numero é " + (aux-1));
    }
}
