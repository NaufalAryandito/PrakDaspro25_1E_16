package P10;
import java.util.Scanner;
public class Star16 {

    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);
        
        System.out.print("Masukkan nilai n=");
        int n16= dito.nextInt();

        for (int i=1; i<=n16; i++){
            System.out.print("*");
        }
    }
}