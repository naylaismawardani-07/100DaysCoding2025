package Day22;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner nay = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int sisi = nay.nextInt();
        
        int luas = sisi * sisi;
        System.out.println("luas : " + luas);
    }
}
