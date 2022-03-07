
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    
    public static void islemleriBastir(){
        
        
        System.out.println("\t **************************\n"
                          + "\t 0 - Islemleri Goster\n"
                          + "\t 1 - Sonraki Sehre Git \n"
                          + "\t 2 - Onceki Sehre Git\n"
                          + "\t 3 - Cikis\n"
                          + "\t -------------------------");
    }
    public static void sehirleriTurla (LinkedList<String> sehirler){
        ListIterator<String> ite = sehirler.listIterator();
        int islem;
        islemleriBastir();
        Scanner input = new Scanner(System.in);
        
        if (!ite.hasNext())
        {
            System.out.println("Gidilecek Sehir Yok");
        }
        boolean exit = false;
        
        while (!exit){
            System.out.print("\t --------------------\n"
                            + "\t Bir Islem Seciniz:");
            islem = input.nextInt();
            
            switch(islem){
                case 0 :
                    islemleriBastir();
                    break;
                case 1 : //Sonraki sehir icin
                     if (ite.hasNext()){
                     System.out.println(ite.next() + " sehrine gidiliyor.");
                     }
                     else {
                         System.out.println("Planlanan Seyehat Tamamlandi..");
                     }
                     break;
                case 2 : //Onceki sehir icin 
                    if (ite.hasPrevious()){
                        System.out.println(ite.previous() + " sehrine geri donuluyor. Ne unuttuk acaba?");
                    }
                    else { //Oncesi yok bu yeni basliyoruz demektir.
                        System.out.println("Seyehatimiz Basliyor.. Kemerleri baglayin.");
                   }
                    break;
                case 3 :    
                    
                    exit = true;
                    System.out.println("\t Programdan Cikiliyor...");
                    break;
            }
           
        }
            
    }
    
    public static void main(String[] args) {
        
        LinkedList<String> sehirler = new LinkedList<String>() ;
        
        sehirler.add("Sanliurfa");
        sehirler.add("Gaziantep");
        sehirler.add("Adana");
        
       
        sehirleriTurla(sehirler);
                           
        
    }
}
