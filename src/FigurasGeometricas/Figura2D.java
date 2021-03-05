package FigurasGeometricas;

import java.util.ArrayList;

abstract class Figura2D {
    int lados;
    final int DIMENSIONES = 2;

    public Figura2D(int lados) {
        this.lados = lados;
    }

    abstract ArrayList<Linea> crearLineas();

    abstract double calcularPerimetro();

    abstract double calcularArea();
}
