package projetopadaria;

public class Funcionario {

    private Long id;
    private String nome;
    private boolean ativo;
    private String documento;

    public void inativar(){
        ativo = false;
    }

    public void alterarDocumento(String documento){
        this.documento = documento;
    }

    public void alterarNome(String nome){
        this.nome = nome;
    }

    public void cadastrarNovo(){
    }
}
