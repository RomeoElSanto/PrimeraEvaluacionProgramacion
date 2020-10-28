package Practica1;

import java.util.Scanner;

public class calcular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int num2 = sc.nextInt();
        if ((num1 > 0) && (num2 > 0)) { //Hacemos una comprobación mediante un if para ver si los dos números introducidos son positivos, si es asi entraría al menú del Switch.
            System.out.println("Introduce la operación que quieres realizar: (+, -, *, /)");
            String oper = sc.next(); //Leemos el operador introducido por pantalla, lo definimos como string para que no haya problemas con los caracteres.
            switch (oper) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default://Si se introduce cualquier cosa que no sea uno de los cuatro caracteres el programa terminara con un mensaje de error en la operación.
                    System.out.println("Operación incorrecta");
                    break;
            }
        } else { // Si los numeros introducidos no son los dos positivos, no entra al Switch, nos saca un mensaje advirtiendonos y termina el programa.
            System.out.println("Los números no son positivos");
        }
    }
}
