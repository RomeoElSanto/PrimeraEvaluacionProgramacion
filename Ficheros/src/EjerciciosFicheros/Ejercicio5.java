package EjerciciosFicheros;

import java.io.File;
import java.util.Scanner;


/*
5. Crear un programa en Java que borre el fichero cuya ruta ha sido
introducida por el usuario.

 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ruta del fichero a borrar: ");
        String ruta = sc.nextLine();

        File f = new File(ruta);
        if(f.exists()) {
            boolean borrado = f.delete();
            if (borrado) {
                System.out.printf("El fichero ha sido borrado: ");

            }else{
                System.out.printf("No se ha podido borrar el fichero: ");
            }
        }else {
            System.out.printf("No existe el fichero: ");

        }

    }
}
