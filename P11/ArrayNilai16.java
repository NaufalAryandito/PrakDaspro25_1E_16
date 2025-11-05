package P11;
import java.util.Scanner;
public class ArrayNilai16 {
    public static void main(String[] args) {
    

    Scanner dito = new Scanner(System.in);

    int nilaiAkhir16[]= new int[10];    
    for (int i=0; i<10; i++){
        System.out.print("Masukkan nilai akhir ke- "+i+" : ");
        nilaiAkhir16[i]= dito.nextInt();
        
    }
    
    for (int i=0; i<10; i++){
        System.out.println("Nilai akhir ke- "+i+" adalah "+nilaiAkhir16[i]);
    }
}
}