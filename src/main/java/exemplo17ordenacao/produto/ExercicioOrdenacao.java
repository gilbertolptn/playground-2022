package exemplo17ordenacao.produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Exercício:

- Crie uma classe `Produto` com os atributos: `nome`, `custoAquisicao`, `valorVenda`.
- Crie uma classe `ExercicioOrdenacao` com o método `main`.
- Crie os produtos lista a seguir.
- Imprima a lista:
	+ Ordenada por `nome` (ordem padrão).
	+ Ordenada por `custoAquisicao`.
	+ Lucro (`valorVenda` - `custoAquisicao`). TODO (desafio)

Produtos:

Descrição, Custo, Venda
Creme Dental 90g, R$ 2,49, R$ 2,99
Sabonete em Barra Corporal 90g, R$ 2,99, R$ 3,30
Protetor Solar 30 FPS 200ml, R$ 37,39, R$ 39,12
Fralda P Confort - 50 Unidades, R$ 44,90, R$ 44,90
Condicionador 200ml, R$ 18,90, R$ 15,00

 */
public class ExercicioOrdenacao {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Sabonete em Barra Corporal 90g", 2.99F, 3.30F));
        produtos.add(new Produto("Creme Dental 90g", 2.49F, 2.99F));

        Collections.sort(produtos);

        System.out.println("Ordenação por Nome Produto: ");
        for (Produto produto : produtos) {
//            System.out.println(produto.toString());
            System.out.println(produto.getDescricao());
        }

        //Collections.sort(produtos, new ProdutoPorCustoComparator());
        produtos.sort(new ProdutoPorCustoComparator());

        System.out.println("Ordenação por Custo do Produto: ");
        for (Produto produto : produtos) {
//            System.out.println(produto.toString());
            System.out.println(produto.getDescricao());
        }

    }
}
