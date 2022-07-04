package exemplo16excecoes;

public class ArquivoInformadoInvalidoException extends RuntimeException {
    public ArquivoInformadoInvalidoException(String mensagem){
        super(mensagem);
    }
}
