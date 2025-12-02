package P14;
import java.util.Scanner;
public class NilaiMahasiswa16 {
    
    public static void isiArray16 (int nilaiArr16[], int jmlMhs16){
        Scanner dito= new Scanner(System.in);
       for (int i = 0; i < jmlMhs16; i++) {
           
           System.out.println("Masukkan nilai Mahasiswa ke "+ (i+1)+ " : ");
           nilaiArr16[i] = dito.nextInt();
       }
    }
       static void tampilArray16 (int nilaiArr16[], int jmlMhs16){
        System.out.println("Daftar Nilai Mahasiswa");
        for (int i = 0; i < jmlMhs16; i++) {
            System.out.println("Nilai mahasiswa ke- "+ (i+1) +"adalah :"+nilaiArr16[i]);
        }
    }
        static int hitTot16(int nilaiArr16[], int jmlMhs16){
            int total16=0;
            for(int i =0; i<jmlMhs16; i++){
                total16+=nilaiArr16[i];
            }
            System.out.println("Total Nilai Mahasiswa: "+total16);
            return total16; 
        }
       
    
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jmlMhs16= dito.nextInt();

        int[] NilaiMahasiswa16= new int[jmlMhs16];
        isiArray16(NilaiMahasiswa16, jmlMhs16);
        tampilArray16(NilaiMahasiswa16, jmlMhs16);
        hitTot16(NilaiMahasiswa16, jmlMhs16);
    }
    }

