import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Tiempo {
    public static void main(String[] args) {
        System.out.println("****** localDate ****** ");
        LocalDate hoy = LocalDate.now();
        System.out.println("Fecha actual: " + hoy);
        System.out.println("Año actual:  " + hoy.getYear());
        System.out.println("Mes actual: " + hoy.getMonth());
        System.out.println("Dia actual: " + hoy.getDayOfMonth());

        System.out.println("****** LocalTime ******");
        LocalTime ahora = LocalTime.now();
        System.out.println("Ahora: " + ahora);
        System.out.println("Horas: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Segundos: " + ahora.getSecond());
        System.out.println("Nanosegundos: " + ahora.getNano());

        System.out.println("******* LocalDateTime *******");
        LocalDateTime momentoActual = LocalDateTime.now();
        System.out.println("Momento: " + momentoActual);

        System.out.println("*********************************");
        System.out.println();


        System.out.println("***** Construir fechas y/o momentos *******");
        LocalDate examen = LocalDate.of(2021, 5, 18);
        System.out.println("Fecha del examen: " + examen.getDayOfMonth() + "/" + examen.getMonthValue() + "/" + examen.getYear());

        LocalDateTime horaExamenB;
        LocalDateTime horaExamenA;
        System.out.println("Fecha y hora de examen: ");
        System.out.println(" * Grupo B: " + LocalDateTime.of(2021, 5,18,15,30,0,0));
        System.out.println(" * Grupo A: " + LocalDateTime.of(2021,5,18,18,00,0,0));


        System.out.println("************************");
        System.out.println();
        System.out.println(" ************** Añadir y quitar tiempo ************");
        System.out.println("Dentro de 10 dias naturales: " + LocalDate.now().plusDays(10));
        System.out.println("Hace 5 horas: " + LocalDateTime.now().minusHours(5));

        System.out.println("***************************");
        System.out.println();
        System.out.println("***** Calcular intervalos de tiempo *****");
        Period diasHastaExamen = LocalDate.now().until(examen);
        System.out.println("Quedan " + diasHastaExamen.getDays() + " dias hasta el examen");


    }
}
