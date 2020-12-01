package Practica1;

import java.util.Arrays;

public class EJ3_Array {
    public static void main(String[] args) {
       double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%.2f ", notas[i]);
        }
        System.out.println();
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double media = suma / notas.length;
        System.out.printf("Media: %.2f", media);
        System.out.println();

        //Nota mas alta
        double maximo = notas[0];
        for (int i = 1; i < notas.length ; i++) {
            if (notas[i] > maximo){
                maximo = notas[i];
            }

        }
        System.out.printf("Nota mas alta: %.2f", maximo);
        System.out.println();
        double minimo = notas[0];
        for (int i = 1; i < notas.length ; i++) {
            if (notas[i] < minimo){
                minimo = notas[i];
            }

        }
        System.out.printf("Nota mas baja: %.2f", minimo);
    }
}
