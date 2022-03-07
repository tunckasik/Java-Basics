
public class Doktorlar extends Calisan {
    private String tecrube;
    //super(isim,maas,departman);
  
  public Doktorlar(String isim, int maas, String departman,String tecrubeM){
      super(isim,maas,departman);
      this.tecrube=tecrubeM;
      
  } 
  public void bilgilerigoster(){
      
      super.bilgilerigoster();
     System.out.println("doktor tecrubesi "+this.tecrube);
  }
  public void doktorunAdi(){
    String doktorIsim= super.getIsim()+" Doktorun adidir, onu cagirdik super'le";
     
      System.out.println(doktorIsim);
      System.out.println(10);
  }
}
