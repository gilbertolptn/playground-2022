package exemplo15heranca;

import java.util.ArrayList;
import java.util.List;

public class Applicacao {

    public static void main(String[] args) {

//        Pessoa pessoa = new Pessoa(); //Não posso mais dar new pois é "abstract"
//        pessoa.setDocumento("312321");
//        pessoa.setNome("Fulano");

        Professor professor = new Professor();
        professor.setNome("Ciclano");
        professor.setDocumento("6545645");

        List<String> cursos = new ArrayList<>();
        cursos.add("Java"); //Arrays.asList("Java");
        professor.setCursosMinistra(cursos);

        Aluno aluno = new Aluno();
        aluno.setNome("Gilberto");

    }
}
