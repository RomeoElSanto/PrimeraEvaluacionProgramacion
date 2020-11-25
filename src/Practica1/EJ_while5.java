package Practica1;

public class EJ_while5 {
    public static void main(String[] args) {
        int i=5;
        int contadorMultiplos =0;
        while (contadorMultiplos < 50) {
            if (i % 5==0) {
                System.out.print(i + "\t");
                contadorMultiplos++;
                 if (contadorMultiplos % 10==0){
                    System.out.println();
                 }
            }
            i++;
        }
    }
}
