package exemplo06lacos;

import java.util.Scanner;

/*
Faça um método que pede um número ao usuário e retorna esse número.
Faça outro método que verifica se o número está no intervalo de 0 a 100*:

* Caso o número informado seja menor que 0 ou maior que 100,
solicitar novamente o número ao usuário até que seja informado um número nesse intervalo.
 */
public class EntradaUsuario0a100v2 {

    public static void main(String[] args) {
        int numero = pedirNumero();
        boolean valido;

        do {
            valido = verificarIntervalo(numero);
            numero = pedirNumero();

        } while (!valido);

        System.out.println("O número informado foi: "+numero);
    }

    public static int pedirNumero(){
        System.out.println("Informe um número");
        Scanner scanner = new Scanner(System.in); //Abrindo um recurso
        int numero = scanner.nextInt();
        scanner.close(); //Liberando o recurso
        return numero;
    }

    public static boolean verificarIntervalo(int numero){

        if(numero > 0 && numero <= 100){
            System.out.println("Número válido");
            return true;
        }else {
            System.out.println("Número inválido");
            return false;
        }
    }

}
