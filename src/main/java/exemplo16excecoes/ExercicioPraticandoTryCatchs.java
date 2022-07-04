//package exemplo16excecoes;
//
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.sql.SQLDataException;
//
///*
//    TODO corrigir
//
//    OBS: Este arquivo traz erros de compilação esperados, resolva o exercício para parar os erros!
//
//    Trate as exceções a seguir até o main() completar sem erros:
// */
//public class ExercicioPraticandoTryCatchs {
//
//    //Não altere esse método main, altere somente dentro dos métodos que são chamados por ele
//    public static void main(String args[]) {
//        excecoesNumericas();
//        nullPointerException();
//        indexOfBounds();
//        arquivoInexistente();
//        erroDeConversao();
//        argumentoObrigatorio();
//        multiplasExcecoes();
//        System.out.println("Completou com sucesso! Parabéns!");
//    }
//
//    /*
//    Tratar o erro usando um try/catch adequado. Não é necessário relançar, só logar.
//     */
//    private static void erroDeConversao() {
//
//        int num = 0;
//        num = Integer.parseInt("zero");
//    }
//
//    /*
//    Tratar o erro usando um try/catch adequado. Não é necessário relançar, só logar.
//     */
//    private static void arquivoInexistente() {
//
//        //Estou apenas "definindo" qual arquivo vou abrir
//        File file = new File("E://arquivo.txt");
//        FileReader fr = new FileReader(file);
//        fr.close();
//    }
//
//    /*
//    A posição 29 não é um caracter válido. Tratar adequadamente
//     */
//    private static void indexOfBounds() {
//        String e = "Imersao Java";
//
//        char f = e.charAt(29);
//        System.out.println(e);
//    }
//
//    /*
//    Aqui ocorre nullpointer. o que fazer?
//     */
//    private static void nullPointerException() {
//        String d = null;
//        System.out.println(d.charAt(0));
//    }
//
//    /*
//    Divisão por zero é outro caso. O que fazer?
//     */
//    private static void excecoesNumericas() {
//        int a = 30, b = 0, c = 0;
//        c = a / b;
//        System.out.println ("Resultado = " + c);
//    }
//
//    /*
//    Esse método interno dispara uma exeção.
//    Não queremos que ela suba até o main, o que podemos fazer para somente logar um erro?
//     */
//    private static void argumentoObrigatorio(){
//        metodoDisparaIllegal();
//    }
//
//    /*
//    Esses 2 métodos internos disparam exceções.
//    Não queremos que elas subam até o main, o que podemos fazer para somente logar erros?
//    E se para cada uma das exceções que falhar, tivermos que escrever um log diferente?
//     */
//    private static void multiplasExcecoes() {
//        //trate com vários catchs separados
//        metodoDisparaSql();
//        metodoDisparaIOException();
//    }
//
//    /*
//    Esses 2 métodos internos disparam exceções.
//    Não queremos que elas subam até o main, o que podemos fazer para somente logar erros?
//    Neste caso queremos o mesmo log e tratamento para as duas exceções. Como fazemos?
//     */
//    private static void multiplasExcecoesMultiCatch() {
//        //trate com apenas um multi-catch
//            metodoDisparaSql();
//            metodoDisparaIOException();
//    }
//
//    /*
//    A PARTIR DAQUI, NÃO ALTERE
//    São só métodos úteis usados nos métodos de exercício.
//     */
//
//    private static void metodoDisparaIllegal() {
//        //Não altere esse método, somente quem o chama
//        throw new IllegalArgumentException();
//    }
//
//    private static void metodoDisparaIOException() throws IOException {
//        //Não altere esse método, somente quem o chama
//        throw new IOException();
//    }
//
//    private static void metodoDisparaSql() throws SQLDataException {
//        //Não altere esse método, somente quem o chama
//        throw new SQLDataException();
//    }
//
//*/
//
//}