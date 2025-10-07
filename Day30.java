package Belajar;

import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("masukkan angka 1 :");
        int a = n.nextInt();
        System.out.print("masukkan angka 2 : ");
        int b = n.nextInt();

        System.out.println("apakah angka 1 lebih kecil atau sama dengan angka 2 ? "+(a<=b));
        System.out.println("apakah angka 1 lebih besar atau sama dengan angka 2 ? "+(a>=b));
    }
}
