package Enumerados;
public class Usuarios {
    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String email;
    private String password;

    public Usuarios(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.estado = Estado.PENDIENTE;
    }
    enum Estado {PENDIENTE, ACTIVO, BLOQUEADO};
    Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void mensajeEstado() {
        switch (estado) {
            case ACTIVO:
                System.out.println("Todo ok , via libre:");
                break;
            case BLOQUEADO:
                System.out.println("Usuario bloqueado, algo habras hecho");
                break;
            case PENDIENTE:
                System.out.println("Tienes que esperar un poco");
                break;
            default:
                System.out.println("Estado desconocido. ");
        }
    }
}
