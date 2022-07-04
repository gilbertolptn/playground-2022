import exemplo05array.PrimeiroElemento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeiroElementoTest {

    @Test
    void deveriaRetornarPrimeiroElemento(){
        int[] elementos = new int[]{3, 8, 1};
        int primeiro = PrimeiroElemento.obtemPrimeiroElemento(elementos);
        Assertions.assertEquals(3, primeiro);
    }

    @Test
    void deveriaRetornarMenosUmQuandoZero(){
        int[] elementos = new int[]{0, 8, 1};
        int primeiro = PrimeiroElemento.obtemPrimeiroElemento(elementos);
        Assertions.assertEquals(-1, primeiro);
    }
}
