package Belajar;

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("nilai a = ");
        int a = n.nextInt();
        System.out.print("nilai b = ");
        int b = n.nextInt();
        System.out.print("nilai c = ");
        int c = n.nextInt();
        int nilai = a+(b*c);
        System.out.println("Nilai akhir a = "+nilai);
        boolean hasil = (nilai %2 == 0 && nilai/b > c || nilai-b <= 10);
        System.out.println("hasil logika = "+hasil);
    }   
}
