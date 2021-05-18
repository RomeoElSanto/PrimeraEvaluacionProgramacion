package EjerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
10. Escribir un programa Java para buscar una palabra o una
cadena en un fichero de texto. El programa pedirá que se
introduzca una palabra o un texto por teclado y realizará su búsqueda por el archivo. Se mostrará por pantalla el número de
línea y el contenido de la línea del fichero que contiene la
cadena buscada. Si la cadena buscada aparece en varias líneas se
mostrarán todas ellas. Si el fichero no contiene el texto
buscado se mostrará un mensaje indicándolo
 */
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
