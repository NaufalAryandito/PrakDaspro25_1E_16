package P11;
import java.util.Scanner;
public class SearchNilai16 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);
        int key16;
        int hasil16=0;
        
        System.out.print("Masukkan nilai yang akan diinput= ");
        int jml16= dito.nextInt();
        
        int []  arrNilai16= new int[jml16];
        
        for (int i=0; i<jml16;i++){
            System.out.println("Masukkan nilai mahasiswa ke- "+ (i+1) + " = ");
            arrNilai16[i]= dito.nextInt();
        }
        
        
        System.out.println("Masukkan nilai yang akan dicari= ");
        key16= dito.nextInt();
        

    
    for (int i=0; i<arrNilai16.length; i++){
        if (arrNilai16[i] == key16){
            hasil16 = i+1;
            break;
        }
        
        if (key16!=arrNilai16[i]){
    
            System.out.println("Nilai yang dicari tidak ditemukan");
            System.exit(0);
    }
}
System.out.println();
System.out.println("Nilai "+ key16+" Ketemu, merupakan nilai mahasiswa ke- "+hasil16);
System.out.println();
}
}
