import java.io.IOException;

public class main{
    public static void main(String[] args) throws IOException {
        Sucursal CajaBanco = new Sucursal("1210", "1444");
        Cuenta Cuenta1 = new Cuenta("Emilio", "ES0012101444320000000001");
        Cuenta Cuenta2 = new Cuenta("Alejandro", "ES0012101444320000000002");
        CajaBanco.ingresar(Cuenta1, 1000);
        CajaBanco.retirar(Cuenta1, 200);
        CajaBanco.retirar(Cuenta1, 100);
        CajaBanco.ingresar(Cuenta1, 1250);
        for (int i = 0; i < 10; i++) {
            CajaBanco.retirar(Cuenta1, 50);
        }
        CajaBanco.generarExtracto(Cuenta1);
        CajaBanco.bloquearCuenta(Cuenta1);
        CajaBanco.bloquearCuenta(Cuenta2);
    }
}
