package Belajar;

import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan Tinggi segitiga : ");
        int panjang = n.nextInt();

        for (int i = 1; i <= panjang; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
