package P10;
import java.util.Scanner;
public class TugasKafe16 {
    public static void main(String[] args) {
    Scanner dito= new Scanner(System.in);
        int jmlTotalPlgn16=0, jmlItemterjual16=0;
        
    System.out.print("Jumlah cabang= ");
    int jmlCbg16= dito.nextInt();
    System.out.println("== Input Per Cabang ==");

    for (int i16=1; i16<=jmlCbg16; i16++){
        System.out.println("-"+"Cabang"+" "+i16+"-");
        System.out.print("Jumlah pelanggan=");
        int jmlPlgn16= dito.nextInt();
        int jmlItem16=0;
        for (int j16=1; j16<=jmlPlgn16; j16++){
            System.out.print("-Pelanggan"+" "+j16+" "+"memesan berapa item? ");
            int item16= dito.nextInt();
            jmlItem16+=item16;

        }
        jmlTotalPlgn16+=jmlPlgn16;
        jmlItemterjual16+=jmlItem16;
        System.out.println("Cabang"+" "+i16+":");
        System.out.println("-Pelanggan: "+jmlPlgn16);
        System.out.println("-Item terjual: "+jmlItem16);
        System.out.println();
    }
    System.out.println("Total Seluruh cabang");
    System.out.println("Pelanggan: "+jmlTotalPlgn16);
    System.out.println("Item Terjual: "+jmlItemterjual16);
     }
}
