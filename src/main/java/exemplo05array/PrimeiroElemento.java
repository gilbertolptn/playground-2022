package exemplo05array;

public class PrimeiroElemento {

    public static void main(String[] args) {

        int[] elementos = new int[]{3, 8, 9};

        int primeiro = obtemPrimeiroElemento(elementos);
        System.out.printf("Primeiro elemento: %d", primeiro);
    }

    public static int obtemPrimeiroElemento(int[] elementos) {

        int primeiroElemento = elementos[0];

        if (primeiroElemento == 0) {
            return -1;
        }

        return primeiroElemento;
    }

/*
    //Teste unitário rústico
    public static void main(String[] args) {

        int[] elementos = {3, 8, 9};
        int primeiro = obtemPrimeiroElemento(elementos);
        if(primeiro == 3){
            System.out.println("Deu bom!");
        }else{
            System.out.println("Deu Ruim!");
        }
    }*/
}
