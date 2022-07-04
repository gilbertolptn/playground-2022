package projetopadaria;

public class Cliente {

    private String cpf;
    private String nome;

    public Cliente(){
        System.out.println("Construtor padrão chamado!");
    }

    public Cliente(String nome){
        this.nome = nome;
        System.out.println("Construtor chamado! Nome: "+ this.nome);
    }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        System.out.printf("Construtor chamado! Nome: %s, Cpf: %s \n", nome, cpf);
    }

    public void alteraNome(String nome){
        this.nome = nome;
    }

    public void cadastrarCliente() {
    }

    public void imprimeNome(){
        System.out.println(this.nome);
    }
}