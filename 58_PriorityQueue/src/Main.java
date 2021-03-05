import java.util.PriorityQueue;   // ilk giren ilk çıkmıyor önceliği olan ilk çıkıyor hatta sıraya ona göre giriyor.
import java.util.Queue;           // en düşük sayı en öne , kelimemede ce alfabetik sıraya göre.

class Player implements  Comparable<Player>{  // Comparable interfaceini imp eden bir Player classı.PriorityQueue elemanı yapmak için
    private String isim;
    private int id;

    public Player(String isim, int id) {   // constructor
        this.isim = isim;
        this.id = id;
    }

    @Override
    public int compareTo(Player player) {  // Comparable abstract metodu implement ettik. 
        if (this.id < player.id) {   // Player objeleri id lerine göre sıralamak için ayarladık.
            return -1;                // id si küçük olanın önceliği olacak.
        }
        else if (this.id > player.id) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {  // Player objelerini bastırabilmek için insert code toString.
        return "Player{" + "isim=" + isim + ", id=" + id + '}';
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Queue<Integer> queue2 = new PriorityQueue<Integer>();   //Queue referansıyla , bir PriorityQueue objesi olusturduk.
        queue2.offer(5);   // add metodu aslında
        queue2.offer(1);
        queue2.offer(2);
        queue2.offer(100);
    
        System.out.println("en baştaki eleman: " + queue2.peek());    // en baştaki elemanı verir
        System.out.println("kuyrukta 100 elemanı var mı?: " + queue2.contains(100));  //içeriyor mu?
        
        while (!queue2.isEmpty()) { // kuyruk boş değilse döngüye girer.
            System.out.println("kuyruğun başındaki (" + queue2.poll() + ") elemanı çıkarılıyor... ");
        }
        System.out.println("***************************************************");
        
        Queue<Player> queue = new PriorityQueue<Player>();//bu sefer Player objeleriyle doldurmak için PriorityQueue objesini oluşturduk.
      
        queue.offer(new Player("Murat", 5));
        queue.offer(new Player("Mehmet", 1));
        queue.offer(new Player("Oğuz",100));
      
        System.out.println("en baştaki player: " + queue.peek());
        while (!queue.isEmpty()) {
            System.out.println("kuyruğun başındaki ( " + queue.poll() + " ) kuyruktan çıkarılıyor.");
        }
        /*for (Integer i : queue) {   // for each döngü PriorityQueue da düzgün çalışmaz
          System.out.println(i);
        }*/        
  /*Queue Interface ve PriorityQueue Sınıfı

    PriorityQueue normal Queue mantığı gibi davranmaz. Elemanlar öncelik sıralarına göre yüksek öncelik kazanıp
    
    Integerlarda en yüksek öncelik en küçük sayıda, en düşük öncelik  en büyük sayıdadır.
    Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen stringte, 
    en düşük öncelik  alfabetik olarak sözlükte en son gelen stringtedir.

    kuyrukta önlere geçer (Tıpkı Hastanedeki Acil Servisler Gibi). 

    add veya offer() metodları --------> Kuyruğa eleman ekler.(Önceden gördüğümüz özellikleri taşırlar.)
    clear() metodu --------> Kuyruğu Temizler.
    contains(Object o) ------> o objesi kuyruğun içindeyse true, değilse false döner.
    peek() ------> Kuyruğun başındaki elemanı döner.Eğer kuyruk boşsa null referans döner.
    poll() -----> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Eğer kuyruk boşsa null referans döner.
    size()------> Kuyruğun içindeki eleman sayısını döner.*/
    }
}
