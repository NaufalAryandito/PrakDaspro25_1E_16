package P10;
import java.util.Scanner;
public class TugasKotak16 {
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);
        
        System.out.print("Masukkan N (minimal 3)= ");
        int N16= dito.nextInt();

        if(N16<3){
            System.out.print("Mohon masukkan ulang!! minimal 3 ");
            return;
        }
       for(int i16= 1; i16<=N16; i16++){
        for (int j16= 1; j16<=N16; j16++){
            
        
            if (i16 == 1|| i16 == N16|| j16 == 1|| j16== N16){
        System.out.print(" "+N16);
        }else 
        System.out.print(" "+" ");
    }
    System.out.println();   

    }
    }
}
