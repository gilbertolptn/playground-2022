package exemplo06lacos;

public class ExemplosIncrementos {

    public static void main(String[] args) {

        System.out.println("Incremento:");

        int contador = 5;
        System.out.println(contador++); // 5, pois o incremento acontece depois do print
        System.out.println(++contador); // 7 pois já está em 6, e ocorre o incremento antes

        contador++; // mais comum
        System.out.println(contador); // 8, pois o incremento acontece antes
        ++contador; // não é tão utilizado
        System.out.println(contador); // 9; pois o incremento acontece antes

        System.out.println("Contador regressivo:");

        int contadorRegressivo = 10;
        // Copia do valor antigo (10) para o numero1 e diminui depois
        int numero1 = contadorRegressivo--;
        System.out.println(numero1); //10
        System.out.println(numero1); //10

        System.out.println(contadorRegressivo); //9

        // Diminui primeiro e copia do valor atualizado (8) para o numero2
        int numero2 = --contadorRegressivo; // (contadorRegressivo = contadorRegressivo-1)
        System.out.println(numero2); //8
        System.out.println(numero2); //8

        System.out.println(contadorRegressivo); //8
    }
}
