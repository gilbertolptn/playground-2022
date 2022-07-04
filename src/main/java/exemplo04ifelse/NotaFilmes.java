package exemplo04ifelse;

public class NotaFilmes {

    public static void main(String[] args) {

        int notaFilme = 2;

        if (notaFilme >= 3) {
            System.out.println("O filme é bom!");
            // posso ter if aninhado... if(){}
        } else if (notaFilme >= 2) {
            System.out.println("O filme é mediano");
        } else {
            System.out.println("O filme é ruim!");
        }
    }

}
