package exemplo17ordenacao.despesa;

import exemplo17ordenacao.despesa.Despesa;
import exemplo17ordenacao.despesa.DespesaPorValorComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoClassesCustomizadas {

    public static void main(String[] args) {

        List<Despesa> despesas = new ArrayList<>();
        despesas.add(new Despesa("Netflix", 45.90F));
        despesas.add(new Despesa("Amazon Prime", 45.90F));
        despesas.add(new Despesa("Disney Plus+", null)); // Vai ficar por primeiro graças ao Comparador

        Collections.sort(despesas);
        System.out.println("Por descrição: ");
        for (Despesa despesa : despesas) {
            System.out.println(despesa.getDescricao() + " - " + despesa.getValor());
        }

        despesas.sort(new DespesaPorValorComparator());
        System.out.println("\nPor valor: ");
        for (Despesa despesa : despesas) {
            System.out.println(despesa.getDescricao() + " - " + despesa.getValor());
        }

    }
}
