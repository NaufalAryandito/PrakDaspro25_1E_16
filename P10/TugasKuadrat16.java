package P10;
public class TugasKuadrat16 {
    public static void main(String[] args) {

        int n16=1;
        while (n16<=5) {
            System.out.print("n =  "+ n16+"-->"+" Jumlah Kuadrat");

            int jumlah16=0;
            for (int i16=1; i16<=n16; i16++){
                int kuadrat16= i16*i16;

                jumlah16+=kuadrat16;

                System.out.print(" "+kuadrat16);
                
                if (i16<n16) {
                    System.out.print(" "+"+");
                }
            }
            System.out.print("="+" "+jumlah16);
                System.out.println();
                n16++;
            }
        }
    }

