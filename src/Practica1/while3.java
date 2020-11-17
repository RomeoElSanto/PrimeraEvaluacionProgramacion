package Practica1;
import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("introduce un numero (0 para terminar)");
        int num = sc.nextInt();
        while (num != 0) {
            System.out.println("introduce un numero (0 para terminar)");
            num = sc.nextInt();
            if (num > cont) {

            }
        }
        System.out.printf("Has introducido " + cont + " numeros");
    }
}
