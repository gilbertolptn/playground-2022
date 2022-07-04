package exemplo07switch;

/*
Considerando as áreas de DDD do RS:
51 - Região Metropolitana de Porto Alegre.
53 - Pelotas e Região.
54 - Caxias do Sul e Região.
55 - Santa Maria e Região.
Outros - Região não identificada
Crie um método que recebe o código inteiro da área e imprima a região do estado.
*/
public class ExemploRegioesComReturn {

    public static void main(String[] args) {

        String ddd = "54";
        imprimeRegiao(ddd);
    }

    public static void imprimeRegiao(String ddd){
        String regiao = obtemRegiao(ddd);
        System.out.println(regiao);
    }

    public static String obtemRegiao(String ddd){
        switch (ddd){
            case "51":
                return "Região Metropolitana de Porto Alegre.";
            case "53":
                return "Pelotas e Região.";
            case "54":
                return "Caxias do Sul e Região.";
            case "55":
                return "Santa Maria e Região.";
            default:
                return "Região não identificada.";
        }
    }
}
