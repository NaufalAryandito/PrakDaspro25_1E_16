package P11;
import java.util.Scanner;
public class Arrayratanilai16 {

    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);

        int[] nilaiMhs16= new int[10];
        double total16=0, totalLulus16=0, totalTakLulus16=0;
        double rata216, rataLulus16=0, rataTaklulus16=0;
        int lulus16=0, takLulus16=0;
        int jmlMhs16;
    

        System.out.println("Masukkan Jumlah Mahasiswa: ");
        jmlMhs16= dito.nextInt();
        
        for (int i=0; i<jmlMhs16; i++){
            System.out.print("Masukkan nilai mahasiswa ke- "+(i+1)+" : ");
            nilaiMhs16[i]= dito.nextInt();

            total16+=nilaiMhs16[i];
           
            if(nilaiMhs16[i]>70){
                totalLulus16+= nilaiMhs16[i];
                lulus16++;
            }else {
                totalTakLulus16+=nilaiMhs16[i];
                takLulus16++;
                
            }
            
        }
        rataLulus16= totalLulus16/lulus16;
        rataTaklulus16= totalTakLulus16/takLulus16;
        System.out.println("rata lulus: "+rataLulus16);
        System.out.println("rata tidak lulus: "+ rataTaklulus16);
        rata216= total16/jmlMhs16;
    }
}