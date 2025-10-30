package Belajar;
import java.util.Scanner;
public class Day53 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = n.nextInt();
        int i = 1;
        while (i <= angka){
            if (i == 15){
                break;
            }
            System.out.println("Angka : "+i);
            i++;
        }
        System.out.println("Program berhenti");
    }
    
}
