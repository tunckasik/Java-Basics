
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        
    /*  4 Farkli inner class var;
         1.Statik Olmayan Inner Classes
         2.Statik Inner Classes
         3.Local Inner Classes
         4.Anonymous inner Classes
    */
    
    //NON-STATIC INNER CLASS olusturma sekli;
    Matematik.Factorial factorial1 = new Matematik(). new Factorial();
    Matematik.Asal asal1 = new Matematik(). new Asal();
    Matematik.Alan alan1 = new Matematik(). new Alan();
    Matematik.Alan.DaireAlan daireAlan1 = new Matematik().new Alan(). new DaireAlan();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Bir sayi giriniz: ");
            
           
    int sayi = sc.nextInt();
    
    if (asal1.asalMi(sayi)){
            System.out.println("Bu sayi Asaldir.");
    }
    else {
            System.out.println("Bu sayi asal degildir.");
    }
    factorial1.faktoriyel();
    daireAlan1.daireAlan();
    
    }

 
}
