import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nÃºmero de personas para comer");
        int num = sc.nextInt();
        if (num <= 200) {
            System.out.println("El presupuesto del banquete es de " + num * 95 + " euros");
        } else if (num > 200 && num <= 300) {
            System.out.println("El presupuesto del banquete es de " + num * 85 + " euros");
        } else if ( num > 300){
            System.out.println("El presupuesto del banquete es de " + num * 75 + " euros");
        }
    }
}

