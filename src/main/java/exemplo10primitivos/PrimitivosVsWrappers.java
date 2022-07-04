package exemplo10primitivos;

public class PrimitivosVsWrappers {

    public static void main(String[] args) {

        //Primitivo
        int anoAtual = 2022; // literal

        //Wrapper (estou exagerando usando Integer.valueOf)
        Integer anoAnterior = Integer.valueOf("2021"); //Criando um objeto Integer

        //AUTOBOXING E UNBOXING (primito vs seu wrapper)

        // Integer -> int = tirando da caixa: unboxing
        int proximoAno = Integer.valueOf("2023");//No dia-a-dia usamos direto "= 2023"

        // int -> Integer = colocando em uma caixa: auto-boxing
        Integer diaHoje = 14;

        Boolean ehNoite = Boolean.valueOf(true);//No dia-a-dia usamos direto "= true"

        String numero = "1.2";
        Float numeroFloat = Float.parseFloat(numero);
        System.out.println(numeroFloat*10);

        //M�todos "static" vs "n�o static"

        //M�todos Static - [Classe].[metodo] = static
        String letraASCII = Character.toString(65);
        System.out.println(letraASCII);
        String texto = String.format("Meu nome � %s", "Jhony");
        System.out.println(texto);

        //M�todos "n�o static" - [variavel].[metodo] = n�o static
        Integer ano = 2022;
        // N�o funciona asssim Long.longValue() pois n�o � static
        long convertidoParaLong = ano.longValue();
        System.out.println(convertidoParaLong);

        String nome = "Jhony";
        String partesNome = "o";
        nome.split(partesNome);

    }
}
