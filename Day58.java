package Belajar;

import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Angka : ");
        int jumlah = n.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.print(i +" ");
        }
        System.out.println(" ");
        for (int i = jumlah; i >= 1; i--) {
            System.out.print(i+" " );
        }
    }
    
}
