package P10;
import java.util.Scanner;
public class Triangle16 {
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);
    System.out.print("Masukkan nilai n= ");
    int n16= dito.nextInt();
    
    int i16= 0;
    while (i16 <= n16){
        int j16= 0;
        while(j16 < i16){
            System.out.print("*");
            j16++;
        }
        System.out.println();
        i16++;
    }


}
}