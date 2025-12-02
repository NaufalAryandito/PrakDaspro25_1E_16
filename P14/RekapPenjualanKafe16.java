package P14;

public class RekapPenjualanKafe16 {
  static int[][] rekap16() {
    int[][] bnykPenjualan16 = {
        { 20, 20, 25, 20, 10, 60, 10 },
        { 30, 80, 40, 10, 15, 20, 25 },
        { 5, 9, 20, 25, 10, 5, 45 },
        { 50, 8, 17, 18, 10, 30, 6 },
        { 15, 10, 16, 15, 10, 10, 55 }
    };
    return bnykPenjualan16;
  }

  static void tampilPenjualan16(String menu16[], String hari16[], int[][] bnykPenjualan16) {
    for (int i = 0; i < hari16.length; i++) {
      System.out.print("\t\t" + hari16[i]);
    }
    System.out.println();

    for (int j = 0; j < menu16.length; j++) {
      System.out.println(menu16[j]);
      for (int i = 0; i < hari16.length; i++) {
        System.out.print("\t\t"+bnykPenjualan16[j][i]);

      }
      System.out.println();
    }
  }
  
  static void tertinggi16(String[] Menu16, int[][] bnykPenjualan16){
    int jualTertinggi16= 0;
    int totalTertinggi16 =0;
    
    for (int i = 0; i < Menu16.length; i++) {
      int total16=0;
      
      for (int j = 0; j < bnykPenjualan16[i].length; j++) {
        
        total16+=bnykPenjualan16[i][j];

        if (total16>totalTertinggi16) {
          totalTertinggi16=total16;
          jualTertinggi16=i;
        }

      }
    }
    System.out.println("Penjualan Tertinggi adalah ");
    System.out.println("Menu: "+Menu16[jualTertinggi16]+" Dengan total: "+ totalTertinggi16);
  }
  
  static void rataJual16(int [][] bnykPenjualan16, String[] Menu16){
    System.out.println();
    System.out.println("Rata Rata Per Menu adalah");
     for (int i = 0; i < Menu16.length; i++) {
      int total16=0;
      
      for (int j = 0; j < bnykPenjualan16[i].length; j++) {
        
        total16+=bnykPenjualan16[i][j];
      }
      double rata16= (double) total16/bnykPenjualan16[i].length;
      System.out.println("Menu: "+Menu16[i]+ " Rata-rata: "+ rata16);
}
  }
public static void main(String[] args) {
    String [] Menu16= {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    String [] Hari16={"Hari 1", "Hari 2","Hari 3", "Hari 4","Hari 5","Hari 6", "Hari 7"};
    int[][] dataRekap16= rekap16();
    
    tampilPenjualan16(Menu16, Hari16, dataRekap16);
    tertinggi16(Menu16, dataRekap16);
    rataJual16(dataRekap16, Menu16);

  }
  
}