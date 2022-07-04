package exemplo17ordenacao.despesa;

public class Despesa implements Comparable<Despesa> {
    private final String descricao;
    private final Float valor;

    public Despesa(String descricao, Float valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Float getValor() {
        return valor;
    }

    // antes -1
    // na mesma posição 0
    // depois +1
    @Override
    public int compareTo(Despesa outraDespesa) {
        //return Objects.compare(descricao, outraDespesa.descricao);
        return this.descricao.compareTo(outraDespesa.descricao);
    }

}
