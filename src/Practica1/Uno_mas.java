package Practica1;

import java.util.Scanner;

public class Uno_mas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce un numero");
        int num1 = sc.nextInt();
        if (num1 < 0) {
            System.out.printf("El numero" + num1 + "no es positivo");
        }
        System.out.printf("Introduce el segundo numero");
        int num2 = sc.nextInt();
        if (num1 < 0) {
            System.out.printf("El numero" + num2 + "no es positivo");
        }
        System.out.println("Introduce un número del 1 al 7: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Debes introducir un número del 1 al 7: ");
                break;
        }
    }
}
