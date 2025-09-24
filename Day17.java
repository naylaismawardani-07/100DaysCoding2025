package Day17;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        System.out.print("Masukkan Angka 1 : ");
        int Angka1 = N.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        int Angka2 = N.nextInt();
        
        int HasilModulus = Angka1 % Angka2;
        System.out.println("Hasil Modulus : " + HasilModulus);
    }
}
