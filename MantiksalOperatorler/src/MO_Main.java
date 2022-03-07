
public class MO_Main {
    public static void main(String[] args) {
        /*
        Mantiksal Operatorler
        && --> 'and' Operatoru
        Butun sonuclar kendi icinde true ise genel sonuc true, en az bir tanesi bile false ise genel sonuc false cikar.
        
        || --> 'or' Operatoru
        Sonuclardan en az birisi bile true ise genel sonuc true, hepsi false ile genel sonuc false cikar
        
        !  --> 'not' Operatoru
        */
        
        /*
        System.out.println(3 == 3);
        System.out.println(2<3);
        System.out.println("Murat" == "Murat" );
        
        System.out.println(3 == 3 && 2 < 3 && "Murat" == "Murat"); //Hepsi true sonuc true
        System.out.println(3 != 3 && 2 < 3 && "Murat" == "Murat"); //Biri false sonuc false
        System.out.println(3 != 3 && 2 > 3 && "Murat" != "Murat"); //Hepsi false sonuc false
        
        */
        
        System.out.println(3 != 3 || 2 > 3);
        System.out.println(!(3<4)); // Parentezin ici true olmasina ragmen () disina ! yani not ifadesi konunca sonuc false cikiyor
        
        
        
        
        
        
        
        
    }
}
