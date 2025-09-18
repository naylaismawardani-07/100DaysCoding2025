package Day11;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Scanner tipe data Char
        System.out.print("masukkan gender:");
        char gender = input.next().charAt(0);
        System.out.println(gender);
        
        //Scanner tipe data String
        System.out.print("masukkan nama:");
        String nama = input.next();
        System.out.println(nama);
        
        //Scanner tipe data bilangan bulat
        System.out.print("masukkan umur:");
        int umur = input.nextInt();
        System.out.println(umur);
        
        System.out.print("masukkan angka:");
        byte angka = input.nextByte();
        System.out.println(angka);
        
        System.out.print("masukkan jumlah:");
        short jumlah = input.nextShort();
        System.out.println(jumlah);
        
        System.out.print("masukkan berapa:");
        long berapa = input.nextLong();
        System.out.println(berapa);
        
        //Scanner bilangan desimal
        System.out.print("masukkan tinggi:");
        double tinggi = input.nextDouble();
        System.out.println(tinggi);
        
        System.out.print("masukkan berat:");
        float berat = input.nextFloat();
        System.out.println(berat);
        
        //Scanner tipe data boolean
        System.out.print("masukkan pernyataan:");
        boolean pernyataan = input.nextBoolean();
        System.out.println(pernyataan);
        
        /*Scanner adalah kelas (class) di Java yang digunakan
         * untuk membaca input dari pengguna (misalnya dari keyboard).
         */
    }
    
}
