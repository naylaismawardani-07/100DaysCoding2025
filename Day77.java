package Belajar;

import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teks = n.nextLine();

        // 1. Trim
        String teksTrim = teks.trim();
        System.out.println("Hasil trim: '" + teksTrim + "'");

        // 2. Substring
        System.out.print("Masukkan indeks awal substring: ");
        int awal = n.nextInt();
        System.out.print("Masukkan indeks akhir substring: ");
        int akhir = n.nextInt();
        String sub = teksTrim.substring(awal, akhir);
        System.out.println("Hasil substring: " + sub);

        n.nextLine(); // bersihkan buffer

        // 3. Replace
        System.out.print("Masukkan teks yang ingin diganti: ");
        String lama = n.nextLine();
        System.out.print("Masukkan teks pengganti: ");
        String baru = n.nextLine();
        String hasilReplace = teksTrim.replace(lama, baru);
        System.out.println("Hasil replace: " + hasilReplace);
    }
}
