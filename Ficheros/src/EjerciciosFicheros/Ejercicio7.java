package EjerciciosFicheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio7 {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\EmiTheCapo\\Downloads\\EjerciciosFicheros\\cadenas.txt";
        String[] cadenas = metodo(ruta);
        for (String cad: cadenas){
            System.out.println(cad);
        }


    }
    public static String[] metodo(String ruta) {
        String[] cadenas = null;
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(ruta)));
            //System.out.println(contenido);
            cadenas = contenido.split("\\*");
        } catch (IOException e) {
            System.out.println("Excepcion de E/S " + e.getMessage());
            e.printStackTrace();
        }

        return cadenas;
    }
}
