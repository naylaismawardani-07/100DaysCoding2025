package Belajar;

import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Masukkan nilai 1 : ");
        int nilai = n.nextInt();
        System.out.println("masukkan nilai 2 : ");
        int nilaii = n.nextInt();

        boolean lulus = (nilai >= 75) && (nilaii >= 80);
        System.out.println("Apakah kamu lulus? "+lulus);
        
    }  
}
