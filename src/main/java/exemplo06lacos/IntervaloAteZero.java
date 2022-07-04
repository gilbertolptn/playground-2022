package exemplo06lacos;

import java.util.Scanner;

/*
Faça um método que pede um número ao usuário e retorna esse número.
Faça outro método que recebe o número informado anteriormente e imprime cada número do intervalo dele até zero.

Ex: se informado 3: 3 2 1 0
 */
public class IntervaloAteZero {

    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimeNumeroAteZero(numero);
    }

    public static void imprimeNumeroAteZero(int numeroInformado){
        while (numeroInformado >= 0){ // inclusive o 0
            System.out.print(numeroInformado+" ");
            numeroInformado--; //numeroInformado = numeroInformado-1;
        }
    }

    public static int pedirNumero(){
        System.out.println("Informe um número:");
        return new Scanner(System.in).nextInt();
    }
}
