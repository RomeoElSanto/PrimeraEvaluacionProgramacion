package Practica1;

import java.util.Arrays;
import java.util.Scanner;

public class EJ2_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cadenas = new String[5];
        for (int i = 0; i < cadenas.length ; i++) {
            System.out.println("Introduce una palabra");
            cadenas[i] = sc.next();
        }
        System.out.println(Arrays.toString(cadenas));
        String[] inverso = new String[5];
        for (int i = 0; i < inverso.length; i++) {
            inverso[4 - i] = cadenas[i];

        }
        System.out.println(Arrays.toString(inverso));
        }
    }

