package Belajar;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = n.nextInt();

        System.out.println("Ganjil ");
        for (int i = angka; i >= 1; i--) {
            if(i %2 != 0){
               System.out.print(i +" ");  
            }
        }
        System.out.println("\nGenap");
        for (int i = angka; i >= 2; i--) {
            if (i %2 == 0){
                System.out.print(i +" ");
            }
        }
    }
}
