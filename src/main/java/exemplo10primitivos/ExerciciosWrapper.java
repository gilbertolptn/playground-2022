package exemplo10primitivos;

/*
Exercício 1:
    Crie um programa que converta uma lista de números inteiros em seus respectivos códigos ASCII.
    Após, imprima o texto resultante.
    OBS: Pode ser útil consultar a tabela ASCII:
	https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/ASCII-Table.svg/738px-ASCII-Table.svg.png

	Integer[] numeros = {86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105,
		        115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111, 108, 117, 99, 97,
		        111, 32, 101, 115, 116, 97, 104, 32, 99, 111, 114, 114, 101, 116, 97,
		        33, 33, 32, 78, 97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111, 115,
		        32, 100, 101, 109, 97, 105, 115, 32, 58, 41};

Exercício 2:
    Sendo o limite de 22.5 kg para cada mala no aeroporto, dados três pesos de malas,
    escreva a frase apropriada para cada um dos casos.
    Menor que 22.5:     Peso abaixo do limite.
    Igual a 22.5:       Peso máximo atingido.
    Maior que 22.5:     Excesso de peso, haverá cobrança de adicional.

	Casos de teste:
	    Float peso1 = Float.valueOf("22.5");    // Peso máximo
	    Float peso2 = Float.valueOf("15");      // Abaixo
	    Float peso3 = Float.valueOf("30.2");    //Excedente
 */
public class ExerciciosWrapper {

    public static void main(String[] args) {
        //exercicio1();
        exercicio2();
    }

    private static void exercicio1() {
        Integer[] numeros = {86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105,
                115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111, 108, 117, 99, 97,
                111, 32, 101, 115, 116, 97, 104, 32, 99, 111, 114, 114, 101, 116, 97,
                33, 33, 32, 78, 97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111, 115,
                32, 100, 101, 109, 97, 105, 115, 32, 58, 41};

        StringBuilder sbMensagem = new StringBuilder();
        //Percorre cada número da lista
        for (int i = 0; i < numeros.length; i++) {
            //Converte para letras
            sbMensagem.append(Character.toString(numeros[i]));
            //System.out.print(Character.toChars(numeros[i]));
            //int ascii = numeros[i];
            // usei de CAST "(char)": forçei o tipo CHAR e o java converteu o int para a letra
            //char letra = (char) ascii;
            //sbMensagem.append(letra);//int, short, byte, boolean, char, long, double, float
        }

        System.out.println(sbMensagem); // ele chama o .toString()
    }

    private static void exercicio2() {
        Float peso = 34.5F;
        String situacao = obtemSituacaoBagagem(peso);
        System.out.println(situacao);
    }

    public static String obtemSituacaoBagagem(Float peso){

        Float limite = 22.5F;
        String situacao;

        if(peso.compareTo(limite) < 0){
            situacao = "Peso abaixo do limite.";

        } else if (peso.equals(limite)) {
            situacao = "Peso máximo atingido.";

        }else {
            situacao = "Excesso de peso, haverá cobrança de adicional.";
        }

        return situacao;
    }
}
