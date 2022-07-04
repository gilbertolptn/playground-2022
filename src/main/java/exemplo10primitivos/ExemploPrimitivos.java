package exemplo10primitivos;

public class ExemploPrimitivos {

    public static void main(String[] args) {

        byte idadePet = -128; // de -128 at� +127

        //Bin�rio -> processa no Java com byte[]
        byte[] pdf;
        byte[] video;
        byte[] imagem;

        //short
        short populacaoEspumo = 14000; // At� ~32.000....

        //int
        // Uso recomendado de "_" underline quando precisar deixar claro o separador decimal
        int populacaoPortoAlegre = 1_492_530; // At� ~ 2mi
        System.out.println(populacaoPortoAlegre);

        //Maior tipo primitido inteiro: LONG
        long numeroCelulasPet = 9199999999999999999L; // L: deixa claro n�o � um INT

        //Mais que isso: BigInteger

        // REAIS primitivos - podem ter problema de precis�o em ***c�lculos***

        //Float
        float compra = 120.30F; //F: Deixar claro que � um FLOAT
        float faturaCartao = 1990.00F;

        //Double
        double arrecadacaoMunicipio = 2_000_000_000.01; // Pode ser usado "D"

        // Para c�lculos monet�rios iremos usar o BigDecimal

        boolean vaiChover = true; //false/true
        System.out.println(vaiChover);
    }
}
