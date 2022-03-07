
package geometrik.sekil.hesaplama;

public class Daire extends Sekil {
    private int r;

    public Daire(String isim, int r) {
        super(isim);
        this.r = r;
    }

    @Override
    public void alanHesapla() {
        System.out.println(getIsim() + " nin alani " + (Math.PI * r * r));
    }
}
