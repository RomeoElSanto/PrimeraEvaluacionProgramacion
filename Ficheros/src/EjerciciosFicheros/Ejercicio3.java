package EjerciciosFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
3. Partiendo del fichero de csv de ejemplo, crear un programa de
Java que permita al usuario añadir datos nuevos a ese fichero,
utilizando el mismo formato que los ya existentes.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\EmiTheCapo\\Downloads\\EjerciciosFicheros\\Restaurantes.csv";
        File f = new File(ruta);
        try (FileWriter fw = new FileWriter(f,true)){
            String linea = "O Mamma Mia, Condesa de Venadito s/n, Madrid, España, 28027";
            fw.write(linea);
        } catch (IOException e) {
            System.out.println("Excepcion de E/S; " + e.getMessage());
            e.printStackTrace();
        }
    }
}
