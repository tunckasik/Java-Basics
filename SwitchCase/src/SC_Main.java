
import java.util.Scanner;


public class SC_Main {
    public static void main(String[] args) {
    /*
    switch(op)  {
         case durum1:
             islemler
             break
        case durum2:
            islemler
            break
        
            //
            //
        default:
            islemler
            break
            
        }
        */
        
        //break fren gibi birsey, eger break olmazsa diger caseler uysun uymasin calirtiriyor.
        
        /*Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Merhaba"); 
        System.out.println("Diger dillerde ne demek?");
        System.out.println("Ingilizce icin 1'i");
        System.out.println("Fransizca icin 2'yi");
        System.out.println("Kinyarwanda icin 3'u");
        System.out.println("Zazaca icin 4'u");
        System.out.println("Tuslayin:");
        
        int islem = scanner.nextInt();                           
        switch(islem){
            case 1:
                System.out.println("Hello..!");
                break;
            case 2:
                System.out.println("Bonjour..!");
                break;
            case 3:
                System.out.println("Muraho..!");
                break;
            case 4:
                System.out.println("Selama..!");
                break;
            default:
                System.out.println("Gecerli bir tusa basiniz!");
                        
                        
             
            
           */
        
        Scanner scanner = new Scanner(System.in);
        
        
       
                
        String islemler = "     >Hesap Makinesi<\n" 
                        +"Toplama islemi icin 1'e basin\n"
                        + "Cikarma islemi icin 2' ye basin\n"
                        + "Carpma islemi icin 3'e basin\n"
                        + "Bolme islemi icin 4'e basin\n"
                        + "Cikmak icin 5'e basin";
                
                
        System.out.println("********************************");
        System.out.println(islemler);
        System.out.println("********************************");
        int a;
        int b;
        
        while (true) {
            System.out.println("\n"
                    + "----------------------");
            System.out.print("Lutfen bir islem turu seciniz : ");
            String islem = scanner.nextLine();
            System.out.println("----------------------");
                                
            if (islem.equals("5")){
            
            System.out.println("Hesap Makinesi Kapatiliyor.. Tesekkurler");
               break;    
            }
            
            else if (islem.equals("1")) {
        
            System.out.println("Toplama Islemi\n"
                    + "---------------------");
            System.out.print("Birinci Sayi: ");
            a = scanner.nextInt();
                    
            System.out.print("Ikinci Sayi: ");
            b = scanner.nextInt();
            
            System.out.print("Sonuc : " + (a+b)); 
            scanner.nextLine();
            }
            else if (islem.equals("2")) {
            System.out.println("Cikarma Islemi\n"
                    + "---------------------");
            System.out.print("Birinci Sayi: ");
            a = scanner.nextInt();
                    
            System.out.print("Ikinci Sayi: ");
            b = scanner.nextInt();
            
            System.out.print("Sonuc : " + (a-b)); 
            scanner.nextLine();
            }
            else if (islem.equals("3"))  {
            System.out.println("Carpma Islemi\n"
                    + "---------------------");
            System.out.print("Birinci Sayi: ");
            a = scanner.nextInt();
                    
            System.out.print("Ikinci Sayi: ");
            b = scanner.nextInt();
            
            System.out.print("Sonuc : " + (a*b)); 
            scanner.nextLine();
            }
            else if (islem.equals("4"))  {
            System.out.println("Bolme Islemi\n"
                    + "---------------------");
            System.out.print("Birinci Sayi: ");
            a = scanner.nextInt();
                    
            System.out.print("Ikinci Sayi: ");
            b = scanner.nextInt();
            
            System.out.print("Sonuc : " + ((double)a / b)); 
            scanner.nextLine();
            }
            
            else {
        
            System.out.println("Gecersiz Islem Girdiniz..\n"
                    + "Toplama islemi icin 1'e basin\n" 
                    + "Cikarma islemi icin 2' ye basin\n"
                    + "Carpma islemi icin 3'e basin\n" 
                    + "Bolme islemi icin 4'e basin\n" 
                    + "Cikmak icin 5'e basin");
            
            }
                   
        }   
    }
        
      
}

