
import java.util.Scanner;


public class BKI_Main {
    public static void main(String[] args) {
        /* Kullanicidan aldigimiz boy ve kilo degerlerine gore kullanicinin beden kitle indeksini buluyoruz
        
        Beden Kitle Indeksi : Kilo / Boy(m) * Boy(m)
        
        */
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Beden Kilo Indeksinizi ogrenmek icin asagidaki gerekli bilgileri giriniz;");
        
        System.out.print("Kilonuzu Girin: ");
        int kilo = scanner.nextInt();
        
        System.out.print("Boyunuzu Girin:(Ornek 1.65) ");
        double boy = scanner.nextDouble();
        
        double bki = kilo / (boy*boy);
        
        System.out.println("Beden Kilo Indeksiniz: " + bki);
    }
}
