package Belajar;

public class Day85 {
    public static void main(String[] args) {
        int[] nilai = {60, 50, 78, 80, 95};
        int max = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max){
                max = nilai[i];
            }
        }
        System.out.println("Nilai Maksimal : "+max);
    }
    
}
