package Belajar;

import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String[] buah = { "apel", "mangga", "jeruk", "pisang", "anggur" };
        String cari = n.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < buah.length;i++) {
            if (buah[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Buah tersedia");
        } else {
            System.out.println("Buah tidak tersedia");
        }
    }

}
