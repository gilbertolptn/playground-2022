package exemplo17ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoTiposBasicos {

    public static void main(String[] args) {

        ordenacaoStrings();
        ordenacaoNumeros();
    }

    private static void ordenacaoNumeros() {
        //List<Long> notas = List.of(12L, 3L, 7L); // Lista imutável - vai dar erro no sort
        List<Long> notas = Arrays.asList(12L, 3L, 7L); // Lista mutável
        Collections.sort(notas);

        for (Long nota : notas) {
            System.out.println(nota);
        }
    }

    private static void ordenacaoStrings() {
        List<String> artistas = new ArrayList<>();
        artistas.add("1");
        artistas.add("TOM JOBIM");
        artistas.add("JOÃO GILBERTO");
        artistas.add("JOAO GILBERTO");
        Collections.sort(artistas); // Ordena até este momento.
        //Collections.sort(artistas, comparadorCustomizadoXYZ); // Ordena até este momento.

        for (String artista : artistas) {
            System.out.println(artista);
        }

        artistas.add("CHICO BUARQUE");
        // TODO comparator reverse
        Collections.reverse(artistas); // Ordena até este momento. TODO está gerando errado.

        System.out.println("Após o Chico: ");
        for (String artista : artistas) {
            System.out.println(artista);
        }
    }
}
