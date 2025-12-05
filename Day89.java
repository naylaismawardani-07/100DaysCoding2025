package Belajar;

import java.util.Scanner;

public class Day89 {
    static void tambah(int a, int b){
        System.out.println("hasil dari "+a +" + "+ b+" adalah "+(a+b));
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan angka 1 : ");
        int a = n.nextInt();
        System.out.print("Masukkan angka 2 : ");
        int b = n.nextInt();
        tambah(a, b);
    }
    
}
