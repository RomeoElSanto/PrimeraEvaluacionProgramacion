package Seguridad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
        // SENSOR
        Sensor sensor1 = new Sensor(TipoAlerta.INCENDIO);
        System.out.println("Estado del sensor: " + sensor1.mostrarEstado());
        // activamos el sensor
        sensor1.activar();
        System.out.println("Estado del sensor: " + sensor1.mostrarEstado());
        // ubicamos el sensor
        sensor1.ubicar("Entrada");
        // ver dónde está ubicado
        System.out.println(sensor1.toString());
        System.out.println("Ubicación del sensor: " + sensor1.ubicación);
*/
        // ALARMA
        Alarma alarma1 = new Alarma(TipoAlerta.ROBO);
/*        System.out.println(alarma1.toString());
        alarma1.añadirSensor(TipoAlerta.ROBO);
        System.out.println(alarma1.toString());
        alarma1.añadirSensor(TipoAlerta.INCENDIO);
        System.out.println(alarma1.toString());
        alarma1.sonar(alarma1.sensores.get(0));

        //alarma1.sonar(sensor1);
        alarma1.sensores.get(0).activar();
        System.out.println(alarma1.sensores.get(0).mostrarEstado());
        alarma1.sonar(alarma1.sensores.get(0));
        alarma1.mostrarSensores();
        alarma1.quitarSensor(0);
        System.out.println("Después de quitar el sensor....");
        alarma1.mostrarSensores();
        alarma1.sensores.get(0).activar();
        System.out.println("Después de activarlo...");
        alarma1.mostrarSensores();
        System.out.println("Hacemos sonar la alarma");
        alarma1.sonar(alarma1.sensores.get(0));
*/
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Dirección del edificio a crear:");
        String d = sc.nextLine();
        System.out.println("Código Postal:");
        Integer cp = sc.nextInt();
        sc.nextLine(); // liberar el scanner
*/
        //Edificio edificio1 = new Edificio(d, cp);
        Edificio edificio1 = new Edificio("Alcalá, 33", 28017);
        Edificio edificio2 = new Edificio("Zurbano, 31", 28033);

        System.out.println(edificio1.toString());
        System.out.println(edificio2.toString());

        Alarma alarmaEdificio1 = edificio1.crearAlarma(TipoAlerta.INCENDIO);
        //String imprimir = alarma1.toString();
        edificio1.añadirAlarma(alarma1);
        //System.out.println(imprimir);
        edificio1.añadirAlarma(alarmaEdificio1);
        edificio1.añadirAlarma(alarma1);
        edificio1.añadirAlarma(edificio2.crearAlarma(TipoAlerta.INCENDIO));

        edificio1.mostrarAlarmas();



        //  CENTRAL
        Central central = new Central("Madrid");
        //Mostramos la central recién creada
        System.out.println(central.toString());
        // Añadimos edificios
        central.añadirEdificio(edificio1);
        central.añadirEdificio(edificio2);
        central.mostrarEdificios();

        // Quitamos el primer edificio
        central.quitarEdificio(edificio1);

        //Mostramos
        central.mostrarEdificios();


    }
}
