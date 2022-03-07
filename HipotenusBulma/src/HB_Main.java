
import java.util.Scanner;


public class HB_Main {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    int a;
    int b;
    
        System.out.print("Birinci Kenarin Uzunlugu: ");
        a = scanner.nextInt();
        System.out.print("Ikinci Kenarin Uzunlugu: ");
        b = scanner.nextInt();
        
        double h = Math.sqrt((a*a) + (b*b)); // int olursa calismayabilir 
                // Math.sqrt karakok olma formulune karsilik geliyor.
                
        System.out.println("Hipotenusun degeri = " + h);
             
        
        
             
    }
}
