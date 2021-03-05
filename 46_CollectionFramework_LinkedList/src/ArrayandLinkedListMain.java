import java.util.ArrayList;   // ArrayList ve LinkedList karsilastirma
import java.util.LinkedList;
import java.util.List;

public class ArrayandLinkedListMain {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedlist  = new LinkedList<Integer>();  //ikisi de List interface i implement ediyor.
        ArrayList<Integer> arraylist =  new ArrayList<Integer>();
        
        zamanHesapla("LinkedList",linkedlist);
        zamanHesapla("ArrayList",arraylist);        
    }
    
    public static void zamanHesapla(String veri_tipi,List<Integer> list) {
        long baslangic;   //sureyi hesaplamak icin
        long bitis;
        baslangic = System.currentTimeMillis();
        
        // Listin basina deger ekleme
        for (int i = 0 ; i< 100000 ; i++) {
            list.add(0,i);
           //list.add(i); //bu da sonuna ekleme
            
        }
        bitis = System.currentTimeMillis();
        
        System.out.println(veri_tipi + " ekleme süresi " + (bitis - baslangic) + " ms");        
    }
}
