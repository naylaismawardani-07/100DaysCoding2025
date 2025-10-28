package Belajar;

import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = n.nextInt();

        for (int i = 1; i < angka; i++) {
            String ganjilgenap = (i %2 == 0) ? "Genap" : "Ganjil";
            System.out.println(i + " adalah "+ganjilgenap);
        }
        
    }
    
}
