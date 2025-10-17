package Belajar;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("");
        int a = n.nextInt();
        System.out.print("");
        char b = n.next().charAt(0);
        System.out.println("");
        int c = n.nextInt();
        System.out.println("===Kalkulator Sederhana===");
        if (b == '*') {
            int hasil = a * c;
            System.out.println("hasil dari " + a + "*" + c + " adalah " + hasil);
        } else if (b == '-') {
            int hasil = a - c;
            System.out.println("hasil dari " + a + "-" + c + " adalah " + hasil);
        } else if (b == '+') {
            int hasil = a + c;
            System.out.println("hasil dari " + a + "+" + c + " adalah " + hasil);
        } else if (b == '/') {
            int hasil = a / c;
            System.out.println("hasil dari " + a + "/" + c + " adalah " + hasil);
        } else if (b == '%') {
            int hasil = a % c;
            System.out.println("hasil dari " + a + "%" + c + " adalah " + hasil);
        }
    }
}
