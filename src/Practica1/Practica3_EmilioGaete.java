package Practica1;

import java.util.Scanner;

public class Practica3_EmilioGaete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sobre que tipo de estructura quieres resolver ejercicios: ");
        System.out.println("1: if");
        System.out.println("2: switch");
        String num1 = sc.next();
        switch (num1) { // Creamos un primer menú switch para dividir las dos opciones principales, if y switch.
            case "1": // En la opción de if colocamos un segundo menú con todos los ejercicios disponibles para escoger.
                System.out.println("Introduce el numero de ejercicio que quieres que resulva: ");
                System.out.println("1: Par Impar");
                System.out.println("2: Sueldo Anual");
                System.out.println("5: Triángulos");
                System.out.println("6: Fiesta de Marmotas");
                System.out.println("7: Calificación");
                String numif = sc.next();
                switch (numif) { // Dentro del switch principal creamos un segundo para las opciones del metodo if, cada numero correspondiendo a un ejercicio de la lista.
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
                        int a = sc.nextInt();
                        System.out.println("Lado 2");
                        int b = sc.nextInt();
                        System.out.println("Lado 3");
                        int c = sc.nextInt();
                        if ((a + b > c) && (a + c > b) && (b + c > a)) {
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
                    default: // Al final del switch para el metodo if colocamos un mensaje de alerta por si se introduce un numero que no exista en la lista de ejercicios
                        System.out.println("El Ejercicio " + numif + " no forma parte de los ejercicios");
                        break;
                }
                break;
            case "2": // Segundo caso de nuestro switch principal para los ejercicios del segundo metodo.
                System.out.println("Introduce el número de ejercicio que quieres que resuelva: ");
                System.out.println("2. Lenguaje programación");
                System.out.println("3. Número correspondiente");
                System.out.println("4. Harry Potter");
                System.out.println("5. Direcciones");
                String numswitch = sc.next();
                switch (numswitch) { // Abrimos un segundo switch anidado en este caso dentro de la segunda opcion principal para desplegar el menu con los ejercicios de la parte switch
                    case "2":
                        System.out.println("¿Qué lenguaje de programación estás estudiando?");
                        System.out.println("a. Java");
                        System.out.println("b. Kotlin");
                        System.out.println("c. Scala");
                        System.out.println("d. Python");
                        String res1 = sc.next();
                        switch (res1) {
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
                        String res2 = sc.next();
                        switch (res2) {
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
                        String res3 = sc.next();
                        switch (res3) {
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
                                System.out.println(res3 + " no es una casa válida");
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
                        int res4 = sc.nextInt();
                        switch (res4) {
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
                    default: // Al final del segundo switch anidado ponemos el mismo mensaje de error por si se introduce un numero que no pertenece a la lista de ejercicios
                        System.out.println("El ejercicio " + numswitch + " no forma parte de la práctica");
                        break;
                }
            default:// Mensaje de error en el switch principal por si no introducimos una de la dos opciones, en este caso solo 1 o 2.
                System.out.printf("Opciones solo 1 o 2");
                break;
        }

    }
}


