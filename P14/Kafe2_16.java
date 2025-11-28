package P14;
public class Kafe2_16 {

    public static void Menu16(String namapelanggan16, boolean isMember, String kodePromo16) {
        System.out.println("Selamat datang, "+namapelanggan16+" !");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

     System.out.println("==== MENU RESTO KAFE===");
        System.out.println("1. Kopi Hitam -Rp 15,000");
        System.out.println("2. Capuccino -Rp 20,000");
        System.out.println("3. Latte -Rp 22,000");
        System.out.println("4. Teh Tarik -Rp 12,000");
        System.out.println("5. Roti Bakar -Rp 10,000");
        System.out.println("6. Mie Goreng -Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");

        if (kodePromo16.equals("DISKON50")) {
            System.out.println("Kode promo valid: Diskon 50%");
        }else if (kodePromo16.equals("DISKON30")){
            System.out.println("Kode promo valid: Diskon 30%");
        }else {
            System.out.println("Kode promo tidak valid");
        }

    }
    public static void main(String[] args) {
        Menu16("Andi", true, "DISKON50");
        Menu16("Dito", true, "DISKON30");
        Menu16("Arjun", true, "DISKON20");
    }
}
