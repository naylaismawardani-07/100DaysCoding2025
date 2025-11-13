package Belajar;

import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan panjang pola : ");
        int angka = n.nextInt();

        for (int i = 0; i < angka; i++) {
            System.out.print("-");
        }
    }
}
