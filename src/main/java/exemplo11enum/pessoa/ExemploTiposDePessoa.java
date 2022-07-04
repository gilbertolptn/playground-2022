package exemplo11enum.pessoa;

import java.util.Scanner;

public class ExemploTiposDePessoa {

    public static void main(String[] args) {

        //Declaração "FIXA" de um enum
        TipoPessoa tipoFisica = TipoPessoa.PESSOA_FISICA;

        //Percorrer e listar os tipos
        for(TipoPessoa tipo : TipoPessoa.values()){ // for-each ( tipo nome : lista )
            System.out.println("->" + tipo);
        }

        System.out.println("Informe um tipo de Conta:");
        String entrada = new Scanner(System.in).nextLine();
        // Com valueOf validamos que só passará os 2 tipos
        // Converte a sting em um enum de mesmo valor
        TipoPessoa tipo = TipoPessoa.valueOf(entrada);

        System.out.println(tipo.name());// transforma o enum em uma string
        System.out.println(tipo.ordinal());// obtém a posição dentro do enum

        switch (tipo){
            case PESSOA_FISICA:
                System.out.println("Pessoa física selecionado!");
                break;
            case PESSOA_JURIDICA:
                System.out.println("Pessoa jurídica selecionada!");
                break;
        }

        if(tipo == TipoPessoa.PESSOA_FISICA){ // DEVEMOS usar o == em ENUMs
            System.out.println("É pessoa física!");
        }

    }
}
