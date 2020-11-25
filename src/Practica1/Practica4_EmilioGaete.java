package Practica1;

import java.util.Scanner;

public class Practica4_EmilioGaete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ejercicio a resolver: ");
        System.out.println("1: for");
        System.out.println("2: while");
        int num = sc.nextInt();
        while (num != 1 && num != 2) { //Para que nos salga el menú hasta que introduzcamos uno de los dos números que se piden usamos la función while, para que se repita la pregunta hasta que el numero sea 1 o 2.
            System.out.println("Opción Incorrecta");
            System.out.println("Introduce el ejercicio a resolver: ");
            System.out.println("1: for");
            System.out.println("2: while");
            num = sc.nextInt();
        }
        switch (num) { //Iniciamos una función switch para crear nuestros dos menus cada uno con uno de los ejercicios pedidos
            case 1:
                System.out.printf("Introduce el primer numero");
                int a = sc.nextInt();
                System.out.printf("Introduce el segundo numero");
                int b = sc.nextInt();
                System.out.printf("Introduce el caracter");
                char c = sc.next().charAt(0);
                if (a > b) { //La función if la utilizamos para comprobar que la base sea siempre el mayor numero que introducimos al principio.
                    for (int i = 1; i <= b; i++) {//Con este bucle anidado creamos las figuras con las medidas que introducimos por teclado
                        for (int j = 1; j <= a; j++) {
                            System.out.print(c);
                        }
                        System.out.println("");
                    }
                } else {
                    for (int i = 1; i <= a; i++) {//Esta funcion en la misma pero con el orden cambiado por si el segundo numero es mayor que el primero
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
                int random = (int) ((Math.random() * 100) + 1); //Usamos la función Math.random para introducir un valor aleatorio en la variable "random" cada vez que ejecutamos el programa
                do {// Con este bucle do-while hacemos las comprobaciones para imprimir por patalla las pistas sobre si el numero introducido es menor o mayor que la solucion
                    if (num5 > random && num5 <=100) {
                        System.out.println("El numero aleatorio es menor:");
                    }  else if (num5 < random && num5 >= 1){
                        System.out.println("El numero aleatorio es mayor");
                    } else {
                        System.out.println("Introduce un numero entre los dos valores que se te piden");
                    }
                    System.out.println("Introduce un numero entre 1 y 100");
                    num5 = sc.nextInt();
                } while (num5 != 0 && num5 != random); //Cuando el numero introducido es 0 o el mismo que el del acertijo, sale del bucle, o has acertado o te has rendido
                if (num5 == 0) {
                    System.out.println("Te has rendido");
                } else {
                    System.out.println("Acertaste el numero aleatorio");
                }
                break;
        }
    }
}