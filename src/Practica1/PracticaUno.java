package Practica1;

import java.util.Scanner;

public class PracticaUno {


        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Momento Inicial: ");
            System.out.println("----------------");
            System.out.println("Introduce la hora: ");
            int h1 = sc.nextInt();
            System.out.println("Introduce los minutos: ");
            int m1 = sc.nextInt();
            System.out.println("Introduce los segundos: ");
            int s1 = sc.nextInt();
            System.out.println("");
            System.out.println("Momento Final: ");
            System.out.println("---------------");
            System.out.println("Introduce la hora: ");
            int h2 = sc.nextInt();
            System.out.println("Introduce los minutos: ");
            int m2 = sc.nextInt();
            System.out.println("Introduce los segundos: ");
            int s2 = sc.nextInt();
            int MomentoInicial = (h1 * 3600) + (m1 * 60) + s1;
            int MomentoFinal = (h2 * 3600) + (m2 * 60) + s2;
            int dif = MomentoFinal - MomentoInicial;
            int h3 = (dif / 3600);
            int m3 = (dif % 3600) / 60;
            int s3 = (dif % 3600) % 60;
            System.out.println(h3 + ":" + m3 + ":" + s3);
        }
    }