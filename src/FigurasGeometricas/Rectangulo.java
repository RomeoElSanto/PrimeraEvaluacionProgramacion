package FigurasGeometricas;

import java.util.ArrayList;

public class Rectangulo extends Figura2D{

    Punto p1;
    Punto p2;
    Punto p3;
    Punto p4;

    public Rectangulo(int lados, Punto p1, Punto p2, Punto p3, Punto p4) {
        super(lados);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    public Rectangulo() {
        super(4);
    }

    @Override
    ArrayList<Linea> crearLineas() {
        return null;
    }

    @Override
    double calcularPerimetro() {
        return 0;
    }

    @Override
    double calcularArea() {
        return 0;
    }
    void punto () {

    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", p4=" + p4 +
                '}';
    }
}
