package exemplo15heranca;

import java.util.List;

// Somente podemos Herdar 1 classe (extends)
// Podemos cumprir vários contratos/interfaces (implements)
public class Professor extends Pessoa {
    private List<String> cursosMinistra;

    public List<String> getCursosMinistra() {
        return cursosMinistra;
    }

    public void setCursosMinistra(List<String> cursosMinistra) {
        this.cursosMinistra = cursosMinistra;
    }
}
