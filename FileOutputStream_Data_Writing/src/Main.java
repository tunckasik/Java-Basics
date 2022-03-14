
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        FileOutputStream fos = null;
        File file = new File("First Text.txt");
        
        

        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception !!");
        }
        
        try {
            fos.write(75);
        } catch (IOException ex) {
            System.out.println("IO exception !!");
        }
        
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("While closing the file there is an IO exception");
            }
            
        }
        
    }
            
    
}
