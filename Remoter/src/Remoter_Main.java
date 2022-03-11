
import java.util.Scanner;        

public class Remoter_Main {
    public static void main(String[] args) {
        System.out.println("\t >Welcome to Remoter Application<");
        Scanner sc = new Scanner(System.in);
        String menu = "\t Menu____ \n"
                + "\t 1. Channels \n"
                + "\t 2. Add New Channel\n"
                + "\t 3. Delete a Channel\n"
                + "\t 4. Check Total Channels Amount\n"
                + "\t 5. Quit";
        
        Remoter remoter1 = new Remoter();
        System.out.println(menu);        
        System.out.println("\t ___________________________");
        
        while (true) {
                
        System.out.print("Press from 1 to 5 : ");
        String input = sc.nextLine();
            if (input.equals("5")){
                System.out.println("Application is being closed soon.. Have a nice day..");
                break;
            }
            else if (input.equals("1")){
                showChannels(remoter1);
            }
            else if (input.equals("2")){
                System.out.print("Which channel do you want to add? : ");
                String channelName = sc.nextLine();
                remoter1.channelAdd(channelName);
                System.out.println(channelName + " is added into channel list.");
            }
            else if (input.equals("3")){
                System.out.print("Which channel do you want to delete? : ");
                String channelName = sc.nextLine();
                remoter1.channelDel(channelName);
                System.out.println(channelName + " is deleted.");
            }
            else if (input.equals("4")){
                System.out.println("Total saved channels is " + remoter1.channelCount());
            }
            else {
                System.out.println("Invalid transaction.. \n"
                        + "Please press valid number between 1 to 5");
                
            }
        }
    }
    public static void showChannels(Remoter remoter1){
        
       if (remoter1.channelCount() == 0){ 
           
           System.out.println("There is no channel yet..");
       }
       else {
           for (String channel : remoter1) {
               System.out.println("Channel : " + channel);
           }
       }  
    }
}  
      
    

