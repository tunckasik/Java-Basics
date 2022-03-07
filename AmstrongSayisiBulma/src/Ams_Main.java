
import java.util.Scanner;


public class Ams_Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayiyi Giriniz:");
        int sayi= scanner.nextInt();
        System.out.print("Kac Basamakli ?:");
        int bas_sayisi = scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do {
            int bas_degeri = gecici_sayi % 10;
            gecici_sayi = gecici_sayi /= 10; // bunun yerine gecici_sayi /= 10;
            System.out.println("gecici sayi : " + gecici_sayi);
            toplam += Math.pow(bas_degeri, bas_sayisi);
            
        } while (gecici_sayi >0);
                
        if (sayi == toplam)  {
            
            System.out.println(sayi + ", bir Amstrong sayisidir.");
            
                      
        }  
        else {
            System.out.println(sayi + ", bir amstrong sayisi degildir.");
        }
                
        
        
        
        
        
        
    }
}
