package exemplo10primitivos;

public class ExemploWrappers {

    public static void main(String[] args) {

        Byte idadePet = -128; // de -128 at� +127

        //Bin�rio -> processa no Java com byte[]
        Byte[] pdf;
        Byte[] video;
        Byte[] imagem;

        //short
        Short populacaoEspumo = 14000; // At� ~32.000....

        //int
        // Uso recomendado de "_" underline quando precisar deixar claro o separador decimal
        Integer populacaoPortoAlegre = 1_492_530; // At� ~ 2mi

        //Usei um m�todo da classe Integer para transformar em double
        Double populacaoDouble = populacaoPortoAlegre.doubleValue();

        //Maior tipo primitido inteiro: LONG
        Long numeroCelulasPet = 9199999999999999999L; // L: deixa claro n�o � um INT

        //Mais que isso: BigInteger

        // REAIS primitivos - podem ter problema de precis�o em ***c�lculos***

        //Float
        Float compra = 120.30F; //F: Deixar claro que � um FLOAT
        Float faturaCartao = 1990.00F;

        //Double
        Double arrecadacaoMunicipio = 2_000_000_000.01; // Pode ser usado "D"

        // Para c�lculos monet�rios iremos usar o BigDecimal

        Boolean vaiChover = null; //false/true/nulo
        System.out.println(vaiChover);

        //NULL -> n�o ter refer�ncia a nenhum local da mem�ria
    }
}
