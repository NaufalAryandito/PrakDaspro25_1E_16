package P6;
import java.util.Scanner;

public class wifi16lagi {
        public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);
        String dosen, mahasiswa;
        int sks16;
        
        System.out.println("Siapa yang menggunakan?");
        String user16= dito.next();
       
        if (user16.equalsIgnoreCase("dosen")) {
            System.out.println("Akses Diberikan");
        }else if(user16.equalsIgnoreCase("mahasiswa")){
            System.out.println("Masukkan SKS");
            sks16 = dito.nextInt();
            if(sks16 >= 12){
            System.out.println("Akses diberikan");

            } else {
                System.out.println("Akses tidak diberikan");
            }
        }else {
        System.out.println("Akses tidak diberikan");
        }
            
        }
    }