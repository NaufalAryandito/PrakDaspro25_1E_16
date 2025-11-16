package P12;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);

        int[][] survei16= new int[10][6];
        double [] Ratajumlahsrv16= new double[6];
       
        
        double totalRata16=0;
        for ( int i = 0; i < 10; i++) {
            System.out.println("Respondensi "+(i+1));
            double Ratajumlahrsp16=0;
            
            for ( int j = 0; j < 6; j++) {
                System.out.print("Survei "+ (j+1) + " (1-5): ");
                survei16[i][j]= dito.nextInt();
                Ratajumlahrsp16+=survei16[i][j];
                Ratajumlahsrv16[j]+=survei16[i][j];
                totalRata16+=survei16[i][j];
            }
            System.out.println("Respondensi "+(i+1)+" rata rata adalah: "+ Ratajumlahrsp16/6);
        }
        for (int j = 0; j < 6; j++) {
            System.out.println("Rata-rata survei "+(j+1) +" : "+ Ratajumlahsrv16[j]/10);
            
        }
        double rata16=totalRata16/60;
        System.out.println("rata rata seluruhnya: "+ rata16);
        }
    }
     

