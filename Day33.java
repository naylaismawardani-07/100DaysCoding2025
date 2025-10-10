package Belajar;

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.print("Masukkan nilai  : ");
        int nilai1 = n.nextInt();

        boolean lulus = !(nilai1 >= 75);
        System.out.println("Apakah kamu lulus? "+lulus);
    }   
}
