
import java.util.Scanner;


        
public class BC_Main {
      public static void main(String[] args) {
        /*
            break anahtar kelimesi
         
            Dongu herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karsilastigi zaman calismasini durdurur.
            Boylelikle dongu hicbir kosula bagli kalmadan sonlanmis olur.
            
            break ifadesi sadece ve sadece icinde bulundugu donguyu sonlandirir. Eger ic ice donguler varsa
            ve icteki dongude break kullanildiysa sadece icteki dongu sona erer.
         
            continue anahtar kelimesi 
            
            Dongu herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karsilastigi zaman geri kalan 
            islemlerini yapmadan direk dongu blogunun basina doner.
        
        */ /*
        System.out.println("Ondan kucuk sayilar:");    
        int i = 0;
        
        while (i<21) {
            
            if (i == 10){
                break;
            }  //Break kendi icinde blok olmasi gerekiyor anladigim kadariyla!!
                System.out.println("i = " + i);
                i++;
            }
        }
        */
        /*
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Yalnizca pozitif sayi giriniz:");
            int islem = scanner.nextInt();
            
            if (islem == -1){
                
                System.out.println("Donguden cikiyor....demistim :D10");
                break;
            }
            System.out.println("islem :" + islem);
            
        }
        */
        /*
        for (int i = 0; i < 10 ; i++) {
            if (i == 3 || i == 5) {  //run yapinca 3 ve 5 sonuctan cikacak
                continue;              //dongunun basina don uyarisi.
        }                               // Continue while dongusunde sorun cikarabiliyor!!
          System.out.println("i = " + i);
        }
        NOTE: While dongusunde Continue kullanirken continue dan once baska bir ifade ile 
        donguyu devam ettirmezsek o limitin icinde donup durur artma ve 
        degisiklik yapamaz sikismis durumda kalmistir.
        
        */
        
        
       int i = 0;
       
       while (i < 11) {
            
           if (i == 3 || i == 5) {
           i++;                 // Bu continue kisir dongusunden cikarmamizi sagliyor 
               continue;
           }
           System.out.println("i : " + i);   
           i++;                 //Bu icerde arttis yaptiriyor 
           
       }
        
        
        
        
}
}