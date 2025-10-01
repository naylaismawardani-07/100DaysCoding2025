package Belajar;

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner nay = new Scanner(System.in);

        final double PI = 3.14;
        System.out.print("masukkan jari-jari lingkaran : ");
        double r = nay.nextDouble();
        
        double Luas = PI * r * r;
        System.out.printf("Luas lingkaran dengan jari-jari %.1f adalah : %.1f" ,r ,Luas);
    }
}
