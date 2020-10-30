package Practica1;

import java.util.Scanner;

public class Practica3_EmilioGaete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sobre que tipo de estructura quieres resolver ejercicios: ");
        System.out.println("1: if");
        System.out.println("2: switch");
        String num1 = sc.next();
        switch (num1) {
            case "1":
                System.out.println("Introduce el numero de ejercicio que quieres que resulva: ");
                System.out.println("1:");
                System.out.println("2:");
                System.out.println("5:");
                System.out.println("6:");
                System.out.println("7:");
                String numif = sc.next();
                switch (numif) {
                    case "1":
                        System.out.println("Introduce un numero");
                        int nume1 = sc.nextInt();
                        if (nume1 % 2 == 0) {
                            System.out.printf("El numero introducido es par");
                        } else {
                            System.out.printf("El numero introducido no es par");
                        }
                        break;
                    case "2":
                        System.out.println("Introduce tu suelto anual");
                        int nume2 = sc.nextInt();
                        if (nume2 > 9000) {
                            System.out.printf("Tu sueldo supera los 9000 euros anuales, debes abonar impuestos");
                        } else {
                            System.out.printf("Tu sueldo no supera los 9000 euros anuales no tienes que abonar impuestos");
                        }
                        break;
                    case "5":
                        System.out.println("Introduce los tres lados de tu triangulo:");
                        System.out.println("Lado 1");
                        int tri1 = sc.nextInt();
                        System.out.println("Lado 2");
                        int tri2 = sc.nextInt();
                        System.out.println("Lado 3");
                        int tri3 = sc.nextInt();
                        if (tri1 + tri2 > tri3) {
                            System.out.printf("SI");
                        } else if (tri1 + tri3 > tri2) {
                            System.out.printf("SI");
                        } else if (tri2 + tri3 > tri1) {
                            System.out.printf("SI");
                        } else {
                            System.out.printf("NO");
                        }
                        break;
                    case "6":
                        System.out.println("Introduce el numero de tazas de mantequilla de cacahuete");
                        int taza = sc.nextInt();
                        System.out.println("¿Es fin de semana? true / false");
                        boolean finde = sc.nextBoolean();
                        if (taza >= 10 && taza <= 20 && finde == false) {
                            System.out.printf("True");
                        } else if (taza >= 15 && taza <= 25 && finde == true) {
                            System.out.printf("True");
                        } else {
                            System.out.printf("False");
                        }
                        break;
                    case "7":
                        System.out.println("Introduce tu nota numérica (entre 0 a 10)");
                        float nota = sc.nextFloat();
                        if (nota >= 0 && nota < 3) {
                            System.out.printf("MD");
                        } else if (nota > 3 && nota < 5) {
                            System.out.printf("INS");
                        } else if (nota >= 5 && nota < 6) {
                            System.out.printf("SUF");
                        } else if (nota >= 6 && nota < 7) {
                            System.out.printf("B");
                        } else if (nota >= 7 && nota < 9) {
                            System.out.printf("N");
                        } else if (nota >= 9 && nota <= 10) {
                            System.out.printf("SB");
                        } else {
                            System.out.printf("Introduce un numero entre 0 y 10");
                        }
                        break;
                    default:
                        System.out.println("El Ejercicio " + numif + " no forma parte de los ejercicios");
                        break;
                }
                break;
            case "2":
                System.out.println("Introduce el número de ejercicio que quieres que resuelva: ");
                System.out.println("2. Lenguaje programación");
                System.out.println("3. Número correspondiente");
                System.out.println("4. Harry Potter");
                System.out.println("5. Direcciones");
                String numswitch = sc.next();
                switch (numswitch) {
                    case "2":
                        System.out.println("¿Qué lenguaje de programación estás estudiando?");
                        System.out.println("a. Java");
                        System.out.println("b. Kotlin");
                        System.out.println("c. Scala");
                        System.out.println("d. Python");
                        String respuesta1 = sc.next();
                        switch (respuesta1) {
                            case "a":
                                System.out.println("¡Sí!");
                                break;
                            case "b":
                                System.out.println("¡No!");
                                break;
                            case "c":
                                System.out.println("¡No!");
                                break;
                            case "d":
                                System.out.println("¡No!");
                                break;
                            default:
                                System.out.println("Lenguaje desconocido");
                                break;
                        }
                        break;
                    case "3":
                        System.out.println("Introduce un número en letra (1-9): ");
                        String respuesta2 = sc.next();
                        switch (respuesta2) {
                            case "uno":
                                System.out.println("1");
                                break;
                            case "dos":
                                System.out.println("2");
                                break;
                            case "tres":
                                System.out.println("3");
                                break;
                            case "cuatro":
                                System.out.println("4");
                                break;
                            case "cinco":
                                System.out.println("5");
                                break;
                            case "seis":
                                System.out.println("6");
                                break;
                            case "siete":
                                System.out.println("7");
                                break;
                            case "ocho":
                                System.out.println("8");
                                break;
                            case "nueve":
                                System.out.println("9");
                                break;
                            default:
                                System.out.println("Solo puedes meter numeros del 1 al 9 ambos incluidos");
                        }
                        break;
                    case "4":
                        System.out.println("¿De qué casa quieres saber el significado?");
                        System.out.println("Gryffindor");
                        System.out.println("Hufflepuff");
                        System.out.println("Slytherin");
                        System.out.println("Ravenclaw");
                        String respuesta3 = sc.next();
                        switch (respuesta3) {
                            case "Gryffindor":
                                System.out.println("Valentía");
                                break;
                            case "Hufflepuff":
                                System.out.println("Lealtad");
                                break;
                            case "Slytherin":
                                System.out.println("Astucia");
                                break;
                            case "Ravenclaw":
                                System.out.println("Intelecto");
                                break;
                            default:
                                System.out.println(respuesta3 + " no es una casa válida");
                                break;
                        }
                        break;
                    case "5":
                        System.out.println("Introduce una dirección: ");
                        System.out.println("1. Arriba");
                        System.out.println("2. Abajo");
                        System.out.println("3. Izquierda");
                        System.out.println("4. Derecha");
                        System.out.println("0. No mover");
                        int respuesta4 = sc.nextInt();
                        switch (respuesta4) {
                            case 1:
                                System.out.println("Subir");
                                break;
                            case 2:
                                System.out.println("Bajar");
                                break;
                            case 3:
                                System.out.println("Mover a la izquierda");
                                break;
                            case 4:
                                System.out.println("Mover a la derecha");
                                break;
                            case 0:
                                System.out.println("No mover");
                                break;
                            default:
                                System.out.println("¡Error!");
                                break;
                        }
                      break;
                    default:
                        System.out.println("El ejercicio " + numswitch + " no forma parte de la práctica");
                        break;
                }

        }
    }
}


