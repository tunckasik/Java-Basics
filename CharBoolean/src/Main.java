
public class Main {
    public static void main(String[] args) {
        // Char Veri Tipi : Karakterleri gostermek icin kullanilir. 2 byte yer kaplar. 2^16 tane karakter simgelenebilir.
        // Boolean Veri Tipi : Kosul Durumlarinda kullanilir. true veya false degeri alir.
        
        char a = 'A';
        char b = '?';
       // char c = '23' kabul edilmiyor cunku 23 simgesini karsilamiyor yani rakam olmamasi gerekiyor. Ve ' ' kullanmamak gerekiyor,
        char c = 1000; // sonucu 8 cikiyor yani char 1000 kodu 8 rakamini temsil ediyor
        char cc = 2000; 
        char d = '\u0024';      /* farkli karakterleri https://unicode-table.com/ adresinden bulabiliriz.
                                U+0024 sekilde aldiigimiz veri kucuk u ve '+' olmadan yazilmasi gerekiyor*/
        
        
        System.out.println(c);
        System.out.println(cc);
        System.out.println(d);
        
        
        boolean ba = true;
        boolean bb = false;
        
        System.out.println(ba);
        System.out.println(bb);
        
    }
}
