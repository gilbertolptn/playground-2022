package exemplo11enum.cartao;

import java.util.Scanner;

/*
    Exercício 1: Faça um programa que recebe como entrada a rendaMensal e retorna o tipo de cartão recomendado:

    1. Crie um enum TipoCartao com as modalidades:
    - STANDARD
    - GOLD
    - PREMIUM
    - BLACK

    2. Crie um novo método que devolve o tipo de cartão de uma financeira de acordo com a rendaMensal:
    STANDARD:   rendaMensal < 1000
    GOLD:       rendaMensal >= 1000 e < 3000
    PREMIUM:    rendaMensal >= 3000 e < 10000
    BLACK:      rendaMensal >= 10000

    3. O main deve pedir a rendaMensal e imprimir o tipoDeCartao

    @TODO ver switch/case com lambda e propriedades :)
 */
class ExercicioTipoCartao {

    public static void main(String[] args) {
        System.out.println("Informe a renda mensal:");
        float rendaMensal = new Scanner(System.in).nextFloat();
        TipoCartao tipoCartao = obtemTipoPela(rendaMensal);
        System.out.println("Tipo de Cartão recomendado: " + tipoCartao.name() + "- " + tipoCartao.ordinal());
    }

    public static TipoCartao obtemTipoPela(float rendaMensal){
        TipoCartao tipoCartaoSelecionado;

        if(rendaMensal < 1_000F){
            tipoCartaoSelecionado = TipoCartao.STANDARD;

        }else if( rendaMensal < 3_000F){
            tipoCartaoSelecionado = TipoCartao.GOLD;

        } else if (rendaMensal < 10_000F) {
            tipoCartaoSelecionado = TipoCartao.PREMIUM;

        }else {
            tipoCartaoSelecionado = TipoCartao.BLACK;
        }

        return tipoCartaoSelecionado;
    }


}
