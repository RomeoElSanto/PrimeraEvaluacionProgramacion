import org.sqlite.SQLiteDataSource;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Crear la base de datos App.db si no existe.
        Si existe, conectar con ella cada vez que se ejecute el programa.
        */
        // Conectar con la BD
        String url = "jdbc:sqlite:D:\\sqlite\\App.db";
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);
                /*
        La base de datos contiene una única tabla Usuarios, con los
campos
    Id (numérico, clave primaria;
    Username, Email, Password y Estado (posibles valores: ACTIVO, PENDIENTE, BLOQUEADO),
     todos ellos de texto y máximo 100 caracteres.
         */
        String crearTabla = "CREATE TABLE IF NOT EXISTS Usuarios (Id INT PRIMARY KEY NOT NULL, Username NVARCHAR(100) NOT NULL, Email NVARCHAR(100) NOT NULL, Password NVARCHAR(100) NOT NULL, Estado NVARCHAR(100) NOT NULL);";

        //  try conexión
        try (Connection con = dataSource.getConnection();) {
            // Creamos la tabla si no existe
            try (Statement st = con.createStatement()) {
                st.executeUpdate(crearTabla);
            }
            // dentro, todas las llamadas a los métodos estáticos
            //System.out.println("LLamada al método añadirRegistro");
            //añadirRegistro(con);
            //System.out.println("Llamada al método cambIarEstado");
            //cambiarEstado(con, "anita", "ACTIVO");

            // Vamos a mostrar datos

            // Hacemos primero la consulta
            // muestra el total de registros

            //String consulta = "SELECT * FROM Usuarios;";
            try (Statement st = con.createStatement()){
                ResultSet rs = st.executeQuery("SELECT * FROM Usuarios;");
                mostrarDatos(rs);
                exportarAFichero(rs);
            }

            System.out.println("Último id: " + obtenerÚltimoId(con));

            // cargar fichero
            cargarFichero(con, "D:\\sqlite\\Usuarios.csv");

            consultarUsuario(con);

            // catch SQL Exception
        } catch (SQLException throwables) {
            System.out.println("Excepción SQL: " + throwables.getMessage());
            throwables.printStackTrace();
        }
    }
    // Aquí los métodos estáticos

    /*
    void añadirRegistro(Connection con): pide por teclado los datos
necesarios para rellenar un registro de App.db, y los inserta en
la base de datos. Comprueba su funcionamiento añadiendo tres
usuarios desde el método main. Una vez hayas implementado, más
adelante, el método obtenerÚltimoId(Statement st), implementa su
utilización en este método para generar el Id de usuario
automáticamente. Utilizar PreparedStatement
     */
    public static void añadirRegistro(Connection con) {
        // Pedimos los datos por teclado
        System.out.println("Id: ");
        int id = sc.nextInt();
        sc.nextLine(); // para "limpiar" el scanner
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        System.out.println("Estado: ");
        String estado = sc.nextLine();

        // Con esto hacemos el insert
        String insert = "INSERT INTO Usuarios(Id, Username, Email, Password, Estado) VALUES ('" + id + "', '" + username + "', '" + email + "', '" + password + "', '" + estado + "');";
        try (Statement st = con.createStatement()) {
            int num = st.executeUpdate(insert);
            System.out.println("Se han insertado " + num + " registros.");
        } catch (SQLException throwables) {
            System.out.println("Excepción SQL: " + throwables.getMessage());
            throwables.printStackTrace();
        }

    }

    /*
        void cambiarEstado(Connection con, String username, String
                estado): actualiza el registro correspondiente al username con
        el estado que se recibe por parámetro. Comprueba su
        funcionamiento cambiando el estado de los usuarios añadidos al
        comprobar el método anterior. Utiliza Statement
    }
     */
    public static void cambiarEstado(Connection con, String username, String estado) {
        String actualizar = "UPDATE Usuarios SET Estado = '" + estado + "' WHERE Username ='" + username + "';";
        try (Statement st = con.createStatement()) {
            int num = st.executeUpdate(actualizar);
            System.out.println("Se han actualizado " + num + " registros.");
        } catch (SQLException throwables) {
            System.out.println("Excepción SQL: " + throwables.getMessage());
            throwables.printStackTrace();
        }
    }

    /*
    void mostrarDatos(ResultSet rs): muestra el total de registros
    que contiene el ResultSet. Comprueba su funcionamiento mostrando
    los datos que hay contenidos en la tabla Usuarios. (Para ello
    deberás hacer la consulta desde el método main)
     */
    public static void mostrarDatos(ResultSet rs) {
        /*Id (numérico, clave primaria;
        Username, Email, Password y Estado (posibles valores: ACTIVO, PENDIENTE, BLOQUEADO),
        */
        try {

            while(rs.next()) {
                System.out.println(rs.getInt(1) + " -  " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
            }
        } catch (SQLException throwables) {
            System.out.println("Excepción SQL en el ResultSet " + throwables.getMessage());
            throwables.printStackTrace();
        }

    }



/*
void exportarAFichero(ResultSet rs): crea un fichero que
contiene los datos del ResultSet pasado como parámetro.
Comprueba su funcionamiento aprovechando la consulta que
realizaste para probar el método anterior. El fichero puede ser
binario o de texto.
 */
public static void exportarAFichero(ResultSet rs) {
    String ruta = "exportado.txt";
    File f = new File(ruta);

    try (FileWriter fw = new FileWriter(f, true)) {
    try {
        while (rs.next()){
            fw.write(rs.getInt("Id") + ",");
            fw.write(rs.getString("Username") + ",");
            fw.write(rs.getString("Email") + ",");
            fw.write(rs.getString("Password") + ",");
            fw.write(rs.getString("Estado" ) + "\n");

        }
    } catch (SQLException throwables) {
        System.out.println("Excepcion en el Resulset al exportar al fichero: " + throwables.getMessage());
        throwables.printStackTrace();
    }

} catch (IOException e) {
        System.out.println("Excacapcion E/S : " + e.getMessage());
        e.printStackTrace();
    }

    }
/*
ResultSet consultarUsuarios(Connection con): presenta un menú
con cuatro opciones, según se quiera mostrar a los usuarios
Activos, Pendientes, Bloqueados o a Todos los usuarios. A
continuación hace la consulta correspondiente y, antes de
devolver el ResultSet, se lo pasa al método
mostrarDatos(ResultSet rs) y pregunta si se desea exportar los
datos a un fichero. Si la respuesta es afirmativa, llama al
método exportarAFichero(ResultSet rs). Comprueba su
funcionamiento.
 */
    public static ResultSet consultarUsuario(Connection con) {
        ResultSet rs = null;

        int opcion = 0;
        do {
            System.out.println("¿Que usuarios quieres consultar? \n1. Activos\n2. Pendientes \n3. Bloqueados\n4. Todos");
            opcion = sc.nextInt();
            sc.nextLine(); //Para limpiar el escaner.
        } while (opcion < 1 || opcion > 4);


        String consulta = null;
        switch (opcion){
            case 1: consulta = "SELECT * FROM Usuarios WHERE Estado = 'ACTIVO';";
            break;
            case 2: consulta = "SELECT * FROM Usuarios WHERE Estado = 'PENDIENTE';";
            break;
            case 3: consulta = "SELECT * FROM Usuarios WHERE Estado = 'BLOQUEADO';";
            break;
            case 4: consulta = "SELECT * FROM Usuarios;";
        }

        try (Statement st = con.createStatement()){
             rs = st.executeQuery(consulta);
             while (rs.next()) {
                 System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
             }
            System.out.println("¿Quieres exportar estos datos a un fichero? (s/n)");
             char respuesta =sc.next().toLowerCase().charAt(0);

             if (respuesta == 's') {
                 //System.out.println(consulta);
                 rs = st.executeQuery(consulta);
                 File f = new File("Exportado.txt");

                 try (FileWriter fw = new FileWriter(f)) {
                     while(rs.next()) {
                         fw.write(rs.getInt(1) + ";");
                         fw.write(rs.getString(2) + ";");
                         fw.write(rs.getString(3) + ";");
                         fw.write(rs.getString(4) + ";");
                         fw.write(rs.getString(5) + "\n");

                     }
                 } catch (IOException e) {
                     System.out.println("Excepcion de E/S al escribirse el fichero: " + e.getMessage());
                     e.printStackTrace();
                 }
             }

        } catch (SQLException throwables) {
            System.out.println("Excepcion SQL " + throwables.getMessage());
            throwables.printStackTrace();
        }
        return rs;
    }


    /*
    int obtenerÚltimoId(Connection con): realiza una consulta para
    obtener el último Id (el más alto) contenido en la tabla
    Usuarios. Comprueba su funcionamiento realizando una llamada a
    este método desde main e imprimiendo lo que devuelve.
     */
    public static int obtenerÚltimoId(Connection con) {
        String maxId = "select MAX(Id) FROM Usuarios;";
        int max = 0;
        try (Statement st = con.createStatement()) {
            ResultSet rs = st.executeQuery(maxId);
            max = rs.getInt(1);
        } catch (SQLException throwables) {
            System.out.println("Excepción al obtener el mayor Id: " + throwables.getMessage());
            throwables.printStackTrace();
        }
        return max;
    }

    /*
    void cargarFichero(Connection con, String nombreFichero): carga
    un fichero .csv en la tabla Usuarios de App.db. (Datos para el
    fichero csv al final de este enunciado). Para saber que Id de
    usuario añadir, llamamos al método obtenerÚltimoId.
     */
    public static void cargarFichero(Connection con, String nombreFichero) {
        // Leemos el fichero
        File f = new File(nombreFichero);
        //System.out.println(f.exists());
        String línea;
        String insertar;
        int uId = 0;
        try (FileReader fr = new FileReader(f)) {
            try (BufferedReader br = new BufferedReader(fr)) {
                línea = br.readLine();
                String[] campos;
                while (línea != null) {
                    campos = línea.split(";"); // separamos los campos y los metemos en un array
                    //System.out.println(línea);
                /*for (int i = 0; i < campos.length ; i++) {
                    System.out.print(campos[i] + " ");
                }*/
                    // Insertamos los datos en la base de datos
                    ;
                    int id = obtenerÚltimoId(con) + 1;
                    insertar = "INSERT INTO Usuarios(Id, Username, Email, Password, Estado) VALUES (" + id + ", '" + campos[0] + "', '" + campos[1] + "', '" + campos[2] + "', '" + campos[3].trim() + "');";
                    /*insertar = "INSERT INTO Usuarios(Id, Username, Email, Password, Estado) VALUES (3, 'Marcus', 'marcus@gmail.com', 'm4rcus', 'ACTIVO');";*/
                    try (Statement st = con.createStatement()) {
                        int insertado = st.executeUpdate(insertar);
                        System.out.println("Insertado " + insertado + " registro.");
                    } catch (SQLException throwables) {
                        System.out.println("Excepción SQL al insertar fichero:  " + throwables.getMessage());
                        throwables.printStackTrace();
                    }

                    línea = br.readLine(); // antes de salir del while, leemos la siguiente línea
                }



            }

        } catch (FileNotFoundException e) {
            System.out.println("Excepción ruta incorrecta " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Excepción E/S " + e.getMessage());
            e.printStackTrace();
        }

        // Lo procesamos

        // Cargamos en la base de datos
    }

}