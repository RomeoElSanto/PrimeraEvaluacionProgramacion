public class Cuenta {

    private String titular;
    private String numero;
    private double saldo;
    private String iban;

    public Cuenta(String titular, double saldo, String iban) {
        this.titular = titular;
        this.saldo = saldo;
        this.iban = iban;
    }

    private boolean bloqueada;


    public Cuenta(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        //this.bloqueada = false;
    }

    public Cuenta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIban() {
        return iban;
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

    public double retirar(long cantidad) {
        if (bloqueada == false) {
            if (cantidad <= this.saldo) {
                this.saldo = this.saldo - cantidad;
                System.out.println("Saldo resultante: " + this.saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Cuenta bloqueada");
        }
        return this.saldo;
    }

    public void imprimir() {
        System.out.println("El titular " + this.titular + " con número de cuenta "
            + this.numero + " tiene un saldo de " + this.saldo + " euros.");
    }

}





