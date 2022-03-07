
import java.util.Scanner;

public class Deneme {
    public void hesapmak() {
        Scanner scanner = new Scanner(System.in);
        String islemler = "Toplama islemi icin 1'e basin\n"
                        + "Cikarma islemi icin 2' ye basin\n"
                        + "Carpma islemi icin 3'e basin\n"
                        + "Bolme islemi icin 4'e basin\n"
                        + "Cikmak icin 5'e basin";
                
                
        System.out.println("********************************");
        System.out.println(islemler);
        System.out.println("********************************");

        
        
        System.out.println("Lutfen bir islem seciniz");
        
        String islem = scanner.next();
        
        int a;
        int b;
        
        while (true)
            
        switch (islem) {
        case "1":
            
            System.out.println("Birinci Sayi: ");
            a = scanner.nextInt();
                    
            System.out.println("Ikinci Sayi: ");
            b = scanner.nextInt();
            
            System.out.println("Sonuc : " + (a+b)); 
            
            break;
        case "2":
            
            System.out.println("Birinci Sayi: ");
            a = scanner.nextInt();
                    
            System.out.println("Ikinci Sayi: ");
            b = scanner.nextInt();
            
            System.out.println("Sonuc : " + (a-b)); 
            
            break;
        case "3":
            
            System.out.println("Birinci Sayi: ");
            a = scanner.nextInt();
                    
            System.out.println("Ikinci Sayi: ");
            b = scanner.nextInt();
            
            System.out.println("Sonuc : " + (a*b)); 
            
            break;
         case "4":
            
            System.out.println("Birinci Sayi: ");
            a = scanner.nextInt();
                    
            System.out.println("Ikinci Sayi: ");
            b = scanner.nextInt();
            
            System.out.println("Sonuc : " + ((double)a / b)); 
            
            break;
            
         case "5":
                 
              System.out.println("Hesap Makinesi Kapatiliyor.. Tesekkurler");
              break;
              
         default:
         
            System.out.println("Gecersiz Islem Girdiniz..");
                
            
                
      }
             
        
    }
}
