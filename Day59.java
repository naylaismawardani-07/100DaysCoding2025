package Belajar;

import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = n.nextInt();

        System.out.println("Ganjil ");
        for (int i = 1; i <= angka; i+=2) {
            System.out.print(i +" ");
        }
        System.out.println("\nGenap");
        for (int i = 2; i <= angka; i+=2) {
            System.out.print(i +" ");
        }
    }
    
}
