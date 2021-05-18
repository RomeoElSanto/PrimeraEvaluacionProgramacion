import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void crearCuenta(String titular,double saldo) throws IOException {
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
    public double retirar(Cuenta cuenta, double cantidad) {
        if (cuenta.isBloqueada() == false) {
            if (cantidad <= cuenta.getSaldo()) {
               cuenta.setSaldo(cuenta.getSaldo() - cantidad);
                System.out.println("Saldo resultante: " + cuenta.getSaldo());
                String ruta = "Ficheros\\..\\Banco\\" + entidad + "\\" + oficina + "\\" + cuenta.getIban().substring(14,24)+
                        "\\movimientos.txt";
                File f = new File(ruta);
                try (FileWriter fw = new FileWriter(f, true)){
                    fw.write("\n" + "-" + String.valueOf(cantidad));
                }catch (IOException e) {
                    System.out.println("Excepcion al añadir movimiento al fichero" + e.getMessage());
                }
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Cuenta bloqueada");
        }
        return cuenta.getSaldo();
    }
    public void generarExtracto(Cuenta cuenta) {
        String titular = cuenta.getTitular();
        String iban = cuenta.getIban();

        double [] movimientos = {1000, -550, 1300, -200, 400, 100, -60};
        double sumaIngresos = 0;
        double sumaReintegros = 0;
        /*
        for (int i = 0; i < movimientos.length ; i++) {
            if (movimientos[i] < 0 )
                sumaReintegros = sumaReintegros + movimientos[i];
            else
                sumaIngresos = sumaIngresos + movimientos[i];
        }
         */
        String ruta = "Ficheros\\..\\Banco\\" + entidad + "\\" + oficina + "\\" + cuenta.getIban().substring(14,24)+
                "\\movimientos.txt";
        File f = new File(ruta);
        try(Scanner sc = new Scanner(f)) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                if (linea.startsWith("-")){
                    sumaReintegros = sumaReintegros + Double.parseDouble(linea);
                } else {
                    sumaIngresos = sumaIngresos + Double.parseDouble(linea);
                }
            }
           ruta =  "Ficheros\\..\\Banco\\" + entidad + "\\" + oficina + "\\" + cuenta.getIban().substring(14,24)+
                   "\\extracto.txt";
            File fichero = new File(ruta);
            boolean creado = fichero.createNewFile();
            if (creado) System.out.printf("Se ha generado el fichero extracto.txt");

            try(FileWriter fw = new FileWriter(fichero, false)){
                fw.write("Titular: " + titular + "\n");
                fw.write("IBAN: " + iban + "\n");
                fw.write("Ingresos: " + sumaIngresos + "\n");
                fw.write("Reintegros: " + sumaReintegros + "\n");
                fw.write("Saldo: " + cuenta.getSaldo());
            }

        } catch (FileNotFoundException e) {
            System.out.printf("Fichero no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.printf("Excepcion de E/S" + e.getMessage());;
        }
    }
    public void bloquearCuenta(Cuenta cuenta){
        if(!cuenta.isBloqueada()){
            cuenta.setBloqueada(true);
        }
        String ruta = "Ficheros\\..\\Banco\\" + entidad + "\\" + oficina + "\\bloqueadas";
        File cBloqueadas = new File(ruta);
        boolean creada = cBloqueadas.mkdirs();
        if (creada) System.out.printf("Se ha creado la carpeta bloqueadas de la sucursal " + oficina);
        String rutaOrigen = "Ficheros\\..\\Banco\\" + entidad + "\\" + oficina + "\\" + cuenta.getIban().substring(14,24);
        String rutaDestino = "Ficheros\\..\\Banco\\" + entidad + "\\" + oficina + "\\bloqueadas" + cuenta.getIban().substring(14,24);
        File cCuenta = new File(rutaOrigen);
        boolean movida = cCuenta.renameTo(new File(rutaDestino));
        if (movida) System.out.printf("Se ha movido la carpeta");{

        }
    }
    public void eliminarCuenta(Cuenta cuenta){
        if (!cuenta.isBloqueada())
            bloquearCuenta(cuenta);
        String ruta = "Ficheros\\..\\Banco\\" + entidad + "\\" + oficina + "\\bloqueadas" + cuenta.getIban().substring(14,24);
        File f = new File(ruta);
        boolean borrada = f.delete();
        if (borrada == false) borrarRecursivamente(f);
        String cEliminadas = "Ficheros\\..\\Banco\\" + entidad + "\\" + oficina + "\\cuentas_eliminadas.txt";
        File fi = new File(cEliminadas);
        try {
            boolean creado = f.createNewFile();
            if (creado) System.out.printf("Se ha creado el fichero cuentas eliminadas");
            try (FileWriter fw = new FileWriter(fi, true)){
                fw.write(cuenta.getIban() + "\n");
            }
        } catch (IOException e) {
            System.out.printf("Excepcion E/S: " + e.getMessage());;
        }
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getIban().equals(cuenta.getIban())){
                cuentas.remove(i);
            }
        }
    }
    public static void borrarRecursivamente(File dir) {
        File[] elementos = dir.listFiles();
        for(File unElemento : elementos) {
            if (unElemento.isDirectory()){
                borrarRecursivamente(unElemento);
            }else{
                unElemento.delete();
            }
        }
        boolean borrada = dir.delete();
        if (borrada) System.out.printf("Borrada ");
    }
}
