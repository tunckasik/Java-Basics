
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player {
    
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
    
}

public class Main {
    public static void main(String[] args) {
    
     Set<Player> hashset = new HashSet<Player>();     //burada string yerine player yazdik!!  
            
     Player player1 = new Player("Mehmet", 5);    
     Player player2 = new Player("Kadir", 10); 
     Player player3 = new Player("Ali", 10); 
     Player player4 = new Player("Akti", 25); 
     
     hashset.add(player1);
     hashset.add(player2);
     hashset.add(player3);
     hashset.add(player4);
     
     for (Player p : hashset) {
         System.out.println(p);
     }
    }
}

