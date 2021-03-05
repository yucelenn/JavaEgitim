import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable<String>{
    
    private ArrayList<String> kanallar_listesi = new ArrayList<String>();  // kanallar_listesi bir ArrayList objesi olusturduk.
    //inner classs
    public class RadyoIterator implements Iterator<String> { // Radyo class içinde RadyoIterator classı oluşturduk.Iterator interface
                                                             // ini implement ettirdik. 
        private int index = 0;
        
        @Override
        public boolean hasNext() {     //Iterator classı imp ettiğimiz için bu abstract metodu da imp ettik yoksa hata verir.
            // metodu kendimiz yazdık.Next i var mı kontrol etmek için.
            if (index < kanallar_listesi.size()) {  // kanallar_listesi 0 dan büyükse yani en az 1 eleman varsa true
                return true;
            }
            else { 
                return false;
            }
        }

        @Override
        public String next() {    //Iterator classı imp ettiğimiz için bu abstract metodu da imp ettik yoksa hata verir.
            // metodu kendimiz yazdık.Next e geçmesi için metod.
            String deger = kanallar_listesi.get(index);
            index++;
            
            return deger;
        }
    }
    
    public Radyo(String[] kanallar) {      // constructor.
        for (String kanal : kanallar) {    // for each döngüsü
            kanallar_listesi.add(kanal);   // gönderdiiğimiz kanalları kanallar_listesi ne eklemek için
        }
    }
    
    @Override
    public Iterator<String> iterator() {  // iterator ı imp ettik.
        //return kanallar_listesi.iterator();  // kendi iterator classımızı oluşturmadan yazarsak bu.kanallar_listesi üzerinde iterator oluşturarak.
        return new RadyoIterator();    // kendi iterator classımızı oluşturup yazarsak bu.
    }
}
