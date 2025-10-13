package P7;
import java.util.Scanner;
public class CM_SIAKAD_16 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);    
        int sksP=2, sksD=3, sksI=2;
        
    System.out.println("====INPUT DATA MAHASISWA====");
        System.out.print("Nama :");
        String nama16= dito.next();
        System.out.println("NIM :");
        long nim16= dito.nextLong();
   
    System.out.println("Masukkan Nilai 0-100");
    System.out.print("Pancasila =");
    int nilaiP16= dito.nextInt();
    System.out.print("Dasar Pemrograman =");
    int nilaiD16 = dito.nextInt();
    System.out.print("Bahasa Inggris =");
    int nilaiI16 = dito.nextInt();

    System.out.println("====================================");
    System.out.println("HASIL KONVERSI NILAI MAHASISWA");
    System.out.println("====================================");
    System.out.println("Nama :"+"\t"+nama16);
    System.out.println("NIM : "+"\t"+nim16);
    System.out.println("-----------------------------------------------------------------");
    System.out.println("Mata Kuliah   \t\tSKS    \tNilai Huruf       Nilai Setara");
    System.out.println("------------------------------------------------------------------");

    double nilaiSetara=0, nilaiSetara1=0, nilaiSetara2=0;
    String nilaiHuruf= "";
    if (nilaiP16>80 && nilaiP16<=100) {
       System.out.println("Pancasila \t\t 2 \t A \t\t 4");
        nilaiSetara= 4;
        nilaiHuruf = "A";
      
    }else if (nilaiP16>73 && nilaiP16<=80 ){
    System.out.println("Pancasila \t\t 2 \t B+ \t\t 3,5");
        nilaiSetara=3.5;
        nilaiHuruf = "B+";
       
    }else if (nilaiP16>65 && nilaiP16<=73){
        System.out.println("Pancasila \t\t 2 \t B- \t\t 3");
        nilaiSetara=3;
        nilaiHuruf = "B-";
        
    }else if (nilaiP16>60 && nilaiP16<=65){
        System.out.println("Pancasila \t\t 2 \t C+ \t\t 2,5");
         nilaiSetara=2.5;
        nilaiHuruf = "C+";
        
    }else if (nilaiP16>50 && nilaiP16<=60){
        System.out.println("Pancasila \t\t 2 \t C \t\t 2 ");
         nilaiSetara= 2;
         nilaiHuruf = "C";
        
    }else if (nilaiP16>39 && nilaiP16<=50){
        System.out.println("Pancasila \t\t 2 \t D \t\t 1");
         nilaiSetara= 1;
         nilaiHuruf = "D";
    }else if (nilaiP16<=39){
        System.out.println("Pancasila \t\t 2 \t E \t\t 0");
         nilaiSetara=0;
        nilaiHuruf = "E";
         
    }else if(nilaiP16<0 || nilaiP16>100){
        System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0-100");
    System.exit(0);
;
    }
    
    
    String nilaiHuruf1 ="";
    
   
     if (nilaiD16>80 && nilaiD16<=100) {
       System.out.println("Dasar Pemrograman \t 2 \t A \t\t 4");
       nilaiSetara1= 4;
       nilaiHuruf1 = "A";
      ;
    }else if (nilaiD16>73 && nilaiD16<=80 ){
        System.out.println("Dasar Pemrograman \t 2 \t B+ \t\t 3,5");
        nilaiSetara1=3.5;
        nilaiHuruf1 = "B+";
       
    }else if (nilaiD16>65 && nilaiD16<=73){
        System.out.println("Dasar Pemrograman \t 2 \t B- \t\t 3");
         nilaiSetara1=3;
        nilaiHuruf1 = "B-s";
        
    }else if (nilaiD16>60 && nilaiD16<=65){
        System.out.println("Dasar Pemrograman \t 2 \t C+ \t\t 2,5");
         nilaiSetara1=2.5;
        nilaiHuruf1 = "C+";
        
    }else if (nilaiD16>50 && nilaiD16<=60){
        System.out.println("Dasar Pemrograman \t 2 \t C \t\t 2 ");
         nilaiSetara1= 2;
        nilaiHuruf1 = "C";
       
    }else if (nilaiD16>39 && nilaiD16<=50){
        System.out.println("Dasar Pemrograman \t 2 \t D \t\t 1");
         nilaiSetara1= 1;
       nilaiHuruf1 = "D";
     
    }else if (nilaiD16<=39){
        System.out.println("Dasar Pemrograman \t 2 \t E \t\t 0");
        nilaiSetara1=0;
        nilaiHuruf1 = "E";
        
    }else if(nilaiD16<0 || nilaiD16>100){
        System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0-100");
       System.exit(0); 
    }
    
   
    String nilaiHuruf2="";
     if (nilaiI16>80 && nilaiI16<=100) {
       System.out.println("Bahasa Inggris \t\t 2 \t A \t\t 4");
        nilaiSetara2= 4;
        nilaiHuruf2="A";
        
    } else if (nilaiI16>73 && nilaiI16<=80 ){
        System.out.println("Bahasa Inggris \t\t 2 \t B+ \t\t 3,5");
        nilaiSetara2=3.5;
        nilaiHuruf2="B+";
         
    }else if (nilaiI16>65 && nilaiI16<=73){
        System.out.println("Bahasa Inggris \t\t 2 \t B- \t\t 3");
        nilaiSetara2=3;
        nilaiHuruf2="B-";
        
    }else if (nilaiI16>60 && nilaiI16<=65){
        System.out.println("Bahasa Inggris \t\t 2 \t C+ \t\t 2,5");
        nilaiSetara2=2.5;
        nilaiHuruf2="C+";
       
    }else if (nilaiI16>50 && nilaiI16<=60){
        System.out.println("Bahasa Inggris \t\t 2 \t C \t\t 2 ");
        nilaiSetara2= 2;
        nilaiHuruf2="C";
        
    }else if (nilaiI16>39 && nilaiI16<=50){
        System.out.println("Bahasa Inggris \t\t 2 \t D \t\t 1");
        nilaiSetara2= 1;
        nilaiHuruf2="D";
        
    }else if (nilaiI16<=39){
        System.out.println("Bahasa Inggris \t\t 2 \t E \t\t 0");
        nilaiSetara2=0;
        nilaiHuruf2="E";
        
    }else if(nilaiI16<0 || nilaiI16>100){
        System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0-100");
     System.exit(0); 
    }
   double ip16= ((nilaiSetara*sksP)+(nilaiSetara1*sksD)+(nilaiSetara2*sksI))/7;
     double totalBobot= ((nilaiSetara*sksP)+(nilaiSetara1*sksD)+(nilaiSetara2*sksI));

     System.out.println("Nilai Bobot :"+totalBobot);
     System.out.println("Indeks Prestasi (IP) :"+ip16);
     
    if (ip16 >= 2.00) {
            if (nilaiP16 >= 50) {
                    if (nilaiD16 >39) {
                        if (nilaiI16>39) {
                            System.out.println("Status Semester= Lulus ");
                        } else 
                           System.out.println("Status Semester= Tidak Lulus ");
                } else
                     System.out.println("Status Semester= Tidak Lulus "); 
            } else
                 System.out.println("Status Semester= Tidak Lulus Nilai Pancasila D atau E ");
        } else
            System.out.println("Status Semester= Tidak Lulus ");
    } 
}

