package exemplo17ordenacao.produto;

import java.util.HashSet;
import java.util.Set;

/*
Comparações de objetos (não primitivos):
==      Compara endereço de memória
equals  Compara se um objeto é igual a outro

 */
public class ComparacaoProduto {
    public static void main(String[] args) {
        comparacoes();
        usoDeSet();
    }

    private static void usoDeSet() {
        //O SET só funciona se tivermos o equals implementado.
        Set<Produto> produtos = new HashSet<>();
        produtos.add(new Produto("Creme", 5F, 10F));
        produtos.add(new Produto("Creme", 5F, 10F));

        System.out.println(produtos.size());
    }

    private static void comparacoes() {
        Produto creme = new Produto("Creme", 5F, 10F);
        Produto creme2 = new Produto("Creme", 5F, 10F);

        Produto copiaCreme2 = creme2;
        Produto sabao = new Produto("Sabão", 1F, 4F);

        System.out.println(creme == sabao); //Não estão no mesmo endereço da HEAP
        System.out.println(creme == creme2); //Não estão no mesmo endereço da HEAP
        System.out.println(creme2 == copiaCreme2); //Apontam pro mesmo lugar da HEAP
        System.out.println(creme.equals(creme2)); // SIM, pois o equals compara nome,valor,custo
    }
}
