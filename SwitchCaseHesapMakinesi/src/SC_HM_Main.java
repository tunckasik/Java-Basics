
import java.util.Scanner;


public class SC_HM_Main {
    public static void main(String[] args) {
        //Switch Case Kullanarak 4 islem yapan bir hesap makinesi tasarliyoruz.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**********************************");
        String islemler = "Toplama Islemi icin T'ye\n"   // \n alt satira devam etmesini sagliyor
                          +"Cikarma Islemi icin C'ye\n"
                          +"Carpma Islemi icin X'e\n"
                          +"Bolme Islemi icin B'e basiniz";
        
        System.out.println(islemler);
        System.out.println("***********************************"); 
                
        System.out.println("Lutfen Bir Islem Seciniz:");
        
        String islem = scanner.nextLine();
        int a;
        int b;
        
        switch (islem){
            case "T":
                System.out.print("Birinci Sayiyi Giriniz: ");
                 a = scanner.nextInt();
                System.out.print("Ikinci Sayiyi Giriniz: ");
                 b = scanner.nextInt();
                System.out.println("Girdiginiz sayilarin toplami " + (a + b));
                break;
            case "C":
                System.out.print("Birinci Sayiyi Giriniz: ");
                 a = scanner.nextInt();
                System.out.print("Ikinci Sayiyi Giriniz: ");
                 b = scanner.nextInt();
                System.out.println("Girdiginiz sayilarin farki " + (a - b));
                break;
             case "X":
                System.out.print("Birinci Sayiyi Giriniz: ");
                 a = scanner.nextInt();
                System.out.print("Ikinci Sayiyi Giriniz: ");
                 b = scanner.nextInt();
                System.out.println("Girdiginiz sayilarin carpimi " + (a * b));
                break;
            case "B":
                System.out.print("Birinci Sayiyi Giriniz: ");
                 a = scanner.nextInt();
                System.out.print("Ikinci Sayiyi Giriniz: ");
                 b = scanner.nextInt();
                System.out.println("Girdiginiz sayilarin bolumu " + ((double)a / b));
                break;
            default:
                System.out.print("Lutfen Gecerli bir harf giriniz ve buyuk harfle tusladiginizdan emin olunuz");                     
                        
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
               
    }
}
