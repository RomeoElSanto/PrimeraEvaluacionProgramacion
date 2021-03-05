package Enumerados;
import java.util.Scanner;

public class UsuariosPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Introduce el email: ");
        String correo = sc.nextLine();
        System.out.println("Introduce password: ");
        String contraseña = sc.nextLine();

        Usuarios usuario1 = new Usuarios(usuario, correo, contraseña);
//Con metodo get
        System.out.println("Datos del usuario creado: \n username: " + usuario1.getUsername() + "\n email: " + usuario1.getEmail()
        + "\n password: " + usuario1.getPassword());
//Con el metodo toString
        System.out.println("Con el metodo toString()");
        System.out.println(usuario1.toString());

        usuario1.mensajeEstado();

        usuario1.setEstado(Usuarios.Estado.ACTIVO);
        System.out.println("Cambiamos el estado y ... ");
        usuario1.mensajeEstado();
    }

}
