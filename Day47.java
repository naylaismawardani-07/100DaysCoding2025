package Belajar;

import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("HII KAMU AKAN MEMILIH HARI ");
        System.out.print("Pilih angka (1-7) : ");
        int angka = n.nextInt();
        String hari;

        switch (angka) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                hari = "Angka tidak valid";
        }
        System.out.println("Heri : "+hari);
    }   
}
