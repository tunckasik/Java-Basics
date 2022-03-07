
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hosgeldiniz...");
        
        String islemler = "Islemler...\n"
                + "1. Daire Alani\n"
                + "2. Ucgen Cevresi\n"
                + "3. 2 Vektorun Ic Carpimi\n"
                + "4. Cikis";
             
        while (true){
            
            System.out.println(islemler);
            System.out.print("Islemi seciniz: ");
            String islem = sc.nextLine();
            
            if (islem.equals("4")){
                
                System.out.println("Cikiliyor");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Dairenin yaricapini giriniz ;");
                int r = sc.nextInt();
                    sc.nextLine();
                Problem.Mathe.daireAlan(r);
            }
            else if (islem.equals("2")){
                System.out.println("Ucgenin kenarlarini giriniz ;");
                System.out.print("a kenari: ");
                int kenara= sc.nextInt();
                System.out.print("b kenari: ");
                int kenarb= sc.nextInt();
                System.out.print("c kenari: ");
                int kenarc= sc.nextInt();
                sc.nextLine();
            
                Problem.Mathe.ucgenCevresi(kenara, kenarb, kenarc);
            }
            else if (islem.equals("3")){
                System.out.println("Vektorun degerlerini giriniz ;");
                System.out.print("Vektor 1: ");
                int vec1 = sc.nextInt();
                System.out.print("Vektor 2: ");
                int vec2 = sc.nextInt();
                sc.nextLine();
            
            
            Problem.physics.icCarpim(int vec1, int vec2, int vec3);
                    
            }
        }
        
              
        
    }


}


