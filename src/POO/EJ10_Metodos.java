package POO;
import java.util.Scanner;
public class EJ10_Metodos {

        public static int signo(int número) {
            if (número > 0)
                return 1;
            else if (número < 0)
                return -1;
            else
            return 0;
        }
        public static void main(String[] args) {
            final Scanner scanner = new Scanner(System.in);
            final int n = scanner.nextInt();
            System.out.println(signo(n));
        }
    }