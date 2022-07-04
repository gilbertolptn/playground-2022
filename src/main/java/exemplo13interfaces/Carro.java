package exemplo13interfaces;

public class Carro implements MeioTransporteMotorizado {

    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int velocidadeMaxima(){
        return 180;
    }

    @Override
    public String unidadeVelocidade() {
        return "Km/h";
    }

    public int getQuantidadePortas(){
        return 5;
    }

    @Override
    public int potenciaMotor() {
        return 120;
    }
}
