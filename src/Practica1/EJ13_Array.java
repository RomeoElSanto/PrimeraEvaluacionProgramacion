package Practica1;

import java.util.Arrays;
import java.util.Scanner;

public class EJ13_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Numero de conductores");
            n = sc.nextInt();
        }while (n <= 0);
        sc.nextLine(); // Liberar el objeto Scanner para poder meter Strings

        String[] nombre = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nombre del conductor " + (i+1));
            nombre[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(nombre));
    }
}
