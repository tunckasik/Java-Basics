
public class Main {
    public static void main(String[] args) {
        /* Operatorler;
        
        + --> Toplama Operatoru
        - --> Cikarma Operatoru
        / --> Bolme Operatoru
        * --> Carpma Operatoru
        % --> Mod (Kalan) Operatoru
        */
        
        System.out.println(3+4.2);
        System.out.println(3 - 5f);
        System.out.println(10/4);
        System.out.println(10d/4); //Fark ettiysen ustundekinden farkli sonuc verdi, double kullandik!!
        System.out.println(3*4.2f);
        System.out.println(10d % 4);
             
        
        
        
        int a = 4;
        int b = 8;
        a = a + 2;
        b -= 2;
                /*2 Farkli yontem de var;
                    I. Yontem
                    a += 1 b -= 2 gibi biryol var. Diger bir yontem
                    
                    II. Yontem 
                    a++ = Bu postfix yontemi (Guncellenmemis haliyle gelir)
                    ++a = Bu prefix yontemi  (Guncellenmis haliyle gelir)
                        */
        
        ++a; //Birer artmasi saglaniyor.
        --b; //Birer azalmasi saglaniyor.
        
        System.out.println(a); //Sonuc 7 cikiyor cunku onceki degiskende +2 gelmisti..!
        System.out.println(b); //Sonuc 5 cikiyor cunku onceki degiskende -2 gelmisti..!
        
        
        
    }
    
}
