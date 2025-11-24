package Belajar;

import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        // Input utama
        System.out.print("Masukkan sebuah teks: ");
        String teks = n.nextLine();

        System.out.println("\n===== HASIL METHOD STRING =====");

        // length()
        System.out.println("Panjang teks: " + teks.length());

        // toUpperCase()
        System.out.println("Huruf besar : " + teks.toUpperCase());

        // toLowerCase()
        System.out.println("Huruf kecil : " + teks.toLowerCase());

        // trim()
        String teksTrim = teks.trim();
        System.out.println("Setelah trim: '" + teksTrim + "'");

        // substring
        System.out.print("\nMasukkan index awal substring: ");
        int awal = n.nextInt();
        System.out.print("Masukkan index akhir substring: ");
        int akhir = n.nextInt();

        String sub = teksTrim.substring(awal, akhir);
        System.out.println("Hasil substring: " + sub);

        n.nextLine(); // enter

        // Pengecekan equals, equalsIgnoreCase, contains
        System.out.print("\nMasukkan kata untuk dicek: ");
        String kata = n.nextLine();

        System.out.println("equals? " + teksTrim.equals(kata));
        System.out.println("equalsIgnoreCase? " + teksTrim.equalsIgnoreCase(kata));
        System.out.println("contains? " + teksTrim.contains(kata));

        // isEmpty
        System.out.println("isEmpty? " + teksTrim.isEmpty());
    }
}
