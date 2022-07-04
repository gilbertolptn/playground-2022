package exemplo06lacos;

import java.util.Scanner;

/*
Faça um método que pede um número ao usuário e retorna esse número.
Faça outro método que recebe o número informado anteriormente e imprime cada número do intervalo dele até zero.

Ex: se informado 3: 3 2 1 0
 */
public class IntervaloAteZeroComArray {

    public static void main(String[] args) {
        int numero = pedirNumero();
        int[] arrayRetorno = buscaNumerosAteZero(numero);

        System.out.println("Laço com FOR");
        for (int contador = 0; contador < arrayRetorno.length; contador++ ) {
            System.out.print(arrayRetorno[contador]+ " ");
        }

        System.out.println("\n\nO mesmo laço com WHILE:");
        int contador = 0;
        while (contador < arrayRetorno.length){
            System.out.print(arrayRetorno[contador]+ " ");
            contador++; //contador = contador + 1;
        }
    }

    public static int[] buscaNumerosAteZero(int numeroInformado) {
        int[] retorno = new int[numeroInformado + 1];
        int posicao = 0;

        while (numeroInformado >= 0) { // inclusive o 0
            retorno[posicao] = numeroInformado;

            numeroInformado--; //numeroInformado = numeroInformado - 1;
            posicao++; //posicao = posicao + 1;
        }

        return retorno;
    }

    public static int pedirNumero() {
        System.out.println("Informe um número:");
        return new Scanner(System.in).nextInt();
    }
}
