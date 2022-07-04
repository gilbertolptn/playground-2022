package exemplo02;

import java.util.Scanner;

/**
 * Faça um método que recebe duas notas e calcula a média simples
 */
public class MediaSimples {

    public static void main(String[] args){
        System.out.println("Informe a primeira nota:");
        double notaA = new Scanner(System.in).nextDouble();

        System.out.println("Informe a segunda nota:");
        double notaB = new Scanner(System.in).nextDouble();

        double media = mediaSimples(notaA, notaB);
        System.out.println("Média: "+ media);
    }

    public static double mediaSimples(double valorA, double valorB){
        //2d deixa claro que não é para converter para int, mas manter double
        double media = (valorA + valorB) / 2d ;
        return media;
    }
}
