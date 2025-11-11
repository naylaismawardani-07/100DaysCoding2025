package Belajar;

import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int N = n.nextInt();
        int angka = 1;

        System.out.print(N + "! = ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " * ");
            angka = angka * i;
        }
        System.out.println("\b\b\b = "+angka);
    }
    
}
