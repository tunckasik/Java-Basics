
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner1 = new Scanner(System.in);
        
         
         System.out.println("Lutfen yasinizi girin: ");
        
        /* int yas = scanner.nextInt();
        
        System.out.println("Yasiniz: " + yas);
        
        
        ----------------------
        
        // double sayi = scanner.nextDouble(); (Burada virgullu sayi girmemiz gerekiyor.
        
        /*System.out.println("Lutfen Yazi giriniz: ");
        
        String yazi = scanner.nextLine();
        
        System.out.println("Girdiniz yazi;"
                + ""); */
       //scanner1.nextLine(); //Dummy deniyor buna ilave inputlar icin kullaniliyor
         
        if (scanner1.hasNextInt()){
           
            
            int sayi = scanner1.nextInt();
            System.out.println("Yasiniz: " + sayi);
        }
        else { 
              System.out.println("Lutfen gecerli bir yas giriniz!");  
        
         
         
         
        }
        
        System.out.println("Lutfen isminizi girin: ");
        scanner1.nextLine();
        if (!scanner1.hasNextLine()){
            System.out.println("Lutfen yazi karakterini kullaniniz..!");
        }
            
            else {
            String isim = scanner1.nextLine();
            
            System.out.println("Isminiz: " + isim);
        }
        
    }
}
