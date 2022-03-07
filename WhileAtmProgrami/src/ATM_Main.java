
import java.util.Scanner;


public class ATM_Main {
    public static void main(String[] args) {
        /*
        
        While dongusu yardimiyla bir tane ATM programi yapiyoruz.
        
        Islemler
        1.Islem : Bakiye Ogrenme
        2.Islem : Para Cekme
        3.Islem : Para Yatirma
        Cikis : 9
        
        */

            Scanner scanner = new Scanner(System.in);
            int bakiye = 1000;
            int sifre = 12345;
            
            String islemler =    "      *TUNC BANK* \n"
                                + "      HOSGELDINIZ\n"
                                + "1.Islem : Bakiye Ogrenme\n" 
                                + "2.Islem : Para Cekme\n" 
                                + "3.Islem : Para Yatirma\n" 
                                + "Cikis icin 9'e basin";

            System.out.println("-------------------------------------");
            System.out.println(islemler);     
            System.out.println("-------------------------------------");                             

            while(true) {
                System.out.println("Islemler icin Enter'a basiniz");
                scanner.nextLine();
                System.out.print("Yapmak Isteginiz Islemi Seciniz: ");
                String islem = scanner.nextLine();
                
                if (islem.equals("9")) {
                    
                    System.out.println("Programdan cikiliyor.. IYI GUNLER DILERIZ.");
                    break;
                }
                else if (islem.equals("1")){
                    System.out.println("Bakiyeniz : " + bakiye);
                    
                }
                else if (islem.equals("2")){
                    System.out.println("Cekmek istediginiz tutari giriniz: " );
                    int ist_tutar =  scanner.nextInt();
                    scanner.nextLine();    /* Int uzerinden scanner alinca while dongusunde yukaridaki scannerline ile cakisiyor 
                    onun onune gecmek icin her zaman int scanner varsa scannar next line ekle!!
                    */
                    if (bakiye - ist_tutar < 0) {
                        
                        System.out.println("Bakiyeniz Yetersiz, Hesabinizda " + bakiye + "$ var.");
                    }
                    else {
                        bakiye -= ist_tutar;
                        System.out.println("Yeni bakiyeniz : " + bakiye + "$");
                    }
                }
                else if (islem.equals("3")){
                    System.out.println("Yatirmak istediginiz tutari giriniz: " );
                    int yat_tutar = scanner.nextInt();
                    scanner.nextLine();
                    
                    bakiye += yat_tutar;
                    
                    System.out.println("Yeni bakiyeniz " + bakiye + "$");
                    
                }
                
                else {
                    
                    System.out.println("Gecersiz Islem..!");
                }
                
                
                
                
                
                
            }








    }
}
