
public class Main {
    public static void main(String[] args) {
        /* 
        Encapsulation bir sinifin ozelliklerini baska bir siniftan gizlemektir.
        Kapsulleme gizleme..
        */
        
       /* Abone abone12 = new Abone();
        //Constractor olarak calistirmadigimiz icin eksik veya hatali giris yapabiliriz.
        //abone.sehir girisini unutursak ta program calismayacakti.
        //Ayrica tanimlanan ozellikler 'isim', 'bakiye' 'sehir' Abone.java dosyasinda degistirildigi zaman bu sayfada (Main.java) sorun cikarir.
        //Bu ornek bize encapsulation kullanmamanin 3 dezavantajini goruyoruz.
        abone12.isim = "Ibrahim TATLI";
        abone12.bakiye = 100;
        abone12.sehir = "Ankara";
        
        abone12.dogalgazKullan(100);
         
        */
       
       GelismisAbone abone43 = new GelismisAbone("Ibrahim TATLI",200, "Ankara");
        abone43.bakiyeOgren();   
           
       
    }
}
