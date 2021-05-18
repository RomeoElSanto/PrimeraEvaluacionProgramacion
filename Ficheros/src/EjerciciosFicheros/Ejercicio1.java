package EjerciciosFicheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce ruta");
        String ruta = sc.nextLine();
        File f = new File(ruta);
        if (f.exists()) {
            System.out.printf("Existe") ;
            if (f.isDirectory()) System.out.printf("Es un directorio");
            else System.out.printf("Es un fichero");

            System.out.printf("Nombre: " + f.getName());

            System.out.printf("Tamaño: " + f.length() + " B");

            System.out.printf("Permisos:");
            if (f.canRead()) System.out.printf("  *Lectura: si");
            else System.out.printf("    *Lectura: no");
            if (f.canWrite()) System.out.printf("  *Escritura: si");
            else System.out.printf("    *Escritura: no");

        }else {
            System.out.printf("No Existe");
        }
    }
}
