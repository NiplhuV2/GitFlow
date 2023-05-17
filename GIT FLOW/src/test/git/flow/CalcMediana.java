/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.git.flow;

import java.util.Arrays;

/**
 *
 * @author Alex
 */
public class CalcMediana {

    public static String LlistatMediana() {

        int[] Matriz = {6, 7, 3, 2, 16, 7, 12, 546, 2342, 2131, 211, 26, 267, 2679};
        Arrays.sort(Matriz);
        String Llistat = "La mediana del siguiente array \n";

        int indiceCentral = Matriz.length / 2;

        // Verifica si el tamaño del array es impar
        if (Matriz.length % 2 == 1) {
            // El tamaño del array es impar, la mediana es el valor en el índice central
            double mediana = Matriz[indiceCentral];
            Llistat += "La mediana es: " + mediana;
        } else {
            // El tamaño del array es par, la mediana es el promedio de los dos valores centrales
            double mediana = (Matriz[indiceCentral - 1] + Matriz[indiceCentral]) / 2.0;
            Llistat += "La mediana es: " + mediana;
        }
        return Llistat;
    }

}
