
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /* 
        while(dongu kosulu) {
            // Kosul dogru oldugu surece calisir.
        }
        
        */
        
        //Genelde yazilimda kilitlenme/kasilma olmasini sebebi sonsuz true dongusune girmesidir.
        
        /* 
        int i = 10;
                
        while (i<100){
            
            System.out.println("i = " + i);
            i += 3;     // ISTE BURASI HATIRLANMASI GEREKEN KISIM
                
        }   
        
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz: ");
        
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        
        while (sayi > 0){
            
            faktoriyel *= sayi;
            sayi++
            
        }
        System.out.println("Faktoriyel =" + faktoriyel);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
