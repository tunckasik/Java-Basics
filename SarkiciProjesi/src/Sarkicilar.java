
import java.util.ArrayList;
//sarkici_listesi = sliste
//sarkicilari_bastir = sbastir
//sarkici_ekle = sekle
//sarkici_guncelle = sguncel
//isim = ad
//sarkici_guncelle = sguncelle
//yeni_isim = yeniAd
//sarkici_sil = ssil
// sarkici_ara = sara
// sarkici_ismi = sarkiciAd
public class Sarkicilar {
    private ArrayList<String> sliste = new ArrayList<String>();

    public void sbastir(){
        System.out.println("Sarkici Listesinde " + sliste.size() + " kadar sarkici var");
        
        for (int i = 0 ; i <sliste.size(); i++) {
            System.out.println((i+1) + ".Sarkici : " + sliste.get(i));
        
        }
    }
    public void sekle (String Ad){
        sliste.add(Ad);
        System.out.println("Sarkici Listesi Guncellendi..");
        System.out.println("Yeni Liste asagidaki gibidir:");
        
        sbastir();// nasil yukaridan cagirabilirim.
    
    }
    public void sguncelle (String yeniAd, int pozisyon){
        sliste.set(pozisyon, yeniAd);
        System.out.println("Sarkici Listesi Guncellendi...");
                
    }
    public void ssil (int pozisyon){
        String ad = sliste.get(pozisyon);
        sliste.remove(pozisyon);
        System.out.println(ad + " isimli sarkici listeden silindi...");
    
    }
    public void sara (String sarkiciAd) {
        int pozisyon = sliste.indexOf(sarkiciAd);
        
        if (pozisyon >= 0){
            System.out.println("Sarkici Bulundu.");
            System.out.println(sarkiciAd + " isimli sarkici" + (pozisyon + 1) + ". pozisyonda");
        }
        else {
            System.out.println("Sarkici Bulunamadi...");
        }
        
    }
    
}
