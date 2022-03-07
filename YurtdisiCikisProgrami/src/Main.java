
public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Havalimanina Hosgeldiniz...");   
        String sartlar =  """
                          Yurtdisi Cikis Kurallari... 
                          Covid negatif belgenizi olmasi gerekiyor 
                          Harcinizi (15$) yatirmaniz gerekiyor..
                          Siyasi yasaginizin olmamasi gerekiyor..
                          Gideceginiz ulkeye vizenizin olmasi gerekiyor""";
        String uyarimesaji = "Yurtdisi Sartlarindan hepsini saglamaniz gerekiyor.";
        
         
        while (true) {
            System.out.println("*****************************************");
            System.out.println(sartlar);
            System.out.println("-----------------------------------------");
            System.out.println(uyarimesaji);
            Yolcu yolcu1 = new Yolcu();
            System.out.print("Covid Negatif belgeniz kontrol ediliyor? ");
            Thread.sleep(3000);
            if (yolcu1.KontrolCovid()== false){
                System.out.println("Negatif Covid Olmasi Gerekiyor");
                continue;
            }
            System.out.println("Harc Bedeli Kontrol Ediliyor...");
            Thread.sleep(3000);
            if (yolcu1.KontrolyurtdisiHarci() == false ){
                System.out.println(uyarimesaji);
                continue; // Bu while dongusunun basina geri gondermesi icin
                //eger buradaki 'if' true cikarsa bu donguye girmemis olacagiz
            }
            System.out.println("Siyasi Yasak Kontrol ediliyor..");
            Thread.sleep(3000);
            if (yolcu1.KontrolSiyasiYasak()== true){
                System.out.println(uyarimesaji);
                continue;
            }
            System.out.println("Vize durumunuz kontrol ediliyor");
            Thread.sleep(3000);
            if (yolcu1.KontrolVizeDurumu()== false) {
                System.out.println(uyarimesaji);
                continue;
            }
            System.out.println("Islemleriniz Onaylandi.. CIKIS IZNI VERILMISTIR!");
            break;
        }      
    }
}
