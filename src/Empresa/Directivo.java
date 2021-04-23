package empresa;
// clase Directivo, que hereda de Empleado.
public class Directivo extends Empleado{
    // Tiene el atributo categoría, que es un tipo enumerado cuyos valores obtendremos de la siguiente URL: https://economipedia.com/definiciones/directivo.html
    private Categoría categoría;

    // Su constructor recibe todos los atributos como parámetros
    public Directivo(String nombre, int edad, double sueldoBruto, Categoría categoría) {
        super(nombre, edad, sueldoBruto); //  new Empleado(nombre, edad, sueldoBruto)
        this.categoría = categoría;
    }

    // get y set

    public Categoría getCategoría() {
        return categoría;
    }

    public void setCategoría(Categoría categoría) {
        this.categoría = categoría;
    }


    /*  También sobreescribe el método mostrar con los valores de todos los atributos heredados más el atributo categoría.
    */

    @Override
    public String toString() {
        return "Directivo: " + nombre + ", " + edad + ", " + getSueldoBruto() + ", " + categoría;
    }

    @Override
    public void mostrar() {
        System.out.println("Llamada desde Directivo: ");
        System.out.println(toString());

    }
}
