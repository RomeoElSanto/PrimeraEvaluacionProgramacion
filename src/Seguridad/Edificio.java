package Seguridad;
import java.util.ArrayList;

public class Edificio {
    String dirección;
    Integer códigoPostal;
    ArrayList<Alarma> alarmas;

    public Edificio(String dirección, Integer códigoPostal) {
        this.dirección = dirección;
        this.códigoPostal = códigoPostal;
        ArrayList<Alarma> alarmas = new ArrayList<>();
        this.alarmas = alarmas;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "dirección='" + dirección + '\'' +
                ", códigoPostal=" + códigoPostal +
                ", alarmas=" + alarmas +
                '}';
    }

    public Alarma crearAlarma(TipoAlerta tipo){
        Alarma a = new Alarma(tipo);
        return a;
    }

    public void añadirAlarma(Alarma a) {
        alarmas.add(a);
    }

    public void quitarAlarma(int pos) {
        alarmas.remove(pos);
    }

    public void mostrarAlarmas() {
        System.out.println("Las alarmas conectadas a este edificio son: ");
        for (int i = 0; i < alarmas.size(); i++) {
            System.out.println((i+1) + "-" + alarmas.get(i).tipo);
        }
    }
}
