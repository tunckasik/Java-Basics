
import java.util.Scanner;


public class DDD_Main {
    public static void main(String[] args) {
 
    Scanner scanner = new Scanner(System.in);
    int birinci;
    int ikinci;
    
        System.out.print("Birinci Sayiyi Giriniz: ");
        birinci = scanner.nextInt();
        
        System.out.print("Ikinci Sayiyi Giriniz: ");
        ikinci = scanner.nextInt();
        
        System.out.println("BEFORE;");
        birinci = birinci;
        ikinci = ikinci;
        System.out.println("Birinci Sayi: " + birinci + " Ikinci Sayi: " + ikinci);
        
        int gecici = birinci;
        birinci = ikinci;
        ikinci = gecici;
        
        System.out.println("AFTER");
        System.out.println("Birinci Sayi: " + birinci + " Ikinci Sayi: " + ikinci); 
       
    }
}
