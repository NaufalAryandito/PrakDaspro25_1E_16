package P14;
import java.util.Scanner;
public class Kafe3_16 {
    public static int hitungTotalHarga16(int pilihanMenu16, int banyakItem16, String kodePromo16) {
        int[] hargaItems16 = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal16= hargaItems16[pilihanMenu16 -1]*banyakItem16;
        if (kodePromo16.equals("DISKON50")) {
            hargaTotal16*=0.5;
            System.out.println("Kode promo valid: Diskon 50% ");
        }else if (kodePromo16.equals("DISKON30")) {
            hargaTotal16*=0.3;
            System.out.println("Kode promo valid: Diskon 30%");
        }else{
            System.out.println("Kode promo tidak valid");
        }

        return hargaTotal16;
    }
        public static void Menu16(String namaPelanggan16){
          
        System.out.println("Selamat datang, "+namaPelanggan16+" !");

        System.out.println("==== MENU RESTO KAFE===");
           System.out.println("1. Kopi Hitam -Rp 15,000");
           System.out.println("2. Capuccino -Rp 20,000");
           System.out.println("3. Latte -Rp 22,000");
           System.out.println("4. Teh Tarik -Rp 12,000");
           System.out.println("5. Roti Bakar -Rp 10,000");
           System.out.println("6. Mie Goreng -Rp 18,000");
           System.out.println("==========================");
           System.out.println("Silahkan pilih menu yang anda inginkan");
    }
    public static void main(String[] args) {
        Scanner dito = new Scanner (System.in);
        Menu16("Andi");
       
        
        System.out.print("\nMasukkan nomor menu yang anda masukkan: "); 
        int pilihanMenu16= dito.nextInt();
        System.out.print("Masukkan jumlah item yang akan dipesan: ");
        int banyakItem16= dito.nextInt();
        System.out.println("Masukkan kode promo: ");
        String kodePromo16= dito.next();
       
        int totalHarga16 = hitungTotalHarga16(pilihanMenu16, banyakItem16, kodePromo16);
    System.out.println("Total harga untuk pesanan anda adalah: Rp."+totalHarga16 );
    }

}