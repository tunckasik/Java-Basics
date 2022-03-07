
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Idman Programi olusturuyoruz.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman Programina Hosgeldiniz...");
       
        String idmanlar = "Yapabileceginiz Hareketler:\n"
                        + "Burpee\n"
                        + "Pushup\n"
                        + "Situp\n"
                        + "Squat";
        System.out.println("****************************");
        System.out.println(idmanlar);
        System.out.println("****************************");        
                
        System.out.println("Bir idman olusturun.");
        
        System.out.print("Burpee Sayisi: ");
        int burpee_sayisi = scanner.nextInt();
        
        System.out.print("Pushup Sayisi: ");
        int pushup_sayisi = scanner.nextInt();
               
        System.out.print("Situp Sayisi: ");
        int situp_sayisi = scanner.nextInt();   
       
        System.out.print("Squat Sayisi: ");
        int squat_sayisi = scanner.nextInt();
                
        scanner.nextLine();
        
        Idman idman = new Idman(burpee, pushup, situp, squat);
         
         System.out.print("Idmaniniz Basliyor..");       
                
        while (idman.idmanBittiMi() == false)  {      
            System.out.print("Hareket Turu (Burpee, Pushup, Situp, Squat) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kac tane yapacaksiniz? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            
            idman.hareketYap(tur, sayi);
    }
  
            System.out.println("Idmaninizi basariyla tamamladin, Tebrikler, yine bekleriz");
            
            
            
    }
}
