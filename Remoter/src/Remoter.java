
import java.util.ArrayList;
import java.util.Iterator;

//For each dongusuyle gezinebilmek icin iterable implement ediyoruz!

public class Remoter implements Iterable<String> {
    private ArrayList<String> channels = new ArrayList<String>();
    
    //Bir tane iterator donmemeiz icin birtane iterator olusturmamiz gerekiyor..
    //Bunu inner class yardimiyla yapacagiz..
    public class RemoterIterator implements Iterator<String>{
        private int index = 0;
   
        @Override
        public boolean hasNext() { //eger sonraki next kanal yoksa hata vermemesi icin bunu doldurduk
            if (index >= channels.size()){
                return false;
            }
            else {
                return true;
            }
        }
        @Override
        public String next() { //Kanallar uzerinde gezinmek icin next i kullanacagiz.
            String channel = channels.get(index);
            index++;
            return channel;
        }
    }
    public void channelAdd (String channel){
        channels.add(channel);
    }
    public void channelDel (String channel){
        if (channels.contains(channel)){
            channels.remove(channel);
        }
        else {
            System.out.println("There is no channel to delete");
        }
        
        
    }
    public int channelCount(){
        return channels.size();
    }

    @Override
    public Iterator<String> iterator() {
        return new RemoterIterator();
    }    
}
