
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Bir sayi giriniz: ");
        
        int sayi = scanner.nextInt();
        int toplam = 0;
        
        do {
            
            toplam += sayi % 10;
            System.out.println("toplam : " + toplam);
            sayi /= 10;
            System.out.println("sayi : " + sayi);
            
        } while(sayi>0)
        System.out.println("Rakamlarin toplami = " + toplam);
        
    }
}
