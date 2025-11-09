package P11;
import java.util.Scanner;
public class Tugas1array116 {
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);

        System.out.print("Masukkan nilai yang akan diinput= ");
        int jm16= dito.nextInt();

        int [] arrayNilai16= new int[jm16];

        int tertinggi16=0;
        int terendah16=100;
        int total16=0;
        int rata16=0;
        for(int i=0; i<jm16; i++){
            System.out.println("Masukkan Nilai Mahasiswa Ke- "+(i+1)+" = ");
            arrayNilai16[i]=  dito.nextInt();

            total16+=arrayNilai16[i];
            
            
            if(arrayNilai16[i]>tertinggi16){
            tertinggi16=arrayNilai16[i];
            }
            if(arrayNilai16[i]<terendah16){
            terendah16=arrayNilai16[i];
            }
        }
        rata16= total16/jm16;
System.out.println("Total Rata Rata= "+ rata16);
System.out.println("Nilai Tertinggi= "+ tertinggi16);
System.out.println("Nilai Terendah= "+ terendah16);
for (int i=0; i<jm16; i++)
 System.out.println("Mahasiswa ke- "+ (i+1) +" nilai nya adalah: "+arrayNilai16[i]);
 System.out.println();
    }
}
