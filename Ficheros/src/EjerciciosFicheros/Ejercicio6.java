package EjerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\EmiTheCapo\\Downloads\\EjerciciosFicheros\\dataset_91007.txt";
        File f = new File(ruta);
        try(Scanner lector = new Scanner(f)){
            int max = lector.nextInt();
           // System.out.println(max);
            int temp = 0;
            while(lector.hasNextInt()) {
                temp = lector.nextInt();
                if (temp > max) {
                    max = temp;
                }
            }
            System.out.printf("El numero mayor es: " + max);
        } catch (FileNotFoundException e) {
            System.out.printf("Ruta incorrecta: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
