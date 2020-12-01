package Practica1;

import java.util.Arrays;
import java.util.Scanner;

public class EJ4_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño;
        do {
            System.out.println("Tamaño del array");
            tamaño = sc.nextInt();
        } while (tamaño <= 0);
        int[] array = new int[tamaño];
        int num;
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Valor de la posicion " + "(negativo para salir) " + i);
            num = sc.nextInt();
            if (num >=0)
                array[i] = num;
            else
                break;
        }
        System.out.printf(Arrays.toString(array));
    }
}