package Belajar;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("====== DAFTAR MERK MOBIL ======");
        System.out.println("1. Toyota");
        System.out.println("2. Honda");
        System.out.print("Masukkan merk mobil(1-2) : ");
        int merk = n.nextInt();

        if(merk == 1){
            System.out.println("=== MODEL MOBIL ===");
            System.out.println("1. Avanza");
            System.out.println("2. Fortuner");
            System.out.print("Pilih model(1-2) : ");
            int model = n.nextInt();

            if(model == 1){
                System.out.println("=== Speisifikasi ===");
                System.out.println("Merk mobil : Toyota");
                System.out.println("Model : Avanza");
                System.out.println("kapasitas mesin : 1500 cc");
                System.out.println("Tipe transmisi : manual/matic");
            }else if (model == 2){
                System.out.println("=== Spesifikasi ===");
                System.out.println("=== Speisifikasi ===");
                System.out.println("Merk mobil : Toyota");
                System.out.println("Model : Fortuner");
                System.out.println("kapasitas mesin : 2400 cc");
                System.out.println("Tipe transmisi : otomatis");
                
            }else{
                System.out.println("Merk tidak ditemukan");
            }
        }else if (merk == 2){
                System.out.println("=== Speisifikasi ===");
                System.out.println("Merk mobil : Honda");
                System.out.println("Model : Brio");
                System.out.println("kapasitas mesin : 1200 cc");
                System.out.println("Tipe transmisi : manual/CVT");
                int model = n.nextInt();

            if(model == 1){
                System.out.println("=== Speisifikasi ===");
                System.out.println("Merk mobil : Honda");
                System.out.println("Model : HR-V");
                System.out.println("kapasitas mesin : 1500 cc");
                System.out.println("Tipe transmisi : Otomatis CVT");
            }else if(model == 2){
                System.out.println("=== Spesifikasi ===");
                System.out.println("Merk Hp : infinix");
                System.out.println("Model : GT 30 Pro");
                System.out.println("Prosesor : MediaTek Dimensity 8300 Ultimate");
                System.out.println("RAM : 12 GB");
                System.out.println("Baterai : 5100 mAh");
            }
        }else{
            System.out.println("Merk tidak ditemukan ");
        }
    }   
}
