package P12;

import java.util.Scanner;

public class BioskopWithScanner {

    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);
        int baris16, kolom16;
        String nama16, next16;

        String[][] penonton16 = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama16 = dito.nextLine();
            System.out.print("Masukkan baris: ");
            baris16 = dito.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom16 = dito.nextInt();
            dito.nextLine();

            penonton16[baris16 - 1][kolom16 - 1] = nama16;

            System.out.print("Input penonton lainnya?(y/n): ");
            next16 = dito.nextLine();

            if (next16.equalsIgnoreCase("n")) {


                break;

        
        }
        System.out.println("--Daftar Penonton--");
        for (int i = 0; i < penonton16.length; i++) {
            for (int j = 0; j<penonton16[i].length; j++) {
                System.out.print(penonton16[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
}