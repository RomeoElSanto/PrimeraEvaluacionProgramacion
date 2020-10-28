package Practica1;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Ardillas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor");
        int num1 = sc.nextInt();
        System.out.println("Introduce un valor");
        int num2 = sc.nextInt();
        System.out.println("Introduce un valor");
        int num3 = sc.nextInt();
        boolean ordenadosDesc = ((num1 >= num2) && (num2 >= num3));
        System.out.println(ordenadosDesc);
        if (ordenadosDesc == true) {
            System.out.printf("Los elementos estan ordenados");
        } else {
            System.out.printf("Los elementos no estan odenados");
        }
    }
}
