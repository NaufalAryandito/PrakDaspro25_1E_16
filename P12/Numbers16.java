package P12;

import java.util.Arrays;

public class Numbers16 {
    public static void main(String[] args) {
        int[][] myNumbers16= new int[3][];
        
        myNumbers16[0]= new int[5];
        myNumbers16[1]= new int[3];
        myNumbers16[2]= new int[1];

        for (int i = 0; i < myNumbers16.length; i++) {
            System.out.println(Arrays.toString(myNumbers16[i]));
            System.out.println("Panjang baris ke- "+(i+1)+" : "+ myNumbers16[i].length);
        }
    }
}
