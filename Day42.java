package Belajar;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Nama Pegawai : ");
        String nama = n.nextLine();
        System.out.println("======== Pekrjaan ========");
        System.out.println("1. PNS");
        System.out.println("1. Freelencer");
        System.out.println("===========================");
        System.out.print("Pilih Pekerjaan : ");
        int pilihan = n.nextInt();
        System.out.print("Penghasilan : ");
        double penghasilan = n.nextDouble();

        String Pekerjaan = "";
        int PajakPersen = 0;

        if(pilihan == 1){
            Pekerjaan = "PNS";
            if (penghasilan >= 5000000){
                PajakPersen = 15;
            }else if (penghasilan >= 3000000 && penghasilan < 5000000){
                PajakPersen = 10;
            }else {
                PajakPersen = 0;
            }
        }else if (pilihan == 2){
            Pekerjaan = "Freelencer";
            if (penghasilan >= 5000000){
                PajakPersen = 8;
            }else if (penghasilan >= 3000000 && penghasilan < 5000000){
                PajakPersen = 3;
            }else {
                PajakPersen = 0;
            }
        }else {
            System.out.println("Pilihan tidak tersedia");
        }
        double Potongan = penghasilan *PajakPersen/100;
        double GajiBersih = penghasilan - Potongan;

        System.out.println("================================");
        System.out.println("Nama Pegawai\t\t : "+ nama);
        System.out.println("Jenis Pekerjaan\t\t : "+pilihan);
        System.out.println("Penghasilan Kotor\t : Rp"+penghasilan);
        System.out.println("Pajak Dikenakan\t\t : "+PajakPersen + "%");
        System.out.println("Potongan Pajak\t\t : "+ Potongan);
        System.out.println("Penghasilan Bersih\t : "+GajiBersih);
    }
    
}
