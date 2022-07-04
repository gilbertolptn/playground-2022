import exemplo05array.PrimeiroEUltimoElemento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeiroEUltimoElementoTest {

    @Test
    void deveriaRetornar1e3(){

        int[] entrada = new int[]{1, 3};

        int[] retorno = PrimeiroEUltimoElemento.obtemPrimeiroEUltimoElemento(entrada);

        Assertions.assertEquals(1, retorno[0]);
        Assertions.assertEquals(3, retorno[1]);
    }

    @Test
    void deveriaRetornar1e5(){
        int[] entrada = new int[]{1, 3, 4, 5};

        int[] retorno = PrimeiroEUltimoElemento.obtemPrimeiroEUltimoElemento(entrada);

        int[] retornoEsperado = new int[]{1,5};
        Assertions.assertArrayEquals(retornoEsperado, retorno);
    }
}
