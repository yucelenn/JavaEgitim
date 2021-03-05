import java.util.ArrayList;
import java.util.Iterator;

public class Kumanda implements Iterable<String>{ //kanallar üzerinde iteratorla gezinebilmek,for each döngü kullanabilmek için
                                                  // Iterable interface inden implement ettik classı.
    private ArrayList<String> kanallar = new ArrayList<String>(); //classın özelliği
    
    public class KumandaIterator implements  Iterator<String> {  // inner class oluşturduk iterator için
        
        private int index = 0;
        
        @Override
        public boolean hasNext() {  // abstract metodu imp ettik.Next i var mı kontrol eden metodu doldurduk.
            if (index >= kanallar.size()){
                return false;
            }
            else {
                return true;
            }
        }

        @Override
        public String next() {     // abstract metodu imp ettik.kanallar üzerinde gezmemizi sağlayan metod yaptık.
            String kanal = kanallar.get(index);
            index++;
            return kanal;            
        }      
    }
    
    public void kanalEkle(String kanal) {  // metod
        kanallar.add(kanal);
    }
    
    public void kanalSil(String kanal) {   // metod
        if (kanallar.contains(kanal)) {    // içeriyorsa sil
            kanallar.remove(kanal);           
        }
        else {     // öyle bir kanal yoksa
            System.out.println("Böyle bir kanal bulunmuyor...");
        }
    }
    
    public int kanalSayisi() {  // metod
        return kanallar.size();
    }

    @Override
    public Iterator<String> iterator() {  // imp ettik.
        return new KumandaIterator();     // for each kullanabilmek için.
    }
}
