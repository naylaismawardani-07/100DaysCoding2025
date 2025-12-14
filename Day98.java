package Belajar;

import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan Fibonacci: ");
        int bil = n.nextInt();

        int a = 1;
        int b = 1;

        System.out.println("Bilangan Fibonacci:");
        for (int i = 1; i <= bil; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
