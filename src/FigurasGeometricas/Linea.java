package FigurasGeometricas;

public class Linea {
    final int Dimensiones = 1;
    Punto puntoInicio;
    Punto puntoFinal;

    public Linea(Punto puntoInicio, Punto puntoFinal) {
        this.puntoInicio = puntoInicio;
        this.puntoFinal = puntoFinal;
    }
   public double calcularLongitud(){
        double longitud = Math.sqrt(Math.pow(puntoInicio.x - puntoFinal.x,2) + Math.pow(puntoInicio.y - puntoFinal.y,2));
        return longitud;

    }

    @Override
    public String toString() {
        return "Linea{" +
                "Dimensiones=" + Dimensiones +
                ", puntoInicio=" + puntoInicio +
                ", puntoFinal=" + puntoFinal +
                '}';
    }
    public void dibujarLinea(){
     int l = (int) Math.round(calcularLongitud());;
        for (int i = 0; i < l; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
