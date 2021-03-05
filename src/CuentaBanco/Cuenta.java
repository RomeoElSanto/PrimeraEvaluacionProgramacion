package CuentaBanco;

import java.util.Scanner;

public class Cuenta {
    private String titular;
    private long número;
    private long saldo;
    private boolean bloqueada;
    public Cuenta(String titular, long número) {
        this.titular = titular;
        this.número = número;
        // this.bloqueada = false;
        // no es necesario porque el valor por defecto de un boolean es false
    }
    public Cuenta(String titular, long número, long saldo) {
        this.titular = titular;
        this.número = número;
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    /* No se crea un setter para el titular
    porque no se puede cambiar el titular de una cuenta */
    public long getNúmero() {
        return número;
    }
    /* No se crea un setter para el número
    orque no se puede cambiar el número de una cuenta */
    public long getSaldo() {
        return saldo;
    }
    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    public boolean isBloqueada() {
        return bloqueada;
    }
    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }
    public long ingresar(long cantidad) {
        if (bloqueada == false) {
            this.saldo = this.saldo + cantidad;
            System.out.println("Saldo: " + this.saldo);
        } else {
            System.out.println("Operación rechazada: esta cuenta está bloqueada");
        }
        return saldo;
    }
    public long retirar(long cantidad) {
        if (bloqueada == false) {
            if (cantidad < saldo) {
                this.saldo = this.saldo - cantidad;
                System.out.println("Saldo: " + this.saldo);
            } else {
                System.out.println("Operación rechazada: no dispone de esa cantidad");
            }
        } else {
            System.out.println("Operación rechazada: la cuenta está bloqueada");
        }
        return saldo;
    }
    public void imprimir() {
        System.out.println("El titular " + this.titular + " con número de cuenta " + this.número + " tiene un saldo de " + this.saldo + " euros.");
    }
    public void cajero () {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        do {
            System.out.println("¿De qué cuenta quieres hacer las operaciones?: ");
            System.out.println("--Operaciones--");
            System.out.println("1. Ingresar: ");
            System.out.println("2. Retirar: ");
            System.out.println("3. Consultar: ");
            System.out.println("4. Salir: ");
            int opción = sc.nextInt();
            switch (opción) {
                case 1:
                    System.out.println("¿Cúanto dinero quieres ingresar?: ");
                    long cantidadING = sc.nextLong();
                    ingresar(cantidadING);
                    System.out.println("¿Quiéres realizar otra operación? (true/false)");
                    seguir = sc.nextBoolean();
                    break;
                case 2:
                    System.out.println("Cuánto dinero quieres retirar?: ");
                    long cantidadRET = sc.nextLong();
                    retirar(cantidadRET);
                    System.out.println("¿Quiéres realizar otra operación? (true/false)");
                    seguir = sc.nextBoolean();
                    break;
                case 3:
                    System.out.println("Títular: " + getTitular() + ", Nº Cuenta: " + getNúmero() + ", saldo: " + getSaldo() + ", bloqueada: " + isBloqueada());
                    System.out.println("¿Quiéres realizar otra operación? (true/false)");
                    seguir = sc.nextBoolean();
                    break;
                case 4:
                    seguir = false;
                    break;
            }
        } while (seguir);
    }
}
