package Day28;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan angka 1 : ");
        int a = n.nextInt();
        System.out.print("Masukkan angka 2 : ");
        int b = n.nextInt();
        
        System.out.println("apakah angka 1 sama dengan angka 2? "+ (a==b));
        System.out.println("apakah angka 1 tidak sama dengan angka 2? "+(a!=b));
    }
}
