
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    
    public static int[] arrayiDoldur(int sayi){
        Scanner scanner = new Scanner(System.in);  
        int[] cikti = new int[sayi];
        
        for (int i = 0 ; i < sayi ; i++) {
        cikti[i] = scanner.nextInt();
        } 
        return cikti;
    }
    public static void arrayiBastir(int[] array1){
        
        for(int a = 0 ; a <array1.length; a++){
            System.out.println("Array " + (a+1) + ": " + array1[a]);
        }
                  
    }
    public static void arraySort(int [] BARRAY ){
        
        //Arrays Sinifi
        System.out.println("Array Sirasi " );
        Arrays.sort(BARRAY);
        arrayiBastir(BARRAY);       
    }
    
    public static void main(String[] args) {
      //  int[] x = arrayiDoldur(5);
      //  arrayiBastir(x);
        
      //  arraySort(x);
        
        int [] y = {2,4,6,8,10};
        int [] z = {2,4,6,8,10};
        
     /*   if (y == z){ //Bu islem bellekte ayni objeyi gosterip gostermedigini sorgulamis oluyor, icerigindeki degerleri  degil.!!
            //Icerigindeki degerleri kiyaslamak icin farkli bir yontem kullaniyoruz.
            System.out.println("Esitler");
        }
        else {
            System.out.println("Esit Degiller "); 
     */
     //ARRAYLERIN ICERIGINI KIYASLAMAK ICIN:
     if (Arrays.equals(y, z)){ 
            System.out.println("Esitler");
        }
        else {
            System.out.println("Esit Degiller "); 
        }
        
        
        
    }
    
    
}
