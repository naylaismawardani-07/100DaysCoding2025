package Belajar;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int Bilangan = n.nextInt();

        String ganjilgenap = (Bilangan %2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Bilangan "+Bilangan+" adalah bilangan "+ganjilgenap);
    }
    
}
