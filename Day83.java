package Belajar;

public class Day83 {
    public static void main(String[] args) {
        int [] angka = {10, 5, 15, 20, 25};
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        System.out.println("Total dari elemen array adalah "+total);
    }
    
}
