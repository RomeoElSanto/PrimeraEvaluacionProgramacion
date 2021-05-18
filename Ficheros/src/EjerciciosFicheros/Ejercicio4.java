package EjerciciosFicheros;

import java.io.*;


/*
4. Partiendo del fichero de csv de ejemplo, crear un programa de
Java que cree una copia de ese fichero llamada
“Restaurants2.csv” que contenga los mismos datos excepto
aquellos correspondientes a los restaurantes cuyo código postal
empieza por 6.

 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String rutaOrigen = "C:\\Users\\EmiTheCapo\\Downloads\\EjerciciosFicheros\\Restaurantes.csv";
        File f1 = new File(rutaOrigen);

        String rutaDestino = "C:\\Users\\EmiTheCapo\\Downloads\\EjerciciosFicheros\\Restaurantes2.csv";
        File f2 = new File(rutaDestino);
        try(FileReader fr = new FileReader(f1)) {
            try(BufferedReader br = new BufferedReader(fr)){
                String linea = br.readLine();
                String[] registro;
                while(linea != null) {
                    registro  = linea.split(",");
                    if (!registro[4].startsWith("6")){
                        System.out.println(linea);
                        try (FileWriter fw = new FileWriter(f2, true)){
                            fw.write(linea + "\n");
                        }
                    }
                    linea = br.readLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.printf("Excepcion ruta incorrecta: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.printf("Excepcion E/S: " + e.getMessage());
            e.printStackTrace();
        }


    }
}
