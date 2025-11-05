package P11;
import java.util.Scanner;
public class ArrayNilai16 {
    public static void main(String[] args) {
    

    Scanner dito = new Scanner(System.in);

    int nilaiAkhir16[]= new int[10];    
    for (int i=0; i<nilaiAkhir16.length; i++){
        System.out.print("Masukkan nilai akhir ke- "+i+" : ");
        nilaiAkhir16[i]= dito.nextInt();
        
    }
    
    for (int i=0; i<10; i++){
        if (nilaiAkhir16[i]>70){
            System.out.println("Mahasiswa ke- "+ i +" Lulus!");
        }else {
            System.out.println("Mahasiswa ke- "+ i+" Tidak Lulus!");
        }
    }
}
}