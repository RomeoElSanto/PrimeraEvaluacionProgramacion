package Practica1;

import java.util.Arrays;

public class EJ_1_Array {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.printf(Arrays.toString(array));
    }
}
