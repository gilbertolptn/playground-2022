package exemplo06lacos;

public class InterrupcoesLacos {

    public static void main(String[] args) {
        exemploContinueComFori();
        exemploContinueComArray();
        exemploBreak();
        exemploReturn();
    }

    private static void exemploReturn() {
        System.out.println("Inicio do método");
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                return; // pular para fora do MÉTODO INTEIRO
            }
            System.out.println(i);
        }
        System.out.println("Fim do método");
    }

    private static void exemploBreak() {
        System.out.println("Inicio do método");
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break; // pular para fora do FOR
            }
            System.out.println(i);
        }
        System.out.println("Fim do método");
    }

    private static void exemploContinueComArray() {
        String[] letras = new String[]{"A", "B", "C"};

        for (int i = 0; i < letras.length; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println(letras[i]);
        }
    }


    private static void exemploContinueComFori() {
        System.out.println("Inicio do método");
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue; // pula para o próximo item do laço
            }
            // O restante do corpo do FOR é ignorado quando atingir o continue
            System.out.println(i);
        }
        System.out.println("Fim do método");
    }
}
