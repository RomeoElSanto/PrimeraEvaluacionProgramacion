package Practica1;

import java.util.Scanner;

public class EJ_7NumerosReves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de 3 cifras");
        int num = sc.nextInt();
        if (num < 99) {
            System.out.printf("El numero tiene que ser de 3 digitos");
        } else if (num >= 999){
            System.out.printf("El numero solo puede ser de 3 digitos");
        }
        int centenas = num /100;
        int decenas = (num % 100) / 10;
        int unidades = (num % 100) % 10;
        int invertido = unidades * 100 + decenas * 10 + centenas;
        System.out.println(invertido);
    }
}
