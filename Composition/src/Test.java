
public class Test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("SVS197", "ASUS", "18.5", resolution);
        
        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Glass");
        
        Anakart anakart = new Anakart("PRO - B250", "DELL", 10, "Windows");
        
        Bilgisayar_Objesi newpc = new Bilgisayar_Objesi(monitor, anakart, kasa);
        
        newpc.getKasa().bilgisayariAc();
        newpc.getMonitor().monitoruKapat();
        newpc.getAnakart().isletimSistemiYukle("Windows X");
    }
}
