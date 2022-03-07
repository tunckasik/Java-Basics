
import java.util.Scanner;


public class Main {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner sc = new Scanner(System.in);
    
    public static void islemleriBastir() {
        
        System.out.println("\t 0 - Islemleri Listele");
        System.out.println("\t 1 - Sarkicilari Listele");
        System.out.println("\t 2 - Sarkici Ekle");
        System.out.println("\t 3 - Sarkici Guncelle");
        System.out.println("\t 4 - Sarkici Sil");
        System.out.println("\t 5 - Sarkici Ara");
        System.out.println("\t 6 - Uygulamadan Cik");
    }
    public static void listele(){
        sarkicilar.sbastir();
    }
    public static void ekle(){
        System.out.println("Eklemek Istediginiz Sarkicinin Ismini Giriniz: ");
        String Ad = sc.nextLine();
        sarkicilar.sekle(Ad);
        
    }
    public static void guncelle(){
        System.out.println("Guncellemek istediginiz pozisyonu giriniz (1, 2, 3 ....) : ");
        int pozisyon = sc.nextInt();
        sc.nextLine();
        String yeniAd = sc.nextLine();
        sarkicilar.sguncelle(yeniAd, pozisyon-1);
    }
    public static void sil(){
        System.out.println("Silmek istediginiz pozisyonu giriniz (1,2,3...):");
        int pozisyon = sc.nextInt();
        sc.nextLine();
        sarkicilar.ssil(pozisyon-1);
    }
    public static void ara(){
        System.out.print("Aramak isteginiz sarkici: ");
        String Ad = sc.nextLine();
        sarkicilar.sara(Ad);
    }
    public static void main(String[] args) {
        System.out.println("Sarkici Programina Hosgeldiniz..");
        
        islemleriBastir();
        
        boolean cikis = false;
        int islem;
               
        while(!cikis){
            System.out.println("Bir islem Seciniz: ");
            
            islem = sc.nextInt();
            
           sc.nextLine(); //dummy bir islem bu, enter'a basinca kacirmamak icin.
           
           switch(islem){
               
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    listele();
                    break;
                case 2:
                    ekle();
                    break;
                case 3:
                    guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Programdan cikiliyor");
                            
            }
                if (!(islem >= 0 && islem <= 6)){
                System.out.println("Gecersiz islem girdiniz..");
                   
                }
                
        }
        
    }
}
