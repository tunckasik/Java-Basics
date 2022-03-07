
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> Ogrenmelisin = new ArrayList<String>();
        Ogrenmelisin.add("Java");
        Ogrenmelisin.add("Selenium");
        Ogrenmelisin.add("Cyprus");
        Ogrenmelisin.add("Postman");
        
        for (int i = 0 ; i <Ogrenmelisin.size() ; i++){
            System.out.println((i+1) + ". " + Ogrenmelisin);
        }
        
        System.out.println("");
        for (String O : Ogrenmelisin){
            System.out.println(O);
        }
        System.out.println("---------------------------");
        Ogrenmelisin.add(1,"PMI");
        for (String O : Ogrenmelisin){
            System.out.println(O);
        }
        
    }
}
