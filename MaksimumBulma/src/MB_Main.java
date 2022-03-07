
import java.util.Scanner;


public class MB_Main {
    public static void main(String[] args) {
        //Kullanici Alinan 3 Sayidan En Buyuk Sayiyi Bulma
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci Sayi: ");
        int a = scanner.nextInt();
        
        System.out.print("Ikinci Sayi: ");
        int b = scanner.nextInt();
        
        System.out.print("Ucuncu Sayi: ");
        int c = scanner.nextInt();
        
        int maks = -1;
        if (a >= b && a >= c) {
        
            maks = a;
        }
        
        else if (b >= a && b >= c) {
        
            maks = b;
        }
        
        else {
        
            maks = c;
        }
        
        System.out.println("Yazdiklariniz arasinda en buyuk sayi " + maks);
        
        
        
        
        
        
        
    }
}
