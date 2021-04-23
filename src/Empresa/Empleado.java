package empresa;

/* clase Empleado,
que hereda de Persona y
tiene el atributo propio double sueldoBruto;
sobreescribe el método mostrar para que muestre los valores del atributo propio y
de los heredados;
 Su constructor recibe todos los atributos como parámetros*/


public class Empleado extends Persona{
    // atributos
    private double sueldoBruto;

    // constructor
    public Empleado(String nombre, int edad, double sueldoBruto) {
        super(nombre, edad); // invocamos al constructor de la superclase
        this.sueldoBruto = sueldoBruto;
    }

    // getters y setters
    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    // toString();

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldoBruto= " + sueldoBruto +
                " nombre= " + this.nombre +
                " edad= " + this.edad + '}';
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

    /*  tiene el método calcularSalarioNeto():double,
    que descuenta un 15% al salario bruto y devuelve el valor resultante.*/
    public double calcularSalarioNeto() {
        // sueldo neto = sueldo bruto - 15%
        return sueldoBruto * 0.85;
    }
}
