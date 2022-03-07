
import java.util.Scanner;


public class For_Main {
    public static void main(String[] args) {
        /*
        for (dongu degiskeni baslatma ; kosul ; artirma veya azaltma islemleri) {
            Dongu kosulumuz dogru oldugu surece burasi calisacak.
        
        }
                            */
        
       /* int i;
        
        for (i = 0; i < 5 ; i++) {
            
            System.out.println("i = " + i);
        }
                             */
        
        //int degiskenini for dongusune ozel yapabiliyoruz asagidaki gibi;
     /*  for (int i= 50; i >= 0; i--) {
        
        System.out.println("i = " +i);
    }
                            */ 
     /*
       int i = 5
               
       for (; i < 10; i++){
           System.out.println("i = " + i);
       }
                             */
                     
      /*  
        int a = 1;
        int z = 29;
        //int yukarida onceden yazildigi icin, for icinde ';' kullanarak dongu degiskeni belirtmemis olduk, asagidaki gibi
        for (; a<=z && z>=a; a++,z--){
            
            System.out.println("a = " + a);
            System.out.println("z = " + z);
        }
                            */
        
       /* 
        for (int i = 1; i <100 ; i*=2){
            
            System.out.println("i = " + i);
        }
                            */
        
        
        //FAKTORIYEL FORMULU
        // 5 ! = 5*4*3*2*1 = 120 gibi
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz"
        );
        
        int f = 1;
        
        int sayi = scanner.nextInt();
        
        for (int i = 1; i <= sayi; i++){
            f *= i; //bu veri girilen sayiyla esitlenmesini saglayacak
            System.out.println("Faktoriyel = " + f + " , i = " + i);
        }
        
        
        
        
        
        
    }
}
