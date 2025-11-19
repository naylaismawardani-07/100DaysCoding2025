package Belajar;

import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int total = 0;

        while(true){
            System.out.print("Masukkan angka : ");
            int angka = n.nextInt();
            if (angka < 0){
                break;
            }
            total += angka;
        }
        System.out.print("Total penjumlahan : "+total);
    }
}
