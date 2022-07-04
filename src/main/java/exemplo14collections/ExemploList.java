package exemplo14collections;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        List<String> linguagens = new LinkedList<>();

        linguagens.add("Java");
        linguagens.add("PHP");
        linguagens.add("C#");
        linguagens.add("JS");
        linguagens.add("Scala");
        linguagens.add("Java");
        linguagens.add("Scala");

        System.out.println("FOR-i");
        //For-i (linkedlist com for-i não é recomendada por causa dos múltiplos .get())
        for (int i = 0; i < linguagens.size(); i++) {
            System.out.println(linguagens.get(i));
        }

        System.out.println("\n\nFOR-EACH");
        //For-each
        for(String ling : linguagens){
            System.out.println(ling);
        }

        System.out.println("\n\nIterator");
        //Iterator
        Iterator<String> iterator = linguagens.iterator();
        while (iterator.hasNext()){
            String ling = iterator.next();
            System.out.println(ling);
        }

        System.out.println("\n\nMétodos:");
        System.out.println("Contains? "+linguagens.contains("PHP"));

        System.out.println("IndexOf Java? "+linguagens.indexOf("Java"));//0
        linguagens.remove("Java");// Removendo o Java da 0
        System.out.println("IndexOf Java? "+linguagens.indexOf("Java"));//4
        linguagens.remove(4);// Removendo o Java da 4
        System.out.println("IndexOf Java? "+linguagens.indexOf("Java"));//-1
        System.out.println("LastIndexOf? "+linguagens.lastIndexOf("Java"));

        linguagens.clear();
        System.out.println("Elementos? " + linguagens.size());

        //Sobrescrevendo a posição 0
        linguagens.set(0, "Kotlin");

        System.out.println("\n\nListIterator");
        //listIterator
        Iterator<String> listIterator = linguagens.iterator();
        while (listIterator.hasNext()){
            String ling = listIterator.next();
            System.out.println(ling);
        }

        //Converter em outro tipo de lista
        Set<String> lings = new TreeSet<>(linguagens);
    }
}
