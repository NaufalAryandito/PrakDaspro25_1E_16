package P6;

import java.util.Scanner;
public class sistemperpustakaan16 {
    public static void main(String[] args) {
      Scanner dito= new Scanner(System.in);
    
    System.out.println("Bawa KRS? (True/False)");
    boolean kartuMahasiswa16 = dito.nextBoolean();
    System.out.println("Apakah sudah registrasi online (True/False)");
    boolean registrasiOnline16= dito.nextBoolean();

    if (kartuMahasiswa16 || registrasiOnline16)  {
        System.out.println("Boleh Masuk");
    } else {
        System.out.println("Tidak Boleh Masuk");
    }
    }
        
    }

