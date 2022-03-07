
import java.util.Scanner;


public class BKI_IF_Main {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan boy ve kilo degerlerine gore beden kitle indeksini hesapliyoruz
        ve asagidaki kosullara gore ekrana yazi yazdir
        
        BKI 18.5'un altindaysa --------> Zayif
        
        BKI 18.5 ile 25 arasindaysa --------> Normal
        
        BKI 25 ile 30 arasindaysa --------> Kilolu
        
        BKI 30'un ustundeyse ---------> Obez 
        */
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Merhaba Beden Kitle Indeksi Hesaplayicisina Hosgeldiniz");
        System.out.println("Lutfen asagiya boy ve kilo bilginizi giriniz");
        
        System.out.print("Boyunuz(cm): ");
        double boy = scanner.nextDouble();
        
        System.out.print("Kilonuz(kg) : ");
        double kilo = scanner.nextDouble();
     
        double bki = (kilo / (((boy * boy)/10000)));
        
        if (bki < 18.5) {
            System.out.println("Sizin BKI degeriniz: " + bki);
            System.out.println("Siz Zayifsiniz.");
            
        }
        else if (bki >= 18.5 && bki <=25) {
            System.out.println("Sizin BKI degeriniz: " + bki);
            System.out.println("Siz Normal Beden olculerine sahipsiniz.");
            
        }
        else if (bki >25 && bki <= 30) {
            System.out.println("Sizin BKI degeriniz: " + bki);
            System.out.println("Siz Kilolu birisiniz");
            
        }
        else {
            System.out.println("Sizin BKI degeriniz: " + bki);
            System.out.println("Siz Obezsiniz");
        }    
        
        
        
        
        
        
        
        
             
    }
}
