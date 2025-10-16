package Belajar;

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("==== NAYLA CELL ====");
        System.out.println("1. Pulsa");
        System.out.println("2. Paket data");
        System.out.println("3. Paket Nelpon");
        System.out.println("4. Token Listrik");
        System.out.print("Pilih menu (1-4): ");
        int pilih = n.nextInt();

        if (pilih == 1) {
            System.out.println("Anda memilih: Pulsa");
            System.out.println("Nominal yang tersedia:");
            System.out.println("1. Rp 10.000");
            System.out.println("2. Rp 20.000");
            System.out.println("3. Rp 50.000");
            System.out.print("Pilih nominal (1-3): ");
            int nominal = n.nextInt();

            if (nominal == 1) {
                System.out.println("Anda membeli Pulsa Rp 10.000");
            } else if (nominal == 2) {
                System.out.println("Anda membeli Pulsa Rp 20.000");
            } else if (nominal == 3) {
                System.out.println("Anda membeli Pulsa Rp 50.000");
            } else {
                System.out.println("Nominal tidak tersedia!");
            }

        } else if (pilih == 2) {
            System.out.println("Anda memilih: Paket Data");
            System.out.println("Pilihan paket:");
            System.out.println("1. 5GB - Rp 25.000");
            System.out.println("2. 10GB - Rp 40.000");
            System.out.print("Pilih paket (1-2): ");
            int paket = n.nextInt();

            if (paket == 1) {
                System.out.println("Anda membeli Paket 5GB - Rp 25.000");
            } else if (paket == 2) {
                System.out.println("Anda membeli Paket 10GB - Rp 40.000");
            } else {
                System.out.println("Paket tidak tersedia!");
            }

        } else if (pilih == 3) {
            System.out.println("Anda memilih: Paket Nelpon");
            System.out.println("Harga: Rp 15.000 (100 menit)");
        } else if (pilih == 4) {
            System.out.println("Anda memilih: Token Listrik");
            System.out.println("Harga: Rp 50.000");
        } else {
            System.out.println("Pilihan tidak tersedia!");
        }
    }
}
