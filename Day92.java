package Belajar;

public class Day92 {
    static void cekAngka(int a){
        if (a < 0){
            System.out.println("Angka negatif");
            return;
        }
        System.out.println("Angka positif");
    }
    public static void main(String[] args) {
        cekAngka(-5);
        cekAngka(10);
        cekAngka(0);
    }
    
}
