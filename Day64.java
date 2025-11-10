package Belajar;

import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan angka M : ");
        int M = n.nextInt();
        System.out.print("Masukkan angka N : ");
        int N = n.nextInt();
        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil *= M;
        }
        System.out.println("Hasil dari "+M+" pangkat "+N+" adalah "+hasil);
    }
    
}
