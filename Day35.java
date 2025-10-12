package Belajar;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int a = n.nextInt();

        if (a >= 75) {
            System.out.println("selamat kamu lulus");
        }else {
            System.out.println("kamu tidak lulus");
        }
    }   
}
