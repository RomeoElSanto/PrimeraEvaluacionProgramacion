package Practica1;

import java.util.Scanner;

public class Practica4_EmilioGaete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ejercicio a resolver: ");
        System.out.println("1: for");
        System.out.println("2: while");
        int num = sc.nextInt();
        while (num != 1 && num != 2) {
            System.out.println("Opción Incorrecta");
            System.out.println("Introduce el ejercicio a resolver: ");
            System.out.println("1: for");
            System.out.println("2: while");
            num = sc.nextInt();
        }
        switch (num) {
            case 1:
                System.out.printf("Introduce el primer numero");
                int a = sc.nextInt();
                System.out.printf("Introduce el segundo numero");
                int b = sc.nextInt();
                System.out.printf("Introduce el caracter");
                char c = sc.next().charAt(0);
                if (a > b) {
                    for (int i = 1; i <= b; i++) {
                        for (int j = 1; j <= a; j++) {
                            System.out.print(c);
                        }
                        System.out.println("");
                    }
                } else {
                    for (int i = 1; i <= a; i++) {
                        for (int j = 1; j <= b; j++) {
                            System.out.print(c);
                        }
                        System.out.println("");
                    }
                }
                break;
            case 2:
                System.out.println("Vamos a encontrar un numero elegido al azar entre 1 y 100");
                System.out.println("Si en algun momento deseas rendirte pulsa el 0");
                System.out.println("Introduce un numero entre 1 y 100");
                int num5 = sc.nextInt();
                int random = (int) ((Math.random() * 100) + 1);
                do {
                    if (num5 > random) {
                        System.out.println("El numero aleatorio es menor:");
                    } else {
                        System.out.println("El numero aleatorio es mayor");
                    }
                    System.out.println("Introduce un numero entre 1 y 100");
                    num5 = sc.nextInt();
                } while (num5 != 0 && num5 != random);
                if (num5 == 0) {
                    System.out.println("Te has rendido");
                } else {
                    System.out.println("Acertaste el numero aleatorio");
                }
                break;
        }
    }
}