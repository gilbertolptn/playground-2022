package exemplo07switch;

public class ExemploSwitch {

    public static void main(String[] args) {

        String operacaoFinanceira = "TED"; //PIX

        switch (operacaoFinanceira){
            case "TED":
                System.out.println("Taxa 0.1%");
                break;
            case "PIX":
                System.out.println("Taxa 0.0%");
                break;
            case "BOLETO":
                System.out.println("Taxa 1.0%");
                break;
            default:
                System.out.println("Operação não permitida!");
        }

    }
}
