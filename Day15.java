package Day15;
import java.util.Scanner;
public class f {
    public static void main(String[] args) {   
    Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan Angka 1 : ");
        int a = input.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        int b = input.nextInt();

        int Penjumlahan = a + b;
        System.out.println("Hasil Penjumlahan : " + Penjumlahan);
        
        int Pengurangan = a - b;
        System.out.println("Hasil Pengurangan : " + Pengurangan);
}
}
