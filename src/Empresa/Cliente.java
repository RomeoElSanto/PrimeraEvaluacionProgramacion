package empresa;

/* clase Cliente,
que hereda también de Persona y
tiene el atributo propio String telefonoDeContacto.
De esta clase no hereda ninguna otra. También sobreescribe el método mostrar de la misma forma que la clase anterior. Su constructor recibe todos los atributos como parámetros*/

public class Cliente extends Persona{
    private String telefonoDeContacto;

    public Cliente(String nombre, int edad, String telefonoDeContacto) {
        super(nombre, edad); // invoco new Persona(nombre, edad);
        this.telefonoDeContacto = telefonoDeContacto;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }

    // También sobreescribe el método mostrar de la misma forma que la clase anterior.

    @Override
    public void mostrar() {
        //super.mostrar();
        System.out.println("Cliente: " + nombre + " (" + edad + ") " + "tel. " + telefonoDeContacto);
    }
}
