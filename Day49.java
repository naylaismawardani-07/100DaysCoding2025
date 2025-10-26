package Belajar;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan jam (0-23) : ");
        int jam = n.nextInt();

        String waktu = (jam < 12) ? " Pagi" : (jam < 15) ? " Siang" : (jam < 18 ) ? " Sore" : (jam <= 23) ? " Malam" : " jam tidak valid";

        System.out.println("Sekarang jam : "+jam+ waktu);
    }

}
