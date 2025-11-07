package Belajar;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkang angka : ");
        int angka = n.nextInt();
        System.out.print("masukkan kelipatan : ");
        int kelipatan = n.nextInt();

        for (int i = 1; i <= angka; i++) {
            if(i % kelipatan == 0){
                System.out.println(i+ " ");
            }
        }
    }
    
}
