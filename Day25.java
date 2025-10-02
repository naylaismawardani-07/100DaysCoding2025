package Belajar;
import java.util.Scanner;
public class Day25 {
    public static void main(String[] args) {
        Scanner nay = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int i = nay.nextInt();

        i++;
        System.out.println("increment : " + i);
        ++i;
        System.out.println("pre increment : " + i);
        
        i--;
        System.out.println("decrement : " + i);
        --i;
        System.out.println("pre decrement : " + i);
    }
}
