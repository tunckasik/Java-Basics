
public class Kopek extends Hayvan {

    private int disSayisi;
    
    public Kopek(String isim, int kilo, int boy, int bacaksayisi, int disSayisi){
        
        super(isim,kilo,boy,bacaksayisi);
        
        this.disSayisi = disSayisi;
        
    }
    public void kos (int hiz){
        
        System.out.println("Kopek kosuyor..");
        
        hareketeGec(hiz); //override ettigimiz kod degisimi yapmadan dogrudan kendo 
        //kodumuzu kullaniyoruz, bu da ilerde isimizi kolaylastiracktir ins    
    }
    public int getDisSayisi() {
        return disSayisi;
    }
    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }
    
}
