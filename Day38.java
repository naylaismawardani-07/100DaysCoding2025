package Belajar;

import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("masukkan bilangan (3 digit): ");
        int bil = n.nextInt();

        if (bil == 0) {
            System.out.println("Bilangan yang kamu masukkan adalah bilangan nol");
        } else if (bil > 0) {
            System.out.println("Bilangan yang anda masukkan adalah bilangan positif");
        } else {
            System.out.println("Bilangan yang anda masukkan adalah bilangan negatif");
        }

        if ((bil % 10) % 2 == 0) {
            System.out.println("Angka satuaannya genap");
        } else {
            System.out.println("Angka satuannya ganjil");
        }
        if (((bil / 10) % 10) % 2 == 0) {
            System.out.println("Angka puluhannya genap");
        } else {
            System.out.println("Angka puluhannya ganjil");
        }
        if (((bil / 100) % 10) % 2 == 0) {
            System.out.println("Angka ratusannya genap");
        } else {
            System.out.println("Angka ratusannya ganjil");
        }

    }

}
