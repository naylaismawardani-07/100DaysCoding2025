package Day16;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka 1 : ");
        int A = input.nextInt();
        System.out.print("Masukkang Angka 2 : ");
        int B = input.nextInt();

        int HasilPerkalian = A*B;
        int HasilPembagian = A/B;
        System.out.println("Hasil Perkalian : "+HasilPerkalian);
        System.out.println("Hasil Pembagian : "+HasilPembagian);
    }
}
