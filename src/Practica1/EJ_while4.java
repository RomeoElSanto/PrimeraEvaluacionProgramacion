package Practica1;

public class EJ_while4 {
    public static void main(String[] args) {
        int i=5;
        int contadorMultiplos =0;
        while (contadorMultiplos < 20) {
            if (i % 5==0) {
                System.out.print(i + " ");
                contadorMultiplos++;
            }
            i++;
        }
    }
}
