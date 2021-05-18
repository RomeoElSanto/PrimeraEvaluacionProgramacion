package EjerciciosFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/*
8. Escribir un programa Java que lee texto por teclado y lo escribe
en un fichero de texto llamado datos.txt. El proceso consiste en
leer una línea de texto por teclado y escribirla en el fichero.
Este proceso se repite hasta que se introduce por teclado la
cadena FIN. La cadena FIN que indica el final de lectura no se
debe escribir en el fichero.

 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = "datos.txt";
        File f = new File(ruta);
        try {
            boolean creado = f.createNewFile();
            if (creado) {
                System.out.println("Fichero creado");
            }else if (f.exists()) {
                System.out.println("El fichero ya existe");

            }else {
                System.out.println("El fichero no se ha creado");
            }
        } catch (IOException e) {
            System.out.printf("Excepcion de E/S: " + e.getMessage());
            e.printStackTrace();
        }
        String linea = null;
        try(FileWriter fw = new FileWriter(f)) {
            boolean parar = false;
            while (!parar) {
                System.out.println("Introducir linea: ");
                linea= sc.nextLine();
                if(linea.toUpperCase().equals("FIN")){
                    parar = true;
                }else {
                    fw.write(linea + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Excepcion de E/S al escribir el fichero: " +  e.getMessage());
            e.printStackTrace();
        }
    }
}
