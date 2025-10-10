package Belajar;

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.print("Masukkan nilai 1 : ");
        int nilai1 = n.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int nilai2 = n.nextInt();

        boolean lulus = !((nilai1 >= 75)|| (nilai2 >= 80));
        System.out.println("Apakah kamu lulus? "+lulus);
    }   
}
