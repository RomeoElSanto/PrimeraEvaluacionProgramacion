import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Ej11_Array {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = 2 + 2*i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("numero a insetar");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int pos = 0;
        int i = 0;
        while (i < a.length && a[pos] < N){
            pos++;
            i++;
        }
        System.out.println(pos);
        int [] copia = a.clone();
        for (int j = 0; j < a.length - 1; j++) {
            a[i+1] = copia[i];
        }

        a[pos] = N;
        System.out.println(Arrays.toString(a));
    }
}
