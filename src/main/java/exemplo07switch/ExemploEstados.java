package exemplo07switch;

/*
Considerando as áreas de DDD do Sul:
48 - Santa Catarina
49 - Santa Catarina
51 - Rio Grande do Sul
53 - Rio Grande do Sul
45 - Paraná
46 - Paraná
Outros - Estado não identificado

Crie um método que recebe o código inteiro da área e retorna qual é o estado correspondente.

 */
public class ExemploEstados {

    public static void main(String[] args) {
        String estado = obtemEstado("51");
        System.out.println(estado);
    }

    public static String obtemEstado(String ddd){

        String estado;
        switch (ddd){
            case "48":
            case "49":
                estado = "Santa Catarina";
                break;
            case "51":
            case "53":
                estado = "Rio Grande do Sul";
                break;
            case "45":
            case "46":
                estado = "Paraná";
                break;
            default:
                estado = "Estado não identificado";
        }
        return estado;
    }
}
