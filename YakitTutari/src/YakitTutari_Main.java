
import java.util.Scanner;


public class YakitTutari_Main {
    public static void main(String[] args) {
        
        /* 
    Bir aracin 100 kilometrede kac lt benzin yaktigini ve benzin fiyati bilgilerini alip 
        sonrasinda km de ne kadar yaktigini hesapliyoruz.

*/ /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Araciniz 100 km kac litre tuketiyor? (Ornegin : 10.5) : ");
        double litre = scanner.nextDouble();
        
        System.out.print("Benzinin guncel fiyati(Ornegin 1.5) : ");
        double benzin = scanner.nextDouble();
        
        double kmde = (litre * benzin);
        
        System.out.println("Araciniz km'de " + kmde + " cent benzin yakiyor.");
        
         */ 



            //WHILE TRUE dongusuyle yapmaya calisiyorum;
        Scanner scanner = new Scanner(System.in);
        
        String acilis = "Araciniz km'de kac cent yakiyor?\n"
                    + "Ogrenmek icin 1'e basin\n"
                    + "Cikis icin 9'a basin";
        
                    System.out.println("******----------******");
                    System.out.println(acilis);
                    System.out.println("******----------******");
       
                    
            while (true) {
                System.out.println("Denemek ister misiniz?");
                String dene = scanner.nextLine();
                    
                if (dene.equals("9")){
                    
                    System.out.println("Programi denediginiz icin Tesekkurler!");
                    break;
                }    
                else if (dene.equals("1")){
                  
                    System.out.print("Benzinin guncel fiyatini giriniz(1.5) : ");
                    double benzin = scanner.nextDouble();
                    System.out.print("Araciniz 100 km kac litre tuketiyor?:  ");
                    double litre = scanner.nextDouble();
                    double kmde = (litre * benzin);
                    System.out.println("Araciniz km'de " + kmde + " cent benzin yakiyor.");
                               
                else {
                            System.out.println("Lutfen gecerli bir islem giriniz!");
                            }           
                }
                       
                
                
                
        
        
        
        
        
        
        
         
        
        
        
        
        
        
        
        
            }
        
    }
} 
    