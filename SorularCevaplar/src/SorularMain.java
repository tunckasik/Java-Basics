
public class SorularMain {
    public static void main(String[] args) {
           //Algorithm:  
        //Take a String.
        //Convert it into array of characters
        //Apply for loop till length of char array
        //Add each char in to the array
        //That digit is in char form. We will convert it into String then Integer.
        //Using sum variable, we will sum it.
        
        //Take a String.
       String name ="John";
             
       //Convert it into array of characters
        char [] i= new char[name.length()];
          System.out.println(i);
        System.out.print("[");
       
       //Apply for loop till length of char array
       for(int index =0 ;index<name.length();index++){
           
           //Add each char in to the array
           i[index]=name.charAt(index);
           System.out.print(i[index]+",");
        }
        System.out.print("]");
        System.out.println("");
        
     
        
    }
}
     
       
        

