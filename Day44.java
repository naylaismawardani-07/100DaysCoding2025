package Belajar;

import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = n.nextInt();
        String predikat = "";
        String pesan = "";
        System.out.println("====== PREDIKAT NILAI ======");

        if(nilai >= 85 && nilai <=100){
            predikat = "A";
            pesan = "Hebat pertahankan prestasimu ";
        }else if (nilai >= 75){
            predikat = "B";
            pesan = "Bagus masih bisa llebih baik lagi";
        }else if (nilai >= 65){
            predikat = "C";
            pesan = "cukup baik tingkatkan lagi yah";
        }else if (nilai >= 50){
            predikat = "D";
            pesan = "Belajar lebih giat lagi kamu pasti bisa";
        }else if(nilai >= 0){
            predikat = "E";
            pesan = "Jangan menyerah setiap kegagalan adalah pelajaran";
        }else{
            predikat = "Nilai tidak valid";
        }
        System.out.println("Nilai Kamu\t : "+nilai);
        System.out.println("Predikat\t : "+predikat);
        System.out.println("Pesan untukmu\t : "+pesan);
        System.out.println("=============================");   
    }   
}
