package exemplo13interfaces;

public class Barco implements MeioTransporte {
    @Override
    public int velocidadeMaxima() {
        return 20;
    }

    @Override
    public String unidadeVelocidade() {
        return "Mph";
    }
}
