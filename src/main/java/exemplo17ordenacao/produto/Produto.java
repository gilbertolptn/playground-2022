package exemplo17ordenacao.produto;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private final String nome;
    private final Float custoAquisicao;
    private final Float valorVenda;

    public Produto(String nome, Float custoAquisicao, Float valorVenda) {
        this.nome = nome;
        this.custoAquisicao = custoAquisicao;
        this.valorVenda = valorVenda;
    }

    public Float getCustoAquisicao(){
        return custoAquisicao;
    }

    public String getDescricao() {
        return String.format("Nome: %30s | Custo: %8.2f | Valor Venda: %8.2f",
                nome, custoAquisicao, valorVenda);
    }

    @Override
    public int compareTo(Produto o) {
        if(this.nome == null){
            return -1;
        }
        if(o.nome == null){
            return 1;
        }
        return this.nome.compareTo(o.nome);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", custoAquisicao=" + custoAquisicao +
                ", valorVenda=" + valorVenda +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Produto outro = (Produto) o; // CAST pois somos obrigados a usar Object
        return this.nome.equals(outro.nome)
                && this.valorVenda.equals(outro.valorVenda)
                && this.custoAquisicao.equals(custoAquisicao);
    }

    @Override
    public int hashCode() {
        // É uma boa prática sempre implementarmos o hash junto com o EQUALS
        return Objects.hash(nome, custoAquisicao, valorVenda);
    }
}
