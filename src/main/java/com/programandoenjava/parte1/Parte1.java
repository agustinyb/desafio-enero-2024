package com.programandoenjava.parte1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parte1 {


    public static void main(String[] args) {
        invertirPalabras("Hola Mundo");
    }

    /**
     * Escribe un programa en Java que reciba una cadena de texto y devuelva la
     * misma cadena pero con cada palabra invertida. Por ejemplo, para la entrada "Hola Mundo",
     * la salida debería ser "aloH odluM".
     *
     * @param
     * @return cadena invertida
     */

    public static String invertirPalabras(String cadena) {


        String cadenaInvertida = "";
        if (cadena == null) {
            return "";
        } else {


            for (int i = cadena.length() - 1; i >= 0; i--) {
                cadenaInvertida += cadena.charAt(i);
            }
            String palabras[] = cadenaInvertida.split(" ");

            String[] palabrasInvertidas = new String[palabras.length];
            for (int i = palabras.length - 1, j = 0; i >= 0; i--, j++) {
                palabrasInvertidas[j] = palabras[i];
            }
            String resultado = Arrays.toString(palabrasInvertidas).replace("[", "").replace("]", "").replace(",", "");
            return resultado;
        }
    }
}

