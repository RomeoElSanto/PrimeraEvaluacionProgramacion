package EjerciciosFicheros;

import java.io.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\EmiTheCapo\\Downloads\\EjerciciosFicheros\\Restaurantes.csv";
        File f = new File(ruta);
        try(FileReader fr = new FileReader(f)){
            try(BufferedReader br = new BufferedReader(fr)){
                String linea = br.readLine();
                System.out.println(linea);
                String [] registro;
                while(linea != null) {
                    registro = linea.split(",");
                   /* for (int i = 0; i < registro.length ; i++) {
                        System.out.println(registro[i] + " - ");
                    }
                    System.out.println();*/
                    if (registro[4].startsWith("6")) {
                        System.out.println(linea);
                    }
                    linea = br.readLine();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.printf("Excepcion ruta no encontrada" + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.printf("Excepcion E/S" + e.getMessage());
            e.printStackTrace();
        }
    }
}
