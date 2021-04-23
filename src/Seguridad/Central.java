package Seguridad;

import java.util.ArrayList;

public class Central {
    String ciudad;
    ArrayList<Edificio> edificios;

    public Central(String ciudad) {
        this.ciudad = ciudad;
        ArrayList<Edificio> edificios = new ArrayList<>();
        this.edificios = edificios;
    }

    @Override
    public String toString() {
        return "Central{" +
                "ciudad='" + ciudad + '\'' +
                ", edificios=" + edificios +
                '}';
    }

    void añadirEdificio(Edificio edificio){
        edificios.add(edificio);
    }

    void quitarEdificio(Edificio edificio){
        edificios.remove(edificio);
    }

    void mostrarEdificios(){
        System.out.println("Edificios de la central " + ciudad + ":");
        for (int i = 0; i < edificios.size(); i++) {
            System.out.println((i+1) + "- " + edificios.get(i).dirección + " - " + edificios.get(i).códigoPostal);
        }
    }
}
