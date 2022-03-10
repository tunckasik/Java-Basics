
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your sentence and check their values for each characters :");
        String sentence = sc.nextLine();
        
        Map<Character, Integer> frequency = new TreeMap<Character, Integer>();
        
        for (int i = 0 ; i < sentence.length() ; i++){  //Cumlenin uzerinden gezinmek icin
            
            char c = sentence.charAt(i);   //harfleri tespit etmek icin
            
            if (frequency.containsKey(c)){ //harf miktarindan ne kadar varsa toplamasi icin
                
                frequency.replace(c, frequency.get(c) + 1); //burasi var olan harfin miktarini arttirmak icin
            }
            else {
                frequency.put(c, 1); //burasi ilk kez o harfi aliyorsa 1 den baslatmak icin
            }
        }
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()){ //Map'i sete ceviriyoruz...
            System.out.println("Charater : " + entry.getKey() + " contains " + entry.getValue()+ ".");
        }
    }
}
