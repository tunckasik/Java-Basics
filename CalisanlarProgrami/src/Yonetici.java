
public class Yonetici extends Calisan {
    private int sorumluKisiSayisi;

    public Yonetici(String ad, String soyad, int id) {
        super(ad, soyad, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yoneticinin Sorumlu oldugu Kisiler :" + sorumluKisiSayisi);
    }
    public void zamYap(int zamMiktari){
        
        System.out.println(getAd() + " calisanlara " + zamMiktari + "$ zam yapiyor.");
    }

      public int getSorumluKisiSayisi() {
        return sorumluKisiSayisi;
    }

      public void setSorumluKisiSayisi(int sorumluKisiSayisi) {
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }
    
}
