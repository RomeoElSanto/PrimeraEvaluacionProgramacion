package Practica1;

import java.util.Scanner;

public class Ej6_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int mes;
        do{
            System.out.println("Numero de mes");
            mes = sc.nextInt();
        }while(mes < 1 || mes > 12);
        System.out.println("El mes " + mes + " tiene " + meses[mes -1]);
    }
}
