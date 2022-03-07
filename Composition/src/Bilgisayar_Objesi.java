
public class Bilgisayar_Objesi {
    private Monitor monitor;
    private Anakart anakart;
    private Kasa kasa;

    public Bilgisayar_Objesi(Monitor monitor, Anakart anakart, Kasa kasa) {
        this.monitor = monitor;
        this.anakart = anakart;
        this.kasa = kasa;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }
    
    
    
    
    
}
