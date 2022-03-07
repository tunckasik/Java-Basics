
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        
       
        String a = "Mustafa";
         System.out.println(a);
        
        String b = new String ("AB1CD2EF3GH4IJ5KL6MN7OP8QR9ST0UVWXYZ");
        
        /*
        System.out.println(b);
        
        System.out.println("Harf sayisi : " + b.length());
        
        System.out.println("0.Indeks : " + b.charAt(0));
        System.out.println("20.Indeks : " + b.charAt(20));
        System.out.println("Son eleman : " + b.charAt(b.length()-1));
        */
       /* for (int i = 0 ; i < b.length() ; i++){
            
            System.out.println((i+1) + " Sirada : " + b.charAt(i));
           
        }
       */     
        System.out.println(b.startsWith("AB"));
        System.out.println(b.lastIndexOf("A"));
        
        System.out.println(b.indexOf("G"));
        System.out.println(b.toLowerCase());
            
        String c = "2022";
        int d = Integer.parseInt(c);
      
        System.out.println(d);
        System.out.println(d-1000);
        
        //icerigi ayni mi diye bakmak icin ne yapmak lazim?
        
        String ic1 = "Mehmet";
        String ic2 = "Mehmet";
        
        if (ic1.equals(ic2)){
            System.out.println("ICERIK AYNI");
        }
        else {
            System.out.println("ICERIK AYNI DEGIL");
        }  
        String ic3 = new String("Mehmet");
        String ic4 = new String ("Ali");
        
        if (ic3.equals(ic4)){
            System.out.println("ICERIK AYNI");
        }
        else{
            System.out.println("ICERIK AYNI DEGIL");
        }
        
       //RAKAMLARI NASIL AYIRIRIZ?
       
      char[] chars = b.toCharArray();
      StringBuilder sb = new StringBuilder();
      for(char c : chars){
         if(Character.isDigit(c)){
            sb.append(c);
         }
      }
      System.out.println(sb);
   }
        
        
        
        
        
    }
}
