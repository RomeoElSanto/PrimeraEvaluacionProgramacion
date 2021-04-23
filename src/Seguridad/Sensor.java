package Seguridad;

public class Sensor {
    TipoAlerta tipo;
    Boolean activado;
    String ubicación;

    public Sensor(TipoAlerta tipo) {
        this.tipo = tipo;
        this.activado = false;
    }

    public void activar() {
        activado = true;
    }

    public void desactivar() {
        activado = false;
    }

    public String mostrarEstado() {
        if (activado)
            return "activado";
        else
            return "desactivado";
    }

    public void ubicar(String ubicación) {
        this.ubicación = ubicación;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "tipo=" + tipo +
                ", activado=" + activado +
                ", ubicación='" + ubicación + '\'' +
                '}';
    }
}
