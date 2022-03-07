
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /*
        do {
        //Kosul dogru olmazsa bile do calisir toplami dogru oldugu surece calisir
        //Whiledan farki en az bir kere do blogunu calistirmasinin garanti olmasi.
        */
        
       /* int i = 1;
        
        do {
            
            System.out.println("i = " + i);
            i*=2;
        } while (i<=100);
        
        
        */
        
        
        //SAYININ RAKAMLARI TOPLAMI
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lutfen bir sayi giriniz:");
        
        int sayi = scanner.nextInt();
        int toplam = 0;
      
        do {
            toplam += sayi % 10; //Dongumuzun ilk basamaginda birler basamagini almis oluyoruz.
            System.out.println("toplam;" + toplam);
            sayi /= 10; //Bu hem sayinin 10 basamagini birler basamagina cevirmesi icin(donguden once)
            System.out.println("Sayi: " + sayi);
        } while (sayi > 0);
        System.out.println("Rakamlari toplami = " + toplam);
    }
}
