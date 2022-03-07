
import java.util.Scanner;


public class KG_Main {
    public static void main(String[] args) {
        // While dongusu yardimiyla bir kullanici girisi yazmaya calisin.
        
        
        Scanner scanner = new Scanner(System.in);
        
        int giris_hakki = 3;
        
        String sys_kullanici_adi = "Mehmet Ali";
        String sys_parola  = "636300";
        
        System.out.println("------------------------------------");
        System.out.println("   *   Kullanici Giris Sayfasi   *  ");
        System.out.println("------------------------------------");

        while (true) {
            
            System.out.print("Kullanici Adi: ");
            String kullanici = scanner.nextLine();
            System.out.print("Parolo: ");
            String parola = scanner.nextLine();
            
            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hosgeldiniz, " + kullanici);
                break;
            }  
            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                System.out.println("Parolaniz Hatali, Lutfen Tekrar Deneyin");
                giris_hakki -= 1 ;
                System.out.println("Kalan Giris Deneme Hakki " + giris_hakki);
                    }
            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Kullanici Adi Hatali, Lutfen Tekrar Deneyin");
                giris_hakki -= 1 ;
                System.out.println("Kalan Giris Deneme Hakki " + giris_hakki);
                    }
            else { 
                System.out.println("Kullanici Adi ve Parola Hatali, Lutfen Tekrar Deneyin");
                giris_hakki -= 1 ;
                System.out.println("Kalan Giris Deneme Hakki " + giris_hakki);
                    
                }            
            if (giris_hakki == 0){
                System.out.println("Giris Hakkiniz Kalmadi, Ekrani kapatiyoruz");
                break;    
            }
            
        }
        
        
        
        
        
        
        
    }
}
