package Day21;

public class Main {
    
    public static void main(String[] args) {
        int a = 20;
        int b = 7;
        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Setelah ditukar: a = " + a + ", b = " + b);
        
        int c = 2;
        int d = 4;
        
        int temp = c;
        c = d;
        d = temp;
        System.out.println("Setelah ditukar: c = " + c + ", d = " + d);
    }
}
