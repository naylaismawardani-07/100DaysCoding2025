package Belajar.EvaluasiMentor2;

import java.util.Scanner;

public class Soal {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        //SOAL 1
        System.out.print("Masukkan suhu dalam celcius : ");
        int suhu = n.nextInt();
        System.out.println("Pilih konversi : ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.print("Masukkan pilihan anda : ");
        int pilih = n.nextInt();

        if (pilih == 1){
            double fah = (suhu * 9/5)+32;
            System.out.println("Hasil konversi : "+suhu+"C"+" = "+fah+"F");
        }else if(pilih == 2){
            final double kel = (suhu +273.15);
            System.out.println("Hsil konversi : "+suhu+"C"+" = "+kel+"K");
        }
        //SOAL 2
        System.out.print("username : ");
        String user = n.nextLine();
        System.out.print(" Password : ");
        String pass = n.nextLine();

        if(user.equals("Nayla") && pass.equals("2")){
            System.out.println("Anda login sebagai pengguna");
        }else if (user.equals("admin") && pass.equals("admin")){
            System.out.println("Anda login sebagai admin");
        }else {
            System.out.println("akun tidak ditemukan");
        }

    }
    
}
