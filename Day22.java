package Day22;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner nay = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        double sisi = nay.nextDouble();
        
        double luas = sisi * sisi;
        System.out.println("luas : " + luas);
    }
}
