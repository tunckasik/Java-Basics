
import java.util.Scanner;


public class Matematik {
    
    private double PI = Math.PI;
    
    public class Factorial{
        
        public void faktoriyel() {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Faktoriyel bulmak icin bir sayi giriniz: ");
            int sayi = sc.nextInt();
            int fakt = 1;
            //i 2 olmasi gerekiyor ki asagidaki formul calissin.
            for ( int i = 2 ; i <= sayi ; i++){
                fakt *= i;
            }
            System.out.println("Faktoriyel " + fakt);
        }
    }
    public class Asal {
        
        public boolean asalMi (int sayi){
            
            int i = 2; 
            while (i < sayi){
                if (sayi % i == 0) {
                    return false;
                }
                // i++ // i'yi arttirmazsak i sonsuz donguye girer.
                i++;
            
            }
            return true;
        }
    }
    public class Alan{
        
        public class DaireAlan{
        
        public void daireAlan (){
            //PI yi ana matematik class'dan private olmasina ragmen kullanabildik.
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Daire alani icin yaricap giriniz : ");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.println("Dairenin Alani : " + (r *r *PI));
        }
    }   
    }  
    
}
    

