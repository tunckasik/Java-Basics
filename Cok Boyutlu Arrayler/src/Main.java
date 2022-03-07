
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

      //  String [][] isimlistesi = {{"Nesibe","Ceylan"},{"Neva","Yeliz"},{"Esra","Yildiz"},{ "Mehmet","Ali"}};
        
        int [][] dogumTarihi = new int [2][3]; 
        
        Scanner scanner = new Scanner(System.in);
        
        for (int g = 0 ; g < 2 ; g++){
            for (int a = 0 ; a < 3 ; a++){
                
                System.out.print("g = " + g " a = " + a);
                
                dogumTarihi[g][a  ] = scanner.nextInt();
                   
            } 
        }
        
        
        for (int g = 0 ; g < 2 ; g++){
            
            
            
            
        }
       /*
        System.out.print(isimlistesi[0][0]+ " " + isimlistesi[0][1]);
      */  
        
        
                
    }
}
