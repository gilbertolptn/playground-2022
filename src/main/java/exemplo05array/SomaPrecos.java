package exemplo05array;

public class SomaPrecos {

    public static void main(String[] args) {

//        double[] precos = new double[]{7.90, 8.50, 7.90}; //declaração + instancição + valores

//        double[] precos; //declaração
//        precos = new double[2]; // instaciação

        double[] precos = new double[2]; //declaração + instaciação
        precos[0] = 7.90;
        precos[1] = 8.50;
        precos[0] = 1.90; // sobrescrevendo o valor 7.90

        System.out.println("Valores: "+ precos[0] + ", " + precos[1]);
        System.out.println("Quantidade de valores: "+ precos.length);
    }
}
