package exemplo14collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploSet {

    public static void main(String[] args) {

        Set<String> pessoas = new LinkedHashSet<>();
        System.out.println("Adicionou ou não? ");

        System.out.println(pessoas.add("Tom"));
        System.out.println(pessoas.add("John"));
        System.out.println(pessoas.add("Mary"));
        System.out.println(pessoas.add("Peter"));
        System.out.println(pessoas.add("David"));
        System.out.println(pessoas.add("Alice"));
        System.out.println(pessoas.add("Tom"));
        System.out.println(pessoas.add("Alice"));

        System.out.println("Lista:");
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }

    }
}
