package Enumerados;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class Enumerado {
    public enum Estaciones {PRIMAVERA, VERANO, OTOÑO, INVIERNO};
    public enum ParteDias {MAÑANA, MEDIODIA, TARDE, NOCHE};
    public enum Comidas {DESAYUNO, ALMUERZO, MERIENDA, CENA};

    public static void main(String[] args) {
        Estaciones estacionActual = Estaciones.INVIERNO;
        ParteDias momentoAhora = ParteDias.TARDE;
        Comidas comida = Comidas.MERIENDA;
        System.out.println("Estamos en  " + estacionActual);
        System.out.println("En turno de " + momentoAhora);
        System.out.println("Vamos a " + comida);
        Estaciones[] arrayEstaciones = Estaciones.values();
        System.out.println(Arrays.toString(arrayEstaciones));
    }
}
