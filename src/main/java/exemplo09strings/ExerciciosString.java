package exemplo09strings;

/*
Criação de Strings:
    "Cão que ladra não morde"
    "Pimenta nos Olhos dos Outros é Refresco"
    "UM DIA É DA CAÇA, OUTRO DO CAÇADOR"
    "seuemail@mail.com"
    "O que os olhos não veem, o coração não sente"

Split: Faça um método que recebe uma String e retorna cada palavra da sentença em uma linha.
Entrada: "A pressa é a inimiga da perfeição."
Saída: "A
pressa
é
a
inimiga
da
perfeição."

Faça um método que recebe uma String e imprime ela em Maiúsculas e também em Minúsculas.
Entrada: "Pimenta nos Olhos dos Outros é Refresco"
Saída: "
pimenta nos olhos dos outros é refresco
PIMENTA NOS OLHOS DOS OUTROS É REFRESCO
"

Faça um método que recebe uma String e retorna a primeira palavra em Maiúsculas e as demais em minúsculas.
Entrada: "Pimenta nos Olhos dos Outros é Refresco"
Saída: PIMENTA nos olhos dos outros é refresco

Faça um método que recebe uma String e retorna a última palavra em Minúsculas e as demais em maiúsculas.
Entrada: "UM DIA É DA CAÇA, OUTRO DO CAÇADOR".
Saída: "UM DIA É DA CAÇA, OUTRO DO caçador".

Faça um método que recebe uma String e retorna retorna true se a entrada não é nula,
 vazia ou possui somente espaços em branco.
Entrada: "seuemail@mail.com"    Saída: true
Entrada: "         "            Saída: false

Faça um método que recebe uma String e retorna a primeira sentença do texto (antes da primera vírgula ou ponto.)
Entrada: "O que os olhos não veem, o coração não sente."
Saída: O que os olhos não veem

Substring: Faça um método que recebe uma String e retorna os primeiros 3 dígitos da entrada.
Entrada: "IAB2032".
Saída: "IAB"
 */
public class ExerciciosString {
    public static void main(String[] args) {
//        imprimeCadaPalavra("A pressa é a inimiga da perfeição.");
//        imprimeMaiusculasEMinuasculas("Pimenta nos Olhos dos Outros é Refresco");
//        primeiraMaiusculaDemaisMinusculasSplit("Pimenta nos Olhos dos Outros é Refresco");
//        ultimaMinusculasDemaisMaiusculaSplit("Pimenta nos Olhos dos Outros é Refresco");
//        boolean valido = verificaStringValida(null);
//        System.out.println(valido);
        primeiraSentenca("O que os olhos não veem, o coração não sente.");
//        primeiros3Digitos("IAB2032");
    }

    private static void primeiros3Digitos(String codigo) {
        System.out.println(codigo.substring(0, 3));
    }

    private static void primeiraSentenca(String texto) {
        int indicePrimeiraSentenca = texto.indexOf(",");
        String primeiraSentenca;

        if(indicePrimeiraSentenca < 0){
            primeiraSentenca = texto;
        }else {
            primeiraSentenca = texto.substring(0, indicePrimeiraSentenca);
        }
        System.out.println(primeiraSentenca);

        //System.out.println(texto.split(",")[0]);
    }

    private static boolean verificaStringValida(String texto) {
        //return texto != null && !texto.isBlank();
        // trim().isEmpty()
        return texto != null && !texto.isBlank();
    }

    private static void ultimaMinusculasDemaisMaiusculaIndexOf(String texto) {
        int indicePrimeiroEspaco = texto.lastIndexOf(" ");
        String inicioTexto = texto.substring(0, indicePrimeiroEspaco);
        String ultimaPalavra = texto.substring(indicePrimeiroEspaco);
        System.out.print(inicioTexto.toUpperCase() + ultimaPalavra.toLowerCase());
    }

    private static void ultimaMinusculasDemaisMaiusculaSplit(String texto) {

        String[] partes = texto.split(" ");

        for (int i = 0; i < partes.length; i++) {
            if(i == partes.length-1){
                System.out.print(partes[0].toLowerCase());
                System.out.print(" ");
            }else{
                System.out.print(partes[i].toUpperCase());
                System.out.print(" ");
            }
        }
    }

    private static void primeiraMaiusculaDemaisMinusculasIndexOf(String texto) {
        int indicePrimeiroEspaco = texto.indexOf(" ");
        String primeiraPalavra = texto.substring(0, indicePrimeiroEspaco);
        String restanteTexto = texto.substring(indicePrimeiroEspaco);
        System.out.print(primeiraPalavra.toUpperCase() + restanteTexto.toLowerCase());
    }

    private static void primeiraMaiusculaDemaisMinusculasSplit(String texto) {

        String[] partes = texto.split(" ");

        for (int i = 0; i < partes.length; i++) {
            if(i == 0){
                System.out.print(partes[0].toUpperCase());
                System.out.print(" ");
            }else{
                System.out.print(partes[i].toLowerCase());
                System.out.print(" ");
            }
        }
    }

    private static void imprimeMaiusculasEMinuasculas(String texto) {
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
    }

    public static void imprimeCadaPalavra(String texto){
        String[] partes = texto.split(" ");

        for(String parte : partes){
            System.out.println(parte);
        }
    }
}
