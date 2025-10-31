 package Belajar;

import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan jumlah : ");
        int jumlah = n.nextInt();
        double totalValid = 0;
        int jumlahValid = 0;
        int jumlahTidakValid = 0;
        double nilaiTerkecil = 100;
        double nilaiTerbesar = 0;

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            double nilai = n.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println(" Nilai tidak valid dan tidak diproses.");
                jumlahTidakValid++;
                continue; 
            }
            totalValid += nilai;
            jumlahValid++;

            if (nilai < nilaiTerkecil) {
                nilaiTerkecil = nilai;
            }

            if (nilai > nilaiTerbesar) {
                nilaiTerbesar = nilai;
            }
        }
        double rataRata = totalValid / jumlahValid;
        System.out.println("Total nilai valid       : " + totalValid);
        System.out.println("Jumlah nilai valid      : " + jumlahValid);
        System.out.println("Jumlah nilai tidak valid: " + jumlahTidakValid);
        System.out.println("Nilai valid terkecil    : " + nilaiTerkecil);
        System.out.println("Nilai valid terbesar    : " + nilaiTerbesar);
        System.out.println("Rata-rata nilai valid   : " + rataRata);
    }
}
