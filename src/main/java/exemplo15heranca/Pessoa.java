package exemplo15heranca;

//Classe abstrata (public abstract) não permite dar NEW!!
public abstract class Pessoa {
    private String nome;
    private String documento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
