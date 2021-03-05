
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    /*
    HashMap Sınıfı
    1. Değerleri Key(Anahtar) ve Value(Değer) olarak depolar. Her key'e karşılık gelen bir tane değer bulunur.
    2. Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla olabilir.
    3. Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz. (HashSet gibi)
    */
    public static void main(String[] args) {
               // key , value
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();  // hashMap objesini oluşturduk
        
        hashMap.put(10,"Java");    //.add collection dan gelir bunda .put kullan
        hashMap.put(30,"Python");  // key 30 , value Python
        hashMap.put(50,"Php");     //bunları karışık basacak   {50=Php, 20=Php, 10=Java, 30=Python}  böyle 
        hashMap.put(20, "Php");    // key ortak yine bunu basar:  {50=Php, 20=Php, 10=Java, 30=Python}
        hashMap.put(20,"Php");
        
        hashMap.put(50, "Javascript"); // yukardaki 50 yi siler bunu basar: {50=Javascript, 20=Php, 10=Java, 30=Python}
 
        /*System.out.println(hashMap);
        
        System.out.println(hashMap.get(50));   // hashMap.get(50) : keyi 50 olanı degeri basar(Javascript)
        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(100));  // olmayan key için null basar
        */   
            for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {  //hepsini basmak için for each döngüsü gibi entry kullandık
            System.out.println("Anahtar : " + entry.getKey() + " ------> Değer: " + entry.getValue());
        }
    }
}
