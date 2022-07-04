package exemplo16excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AplicacaoComExcecao {

    public static void main(String[] args) {
        System.out.println("MAIN");
        a();
        System.out.println("FIM MAIN");
    }

    private static void a() {
        System.out.println("A");
        try {
            b();
        } catch (IOException e) {
            System.out.println("Deu erro!");
        }
        System.out.println("FIM A");
    }

    private static void b() throws IOException {
        System.out.println("B");
        c();
        System.out.println("FIM B");
    }

    private static void c() {
        System.out.println("C");
        System.out.println("FIM C");
        try {
            File arquivo = new File("notas.txt");
            FileReader fileReader = new FileReader(arquivo);
        }catch (FileNotFoundException e){
            System.out.println("Arquivo não existe");
            //throw e; // poderia relançar e aí volta o THROWS
            throw new ArquivoInformadoInvalidoException("Informe um arquivo válido");
        }
    }


}
