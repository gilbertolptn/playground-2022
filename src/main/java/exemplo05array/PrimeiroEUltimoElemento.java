package exemplo05array;

/*
Faça um método que recebe um array de inteiros
e retorna um array de duas posições com o primeiro e o último elemento do array original.
 */
public class PrimeiroEUltimoElemento {

    public static int[] obtemPrimeiroEUltimoElemento(int[] entrada){

        //Como o array começa em 0, o length pega o tamanho e não a última posição
        int posicaoDoUltimoElemento = entrada.length-1;

        int[] retorno = new int[2];
        retorno[0] = entrada[0];
        retorno[1] = entrada[posicaoDoUltimoElemento];

        return retorno;
    }

}
