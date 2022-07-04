package exemplo10primitivos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciciosWrapperTest {

    @Test
    void deveriaRetornarExcessoDeBagagem(){

        String situacao = ExerciciosWrapper.obtemSituacaoBagagem(23F);

        Assertions.assertEquals("Excesso de peso, haverá cobrança de adicional.", situacao);
    }

    @Test
    void deveriaRetornarPesoMaximo(){

        String situacao = ExerciciosWrapper.obtemSituacaoBagagem(22.5F);

        Assertions.assertEquals("Peso máximo atingido.", situacao);
    }

    @Test
    void deveriaRetornarPesoAbaixo(){

        String situacao = ExerciciosWrapper.obtemSituacaoBagagem(22.4F);

        Assertions.assertEquals("Peso abaixo do limite.", situacao);
    }

}