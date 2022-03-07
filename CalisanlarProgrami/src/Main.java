
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
   
    /* 
    Calisanla Programi
    
    Calisan sinifi seklinde bir ust sinif 
    
    calisan sinifindan tureyen yazilimci adinda bir alt sinif
    calisan sinfindan tureyen yonetici adinda bir alt sinif
    */
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Calisanlar Programina Hosgeldiniz");
    
    
            
    String islemler = "Islemler...\n"
            + "1. Yazilimci Islemleri\n"
            + "2. Yonetici Islemleri\n"
            + "Cikis icin q'ya basin";
    
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");
        
        while(true){
    
            System.out.print("Ana Ekram Islemleri\n"
                             + "Islemi seciniz:");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                
                System.out.println("Sistemden cikiliyor");
                break;
            } 
            else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci ("Ibrahim", "TATLI", 44875, "Python, Java");
                String yazilimciIslem = "1.Format At\n"
                                     + "2. Bilgileri Goster\n"
                                     + "Cikis icin q'ya basin";
                System.out.println(yazilimciIslem);
            
                while (true){    //Yazilimci dongusu
                    
                    System.out.print("Islemi Seciniz: ");
                    String y_islem = scanner.nextLine();
                            
                    if (y_islem.equals("q")){
                        
                        System.out.println("Yazlimci Islemlerinden cikiliyor");
                        break;    //Bu break sadece icerdeki while true dongusunu sonlandirir disardaki while true devam eder.   
                    }
                    else if (y_islem.equals("1)")){
                       
                        System.out.println("Isletim Sistemi : ");
                        String isletimSistemi = scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);

                    }
                    else if (y_islem.equals("2")){
                        
                        yazilimci.bilgileriGoster();
                    } 
                    else {
                        
                        System.out.println("Gecersiz Islem");
                    }
                } //yazilimci islem blogunu kapattik diger while true devam ediyor.
            }    
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Muhammed", "CETIN", 44975);
                        
                String yoneticiIslem = "Yonetici Islemleri\n"
                                    + "1. Zam Yap\n"
                                    + "2. Bilgileri Goster\n"
                                    + "Cikis icin q'ya basin";   
                
                while (true){ // Yonetici Dongusu
                    
                    System.out.println("Islemi Seciniz: ");
                    String yonIslem = scanner.nextLine();
                
                if (yonIslem.equals("q")){
                    
                    System.out.println("Yonetici Islemlerinden Cikiliyor");
                }
                else if (yonIslem.equals("1")){
                    
                    System.out.println("Calisanlara ne kadar zam yapmk istiyorusunuz? : ");
                    int zamMiktari = scanner.nextInt();
                    scanner.nextLine();
                    yonetici.zamYap(200);
                }
                else if (yonIslem.equals("2")){
                    
                    yonetici.bilgileriGoster();
                }
                else {
                    System.out.println("Gecersiz Islem..!");
                } 
                   
                }       
            }
                
            else {
                        System.out.println("Gecersiz Yonetici Islemi");
            }
            
        }
            
    }          
            
}
      

 
    
    

