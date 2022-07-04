package exemplo13interfaces;

import java.util.*;

public class InterfacesNasColecoes {

    public static void main(String[] args) {

        List lista = getLista();
        System.out.println(lista);
    }


    private static List getLista(){
        return new ArrayList();
    }

}
