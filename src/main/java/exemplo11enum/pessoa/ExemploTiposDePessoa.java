package exemplo11enum.pessoa;

import java.util.Scanner;

public class ExemploTiposDePessoa {

    public static void main(String[] args) {

        //Declara��o "FIXA" de um enum
        TipoPessoa tipoFisica = TipoPessoa.PESSOA_FISICA;

        //Percorrer e listar os tipos
        for(TipoPessoa tipo : TipoPessoa.values()){ // for-each ( tipo nome : lista )
            System.out.println("->" + tipo);
        }

        System.out.println("Informe um tipo de Conta:");
        String entrada = new Scanner(System.in).nextLine();
        // Com valueOf validamos que s� passar� os 2 tipos
        // Converte a sting em um enum de mesmo valor
        TipoPessoa tipo = TipoPessoa.valueOf(entrada);

        System.out.println(tipo.name());// transforma o enum em uma string
        System.out.println(tipo.ordinal());// obt�m a posi��o dentro do enum

        switch (tipo){
            case PESSOA_FISICA:
                System.out.println("Pessoa f�sica selecionado!");
                break;
            case PESSOA_JURIDICA:
                System.out.println("Pessoa jur�dica selecionada!");
                break;
        }

        if(tipo == TipoPessoa.PESSOA_FISICA){ // DEVEMOS usar o == em ENUMs
            System.out.println("� pessoa f�sica!");
        }

    }
}
