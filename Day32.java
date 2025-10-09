package Belajar;

import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan nilai 1 : ");
        int nilai = n.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nilaii = n.nextInt();

        boolean lulus = (nilai >= 75) || (nilaii >= 80);
        System.out.println("Apakah kamu lulus? "+lulus);
    }   
}
