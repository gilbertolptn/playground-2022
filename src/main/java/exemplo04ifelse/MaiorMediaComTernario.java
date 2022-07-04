package exemplo04ifelse;

/**
 * Faça um método que recebe duas notas (de provas) e retorna a maior entre elas.
 */
public class MaiorMediaComTernario {

    public static void main(String[] args){

        double nota1 = 9.3;
        double nota2 = 8.3;

        double maiorNota = obtemMaiorNota(nota1, nota2);
        System.out.println("Maior nota encontrada: "+ maiorNota);
    }

    public static double obtemMaiorNota(double nota1, double nota2){
        return Math.max(nota1, nota2);

        //double notaMaior = (nota1 > nota2) ? nota1 : nota2;
        //return notaMaior;
    }
}


