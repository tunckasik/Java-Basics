
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
         
         System.out.println("Lutfen yasinizi girin: ");
        
        /* int yas = scanner.nextInt();
        
        System.out.println("Yasiniz: " + yas);
        
        
        ----------------------
        
        // double sayi = scanner.nextDouble(); (Burada virgullu sayi girmemiz gerekiyor.
        
        /*System.out.println("Lutfen Yazi giriniz: ");
        
        String yazi = scanner.nextLine();
        
        System.out.println("Girdiniz yazi;"
                + ""); */
       scanner.nextLine(); //Dummy deniyor buna ilave inputlar icin kullaniliyor
         
        if (scanner.hasNextInt()){
           
            
            int sayi = scanner.nextInt();
            System.out.println("Yasiniz: " + sayi);
        }
        else { 
              System.out.println("Lutfen gecerli bir yas giriniz!");  
        
         
         
         
        }
        
        System.out.println("Lutfen isminizi girin: ");
        scanner.nextLine();
        if (!scanner.hasNextLine()){
            System.out.println("Lutfen yazi karakterini kullaniniz..!");
        }
            
            else {
            String isim = scanner.nextLine();
            
            System.out.println("Isminiz: " + isim);
        }
        
    }
}
