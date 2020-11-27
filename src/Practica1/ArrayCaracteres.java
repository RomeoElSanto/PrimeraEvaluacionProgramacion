package Practica1;

public class ArrayCaracteres {
    public static void main(String[] args) {
        char[] caracteres = { 'a', 'a', 'h', 'a', 'r', 'a'};
        int cont = 0;
        for (char ch: caracteres) {
            if (ch == 'a'){
                cont++;
            }
        }
        System.out.println(cont);
    }
}
