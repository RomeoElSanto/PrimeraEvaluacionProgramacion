package Practica1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de multiplos de 3 ");
        int n = sc.nextInt();
        int i = 3;
        int cont = 0;
        int suma = 0;
        while (cont < n) {
            if (i % 3==0 && i % 2==0) {
                cont++;
                suma = suma + i;
            }
            i++;
        }
        System.out.println("La suma de los " + n + " primeros multiplos pares de 3 es: " + suma);
    }
}
