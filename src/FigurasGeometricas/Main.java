package FigurasGeometricas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto (5, 9);
        Punto p2 = new Punto(13 , 9);
        Punto p3 = new Punto(13, 2);
        Punto p4 = new Punto(5, 2);
        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(p1);
        puntos.add(p2);
        puntos.add(p3);
        puntos.add(p4);

        for (int i = 0; i < puntos.size(); i++) {
            System.out.println(puntos.get(i).toString());
        }

        System.out.println("Creamos las cuatro lineas : ");
        Linea l1 = new Linea(p1, p2);
        Linea l2 = new Linea(p2, p3);
        Linea l3 = new Linea(p3, p4);
        Linea l4 = new Linea(p4, p1);

        ArrayList<Linea> lineas = new ArrayList<>();
        lineas.add(l1);
        lineas.add(l2);
        lineas.add(l3);
        lineas.add(l4);
        for (int i = 0; i < lineas.size(); i++) {
            System.out.println(lineas.get(i).toString());
            lineas.get(i).dibujarLinea();
        }
    }
}
