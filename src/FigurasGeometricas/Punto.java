package FigurasGeometricas;

public class Punto {
    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto: " +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
