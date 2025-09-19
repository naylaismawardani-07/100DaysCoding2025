package Day12;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
        //Biodata input Svanner
    System.out.print("Masukkan Nama \t: ");
        String Nama = input.nextLine();
        System.out.println(Nama);

        System.out.print("Masukkan NIM \t: ");
        String NIM = input.nextLine();
        System.out.println(NIM);

        System.out.print("Masukkan Umur \t: ");
        int Umur = input.nextInt();
        System.out.println(Umur);

        System.out.print("Masukkan Kelas \t: ");
        char Kelas = input.next().charAt(0);
        System.out.println(Kelas);

        input.nextLine();
        
        System.out.print("Masukkan Alamat :");
        String Alamat = input.nextLine();
        System.out.println(Alamat);
        
        System.out.print("Masukkan Tinggi Badan \t: ");
        double TinggiBadan = input.nextDouble();
        System.out.println(TinggiBadan);

        System.out.print("Masukkan Berat Badan \t: ");
        double BeratBadan = input.nextDouble();
        System.out.println(BeratBadan);
        
        
    }
    
}
   
    
