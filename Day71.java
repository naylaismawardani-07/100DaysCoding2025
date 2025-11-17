package Belajar;

import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga : ");
        int tinggi = n.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
