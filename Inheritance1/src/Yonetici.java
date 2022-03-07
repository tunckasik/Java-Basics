/* Benim Yazdiklarim
public class Yonetici extends Calisan {
    
    //subclass
    private int sorumlu_kisi; // ekstra ozellik(calisanda olmayan)
    
    public Yonetici (String isim, int maas, String departman, int sorumlu_kisi) {
        
      /*this.isim = isim;
      this.maas = maas;
      this.departman = departman;*/
      //Yukaridaki this burada calismadi cunku private veriyi inherit ederken super kod kullanilmasi gerekiyor asagidaki gibi;
     /* super(isim, maas, departman);
      
      this.sorumlu_kisi = sorumlu_kisi;
      
           
    }
    //Asagida ektra bir 'metod' ekliyoruz;
    
    public void zam_yap(int zam_miktari){
        
        System.out.println("Calisanlara " + zam_miktari + "$ zam yapildi.");
    }
    /*NOT: Yonetici.java olarak Calisan.java daki verilere direkt erisim saglanamiyor bunun icin main metodlarla yapmamiz gerekiyor bunun icinde getter setter lari kullanacagiz.!!
    calisan.java'ya gidip sag tiklayip refactor deyip oradan > encapsulate fields diyoruz 
    Ecapsulate fields unselect "Use Accessors Even When Field is Accessible" diyoruz
   ve sonra asagidaki gibi yaziyoruz;
*/
   /* public void bilgilerigoster(){
        
        //Calisan.java'dan kopyaladik sonra get eklerek duzetiyoruz;
        /*System.out.println("Isim : " + getIsim());
        System.out.println("Maas : " + getMaas());
        System.out.println("Departman : " + getDepartman());
        */
      /*  super.bilgilerigoster();
        System.out.println("Sorumlu Kisi Sayisi : " + this.sorumlu_kisi);
        
        
    }
}
*/

public class Yonetici extends Calisan { // Subclass
    
    private int sorumlu_kisi; // Ekstra Özellik
    
    public Yonetici(String isim, int maas,String departman,int sorumlu_kisi) {
        /*this.isim = isim;
        this.maas = maas;
        this.departman = departman;*/
        super(isim,maas,departman);
        
        this.sorumlu_kisi = sorumlu_kisi;
        
    }
    public void zam_yap(int zam_miktarı) {
        
        System.out.println("Çalışanlara " + zam_miktarı + " tl zam yapıldı");
    }
    public void bilgilerigoster() {
        
        /*System.out.println("İsim :" + getIsim());
        System.out.println("Maaş :" + getMaas());
        System.out.println("Departman :" + getDepartman());*/
        super.bilgilerigoster();
        
        
        System.out.println("Sorumlu Kişi Sayısı: " + this.sorumlu_kisi);
      
    }
    
}