package exemplo09strings;

public class ParticularidadesDaString {

    public static void main(String[] args) { // o método de execução sempre recebe args
//        imprimeJava();
//        arrayComStrings();

        String texto = String.format("Idade do %s: %d anos.", "Fulano", 45);
        System.out.println(texto);

    }

    private static void arrayComStrings() {
        String[] lista = new String[2];
        lista[0] = "Fernando";  // aloca o 1º espaço em RAM
        lista[1] = "Rafael";    // aloca o 2º espaço em RAM
        lista[0] = "Poliana";   // aloca o 3º espaço em RAM
        //lista.length // no ARRAY: Não é um método, é uma propriedade de ARRAYS
    }

    public static void imprimeJava(){
        //IMUTABILIDADE
        String turma = "Java 2021"; // Em memória essa string continua IMUTÁVEL
        turma = "Java 2022"; // Será criada em outra posição da memória uma nova String
        //Possivelmente o GC (Garbage Collector) irá limpar a String "Java 2021"
        System.out.println(turma); // "Java 2022"

        System.out.println("O texto "+turma+" tem "+ turma.length() + " caracteres");

        System.out.println("Partes da String: ");
        String[] partes = turma.split(" ");
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }
    }
}
