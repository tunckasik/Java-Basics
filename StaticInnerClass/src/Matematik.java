
import java.util.Scanner;


public class Matematik {
    
    private double PI = Math.PI; //bi PI statik olmadigi icin asagida(No.16) kullanamadik ancak statik yaparsak kullanabiliriz.
    
    public static class Alan{
        public static void daireAlan(){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Dairenin yaricapini giriniz ;");
            double r = sc.nextDouble();
            sc.nextLine();
            System.out.println("Dairenin alani : " + (r *r * Math.PI));
        }
        
    }
}
