package com.programandoenjava.parte2;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementa en Java que tenga un método
 * para agregar números enteros y otro método para calcular
 * la suma de todos los elementos en la lista.
 */
public class Parte2 {
    public List<Integer> numeros = new ArrayList<>();

    /**
     * Calcula la suma de todos los números enteros.
     *
     * @return La suma de los números enteros.
     */
    public int sumarNumeros() {
        int savenum;

        int suma;
        int total = 0;
        for (int i = 0; i < numeros.size(); i++) {

            int numero = numeros.get(i);

            total += numero;

        }
        return total;
    }

    /**
     * Agrega un número entero a la lista.
     *
     * @param numero El número entero que se va a agregar.
     */
    public void agregarNumero(int numero) {
        numeros.add(numero);
    }
}
