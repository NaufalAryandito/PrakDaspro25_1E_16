package P12;
import java.util.Scanner;
public class Siakad16 {
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in); 
       
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs16= dito.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul16= dito.nextInt();
        
        int[][] nilai16= new int[jmlMhs16][jmlMatkul16];

        for ( int i = 0; i < nilai16.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke- "+(i+1));
            double totalPersiswa16=0;

            for (int j = 0; j < nilai16[i].length; j++) {
                System.out.print("Nilai mata kuliah "+ (j+1)+" : ");
                nilai16[i][j]= dito.nextInt();
                totalPersiswa16+=nilai16[i][j];
            }
            System.out.println("Nilai rata rata: "+ totalPersiswa16/jmlMatkul16);
           
        }
        System.out.println("\n=================================");
        System.out.println("rata rata nilai setiap mata kuliah");

        for (int j = 0; j <jmlMatkul16; j++) {
            double totalPermatkul16=0;
            for (int i = 0; i < jmlMhs16; i++) {
                totalPermatkul16+=nilai16[i][j];
            }
            System.out.println("Mata Kuliah "+ (j+1)+ " : "+ totalPermatkul16/jmlMhs16);
        }
    }
}
