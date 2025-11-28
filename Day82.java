package Belajar;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            angka[i] = n.nextInt();
        }

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + angka[i]);
        }
    }
}
