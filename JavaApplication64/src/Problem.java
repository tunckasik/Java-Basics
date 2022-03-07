
import java.util.Scanner;


public class Problem {
    
    public static class Mathe {
        
        public static void daireAlan(int r){
                        
            System.out.println("Dairenin alani : " + (r *r * Math.PI));
        }
        public static void ucgenCevresi(int kenara, int kenarb, int kenarc){
  
            System.out.println("Ucgenin cevresi : " + (kenara+ kenarb + kenarc ));
        }
     
    }
    public static class physics {

        /**
         *
         * @param vec1
         * @param vec2
         */
        public static void icCarpim (Vec vec1, Vec vec2){
        Scanner sc = new Scanner(System.in);
            
        
        int iccarpim = (vec1.getA() * vec2.getA() + (vec1.getB() * vec2.getB()) + (vec1.getC() * vec2.getC()) ); 
                // + );
        
    }
        
    }
}
