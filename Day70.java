package Belajar;

import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi : ");
        int panjang = n.nextInt();
        System.out.print("Masukkan lebar persegi : ");
        int lebar = n.nextInt();

        for (int j = 1; j <= lebar; j++) {
                for (int i = 1; i <= panjang; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
