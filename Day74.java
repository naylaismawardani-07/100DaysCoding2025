package Belajar;

import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int Pilih;
        do{
            System.out.println("1. Halo");
            System.out.println("2. Selamat Pagi");
            System.out.println("3. keluar");
            System.out.print("Pilih : ");
            Pilih = n.nextInt();

            if (Pilih == 1){
                System.out.println("Halo");
            }else if (Pilih == 2){
                System.out.println("Selamat Pagi");
            }else if (Pilih == 3){
                System.out.println("Keluar");
            }else{
                System.out.println("Pilihan tidsk tersedia");
            }
            System.out.println();
            
        } while(Pilih != 3);
    }
}
