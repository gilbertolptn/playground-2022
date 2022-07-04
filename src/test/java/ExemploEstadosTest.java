import exemplo07switch.ExemploEstados;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExemploEstadosTest {

    @Test
    void deveriaRetornarSantaCatarina(){
        String estado = ExemploEstados.obtemEstado("48");
        Assertions.assertEquals("Santa Catarina", estado);
    }

}
