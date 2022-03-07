
public class Main {
    public static void main(String[] args) {
    
     //Sekil sekil = new Sekil("Sekil"); << Calismiyor!
     Sekil sekil;
     sekil = new Kare("B Karesi", 8);
     sekil.alanHesapla();
        
     Kare kare1 = new Kare("A Karesi", 6);
     Daire daire1 = new Daire("C Dairesi", 5);
     
     kare1.alanHesapla();
     daire1.alanHesapla();
    }
}
    