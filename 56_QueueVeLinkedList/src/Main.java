import java.util.LinkedList;   // Queue:kuyruk.   ilk giren ilk, son giren son çıkar.
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {/*
* Queue(Kuyruk) Interface'ini implemente eden LinkedList Classı FIFO(First In, First Out Mantığıyla Çalışır.) 
* add(Eleman) ----> Elemanı Kuyruğa Ekler. Ekleyemezse Hata Fırlatır.
* offer(Eleman) ----> Elemanı Kuyruğa Ekler. Eklerse True Döner, Ekleyemezse False Döner.
* remove() ----> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa hata fırlatır.
* poll() ------> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa null referans döner.
* element() ----> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa ,  hata fırlatır.
* peek() ------> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa , null referans döner.*/
        
      Queue<String> queue = new LinkedList<String>();  //Queue intreface in referansindan bir LinkedList obje oluşturduk.
      System.out.println("Kuyruk şu an boş mu?: " + queue.isEmpty());
      //kuyruğa elemanları eklemek için:
      queue.offer("Java");
      queue.offer("Python");
      queue.offer("Php");
      queue.offer("C++");
      
      System.out.println("baştaki eleman: " + queue.peek());
      
      System.out.println("***********Kuyruk****************");
      for (String s: queue) {
          System.out.println(s);
      }
      System.out.println("***************************");
      
      System.out.println("baştaki eleman (" + queue.poll() + ") çıkarılıyor...");
        
      System.out.println("***********Kuyruk****************");        
      for (String s: queue) {
          System.out.println(s);
      }
      System.out.println("***********kuyruk boşaltma*************");        
      while (!queue.isEmpty()) {  //kuyruk boş değilse döngüye girecek.
          System.out.println("baştaki eleman (" + queue.poll() + ") çıkarılıyor..."); 
      }
      System.out.println("***************************");
      
      System.out.println("Kuyruk şu an boş mu?: " + queue.isEmpty());
    }   
}
