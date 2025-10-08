package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS16 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);
        String pesan16;
        
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false) : ");
        boolean uktlunas16= dito.nextBoolean();

        if (uktlunas16){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
            } else {
                System.out.println("Registrasi ditolak. silahkan lunasi UKT terlebih dahulu");
            }

        
    }
    
}