
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Gorusme Listesi Programi..");
        Random random1 = new Random();
        
        Queue<String> queue1 = new LinkedList<String>();
        
        queue1.offer("Alex");
        queue1.offer("Bilzard");
        queue1.offer("Chantal");
        queue1.offer("Doreen");
        queue1.offer("Emmanuel");
        queue1.offer("Franc");
        queue1.offer("Gabriel");
        queue1.offer("Zebra");
        queue1.offer("Katei");
        queue1.offer("Lilly");
        queue1.offer("Simon");
        
        int busylist = 1 + random1.nextInt(11); //Minimum 1 maksimum 11 olmasi icin
        System.out.println("Gorusmeler basliyor..");
        Thread.sleep(2000);
        System.out.println("Bugun " + busylist + " adet gorusmemis var.");
        Thread.sleep(1000);
        
        while (busylist != 0){ 
            System.out.println(queue1.poll() + " ile gorusme yapildi.");
            busylist --;
            Thread.sleep(1000);
     
        }
        System.out.println("Bugun yapacak gorusme kalmadi");
        while (!queue1.isEmpty()){
            System.out.println(queue1.size() + " adet gorusme yapilmadi.");
        }
    }
}
