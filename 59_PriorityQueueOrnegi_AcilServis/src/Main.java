import java.util.PriorityQueue;    // Acil Servis Uygulaması
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {
  
     /* Hastalar Acil Serviste şikayetlerine göre kuyrukta en önlere geçecek(PriorityQueue).
        Apandisit ----> En yüksek öncelik
        Yanık -------> Orta Öncelik
        Baş Ağrısı ---> En düşük öncelik
        
        new Hasta("Murat Bey","Yanık")   */
        
        Queue<Hasta> acilservis = new PriorityQueue<Hasta>(); // PriorityQueue acilservis objesini Hasta objeleriyle doldurcaz
        
        acilservis.offer( new Hasta("Murat Bey","Yanık"));
        acilservis.offer( new Hasta("Okan Bey","Baş Ağrısı"));
        acilservis.offer( new Hasta("Gizem Hanım","Apandisit"));
        acilservis.offer( new Hasta("Elif Hanım","Apandisit"));
        acilservis.offer( new Hasta("Oğuz Bey","Yanık"));
        acilservis.offer( new Hasta("Merve Hanım","Yanık"));
        
        int i = 1;
        //öncelikler eşitse kuyruğa eklenme sırasına göre kuyruğa sıralanır.
        while(acilservis.isEmpty() != true) {  //boş değilse döngüye girer.
            System.out.println("**************************************");
            System.out.println(i + ". sırada");
            System.out.println(acilservis.poll()); //kuyrukta en öndekini basacak.(önceliğe göre sıralayıp)
            i++;
        }
    }
}
