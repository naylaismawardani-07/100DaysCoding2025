package Belajar;

import java.util.Scanner;

public class Day90 {
    static String Nama (String nama){
        return nama;
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = n.nextLine();
        System.out.println(Nama(nama));
    }
    
}
