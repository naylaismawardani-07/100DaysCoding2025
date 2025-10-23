package Belajar;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("===  JURUSAN KULIAH ===");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Manajemen");
        System.out.println("3. Hukum");
        System.out.println("4. Kedokteran");
        System.out.println("5. Desain Komunikasi Visual");
        System.out.print("Pilih jurusan (1-5): ");
        int pilihan = n.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih: Teknik Informatika");
                System.out.println("Fakultas: Teknologi Informasi");
                System.out.println("Prospek kerja: Programmer, Software Engineer, Data Analyst");
                break;
            case 2:
                System.out.println("Kamu memilih: Manajemen");
                System.out.println("Fakultas: Ekonomi dan Bisnis");
                System.out.println("Prospek kerja: Manajer, Wirausaha, Konsultan Bisnis");
                break;
            case 3:
                System.out.println("Kamu memilih: Hukum");
                System.out.println("Fakultas: Hukum");
                System.out.println("Prospek kerja: Pengacara, Jaksa, Hakim");
                break;
            case 4:
                System.out.println("Kamu memilih: Kedokteran");
                System.out.println("Fakultas: Kedokteran");
                System.out.println("Prospek kerja: Dokter, Peneliti Medis, Dosen");
                break;
            case 5:
                System.out.println("Kamu memilih: Desain Komunikasi Visual");
                System.out.println("Fakultas: Seni dan Desain");
                System.out.println("Prospek kerja: Desainer Grafis, Illustrator, Animator");
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        System.out.println("\nSemoga sukses dengan jurusan pilihanmu!");
    }
}
