package Belajar;

import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Angka : "); 
        int jumlah = n.nextInt();
        long hasil = 1;

        for (int i = 1; i <= jumlah; i++) {
            System.out.print( i+" * ");
            hasil = hasil * i;
        }
        System.out.println("\b\b\b = "+hasil);
    }
    
}
