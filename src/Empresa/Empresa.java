package empresa;
import java.util.ArrayList;

public class Empresa {
    /* clase Empresa; tiene el atributo nombre y además empleados y clientes,
    que representaremos con sendos ArrayList que añadiremos también como atributos.
    Su constructor recibe todos los atributos como parámetros.
    Añade un método mostrar(), que mostrará el resultado del método toString() */
    private String nombre;
    //y además empleados y clientes,
    //que representaremos con sendos ArrayList que añadiremos también como atributos.
    private  ArrayList<Empleado> empleados = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    //Su constructor recibe todos los atributos como parámetros.

    public Empresa(String nombre, ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    // get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    //@Override
    /*public String toString() {
        return E;
    } */

    public void mostrar() {
        System.out.println(toString());
    }
}
