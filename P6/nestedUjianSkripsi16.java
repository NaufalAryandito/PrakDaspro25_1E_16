package P6;
import java.util.Scanner;
public class nestedUjianSkripsi16 {
    public static void main(String[] args) {
        java.util.Scanner dito = new Scanner(System.in);
        String pesan16;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak) ="+ " ");
        String bebaskompen = dito.next();
        System.out.println("Masukkan jumlah log bimbingan Pembimbing 1 : ");
        int bimbinganP1_16= dito.nextInt();
        System.out.println("Masukkan jumlah log bimbingan Pembimbing 2 : ");
        int bimbinganP2_16= dito.nextInt();

        if (bebaskompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1_16 >= 8 && bimbinganP2_16 >= 4) {
            pesan16= "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
        }else if (bimbinganP1_16 < 8 && bimbinganP2_16 < 4){
            pesan16 = "Gagal! Log bimbingan P1 belum mencapai 8 kali dan P2 kurang dari 4 kali";
        } else if (bimbinganP1_16 < 8){
            pesan16= "Gagal! Log bimbingan P1 belum mencapai 8 kali";
        } else {
            pesan16= "Gagal! Log bimbingan P2 belum mencapai 4 kali";
        }
    } else {
        pesan16 = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
    }
     System.out.println(pesan16);
    }
}
       
    
