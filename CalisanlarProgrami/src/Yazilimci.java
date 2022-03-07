
public class Yazilimci extends Calisan  {
    private String diller;
    
    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    
    }
    public void formatAt(String IsletimSistemi){
        
        System.out.println(getAd() + " " + "ni yukluyor.");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yazilimcinin bildigi diller " + diller);
    }

       public String getDiller() {
        return diller;
    }

       public void setDiller(String diller) {
        this.diller = diller;
    }
    
}
