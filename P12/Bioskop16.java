package P12;

public class Bioskop16 {
    public static void main(String[] args) {
        
        String [][] penonton16= new String[4][2];
        penonton16[0][0]= "Amin";
         penonton16[0][1]="Bena";
         penonton16[1][0]="Candra";
         penonton16[1][1]="Dela";
         penonton16[2][0]="Eka";
         penonton16[2][1]="Farhan";
         penonton16[3][0]="Gisel";
         penonton16[3][1]="Hana";

         System.out.printf("%s \t %s\n", penonton16[0][0], penonton16[0][1]);
         System.out.printf("%s \t %s\n", penonton16[1][0], penonton16[1][1]);
          System.out.printf("%s \t %s\n", penonton16[2][0], penonton16[2][1]);
           System.out.printf("%s \t %s\n", penonton16[3][0], penonton16[3][1]);

           System.out.println(penonton16.length);
           System.out.println(penonton16[0].length);
           System.out.println(penonton16[1].length);
           System.out.println(penonton16[2].length);
           System.out.println(penonton16[3].length);
        }
}
