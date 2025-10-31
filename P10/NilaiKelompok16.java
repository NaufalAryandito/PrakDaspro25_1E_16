package P10;
import java.util.Scanner;
public class NilaiKelompok16 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);
        int i16= 1, j16;
        float totalNilai16, nilai16, rataNilai16,terendah16,tertinggi16;
        while (i16<=6) {
            System.out.println("Kelompok"+" "+ i16);

            totalNilai16=0;
             tertinggi16=0;
             terendah16=100;
            for (j16=1; j16<=5; j16++){
                System.out.print("\r Nilai Dari Kelompok Penilai"+" " +j16+":");
                nilai16= dito.nextFloat();

                if (nilai16>tertinggi16){
                    tertinggi16=nilai16;
                }
                if (nilai16<terendah16) {
                    terendah16=nilai16;
                }
                totalNilai16+=nilai16;
            }
            rataNilai16= totalNilai16/5;
            System.out.println("Kelompok"+" "+i16+":"+ "Nilai Rata Rata="+" "+rataNilai16);
            System.out.println("Nilai tertinggi: "+ tertinggi16);
            System.out.println("Nilai Terendah: "+ terendah16);
            i16++;

            
        }


    }
}
