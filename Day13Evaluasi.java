package Evaluasi;
import java.util.Scanner;
public class Berhasil {
    public static void main(String[] args){
        //Nomor 1
               //file1
               //package No1;

               //file2
               //public class file2{}

               //file3
               //public static void main(String[] args){}

        //Nomor 2
        //Bagian 1 Deklarasi adalah yaitu memberikan tipe data dan variabelnya saja
        
        byte a;
        int b;
        short c;
        long d;
        double e;
        float f;
        char g;
        boolean h;
        String i;

        //Bagian 2 Inisialisasi adalah mengisi variabel tersebut
        a = 1;
        b = 18;
        c = 2;
        d = 20000;
        e = 2.5;
        f = 2.1f;
        g = 'P';
        h = true;
        i = "Nayla";

        //Bagian 3 update variabel adalah mengubah nilai dari variabel yg sudah dibuat sebelumnya
         a = 2;
        b = 20;
        c = 3;
        d = 30000;
        e = 3.5;
        f = 5.1f;
        g = 'C';
        h = false;
        i = "ila";

        //Nomor 3
        System.out.println("===== Biodata Mahasiswa =====");
        Scanner input = new Scanner(System.in);
        System.out.print("Nama \t\t:\t");
        String nama = input.nextLine();

        System.out.print("Umur \t\t:\t");
        int Umur = input.nextInt();
        input.nextLine();
        System.out.print("NIM \t\t:\t");
        String NIM = input.nextLine();
        System.out.print("Status \t\t:\t");
        boolean status = input.nextBoolean();
        System.out.print("Tinggi Badan \t:\t");
        double TinggiBadan = input.nextDouble();
        System.out.print("Berat Badan \t:\t");
        double BeratBadan = input.nextDouble();
        System.out.print("Kelas \t\t:\t");
        char Kelas = input.next().charAt(0);
        System.out.print("Alamat \t\t:\t");
        String Alamat = input.next();
       

         System.out.println("===== Biodata Mahasiswa =====");
          System.out.print("Nama \t\t:\t" + nama);
           System.out.print("\nUmur \t\t:\t" + Umur + " tahun");
           System.out.print("\nStatus \t\t:\t" + status);
           System.out.print("\nBerat Badan \t:\t" + BeratBadan + " kg");
           System.out.print("\nTinggi Badan \t:\t" + TinggiBadan + " cm");
           System.out.print("\nKelas \t\t:\t" + Kelas);
           System.out.println("\nAlamat \t\t:\t" + Alamat);

    }
    
}
