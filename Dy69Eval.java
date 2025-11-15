package Belajar;

import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        // Soal 1
        while (true) {

            System.out.print("");
            int a = n.nextInt();
            char c = n.next().charAt(0);
            int b = n.nextInt();

            if (c == '+') {
                int hasil = a + b;
                System.out.println("Hasil dari " + a + " + " + b + " adalah " + hasil);
            } else if (c == '-') {
                int hasil = a - b;
                System.out.println("Hasil dari " + a + " - " + b + " adalah " + hasil);
            } else if (c == '*') {
                int hasil = a * b;
                System.out.println("Hasil dari " + a + " * " + b + " adalah " + hasil);
            } else if (c == '/') {
                int hasil = a / b;
                System.out.println("Hasil dari " + a + " / " + b + " adalah " + hasil);
            } else if (c == '%') {
                int hasil = a % b;
                System.out.println("Hasil dari " + a + " % " + b + " adalah " + hasil);
            } else {
                System.out.println("simbol tidak tersedia");
            }
        }
        // soal 2
        System.out.print("Jumlah Karung : ");
        int karung = n.nextInt();
        System.out.print("Berat per karung : ");
        int berat = n.nextInt();

        int hasil = karung * berat;
        System.out.print("Total Berat : " + hasil);
        // Soal 4
        System.out.print("Jumlah Petak : ");
        int jumlah = n.nextInt();
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Luas petak ke-" + i + " : ");
            int luas = n.nextInt();
            total += luas;
        }
        System.out.print("Total luas sawah : " + total);

    }
}
