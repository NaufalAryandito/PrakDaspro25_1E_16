package P10;

import java.util.Scanner;

public class Square16 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);

        System.out.print("Masukkan nilai N= ");
        int N16 = dito.nextInt();
        for (int iouter16 = 1; iouter16 <= N16; iouter16++) {
            for (int i16 = 0; i16 <= N16; i16++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}