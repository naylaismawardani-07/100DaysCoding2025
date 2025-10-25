package Belajar;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("=== KALKULATOR SEDERHANA ===");
        int angka1 = n.nextInt();
        char operator = n.next().charAt(0);
        int angka2 = n.nextInt();
        boolean valid = true;
        int hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;

            case '-':
                hasil = angka1 - angka2;
                break;

            case '*':
                hasil = angka1 * angka2;
                break;

            case '/':
                hasil = angka1 / angka2;
                break;

            case '%':
                hasil = angka1 % angka2;
                break;

            default:
                System.out.println("Operator tidak valid!");
                valid = false;
        }
        if (valid){
        System.out.println("Hasil dari "+angka1+" "+operator+" "+angka2+" adalah "+hasil);
        }
    }
}
