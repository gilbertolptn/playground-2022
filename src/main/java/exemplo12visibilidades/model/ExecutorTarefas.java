package exemplo12visibilidades.model;

public class ExecutorTarefas {

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        //tarefa.descricao = "desc 3"; // privado não é visível aqui
//        tarefa.alterarDescricao("desc 4");
    }
}
