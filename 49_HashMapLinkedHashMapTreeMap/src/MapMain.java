import java.util.Collection;
import java.util.HashMap;       // hashmap: sırasız,karışık basar
import java.util.LinkedHashMap; // linkedhashmap: girilen keylerin sırasına göre basar (10 5 1 2 100)
import java.util.Map;
import java.util.TreeMap;       // treemap: keylerin  küçükten büyüğe sıralamasına göre basar ( 1 2  5 10 100)

public class MapMain {
    
    public static void mapYazdir(Map<Integer,String> map) { //  map interface ini kullanan method
        
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");
    //1. bastırma yolu : hem key hem value basar;   
        for (Map.Entry<Integer,String> entry : map.entrySet()) {  // for each gibi hepsini basmak için entry 
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
        //System.out.println(map.keySet());  // sadece keyleri basar.
    //2. bastırma yolu : hem key hem value basar;   
        /*for (Integer key : map.keySet()){  // value ları ekleyip basmak için
            System.out.println("Key : " + key + " Value: " + map.get(key));
        }*/
        Collection<String> values = map.values(); // Collection referansını kullanarak 
    //3. bastırma yolu : sadece value ları basar;   
        for (String s: values) {   // for each döngüsüyle basmak için
            System.out.println("Değer : " + s);
        }
    }
    
    public static void main(String[] args) {
        // hepsi Map interface ini implement ettiği için böyle obje oluşturduk:
        Map<Integer,String> hashmap = new HashMap<Integer,String>();
        Map<Integer,String> linkedhashmap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treemap = new TreeMap<Integer,String>();
        
        System.out.println("*******hashmap***********");
        mapYazdir(hashmap);
        System.out.println("******************");
        System.out.println("*****linkedhashmap*************");
        mapYazdir(linkedhashmap);
        System.out.println("******************");
        System.out.println("*******treemap***********");
        mapYazdir(treemap);
        System.out.println("******************");
    }
}
