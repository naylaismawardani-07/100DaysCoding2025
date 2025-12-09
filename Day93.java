package Belajar;

import java.util.Scanner;

public class Day93 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan angka Desimal : ");
        double angka = n.nextDouble();

        System.out.println("Aangka asli : "+angka);
        System.out.println("ceil() : "+Math.ceil(angka));
        System.out.println("floor() : "+Math.floor(angka));
        System.out.println("round() : "+Math.round(angka));
    }
    
}
