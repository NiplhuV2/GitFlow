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
public class OrdenarArray {

    public static String LlistatOrdenat() throws NegativeArraySizeException {
        int[] Matriz = {6, 7, 3, 2, 16, 7, 12, 546, 2342, 2131, 211, 26, 267, 2679};
        String llistat = "Array ordenado -------------------------:\n";
        for (int Num : Matriz) {
            if (Num < 0) {
                throw new NegativeArraySizeException("El array no puede contener valores negativos.");
            }
        }
        Arrays.sort(Matriz);
        llistat += Arrays.toString(Matriz) + "\n";

        return llistat;
    }



}
