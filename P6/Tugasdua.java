package P6;
import java.util.Scanner;
public class Tugasdua {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);
        
        System.out.println("Masukkan angka");
        int angka16= dito.nextInt();
        
        int hasil16= angka16 %2 ;

        if (hasil16 == 0){
            System.out.println("genap");
        }else {
            System.out.println("ganjil");
        }
        }

        
    }

