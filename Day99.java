package Belajar;

import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = n.nextInt();
        System.out.println("Bilangan prima dari 1 sampai "+N+" adalah : ");

        for (int i = 2; i <= N; i++) {
            boolean prima = true;
            
            for (int j = 2; j < i; j++) {
                if (i %  j == 0){
                    prima = false;
                    break;
                }
            }

            if (prima){
                System.out.print(i + " ");
            }
        }
    }
    
}
