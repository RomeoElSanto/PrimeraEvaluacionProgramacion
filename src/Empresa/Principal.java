package empresa;

import java.util.ArrayList;

public class Principal {
    /* clase Principal;
    contiene el método main,
    crea tres empleados (uno de ellos es un directivo de la categoría que quieras)
    y dos clientes y
    con todos ellos crea una empresa.
     */


    public static void main(String[] args) {
        // Creamos una persona
        /* Persona persona1 = new Persona("Álvaro", 25);
        persona1.mostrar(); */

        // Creamos un empleado
        Empleado empleado1 = new Empleado("Eva", 42, 42_000);
        System.out.println("Mostrar empleado 1");
        empleado1.mostrar();
        System.out.println(empleado1.calcularSalarioNeto());
        // "El sueldo de Eva es de 42000 (bruto) y 35700 (neto)"
        System.out.println("El sueldo de " + empleado1.nombre + " es de " + empleado1.getSueldoBruto() + " (bruto) y " +
                empleado1.calcularSalarioNeto() + " (neto).");
        ;

        Empleado empleado2 = new Empleado("Bernardo", 20, 20_000);
        System.out.println("Mostrar empleado 2");
        empleado2.mostrar();
        System.out.println("Mostrar boss");
        Directivo boss = new Directivo("Damián", 27, 50000, Categoría.CEO);
        boss.mostrar();

        // Creamos un ArrayList de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(boss);

        System.out.println("Mis empleados:");
        System.out.println(empleados.toString());
        System.out.println(empleados.get(0).nombre);


        // Clientes
        Cliente cliente1 = new Cliente("Miguel", 30, "91631233445");
        Cliente cliente2 = new Cliente("Asun", 56, "666666666");
        ArrayList<Cliente> cliente = new ArrayList<>();
        cliente.add(cliente1);
        cliente.add(cliente2);

        // Creamos la empresa
        Empresa empresa = new Empresa("Progamadores Reunidos Geyper", empleados, cliente);
        empresa.mostrar();

    }
}
