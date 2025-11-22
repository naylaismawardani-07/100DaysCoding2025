package Belajar;

import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan teks : ");
        String teks = n.nextLine();

        //isEmpety()
        if(teks.isEmpty()){
            System.out.println("teks kosong");
        }else{
            System.out.println("Teks tidak kosong");
        }
        
        //equals()
        if(teks.equals("apel")){
            System.out.println("Teks sama persis dengan apel");
        }else{
            System.out.println("tidak sama");
        }

        //equalsIgnoreCase()
        if(teks.equalsIgnoreCase("apel")){
            System.out.println("Teks sama dengan apel tapi tidak peduli huruf besar/kecil");
        }else{
            System.out.println("tidak sama");
        }

        //contains()
        if(teks.contains("apel")){
            System.out.println("Teks mengandung kata apel ");
        }else{
            System.out.println("Teks tidak mengandung kata apel");
        }
    }
    
}
