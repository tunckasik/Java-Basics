
public class Abone {
    
    public String isim;
    public int bakiye;
    public String sehir;
    
    public void dogalgazKullan(int miktar){
              
        if((this.bakiye - miktar) <= 0 ){
            
            System.out.println("Yeterli Bakiye Yok !");
        }
        else {
            this.bakiye -= miktar;
            
            if (this.bakiye <= 0) {
                System.out.println("Bakiyeniz bitmistir. Abone Merkezine Gidiniz.\n"
                        + " Kredi Limiti = 120 $'dir.");
            }
            
            else {
                System.out.println("Yeni bakiyeniz " + bakiye);
            }
            
        }
        
    }
    
    public void bakiyeOgren(){
        System.out.println("Bakiye = " + bakiye);
        
    }
}
