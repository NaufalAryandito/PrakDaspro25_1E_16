package P14;

public class pelangganKafe16 {
    static void daftarPengunjung16(String...namaPengunjung16){
        System.out.println("Daftar Nama Pengunjung: ");
        for (int i = 0; i < namaPengunjung16.length; i++) {
            System.out.println("- "+ namaPengunjung16[i]);
        }
        }
       public static void main(String[] args) {
    
        daftarPengunjung16("Ali","Budi","Citra");
        daftarPengunjung16("Andi");
        daftarPengunjung16("Doni","Eti","Fahmi","Galih");
    }
}
