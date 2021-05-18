package EjerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String ruta  = "C:\\Users\\EmiTheCapo\\Downloads\\EjerciciosFicheros\\lineas.txt";
        File f = new File(ruta);
        String linea = null;
        int longMax = 0;
        int longMin = 999;
        int longTemp = 0;
        String lineaMax = null;
        String lineaMin = null;
        try (Scanner lector = new Scanner(f)) {
            linea = lector.nextLine();
            longMax = linea.length();
            longMin = linea.length();
            while (lector.hasNextLine()) {
                linea = lector.nextLine();
                longTemp = linea.length();
                if (longTemp > longMax) {
                    longMax = longTemp;
                    lineaMax = linea;
                }else if (longTemp < longMin) {
                    longMin = longTemp;
                    lineaMin = linea;
                }
            }
            System.out.println("Linea mas larga: " + lineaMax + " (" + longMax + " caracteres).");
            System.out.println("Linea mas corta: " + lineaMin + " (" + longMin + " caracteres).");
        } catch (FileNotFoundException e) {
            System.out.printf("Excepcion ruta incorrecta: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
