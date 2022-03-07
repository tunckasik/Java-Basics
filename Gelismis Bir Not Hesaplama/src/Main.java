
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sinifi Gecip gecmediginzi gormek icin icin vizelerinizi final sinav sonuclarinizi giriniz");
        System.out.print("Birinci Vize Puaniniz: ");
        double vize1 = scanner.nextDouble();
        System.out.print("Ikinci Vize Puaniniz: ");
        double vize2 = scanner.nextDouble();
        System.out.print("Final Puaniniz: ");
        double finalnotu = scanner.nextDouble();
        
        
        double toplamnot = (vize1 * 3/10.0) + (vize2 * 3 / 10.0) + (finalnotu * 4 / 10.0);
        double ortalama = (toplamnot/25);
        
        if (toplamnot >= 90){
            System.out.println("Ders notu ortalamaniz " + ortalama);
            System.out.println("AA aldiniz ve dersi gectiniz, TEBRIKLER!");
       
        }
        else if (toplamnot >= 85){
            System.out.println("BA aldiniz ve dersi gectiniz, TEBRIKLER!");
        
        }
        else if (toplamnot >= 80){
            System.out.println("Ders notu ortalamaniz " + ortalama);
            System.out.println("BB aldiniz ve dersi gectiniz, TEBRIKLER!");
        
        }
        else if (toplamnot >= 75){
            System.out.println("Ders notu ortalamaniz " + ortalama);
            System.out.println("CB aldiniz ve dersi gectiniz, TEBRIKLER!");
        
        }
        else if (toplamnot >= 70){
            System.out.println("Ders notu ortalamaniz " + ortalama);
            System.out.println("CC aldiniz ve dersi gectiniz, TEBRIKLER!");
        
        }
        else if (toplamnot >= 65){
            System.out.println("Ders notu ortalamaniz " + ortalama);
            System.out.println("DC aldiniz ve dersi gectiniz, TEBRIKLER!");
        
        }
        else if (toplamnot >= 60){
            System.out.println("Ders notu ortalamaniz " + ortalama);
            System.out.println("DD aldiniz ve bu dersi gectiniz, TEBRIKLER!");
        
        }
       else if (toplamnot >= 55){
            System.out.println("Ders notu ortalamaniz " + ortalama);
            System.out.println("DC aldiniz dolayisiyla bu dersi tekrar almaniz gerekiyor. UZGUNUZ");
       }
      else {
            System.out.println("Ders notu ortalamaniz " + ortalama);
            System.out.println("FF aldiniz ve ders tekrari gerekiyor, UZGUNUZ");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
            
}
