import exemplo07switch.ExemploRegioes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExemploRegioesTest {

    @Test
    void deveriaRetornarPortoAlegreQuando51(){
        String regiao = ExemploRegioes.obtemRegiao(51);
        Assertions.assertEquals("Região Metropolitana de Porto Alegre.", regiao);
    }

    @Test
    void deveriaRetornarNaoIdentificado(){
        String regiao = ExemploRegioes.obtemRegiao(45);
        Assertions.assertEquals("Região não identificada.", regiao);
    }
}
