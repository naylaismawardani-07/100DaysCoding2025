package Belajar;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("");
        int angka1 = n.nextInt();
        System.out.print("");
        char operator = n.next().charAt(0);
        System.out.print("");
        int angka2 = n.nextInt();
        int hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil dari "+angka1+"+"+angka2+" adalah " + hasil);
                break;

            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil dari "+angka1+"-"+angka2+" adalah " + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil dari "+angka1+"*"+angka2+" adalah " + hasil);
                break;

            case '/':
                hasil = angka1 / angka2;
                System.out.println("Hasil dari "+angka1+"/"+angka2+" adalah " + hasil);
                break;

            case '%':
                hasil = angka1 % angka2;
                System.out.println("Hasil dari "+angka1+"%"+angka2+" adalah "+hasil);
                break;

            default:
                System.out.println("Operator tidak valid!");
        }
    }
}
