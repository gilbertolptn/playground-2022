package exemplo14collections;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {

        Map<String, String> capitais = new HashMap<>();

        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Floripa");
        capitais.put("SP", "São Paulo");
        capitais.put("PR", "Curitiba");
        capitais.put("PR", "Curitibanos");
        capitais.put("AC", "Rio Branco");
        capitais.put("", "Montenegro");
        //capitais.put(null, "Pará"); //Pode usar em HashMap/LinkedHashMap. Em TreeMap dá erro!

        System.out.println("Chave/valor (Entry): ");
        for(Map.Entry<String, String> registro : capitais.entrySet()){
            System.out.printf("Chave: %s - %s \n", registro.getKey(), registro.getValue());
        }

        System.out.println("Cidade: ");
        for(String cidade : capitais.values()){
            System.out.println(cidade);
        }

        System.out.println("Estado: ");
        for(String key : capitais.keySet()){
            System.out.println(key);
        }

        String cidade = capitais.get("RS");
        System.out.println("Cidade RS:" + cidade);

        System.out.println("Cidade fantasma: "+capitais.get(""));
        //System.out.println("Cidade nula: "+capitais.get(null));//Pode usar em HashMap/LinkedHashMap. Em TreeMap dá erro!
    }
}
