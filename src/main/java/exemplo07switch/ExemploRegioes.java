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
public class ExemploRegioes {

    public static void main(String[] args) {

        int ddd = 54;
        imprimeRegiao(ddd);
    }

    public static void imprimeRegiao(int ddd){
        String regiao = obtemRegiao(ddd);
        System.out.println(regiao);
    }

    public static String obtemRegiao(int ddd){
        String regiao;
        switch (ddd){
            case 51:
                regiao = "Região Metropolitana de Porto Alegre.";
                break;
            case 53:
                regiao = "Pelotas e Região.";
                break;
            case 54:
                regiao = "Caxias do Sul e Região.";
                break;
            case 55:
                regiao = "Santa Maria e Região.";
                break;
            default:
                regiao = "Região não identificada.";
        }
        return regiao;
    }
}
