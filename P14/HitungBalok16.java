package P14;

import java.util.Scanner;

public class HitungBalok16 {
    static int hitungLuas16(int pjg16, int lb16) {
        int Luas16 = pjg16 * lb16;
        return Luas16;
    }

    static int hitungVolum16(int tinggi16, int a, int b) {
        int Volum16 = hitungLuas16(a, b) * tinggi16;
        return Volum16;
    }

    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);

        int p16, l16, t16, L16, vol16;

        System.out.print("Masukkan panjang: ");
        p16 = dito.nextInt();

        System.out.print("Masukkan lebar: ");
        l16 = dito.nextInt();

        System.out.print("Masukkan tinggi: ");
        t16 = dito.nextInt();

        L16 = hitungLuas16(p16, l16);
        System.out.println("Luas persegi panjang adalah: " + L16);

        vol16 = hitungVolum16(t16, l16, p16);
        System.out.println("Volume balok adalah: " + vol16);

        dito.close();
    }
}