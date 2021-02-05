package POO;

public class EjImprimir {
    public static void imprimir(String stringAImprimir) {
        System.out.println(stringAImprimir);

    }
    public static void imprimir(String stringAImprimir, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(stringAImprimir);
        }
    }
    public static void imprimir(int veces, String stringAImprimir) {
        for (int i = 0; i < veces; i++) {
            System.out.println(stringAImprimir);
        }
    }
    public static void imprimir(int val) {
        System.out.println(val);
    }
}
