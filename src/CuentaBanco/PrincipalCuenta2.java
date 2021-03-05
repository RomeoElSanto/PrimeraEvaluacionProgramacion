package CuentaBanco;

public class PrincipalCuenta2 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Z.Zamorano", 1);
        System.out.println("El usuario " + c1.getTitular() + " cuyo número de cuenta es "
                + c1.getNúmero() + " tiene un saldo de " + c1.getSaldo());
        Cuenta c2 = new Cuenta("Y.Yubero", 2, 1000);
        System.out.println("El usuario " + c2.getTitular() + " cuyo número de cuenta es "
                + c2.getNúmero() + " tiene un saldo de " + c2.getSaldo());
        c1.cajero();
    }
}
