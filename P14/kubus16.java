package P14;
import java.util.Scanner;
public class kubus16 {
    
    static int hitungVolum16 (int sisi16){
        int Volum16= sisi16*sisi16*sisi16;
        return Volum16;
    }
    static int hitungLP16( int sisi16){
        int LP16 = 6*sisi16*sisi16;
        return LP16;
    }
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);

        int Vol16, LuasP16;

        System.out.println("Masukkan sisi: ");
        int sisi16= dito.nextInt();

        LuasP16 = hitungLP16(sisi16);
        System.out.println("Luas Permukaan kubus: "+LuasP16);
        Vol16= hitungVolum16(sisi16);
        System.out.println("Volume Kubus: "+ Vol16);


        dito.close();
    }
}
