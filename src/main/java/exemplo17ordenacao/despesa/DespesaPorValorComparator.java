package exemplo17ordenacao.despesa;

import java.util.Comparator;

public class DespesaPorValorComparator implements Comparator<Despesa> {

//    despesa,  outraDespesa
//    "Amazon", "Netflix" -1
//    null, "Netflix" -1
//    "Amazon", null +1

    @Override
    public int compare(Despesa despesa, Despesa outraDispesa) {
        if(despesa.getValor() == null){ // Pra evitar NullPointer
            return -1; // Joga os nulos para o início
        }
        if(outraDispesa.getValor() == null){ // Pra evitar NullPointer
            return 1;
        }

        return despesa.getValor().compareTo(outraDispesa.getValor());
    }
}
