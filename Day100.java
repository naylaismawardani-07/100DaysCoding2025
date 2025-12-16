package Belajar;

import java.util.Scanner;

public class Dayy100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        // Ubah ke huruf besar agar konsisten
        S = S.toUpperCase();

        boolean adaI = false;
        boolean adaS = false;
        boolean adaC = false;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == 'I' && !adaI) {
                adaI = true;
            } else if (ch == 'S' && adaI && !adaS) {
                adaS = true;
            } else if (ch == 'C' && adaI && adaS) {
                adaC = true;
                break;
            }
        }

        if (adaI && adaS && adaC) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}
