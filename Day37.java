package Belajar;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = n.nextInt();

        if(angka %2 != 0){
            System.out.println("Angka "+angka+ " termasuk bilangan ganjil");
        }else{
            System.out.println("Angka "+angka+ " termasuk bilangan genap");
        }
    }
    
}
