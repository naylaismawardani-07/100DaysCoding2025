package Belajar;

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner nay = new Scanner(System.in);
        System.out.print("masukkan jari-jari lingkaran : ");
        double r = nay.nextDouble();
        
        double Luas = Math.PI * r * r;
        System.out.printf("Luas lingkaran dengan jari-jari %.1f adalah : %.1f" ,r ,Luas);
    }
}
