package exemplo12visibilidades.model;

//public class Tarefa { Vis�vel para toda a aplica��o
public class Tarefa {

    //public String descricao; // Vis�vel pra todos
    //String descricao; // Vis�vel s� para o pacote
    //protected String descricao; // Vis�vel para o pacote + extends (heran�a)
    private String descricao; // Vis�vel apenas para a pr�pria Tarefa

    //getter - obten��o do mesmo tipo
    public String getDescricao(){
        return descricao;
    }

    //setter - altera��o do estado/valor do atributo do mesmo tipo
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void fazOutraCoisa(){
        String descricaoAtual = getDescricao();
    }
}
