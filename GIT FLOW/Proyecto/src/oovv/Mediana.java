/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author usuario
 */
public class Mediana {
    
    private int[] numeros;
    private int cont;
    
    public Mediana() {
        this.numeros = new int[10];
        this.cont = 0;
    }

    public Mediana(int num) throws NegativoException {
        if (num < 10) {
            throw new NegativoException("Tienes que introducir como minimo 10 numeros");
        }
        this.numeros = new int[num];
        this.cont = 0;
    }
    
    public void añadirNum(int num) {
        int pos = getPrimerZero();
        numeros[pos] = num;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public void incrementa(){
        cont++;
    }

    public String calculaMediana() {
        String llista = "La Media es: ";
        double result = 0;
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        result = suma / numeros.length;
        return String.format("%s%.2f\n\n", llista, result);
    }

    private int getPrimerZero() {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public int getAleatori(int inf, int sup) {
        if (inf > sup) {
            return getAleatori(sup, inf);
        }
        return inf + (int) (Math.random() * (sup - inf + 1));
    }

    public void aleatoria() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = getAleatori(1, 99);
        }
    }

    public String llistatNombres() {
        String llista = "Llistat de Nombres\n---------------------------\n";
        for (int i = 0; i < numeros.length; i++) {
            llista += numeros[i] + (i % numeros.length+1 == 0 && i != 0 ? " ": ", ");
        }
        return llista + "\n\n";
    }

    public void eliminarNombres() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 0;
        }
    }

    public int getLongitud() {
        return numeros.length;
    }
}
