package projetopadaria;

import java.time.LocalDateTime;

public class Aplicacao {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ciclano");
        cliente1.alteraNome("Raul");
        cliente1.imprimeNome();
        Cliente cliente2 = new Cliente("Fulano", "010101");
        cliente2.alteraNome("Fernando");
        cliente2.imprimeNome();
        Cliente cliente3 = new Cliente();
        cliente3.alteraNome("João");
        Cliente cliente4 = new Cliente();
        cliente4.alteraNome("Rafael");
        Cliente cliente5 = new Cliente();
        cliente4.alteraNome("Liziane");

        Funcionario funcionario = new Funcionario();
        funcionario.alterarNome("");

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido(StatusPedido.EM_ANDAMENTO);
        LocalDateTime dataHora = LocalDateTime.now().minusMinutes(1); // Há um minuto atrás
        Pedido pedido3 = new Pedido(StatusPedido.AGUARDANDO, dataHora);

        System.out.println("Fim");
    }
}
