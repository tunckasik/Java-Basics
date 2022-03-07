
/* public class Test {
    public static void main(String[] args) {
        /* IS-A iliskisi (veya HAS-A) sirkette tum departmanlarin belli ortak kullanim alanlari vardir 
        ve hepsi bir yer iscidir. Inheritance bu ortak kullanilacak olan verileri tek class ta toplamaya yariyor.
        >Manager IS An employee.
        >Is mulakatlarinda cok soruluyor!!
        
        */
        
        /*Yonetici yoneticiOne = new Yonetici ("Mehmet Ali", 2500, "IT",10);
        
        yoneticiOne.bigileriGoster();
        /*NOT: biz bunu yonetici.java'nin icinde tanimlamadik ancak miras aldigimiz icin direkt 
        olarak kullanabiliyoruz. Inheritance'in mantigi bu; eger bir ana class'imiz varsa ve buna bagli alt
        siniflar olacaksa, butun "ortak ozellikleri" bir ana class'in altinda direkt olarak biriktiriyorsunuz.
      
        */
       /* System.out.println("-----------------------------");
        yoneticiOne.zam_yap(200);
   
    /* Overriding : Enheritance'daki veriyi kendi class'imizda yeniden olusturursak 
        miras alinan veriyi degil yeniden yazdigimiz veriyi(overriding yaptigimiz) veriyi aliyoruz
        Bunu yaparak super class'daki metodu iptal etmis oluyoruz.
    */
       /* System.out.println("---------------------------");
    
    
    }
} */

public class Test {
    
    public static void main(String[] args) {
        
        // IS-A 
        
        Yonetici yonetici1 = new Yonetici("Mustafa Murat Coşkun", 2500, "IT",10);
        yonetici1.bilgilerigoster();
        //yonetici1.zam_yap(200);
        Doktorlar obje = new Doktorlar("mehmet ali ",150000,"it","200");
        
       obje.bilgilerigoster();
       
      obje.doktorunAdi();
    }
    
}
