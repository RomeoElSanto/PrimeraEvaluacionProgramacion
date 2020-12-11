package Practica1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 1;
        while (menu != 0) {
            System.out.println("Suma:");
            System.out.println("Resta:");
            System.out.println("Multiplicacion:");
            System.out.println("Division:");
            String oper = sc.next();
            switch (oper) {
                case "Suma":
                    System.out.println("Introduce un numero: ");
                    int num1 = sc.nextInt();
                    System.out.println("Introduce otro numero: ");
                    int num2 = sc.nextInt();
                    System.out.println(num1 + num2);
                    break;
                case "Resta":
                    System.out.println("Introduce un numero: ");
                    int num3 = sc.nextInt();
                    System.out.println("Introduce otro numero: ");
                    int num4 = sc.nextInt();
                    System.out.println(num3 - num4);
                    break;
                case "Multiplicacion":
                    System.out.println("Introduce un numero: ");
                    int num5 = sc.nextInt();
                    System.out.println("Introduce otro numero: ");
                    int num6 = sc.nextInt();
                    System.out.println(num5 * num6);
                    break;
                case "Division":
                    System.out.println("Introduce un numero: ");
                    int num7 = sc.nextInt();
                    System.out.println("Introduce otro numero: ");
                    int num8 = sc.nextInt();
                    System.out.println(num7 / num8);
                    break;
                default:
                    System.out.println("OperaciÃ³n incorrecta");
                    break;
            }
            System.out.println("Â¿Quieres hacer otra operaciÃ³n? || si = 1 / salir = 0");
            menu = sc.nextInt();
            if (menu == 0)
                break;
        }
    }
}