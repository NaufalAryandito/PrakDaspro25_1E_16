package P11;
import java.util.Scanner;
public class Tugas3Array1 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);

        String[] menu16= {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.print("Masukkan makanan yang akan dicari= ");
        String namaMkn16= dito.nextLine();
        
        boolean ditemukan16= false;
        for ( int i = 0; i < menu16.length; i++) {
            if (menu16[i].equalsIgnoreCase(namaMkn16)) {
                ditemukan16= true;
                break;
            }
        }
        if (ditemukan16){
            System.out.println("Makanan tersedia");
        }else{
        System.out.println("Makanan tidak tersedia");
    }
}
}
