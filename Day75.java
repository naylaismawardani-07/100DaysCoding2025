package Belajar;

import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan teks : ");
        String teks = n.nextLine();

        System.out.println("Kalimat asli \t\t: "+teks);
        System.out.println("jumlah karakter \t: "+teks.length());
        System.out.println("Uppercase(huruf besar) \t: "+teks.toUpperCase());
        System.out.println("LowerCase(huruf kecil) \t: "+teks.toLowerCase());
    }
    
}
