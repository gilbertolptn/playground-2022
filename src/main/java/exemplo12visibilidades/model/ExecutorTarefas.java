package exemplo12visibilidades.model;

public class ExecutorTarefas {

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        //tarefa.descricao = "desc 3"; // privado n�o � vis�vel aqui
//        tarefa.alterarDescricao("desc 4");
    }
}
