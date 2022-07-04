package exemplo13interfaces;

public class Navio implements MeioTransporteMotorizado {

    public int velocidadeMaxima(){
        return 90;
    }

    public String unidadeVelocidade() {
        return "Mph";
    }

    public int quantidadeBotes(){
        return 14;
    }

    @Override
    public int potenciaMotor() {
        return 1500;
    }
}
