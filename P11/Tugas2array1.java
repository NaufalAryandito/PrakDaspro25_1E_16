package P11;
import java.util.Scanner;
public class Tugas2array1 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);

        
        do{
            System.out.print("Masukkan Nama (Ketik 'selesai' jika sudah selesai): ");
            String nama16= dito.nextLine();
            
            if (nama16.equalsIgnoreCase("Selesai")) {
                System.exit(0);
            }
            
            System.out.println();
            int harganasiAyam16= 12000, hargacr16= 10000, hargakpHtm16= 4000, hargakpSu16= 5000; 
            System.out.print("Nasi Ayam= 12.000: ");
             int nasiAyam16= dito.nextInt();
            System.out.print("Croissant= 10.000: ");
            int cr16= dito.nextInt();
            System.out.print("Kopi hitam Es/Panas= 4.000: ");
            int kpHtm16= dito.nextInt();
            System.out.print("Kopi susu Es/Panas= 5.000: ");
             int kpSu16= dito.nextInt();
             
            
            dito.nextLine();
            
            String[] namaPesanan16={"Nasi Ayam", "Croissant", "Kopi hitam", "Kopi susu"};
             int[] menu16={nasiAyam16, cr16, kpHtm16, kpSu16};
             int[] harga16={harganasiAyam16, hargacr16, hargakpHtm16, hargakpSu16};

             int total16=0;
             System.out.println("==Rincian Pesanan " + nama16  + " ==" );
            for (int i = 0; i < namaPesanan16.length; i++) {
                int subtotal= menu16[i]*harga16[i];
                System.out.println(namaPesanan16[i] +" x "+ menu16[i]+ " = "+ " Rp."+ subtotal);
                total16+=subtotal;
            
            }
             System.out.println("Total Pembayaran= "+total16);
             System.out.println();
             
        }while (true);
    }
}
