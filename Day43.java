package Belajar;

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = n.nextInt();
        String a = "";
        String b = "";
        String c = "";

        if (angka < 10){
            a = "satuan";
        }else if (angka < 100){
            a = "puluhan";
        }else{
            a = "ratusan";
        }

        if (angka %2 == 0){
            b = " genap";
        }else{
            b = " ganjil";
        }
        if (angka %3 == 0 && angka %5 == 0){
            c = " bisa dibagi 3 dan 5";
        }else if (angka %3 == 0){
            c = "bisa dibagi 3";
        }else if (angka %5 == 0 ){
            c = " bisa dibagi 5";
        }else{
            c = "tidak bisa dibagi 3 dan 5";
        }
        System.out.println(angka+" adalah angka "+a+""+b+" yang"+c);
    }   
}
