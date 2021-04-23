import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Sucursal {
    String entidad;
    String oficina;
    ArrayList<Cuenta> cuentas = new ArrayList<>();

    public Sucursal(String entidad, String oficina) {
        this.entidad = entidad;
        this.oficina = oficina;
        String rutaCarpeta = "Fichero\\..\\Banco\\" + entidad + "\\" + oficina;
        File c = new File(rutaCarpeta);
        boolean carpeta = c.mkdirs();
    }
    public String generarCC(){
        int c1 = (int) (Math.random()*10);
        int c2 = (int) (Math.random()*10);
        String cc = String.valueOf(c1) + String.valueOf(c2);
        return cc;
    }
    public String generarNumeroCuenta() {
        String numCuenta = "";
        for (int i = 0; i < 10 ; i++) {
            int num = (int)(Math.random()*10);
            numCuenta = numCuenta + String.valueOf(num);
        }
        return numCuenta;
    }

    public String generarIBAN(){
        String iban = "ES" + generarCC() + this.entidad + this.oficina +
                generarCC() + generarNumeroCuenta();
        return iban;
    }

    public void crearCuenta(String titular,double saldo){
        String iban = generarIBAN();
        Cuenta c = new Cuenta(titular,iban, saldo );
        cuentas.add(c);

    }

    public double ingresar(Cuenta cuenta, double cantidad) {
        if (cuenta.isBloqueada() == false) {
           cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        } else {
            System.out.println("Cuenta bloqueada");
        }
        String ruta = "Ficheros\\..\\Banco\\" + entidad + "\\" + oficina + "\\" + cuenta.getIban().substring(14,24)+
                "\\movimientos.txt";
        File f = new File(ruta);
        try (FileWriter fw = new FileWriter(f, true)){
            fw.write("\n" + String.valueOf(cantidad));
        }catch (IOException e) {
            System.out.println("Excepcion al añadir movimiento al fichero" + e.getMessage());
        }

        return cuenta.getSaldo();
    }
}
