package Belajar;

import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        while (true) {
            System.out.println("=== MENU KAFE ===");
            System.out.println("1. Kopi");
            System.out.println("2. Teh");
            System.out.println("3. Jus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilih = n.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Anda memilih Kopi ");
                    break;
                case 2:
                    System.out.println("Anda memilih Teh ");
                    break;
                case 3:
                    System.out.println("Anda memilih Jus ");
                    break;
                case 4:
                    System.out.println("Terima kasih, Berkunjung kembali!");
                    return; 
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi!");
            }
        }
    }
}
