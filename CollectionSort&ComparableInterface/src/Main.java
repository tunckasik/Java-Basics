
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Player implements Comparable<Player> { //!! ONEMLI OLAN Bunu implement etmemiz
    
    String name;
    int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Player{" + "Name= " + name + ", " + "\t Id= " + id + '}';
    }

    @Override
    public int compareTo(Player player) {
        
        //ISIM VEYA ID 'ye SIRALAMAK ICIN:
        
        if (this.id < player.id){
            return -1;
        }
        else if (this.id > player.id){
            return 1;
        }
        return 0;
    }
    
}

public class Main {
    public static void main(String[] args) {
 /*   
    List<String> StringList1 = new ArrayList<String>();
     
    StringList1.add("Ahmet");
    StringList1.add("Baris");
    StringList1.add("Tarik");
    StringList1.add("Mustafa");
    StringList1.add("Aykut");
    
    Collections.sort(StringList1);
    
    for (String s : StringList1){
        System.out.println(s);
    }
 */
     List<Player> PlayerList1 = new ArrayList<Player>();
     
     PlayerList1.add(new Player("Mustafa", 5));
     PlayerList1.add(new Player("Alp", 50));
     PlayerList1.add(new Player("Irfan", 15));
     PlayerList1.add(new Player("Erkan", 6));
     PlayerList1.add(new Player("Semih", 18));
    
     Player p1 = new Player("Mustafa", 5);
     Player p2 = new Player("Alp", 50);
     
     //   System.out.println(p1.compareTo(p2));
  /*    Collections.sort(PlayerList1); 
     
      for (Player p : PlayerList1){
          System.out.println(p);
      }
 */   
    Set<Player> treeset1 = new TreeSet<Player>();
    treeset1.add(new Player("Mustafa", 5));
    treeset1.add(new Player("Alp", 50));
    treeset1.add(new Player("Irfan", 15));
    treeset1.add(new Player("Erkan", 6));
    treeset1.add(new Player("Semih", 18));  
    
    for (Player p : treeset1){
        System.out.println(p);
    }
    }
}

