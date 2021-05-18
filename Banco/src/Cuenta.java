import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Cuenta {
    private String titular;
    private String iban;
    private double saldo;
    private boolean bloqueada;
    static String raiz = "D:\\DAW\\PROG\\IntelliJ\\Banco\\";
    public Cuenta(String titular, String iban) throws IOException {
        this.titular = titular;
        this.iban = iban;
        this.saldo = 1;
        File carpeta = new File(raiz + iban.substring(4,8) + "\\" + iban.substring(8,12) + "\\" + iban.substring(14,24));
        boolean creada = carpeta.mkdirs();
        if (creada) System.out.println("La cuenta se creó exitosamente");
        else System.out.println("Hubo un error en la creación de la cuenta");
        String raizMovimientos = raiz + iban.substring(4,8) + "\\" + iban.substring(8,12) + "\\" + iban.substring(14,24);
        File movimientos = new File(raizMovimientos + "\\movimientos.txt");
        boolean creado = movimientos.createNewFile();
        if (creado) System.out.println("El fichero movimientos ha sido creado con Ã©xito");
        else System.out.println("Hubo un error en la creación de la cuenta");
        try (FileWriter FW = new FileWriter(movimientos, true)) {
            FW.write(String.valueOf(saldo) + "\n");
        } catch (IOException e) { System.out.println("Excepcion al añadir movimiento al fichero: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public Cuenta(String titular, String iban, double saldo) throws IOException {
        this.titular = titular;
        this.iban = iban;
        this.saldo = saldo;
        File carpeta = new File(raiz + iban.substring(4,8) + "\\" + iban.substring(8,12) + "\\" + iban.substring(14,24));
        boolean creada = carpeta.mkdirs();
        if (creada) System.out.println("La cuenta se creó exitosamente");
        else System.out.println("Hubo un error en la creación de la cuenta");
        String raizMovimientos = raiz + iban.substring(4,8) + "\\" + iban.substring(8,12) + "\\" + iban.substring(14,24);
        File movimientos = new File(raizMovimientos + "\\movimientos.txt");
        boolean creado = movimientos.createNewFile();
        if (creado) System.out.println("El fichero movimientos ha sido creado con exito");
        else System.out.println("Hubo un error en la creación de la cuenta");
    }
    public String getTitular() {
        return titular;
    }
    public String getIban() {
        return iban;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isBloqueada() {
        return bloqueada;
    }
    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }
    public void imprimir() {
        System.out.println("El titular " + this.titular + " con numero de cuenta " + this.iban + " tiene un saldo de " + this.saldo + " euros.");
    }
}



