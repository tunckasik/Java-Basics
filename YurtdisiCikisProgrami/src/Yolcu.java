
import java.util.Scanner;


public class Yolcu implements CikisKontrolKurallari {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    private boolean covid;
    
    public Yolcu(){ //Bu bolum yolcunun veri girecegi alani doldurmasi icin hazirlaniyor...
        Scanner sc = new Scanner(System.in);
        System.out.println("Covid Negatif belgeniz var mi? : ");
        String covidyanit = sc.nextLine();
        
        if (covidyanit.equals("hayir")){
            this.covid = false;
        }
        else {
            this.covid = true;
        }      
        System.out.println("Yatirdiginiz Harc Bedeli: ");
        this.harc = sc.nextInt();
        sc.nextLine();
        System.out.println("Siyasi yasaginiz bulunuyor mu?(evet ya da hayir) : ");
        String cevap = sc.nextLine();
        
        if (cevap.equals("evet")){
            
            this.siyasiYasak = true;
           // System.out.println("Yurtdisina cikis yasaginiz bulunuyor...");
        }
        else {
            
            this.siyasiYasak = false;
        }
        System.out.println("Vizeniz buluyor mu?(evet || hayir) : ");
        String cevap2 = sc.nextLine();
        if (cevap2.equals("evet")){
            
            this.vizeDurumu = true;            
        }
        else {
            this.vizeDurumu = false;
        }
    }
    // Asagidaki bolum CikisKontrolKurallari interface'ini uygulamak icin yani yolcunun girdigi verileri kontrol etmek icin 
    // ve ona gore output'larimizla yolcuyu bilgilendirmis olacagiz(ins).
     @Override
    public boolean KontrolCovid() {
            if (this.covid == true){
                
                System.out.println("Covid negatif belgenizi yaninizda bulundurunuz..");
                return true;
            }
            else {
                System.out.println("Covid hastalari yurtdisina cikamaz.. 15 gun sonra tekrar deneyiniz");
                return false;
            }
    }
    @Override
    public boolean KontrolyurtdisiHarci() {
        if (this.harc < 15) {
            System.out.println("Harcinizin tamamani yatirdiginizdan emin olun..");
            return false;  
        }
        else {
            System.out.println("HARC isleminiz kabul edildi");
            return true; 
        }   
    }

    @Override
    public boolean KontrolSiyasiYasak() {
        if (this.siyasiYasak == true ) {
            System.out.println("siyasi yasaginiz bulunuyor, yurtdisina cikamazsiniz");
            return false;
        }
        else {
            System.out.println("Siyasi yasaginiz bulunmuyor..");
            return true;
        }
    }

   
    @Override
    public boolean KontrolVizeDurumu() {
        if (this.vizeDurumu == true) {
            System.out.println("Vize olduguna gore Yurtdisina cikabilirsiniz..");
            return true;
        }
        else {
            System.out.println("Gideceginiz ulkeye vizeniz bulunmamaktadir.");
            return false;
        }
    }
    
}
