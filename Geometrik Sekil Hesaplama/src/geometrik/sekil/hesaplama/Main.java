
package geometrik.sekil.hesaplama;

import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String Islemler = " Islemler...\n"
                + "1 - Kare Alani Hesapla \n"
                + "2 - Ucgen Alani Hesapla \n"
                + "3 - Daire Alani Hesapla \n"
                + "4 - Cikis ";
              
        while (true){
            System.out.println(Islemler);
            System.out.print("Hangi Seklin Alanini Hesaplamak Istiyoruz ? :");
            String sekilTuru = sc.nextLine();
            Sekil sekil = null;
            
            if (sekilTuru.equals("4")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else if (sekilTuru.equals("1")){
                System.out.print("Kenar Olcusu ? : ");
                int kenar = sc.nextInt();
                sc.nextLine();
                sekil = new Kare("Kare1", kenar);
                sekil.alanHesapla();
            }
            else if (sekilTuru.equals("2")){
                System.out.println("Kenar 1 : ");
                int kenar1 = sc.nextInt();
                System.out.println("Kenar 2 : ");
                int kenar2 = sc.nextInt();
                System.out.println("Kenar 3 : ");
                int kenar3 = sc.nextInt();
                sc.nextLine();
                sekil = new Ucgen("Ucgen 1", kenar1, kenar2, kenar3);
                sekil.alanHesapla();
            }
            else if (sekilTuru.equals("3")){
                
                System.out.println("Dairenin Yaricapi : ");
                int yaricap = sc.nextInt();
                sc.nextLine();
                
                sekil = new Daire("Daire 1", yaricap);
                sekil.alanHesapla();
                
            }
            else {
                System.out.println("Gecersiz Islem");
                
            }
        }        
    }
    
}
