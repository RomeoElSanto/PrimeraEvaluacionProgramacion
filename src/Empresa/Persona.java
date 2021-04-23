package empresa;

public class Persona {

    /* clase Persona,
    con los atributos nombre y edad
    (con los modificadores de acceso adecuados
    teniendo en cuenta que va a ser la clase padre de una jerarquía de clases),
    y un método mostrar() que muestre sus valores al ser invocado.
    Su constructor recibe todos los atributos como parámetros*/

    // atributos
    protected String nombre;
    protected int edad;

    // constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // getters y setters

    /*public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    } */

    // toString()
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }


    // métodos creados por el usuario
    // mostrar: muestra lo que devuelve el método toString
    public void mostrar() {
        System.out.println(this.toString());
    }

}
