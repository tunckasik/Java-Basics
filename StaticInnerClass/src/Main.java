
public class Main {
    public static void main(String[] args) {
        
        // Matematik.Alan alan1 = new Matematik().Alan(); demedik cunku buradaki Matematigi olusturmadik "()"
        // sadece dedikki Matematik'in icindeki 'Alan'dan bir tane olustur.
        // statik inner classlar'da bir objeyi gostermek biz asagidaki yontemi kullaniyoruz.
        Matematik.Alan alan1 = new Matematik.Alan();
        while (true){
        alan1.daireAlan();
        }
    }
}
