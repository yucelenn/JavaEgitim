import java.util.LinkedList;    // Ramazan Pidesi Uygulaması
import java.util.Queue;         // Fırından 1(dahil) ile 10(dahil) arası pide çıkacak. Kuyruktakiler Pideyi almaya çalışacak.
import java.util.Random;

public class Main{   
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Ramazan Pidesi Uygulaması....");
        Random random = new Random();
        
        Queue<String> pide_kuyrugu = new LinkedList<String>();
        pide_kuyrugu.offer("Murat");
        pide_kuyrugu.offer("Hasan");
        pide_kuyrugu.offer("Okan");
        pide_kuyrugu.offer("Ayşe");
        pide_kuyrugu.offer("Merve");
        pide_kuyrugu.offer("Ezgi");
        pide_kuyrugu.offer("Gizem");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Oğuz");
        pide_kuyrugu.offer("Azer"); 
        
        int pide_sayisi = 1 + random.nextInt(10);  //1 den 10 a kadar pide sayısı belirlesin diye random.
        System.out.println("Pideler Çıkıyor...");
        System.out.println("Çıkan Pide Sayısı : " + pide_sayisi);
        
        Thread.sleep(3000);  //3sn beklesin diye...
        
        while (pide_sayisi != 0) {
            System.out.println(pide_kuyrugu.poll() + " pideyi aldı...");  //baştaki pideyi alacak kuyruktan çıkacak.
            pide_sayisi--;
            Thread.sleep(1000);
        }
        System.out.println("Pide kalmadı...Pidesiz kalan kuyruktaki salaklar:"); 
        for (String s: pide_kuyrugu) {
          System.out.println(s);
      }
    }
}