import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExemplosStringsTest {

    @Test
    void exemploIndexOf() {
        String email = "giba@gmail.com";

        int indice = email.indexOf("@");

        Assertions.assertEquals(4, indice);
    }

    @Test
    void exemploDominioEmail() {
        String email = "giba@gmail.com";

        int indiceArroba = email.indexOf("@");
        String dominio = email.substring(indiceArroba);

        Assertions.assertEquals("@gmail.com", dominio);
    }

    @Test
    void exemploIndexOfInexistente() {
        String frase = "Olá mundo";

        int indice = frase.indexOf(".");

        Assertions.assertEquals(-1, indice);
    }

    @Test
    void exemploMaisDe1Caractere() {
        String frase = "Ola mundo";

        int indice = frase.indexOf("Ola");

        Assertions.assertEquals(0, indice);
    }

    @Test
    void cortandoAString() {
        String frase = "Ola turma de Java 2022";

        String primeiraParte = frase.substring(0, 9);

        Assertions.assertEquals("Ola turma", primeiraParte);
    }

    @Test
    void cortandoAStringNoFim() {
        String frase = "Ola turma de Java 2022";

        String primeiraParte = frase.substring(9);

        Assertions.assertEquals(" de Java 2022", primeiraParte);
    }

    @Test
    void obtendoUltimos5Caracteres() {
        String placa = "IIJ7890"; // quero pegar o ACDRT

        int comecarCorteEm = placa.length() - 4;
        String parteNumericaDaPlaca = placa.substring(comecarCorteEm);

        Assertions.assertEquals("7890", parteNumericaDaPlaca);
    }

    @Test
    void alterandoNumeros() {
        String texto = "a) compilado b) usa JVM c) tipado";

        String novoTexto = texto.replaceAll("\\)", "."); // "\\)" = ")" escape

        Assertions.assertEquals("a. compilado b. usa JVM c. tipado", novoTexto);
    }

    @Test
    void maiusculas() {
        String texto = "a) compilado b) usa JVM c) tipado";

        String textoEmMaiusculo = texto.toUpperCase();

        System.out.println("pimenta nos olhos dos outros é refresco".toUpperCase());

        Assertions.assertEquals("A) COMPILADO B) USA JVM C) TIPADO", textoEmMaiusculo);
    }


}