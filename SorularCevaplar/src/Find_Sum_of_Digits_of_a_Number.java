
public class Find_Sum_of_Digits_of_a_Number {
    public static void main(String[] args) {
           
      //Algorithm:  
        //Take a String.
        //Convert it into array of characters
        //Apply for loop till length of char array
        //Using isDigit() method we can check the digits in string.
        //If isDigit() will return true then print that index value.
        //That digit is in char form. We will convert it into String then Integer.
        //Using sum variable, we will sum it.
        
        //Take a String.
        String str1 = "ade1r4d3";
        
        //Convert it into array of characters
        char[] c = str1.toCharArray();
        
        //Apply for loop till length of char array
        int sum = 0; //We will need that 'sum' into 'for loop' and out of 'for loop'
        
        for (int i = 0; i < c.length; i++){
            
        //Using isDigit() method we can check the digits in string.
            if (Character.isDigit(c[i])) {
        
        //If isDigit() will return true then print that index value.    
            System.out.println("Digits in the String : " + c[i]);
            System.out.println();
        
        //That digit is in char form. We will convert it into String then Integer.
            int a = Integer.parseInt(String.valueOf(c[i]));
        
        //Using sum variable, we will sum it.
        
        
        sum = sum + a;
            }
        }
        System.out.println("Total of Digits is " + sum);
    }
           
}
