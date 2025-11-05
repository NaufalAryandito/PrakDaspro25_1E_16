package P11;
import java.util.Scanner;
public class Arrayratanilai16 {

    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);

        int[] nilaiMhs16= new int[10];
        double total16=0;
        double rata216;

        for (int i=0; i< nilaiMhs16.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke- "+(i+1)+" : ");
            nilaiMhs16[i]= dito.nextInt();

            total16+=nilaiMhs16[i];
        }
        rata216= total16/nilaiMhs16.length;
        System.out.println("Rata-Rata nilai= "+rata216);
    }
}