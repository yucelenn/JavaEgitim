import java.util.ArrayList;   // sort sadece küçükten büyüğe sıralıyor 
import java.util.Collections; // comparator classı imp eden metod büyükten küçüğe ya da istediğin gibi
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
                                          //Stringleri kıyaslamak için
class BuyuktenKucugeString implements Comparator<String> { //class Comparator interface ini implement ediyor.abstract metodu imp et.

    @Override         //soldaki sağdakinden büyükse -1 , tersiyse +1 , aynıysa 0 döndürür bu metod.
    public int compare(String o1, String o2) {  //compare metodunu override ettik.
        return -o1.compareTo(o2);   //(-) nin anlamı: küçükten büyüğe değil büyükten küçüğe sıralasın diye
    }
}

class Player{
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
       return "|||| ID: " + id + " İsim :" + isim + " |||";
    }
}
                                        //Player objeleri kıyaslamak için
class KucuktenBuyugePlayer implements Comparator<Player> {  //class Comparator interface ini implement ediyor.abstract metodu imp et.
// Player id sine göre sıralar                                      
    public KucuktenBuyugePlayer() { //constructor
    }

    @Override
    public int compare(Player o1, Player o2) { //yukardaki metod gibi 
        if (o1.getId() < o2.getId()) {  //küçükten büyüğe sıralamak için metodun önüne - koysun diye
            return -1;    
        }
        else if (o1.getId() > o2.getId()) {  //küçükten büyüğe sıralanır zaten compare metodu öyle çalışıyor.
            return 15;
        }
        return 0;   //eşitse ikisi
    }
}
                                        //Player objeleri kıyaslamak için
class BuyuktenKucugePlayer implements Comparator<Player> { //class Comparator interface ini implement ediyor.abstract metodu imp et.
// Player id sine göre sıralar  
    @Override
    public int compare(Player o1, Player o2) { //yukardakinin tam zıttı
        if (o1.getId() < o2.getId()) {  //büyükten küçüğe sıralanır zaten compare metodu öyle çalışıyor.
            return 1;   
        }
        else if (o1.getId() > o2.getId()) {  //büyükten küçüğe sıralamak için metodun önüne - koysun diye
            return -15;
        }
        return 0;   //eşitse ikisi
    }   
}

class KucuktenBuyugeStringPlayer implements  Comparator<Player> {
// Player ismine göre sıralar
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getIsim().compareTo(o2.getIsim());           
    }    
}

public class Main {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();
        
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");
        System.out.println("************BuyuktenKucugeString****************");
                             //Comparator interface ini implement eden BuyuktenKucugeString classtan obje vererek kullanırız.
        Collections.sort(list,new BuyuktenKucugeString());     //her ihtimalde sıralar çünkü yukarda ayarladık metodunu ona göre  
        
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("****************************");
       
        List<Player> list_player = new ArrayList<Player>();
        
        list_player.add(new Player("Murat", 5));
        list_player.add(new Player("Emre", 1));
        list_player.add(new Player("Oğuz", 10));
        list_player.add(new Player("Yusuf", 4));
                                      //Comparator interface ini implement eden KucuktenBuyugePlayer classtan obje vererek kullanırız.
        Collections.sort(list_player,new KucuktenBuyugePlayer());
        System.out.println("************KucuktenBuyugePlayer(id)****************");
        for (Player p : list_player) {
            System.out.println(p);            
        }
        System.out.println("****************************************************");
        
        Collections.sort(list_player,new BuyuktenKucugePlayer());
        System.out.println("************BuyuktenKucugePlayer(id)****************");
        for (Player p : list_player) {
            System.out.println(p);            
        }
        System.out.println("****************************************************");
        
        Collections.sort(list_player, new KucuktenBuyugeStringPlayer());
        System.out.println("*************KucuktenBuyugeStringPlayer*************");
        for (Player p : list_player) {
            System.out.println(p);            
        }
        System.out.println("****************************************************");
        
                                     // anonim obje bu (class yazmaya gerek kalmadan anonim obje olusturduk
        Collections.sort(list_player, new Comparator<Player>(){ //anonim obje kullanarak Player isme göre büyükten küçüğe sıralama
            @Override
            public int compare(Player o1, Player o2) {  //yine de metodu implement ettik.
                 return -o1.getIsim().compareTo(o2.getIsim()); //(-) nin anlamı: küçükten büyüğe değil büyükten küçüğe sıralasın diye
            }            
        });
        System.out.println("*************BüyüktenKüçüğeİsmeGöre*****************");
        for (Player p : list_player) {
            System.out.println(p);            
        }
              
      //  Player p1 = new Player("Murat", 5);
      //  Player p2 = new Player("Yusuf", 4);
        
       // System.out.println(p1.compareTo(p1));
        
        /*Collections.sort(list_player);
        
        for (Player p : list_player) {
            System.out.println(p);
        }*/       
    }
}




