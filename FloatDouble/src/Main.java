
public class Main {
    
    public static void main(String[] args) {
        // Double : 64 bit - 8 byte 
        // Float : 32 bit - 4 byte
        
        // Otomatik Donusturme : int --> float --> double
        
        double a = 5.25;
        double b = 68d;
        double c = 8.22;
        
        float ab = 5.25f;
        float bb = 68f;
        float cb = 8.22f;
        
        System.out.println("Double = " + (a + b +c)/3);
        System.out.println("Float = " + (ab + bb + cb)/3);
    }
}
