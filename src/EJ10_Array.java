import java.util.Arrays;

public class EJ10_Array {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 10);

            }
        }
        int[] sumaFila = new int[5];
        int[] sumaColumna = new int[5];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
                sumaFila[i] += a[i][j];
            }

        }
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
                sumaColumna[i] += a[j][i];
            }
        }
        System.out.println(Arrays.toString(sumaFila));
        System.out.println(Arrays.toString(sumaColumna));
    }
}
