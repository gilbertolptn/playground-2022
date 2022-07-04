package exemplo06lacos;

public class MultiplosReturns {

    public static int encontraONumero7(int entrada){

        if(entrada > 5){
            if(entrada == 7) {
                return 5; // Só cai neste return se os dois if's correspoderem
            }
        }

        return 0; // Se não cair nos if's, vai chegar até aqui e retornar 0
    }
}
