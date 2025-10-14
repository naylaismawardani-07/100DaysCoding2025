package Belajar;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan angka(3 digit) : ");
        int angka = n.nextInt();
       
        if((angka % 10) %2 == 0){
            System.out.println("Angka satuaannya genap");
        }else{
            System.out.println("Angka satuannya ganjil");
        }
        if (((angka / 10) % 10) % 2 == 0){
            System.out.println("Angka puluhannya genap");
        }else{
            System.out.println("Angka puluhannya ganjil");
        }
        if(((angka / 100 ) % 10) % 2 == 0){
            System.out.println("Angka ratusannya genap");
        }else{
            System.out.println("Angka ratusannya ganjil");
        }
    }
    
}
