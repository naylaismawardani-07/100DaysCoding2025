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
                System.out.println("=== Speisifikasi ===");
                System.out.println("Merk mobil : Toyota");
                System.out.println("Model : Fortuner");
                System.out.println("kapasitas mesin : 2400 cc");
                System.out.println("Tipe transmisi : otomatis");
                
            }else{
                System.out.println("Merk tidak tersedia");
            }
        }else if (merk == 2){
                System.out.println("=== MODEL HONDA ===");
                System.out.println("1. Brio");
                System.out.println("2. HR-V");
                int model = n.nextInt();

            if(model == 1){
                System.out.println("=== Speisifikasi ===");
                System.out.println("Merk mobil : Honda");
                System.out.println("Model : Brio");
                System.out.println("kapasitas mesin : 1200 cc");
                System.out.println("Tipe transmisi : manual/CVT");
            }else if(model == 2){
                System.out.println("=== Speisifikasi ===");
                System.out.println("Merk mobil : Honda");
                System.out.println("Model : HR-V");
                System.out.println("kapasitas mesin : 1500 cc");
                System.out.println("Tipe transmisi : Otomatis CVT");
            }
        }else{
            System.out.println("Merk tidak tersedia ");
        }
    }   
}
