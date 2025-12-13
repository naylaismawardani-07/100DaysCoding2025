package Belajar;

import java.util.Scanner;

public class Day97 {
    public static int persegi(int sisi){
        return sisi * sisi;
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        int sisi = n.nextInt();

        System.out.println("Luas Persegi : "+ persegi(sisi));
    }
    
}
