package Day14;

public class Main {
    
    public static void main(String[] args) {
        //Mengubah String menjadi Tipe Data Primitif
        String Nomor = "12";
        int angka = Integer.parseInt(Nomor);
        System.out.println(Nomor);
        
        String Huruf = "1";
        byte nama = Byte.parseByte(Huruf);
        System.out.println(Huruf);
        
        String Jam = "15";
        short bel = Short.parseShort(Jam);
        System.out.println(Jam);
        
        String Del = "2";
        long dek = Long.parseLong(Del);
        System.out.println(Del);
        
        String Adek = "0.5";
        double kk = Double.parseDouble(Adek);
        System.out.println(Adek);
        
        String Kakak = "2.1f";
        float dede = Float.parseFloat(Kakak);
        System.out.println(Kakak);
        
        String mama = "p";
        char papa = mama.charAt(0);
        System.out.println(mama);
        
        String Nenek = "true";
        boolean kakek = Boolean.parseBoolean(Nenek);
        System.out.println(Nenek);
        
        /* Mengubah String menjadi tipe data primitif adalah
         * proses mengubah teks menjadi angka, huruf, atau logika 
         * (int, double, char, boolean) agar bisa diproses program, 
         * dengan menggunakan method parse atau charAt dan ini digunakan sesuai kebutuhan
         */
    }
}
