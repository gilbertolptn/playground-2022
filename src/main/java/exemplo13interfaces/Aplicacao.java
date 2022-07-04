package exemplo13interfaces;

public class Aplicacao {

    public static void main(String[] args) {

        Carro carro = new Carro();
        imprimeTransporte(carro);
        System.out.println("\nPortas: "+carro.getQuantidadePortas()+"\n\n");
        imprimePotenciaMotor(carro);

        Navio navio = new Navio();
        imprimeTransporte(navio);
        System.out.println("\nBotes: "+navio.quantidadeBotes());
        imprimePotenciaMotor(navio);

        Barco barco = new Barco();
        imprimeTransporte(barco);
    }

    private static void imprimePotenciaMotor(MeioTransporteMotorizado meio) {
        System.out.println("\nPotênciaMotor: "+ meio.potenciaMotor());
    }

    private static void imprimeTransporte(MeioTransporte meio){
        System.out.printf("Velocidade: %d %s",
                meio.velocidadeMaxima(),
                meio.unidadeVelocidade());
    }
}
