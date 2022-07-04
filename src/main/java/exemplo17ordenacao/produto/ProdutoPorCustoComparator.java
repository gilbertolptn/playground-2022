package exemplo17ordenacao.produto;

import java.util.Comparator;

public class ProdutoPorCustoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        if(o1.getCustoAquisicao() == null){
            return -1;
        }
        if(o2.getCustoAquisicao() == null){
            return 1;
        }
        return o1.getCustoAquisicao().compareTo(o2.getCustoAquisicao());
    }
}
