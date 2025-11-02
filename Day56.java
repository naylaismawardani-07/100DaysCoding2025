package Belajar;

import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan jumlah ikan : ");
        int ikan = n.nextInt();
        int i =1;
        double total=0;
        do{
            double berat = n.nextDouble();
            if (berat <= 5){
                total += berat;
            }
            i++;
        }while(i <= ikan);
        System.out.printf("Total ikan yang bisa dijual : %.2f",total);
    } 
}
