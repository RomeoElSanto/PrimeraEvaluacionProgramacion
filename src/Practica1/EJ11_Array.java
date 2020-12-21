package Practica1;

public class EJ11_Array {
    public static void main(String[] args) {
    int[][] diagonal = new int[5][5];

        for (int i = 0; i < diagonal.length ; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                if (i == j)
                    diagonal[i][j] = 1;
                else
                    diagonal[i][j] = 0;
            }

        }
        System.out.println();

    }
}
