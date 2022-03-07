class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        
        return "Hayvan Konusuyor...";
    }

      
}
class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavliyor...";
    }
   
    
}
class Kopek extends Hayvan {
    
    public Kopek (String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havliyor";
    }
     
}
class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() +" kisniyor.";
    
    
}
}

public class Main {
    public static void konustur(Hayvan hayvan){
        
        System.out.println(hayvan.konus());
    }
    
    
    public static void main(String[] args) {
        // Tanim; Bir nesnenin birden fazla nesne gibi davranmasidir.Cok BICIMLILIK
        
        /*    Hayvan hayvan1 = new Kedi ("Limon");
            System.out.println(hayvan1.konus());
            
            Hayvan hayvan2 = new Kopek ("Limon");
            System.out.println(hayvan2.konus());
            
            Hayvan hayvan3 = new At ("Limon");
            System.out.println(hayvan3.konus()); */
        konustur(new Kedi("tekir"));
        konustur(new Kedi("Mavis"));
        konustur(new Kopek("Olaf"));
        konustur(new At("Karatay"));
    }
}

