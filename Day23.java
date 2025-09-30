package Belajar;

import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner nay = new Scanner(System.in);
        System.out.print("masukkan panjang : ");
        double Panjang = nay.nextDouble();
        System.out.print("masukkan lebar : ");
        double Lebar = nay.nextDouble();

        //hitung luas persegi panjang 
        double Luas = Panjang * Lebar ;
        System.out.print("Luas persegi panjang = " + Luas);
    }  
}
