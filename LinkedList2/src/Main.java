
import java.util.LinkedList;
import java.util.ListIterator;


public class Main {
    
    public static void ListeyiBastir(LinkedList<String> gidilecekYerler){
        
    /*    for(String x : gidilecekYerler){
            System.out.println(x);
        }
    */   
        ListIterator <String> ITE = gidilecekYerler.listIterator();
        
        while (ITE.hasNext()){
            
            System.out.println(ITE.next());
        }
        
    }
    public static void siraliEkle(LinkedList<String> gidilecekYerler, String yeni){
        ListIterator <String> ite = gidilecekYerler.listIterator();
        
        while (ite.hasNext()){
            int kiyasla = ite.next().compareTo(yeni);
            
            if (kiyasla == 0 ){
                // Iki deger esit
                System.out.println("Listenizde bu eleman zaten var..");
                
                return;
            }
            else if (kiyasla < 0) {
                
                //Yeni deger ite.next ten daha buyuk.
            }
            else if (kiyasla > 0 ){
                
                ite.previous();
                ite.add(yeni);
                System.out.println("");
                return;
            }
        }
        ite.add(yeni);
        
        
    }
    public static void main(String[] args) {
        
        LinkedList<String> gidilecekYerler = new LinkedList<String>();
        
     /*   gidilecekYerler.add("Postane");
        gidilecekYerler.add("Banka");
        gidilecekYerler.add("Kutuphane");
        gidilecekYerler.add("PatenOluk");
        gidilecekYerler.add("Buz Pisti");
        gidilecekYerler.add("Ev");
        
        ListeyiBastir(gidilecekYerler);
        System.out.println("---------------------------");
        gidilecekYerler.add(3,"Market");
        ListeyiBastir(gidilecekYerler);
        gidilecekYerler.remove(5);
        System.out.println("--------------***-------------");
        ListeyiBastir(gidilecekYerler);
        
        
    }
}
