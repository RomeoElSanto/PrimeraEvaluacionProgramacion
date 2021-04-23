package Seguridad;

import java.util.ArrayList;

public class Alarma {
    TipoAlerta tipo;
    ArrayList<Sensor> sensores;

    public Alarma(TipoAlerta tipo) {
        this.tipo = tipo;
        ArrayList<Sensor> sensores = new ArrayList<>();
        this.sensores = sensores;
    }

    @Override
    public String toString() {
        return "Alarma{" +
                "tipo=" + tipo +
                ", sensores=" + sensores +
                '}';
    }

    public void sonar(Sensor sensor){
        if (sensor.activado)
            if (sensor.tipo == TipoAlerta.INCENDIO)
                System.out.println("Avisar bomberos y policía");
            else
                System.out.println("Avisar policía");
    }

    public void añadirSensor(TipoAlerta tipo) {
        Sensor s = new Sensor(tipo);
        this.sensores.add(s);
    }

    public void quitarSensor(int posición) {
        sensores.remove(posición);
    }

    public void mostrarSensores() {
        System.out.println("Esta alarma está conectada con los siguientes sensores: ");
        for (int i = 0; i < sensores.size(); i++) {
            System.out.println((i+1) + " - " + sensores.get(i).tipo + " (" + sensores.get(i).mostrarEstado() + ")");
        }
    }
}
