
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        class Alan {
            public void daireAlan(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Dairenin yaricapini giriniz ;");
            double r = sc.nextDouble();
            sc.nextLine();
            System.out.println("Dairenin alani : " + (r * r * Math.PI));
            }
        }
        Alan alan1 = new Alan();
        alan1.daireAlan();
        Alan alan2 = new Alan();
        alan2.daireAlan();
    }
    
    /*
    //Asagidaki ornekte Alan metoduna tanimlanmamis gozukuyor, cunku Alan metoduna yukaridaki class tan erisemiyoruz, 
    //orada tanimlanip oraya ait kaliyor (statik degil public degil)
    
    public static void deneme (){
    
    Alan alan3 = new Alan();
    */ 
    }
}
