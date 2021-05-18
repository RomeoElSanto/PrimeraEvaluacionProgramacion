package EjerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto a buscar: ");
        String textoABuscar = sc.nextLine();

        String ruta = "C:\\Users\\EmiTheCapo\\Downloads\\EjerciciosFicheros\\lineas.txt";
        File f = new File(ruta);
        String linea;
        int contadorDeLineas = 1;
        try (Scanner lector = new Scanner(f)) {
            while (lector.hasNextLine()) {
                linea = lector.nextLine();
                if (linea.contains(textoABuscar)) {
                    System.out.println(contadorDeLineas + " - " + linea);
                }
                contadorDeLineas++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Excepcion ruta no encontrada: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
