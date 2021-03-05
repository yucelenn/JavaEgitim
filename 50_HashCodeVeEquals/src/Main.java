import java.util.ArrayList;     // hashcode yazıyosan equals da yaz.
import java.util.Collections;   // sağ tık , insert code , equals() and hashcode()
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Player {
    
    private String isim;   
    private int id;

    public Player(String isim, int id) {  //constructor
        this.isim = isim;
        this.id = id;
    }

    @Override                //Object classtan bu metodu override ettik
    public String toString() {
       return "|||| ID: " + id + " İsim :" + isim + " |||";
    } 
    
    @Override
    public int hashCode() {        // sağ tık , insert code , equals() and hashcode()
        int hash = 7;              // 1 ve 4 aynı olduğu için engellemek amaçlı, yapmasaydık 2 tane id 1 mustafa oluşurdu.
        hash = 41 * hash + Objects.hashCode(this.isim);
        hash = 41 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Set<Player> hashset = new HashSet<Player>();
        
        Player player1 = new Player("Mustafa",1);  // 1 ile 4 aynı olduğunda sorun olmasın diye hash ve equal yaptık yukarda
        Player player2 = new Player("Mehmet",10);
        Player player3 = new Player("Emre",6);
        Player player4 = new Player("Mustafa",1);        
    
        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);
        
        for (Player p: hashset){    // basmak için for each döngüsü
            System.out.println(p);
        }
    }
}
