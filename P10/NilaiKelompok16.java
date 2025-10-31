package P10;
import java.util.Scanner;
public class NilaiKelompok16 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);
        int i16= 1, j16;
        float totalNilai16, nilai16, rataNilai16;
        while (i16<=6) {
            System.out.println("Kelompok"+" "+ i16);

            totalNilai16=0;
            for (j16=1; j16<=5; j16++){
                System.out.print("\r Nilai Dari Kelompok Penilai"+" " +j16+":");
                nilai16= dito.nextFloat();

                totalNilai16+=nilai16;
            }
            rataNilai16= totalNilai16/5;
            System.out.println("Kelompok"+" "+i16+":"+ "Nilai Rata Rata="+" "+rataNilai16);
            i16++;
            
        }


    }
}
