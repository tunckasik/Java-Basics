
import java.util.Scanner;


public class ReverseSentence {
    public static void main(String[] args) {
         //Algorithm    
        //Scanner for input
        Scanner scanner = new Scanner(System.in);
        //Ask to write a sentence 
        System.out.println("Please write a sentence : ");
        //a string as a sentence 
        String sentence1 = scanner.nextLine();
        //Define empty string for reversed sentence
        String reversedsentence = "";
        //Define a string array with spliting to each word
        String [] sentenceArray = sentence1.split( " " );
        //Open a loop with for to reverse the sentence
        for (int i = sentenceArray.length-1; i >= 0; i--){
                    
        //store reversed words into new reversed string
        reversedsentence += sentenceArray[i] + " ";
        }
        //remove space from the words in case
        reversedsentence = reversedsentence.trim();
        //print reversedstring
        System.out.println("---------------After Reversion");
        
        System.out.println(reversedsentence);
    
//        //Define a string 
//        String sentence = "Hadi bakalim bu cumleyi cevir!" ;
//        //Define empty string for reversed sentence
//        String reversedSentence = "" ;
//        //Define a string array with spliting to each word
//        String [] Array1 = sentence.split( " " );
//        //Open a loop with for to reverse the sentence
//        for ( int i = Array1. length - 1 ; i>= 0 ; i--) {
//        //store reversed words into new reversed string
//        reversedSentence += Array1[i]+ " " ; }
//        //remove space from last word    
//        reversedSentence = reversedSentence.trim();
//        //print reversedstring
//        System. out .println(reversedSentence);
    }
}
