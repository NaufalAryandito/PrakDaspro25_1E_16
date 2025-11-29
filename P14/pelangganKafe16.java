package P14;

public class pelangganKafe16 {
    static void daftarPengunjung16(String...namaPengunjung16){
        System.out.println("Daftar Nama Pengunjung: ");
       for (String nama16 : namaPengunjung16) {
        
           System.out.println("- "+ nama16);
       } 
        
        }
       public static void main(String[] args) {
    
        daftarPengunjung16("Ali","Budi","Citra");
        daftarPengunjung16("Andi");
        daftarPengunjung16("Doni","Eti","Fahmi","Galih");
    }
}
