package exemplo12visibilidades.model;

//public class Tarefa { Visível para toda a aplicação
public class Tarefa {

    //public String descricao; // Visível pra todos
    //String descricao; // Visível só para o pacote
    //protected String descricao; // Visível para o pacote + extends (herança)
    private String descricao; // Visível apenas para a própria Tarefa

    //getter - obtenção do mesmo tipo
    public String getDescricao(){
        return descricao;
    }

    //setter - alteração do estado/valor do atributo do mesmo tipo
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void fazOutraCoisa(){
        String descricaoAtual = getDescricao();
    }
}
