package Practica1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas monedas tienes de 2 euros");
        int eur = sc.nextInt();
        System.out.println("Cuantas monedas tienes de 1 euro");
        int eur2 = sc.nextInt();
        System.out.println("Cuantas monedas tienes de 50 centimos");
        int cent = sc.nextInt();
        System.out.println("Cuantas monedas tienes de 20 centimos");
        int cent2 = sc.nextInt();
        System.out.println("Cuantas monedas tienes de 10 centimos");
        int cent3 = sc.nextInt();
        int sumaeur = (eur * 2 + eur2 * 1);
        int sumacent = (cent * 50 + cent2 * 20 + cent3 * 10);
        System.out.println("Tienes " + sumaeur + " euros y " + sumacent + " centimos");
    }
}
