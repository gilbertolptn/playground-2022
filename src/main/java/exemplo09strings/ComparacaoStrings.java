package exemplo09strings;

/*
Criar um programa que verifica se a situação de um pedido é igual a "concluido".
 */
public class ComparacaoStrings {

    public static void main(String[] args) {

        //String statusPedido = "concluido"; // essa vai pro String Pool
        String statusPedido = "concluido"; // Essa vai para a HEAP (não é reaproveitada)
        //String statusPedido = new Scanner(System.in).nextLine(); // Essa vai para a HEAP (não é reaproveitada)

        // PROVAVELMENTE ERRADO, pois compara endereço de memória
        if(statusPedido == "concluido"){
            System.out.println("Está concluído!");
        }else {
            System.out.println("Pedido em andamento!");
        }

        // Não se aplicam a String na parte dos casos ==, !=, >=, >, <

        if(statusPedido.equals("concluido")){ // CERTO
            System.out.println("Está concluído!");
        }

        if(statusPedido.equalsIgnoreCase("CONCLUIDO")){ // CERTO
            System.out.println("Está concluído!");
        }

        if(statusPedido.compareTo("concluido") == 0){ // CERTO
            System.out.println("Está concluído!");
        }

        if(statusPedido.compareToIgnoreCase("concluido") == 0){ // CERTO
            System.out.println("Está concluído!");
        }

        switch (statusPedido){
            case "concluido": // ele usa equals para comparar.
                System.out.println("Status concluído!");
                break;
            case "em_andamento":
                System.out.println("Status em andamento!");
                break;
        }
    }
}
