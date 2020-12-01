package Practica1;

import java.util.Arrays;

public class EJ7_Array {
    public static void main(String[] args) {
        int[] lista1 = new int[5];
        int[] lista2 = new int[5];
        int[] lista3 = new int[5];

        for (int i = 0; i < lista1.length; i++) {
            lista1[i] = (int) (Math.random() * 1000);
            lista2[i] = (int) (Math.random() * 1000);
            lista3[i] = (lista1[i] + lista2[i]);
        }
        System.out.println(Arrays.toString(lista1));
        System.out.println(Arrays.toString(lista2));
        System.out.println(Arrays.toString(lista3));
    }
}
