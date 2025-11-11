package Belajar;

import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int N = n.nextInt();
        int angka = 1;

        for (int i = 1; i <= N; i++) {
            angka = angka * i;
        }
        System.out.println("Hasil dari "+N+ "!"+" = "+angka);
    }
    
}
