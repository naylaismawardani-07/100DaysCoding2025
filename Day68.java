package Belajar;

import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan uk persegi : ");
        int uk = n.nextInt();

        for (int i = 1; i <= uk; i++) {
            for (int j = 1; j <= uk; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
