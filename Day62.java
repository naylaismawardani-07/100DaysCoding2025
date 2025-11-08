package Belajar;

import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Angka : "); 
        int jumlah = n.nextInt();
        int tambah = 0;

        for (int i = 1; i <= jumlah; i++) {
            System.out.print( i+" + ");
            tambah += i;
        }
        System.out.println("\b\b\b = "+tambah);
    }
    
}
