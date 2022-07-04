package exemplo06lacos;

/*
Faça um método que recebe uma lista de números inteiros
e retorna todos os números ÍMPARES em um novo array.
 */
public class ExercicioImpares {

    public static void main(String[] args) {
        int[] inteiros = new int[]{0, 2, 3, 8, 9, 11, 15, 20};
        int[] impares = obtemImpares(inteiros);

        for (int i = 0; i < impares.length; i++) {
            System.out.println(impares[i]);
        }
    }

    public static int[] obtemImpares(int[] inteiros){
        int quantidadeImpares = contaImpares(inteiros);
        int[] impares = new int[quantidadeImpares];
        int contadorImpares = 0;

        for(int i = 0; i < inteiros.length; i++){
            if(isImpar(inteiros[i])){
                impares[contadorImpares++] = inteiros[i];
            }
        }
        return impares;
    }

    public static int contaImpares(int[] inteiros){
        int contador = 0;
        //Com for-i
//        for(int i = 0; i < inteiros.length; i++){
//            if(isImpar(inteiros[i])){
//                contador++;
//            }
//        }
        //Com for-each
        for(int inteiro : inteiros){
            if(isImpar(inteiro)){
                contador++;
            }
        }
        return contador;
    }

    public static boolean isImpar(int numero){
        int restoDe2 = numero%2;
        return restoDe2 != 0; // todas as expressões retornam boolean (true ou false)
    }
}
