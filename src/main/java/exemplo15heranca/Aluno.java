package exemplo15heranca;

public class Aluno extends Pessoa {

    @Override // SObrescrita do método da superclasse
    public void setNome(String nome) {
        //Troca do nome para UPPERCASE só para o ALUNO
        super.setNome(nome.toUpperCase());
    }
}
