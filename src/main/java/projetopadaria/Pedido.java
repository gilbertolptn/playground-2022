package projetopadaria;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedido {

    private StatusPedido status;
    private final LocalDateTime dataHora;// = LocalDateTime.now(); // Alternativa para setar na instanciação da classe
    private BigDecimal valorTotal;

    public Pedido(){
        this.dataHora = LocalDateTime.now();
    }

    public Pedido(StatusPedido status){
        this.status = status;
        this.dataHora = LocalDateTime.now();
    }

    public Pedido(StatusPedido status, LocalDateTime dataHora){
        this.status = status;
        this.dataHora = dataHora;
    }

    public void iniciarAtendimento(){
        this.status = StatusPedido.EM_ANDAMENTO;
    }

    public void alterarStatus(StatusPedido status){
        this.status = status;
    }

    public void calcularValorTotal(){
    }
}
