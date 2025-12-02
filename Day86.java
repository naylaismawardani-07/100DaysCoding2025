package Belajar;

public class Day86 {
    public static void main(String[] args) {
        int[] nilai = {60, 50, 78, 80, 95};
        int min = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < min){
                min = nilai[i];
            }
        }
        System.out.println("Nilai Minimal : "+min);
    }
    
}
