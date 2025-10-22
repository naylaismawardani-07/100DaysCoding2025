package Belajar;

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("====== HEALING ======");
        System.out.println("1. Pantai");
        System.out.println("2. Gunung");
        System.out.println("3. Camping");
        System.out.println("4. Kota");
        System.out.print("Pilih tempat tempat healing(1-4) :");
        int angka = n.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Kamu memilih pantai yang suara ombaknya bikin tenang");
                break;
            case 2:
                System.out.println("Kamu memilih gunung yang udaranya sejuk dan segar");
                break;
            case 3:
                System.out.println("Kamu memilih camping yang malamnya begitu tenang");
                break;
            case 4:
                System.out.println("Kamu memilih kota yang mempunyai banyak kuliner");
                break;
            default:
                System.out.println("Pilihan kamu tidak tersedia");
                break;
        }
    }

}
