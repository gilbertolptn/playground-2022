package exemplo04ifelse;

/**
 * Faça um método que recebe duas notas (de provas)
 * e retorna a maior entre elas.
 */
public class MaiorMedia {

    public static void main(String[] args) {

        double nota1 = 9.3;
        double nota2 = 8.3;
        double maiorNota = obtemMaiorNota(nota1, nota2);
        System.out.println("Maior nota encontrada: " + maiorNota);
    }

    public static double obtemMaiorNota(double nota1, double nota2) {
        if (nota1 > nota2) {
            return nota1;
        } else {
            System.out.println("nota 1");
            return nota2;
        }
    }
}


