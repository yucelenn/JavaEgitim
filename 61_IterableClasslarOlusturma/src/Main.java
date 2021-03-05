import java.util.Iterator;

public class Main {
    
    public static void main(String[] args) {
        
        String[] kanallar = {"Radyo Viva","Radyo Fenomen","Kral Pop","Radyo Hacettepe","Alem FM"};
        
        Radyo radyo =  new Radyo(kanallar); // Radyo objesi olusturduk ve kanalları girdik kanallar_listesi ne
        
        for (String s : radyo ) {  // for each döngüleri iterator kullandığı için ve radyo objesinin iterator objesi olmadığı için
            System.out.println(s);   // hata verir.Bu yüzden Radyo classı imp ettirdik Iterable ı.
        }// kendi Iterator classımızı oluşturduğumuz için for each döngüsü çalışabilir artık.
        System.out.println("*********************************");
        
        String[] kanallar2 = {"DreamTürk","Radyo Odtü","Alem FM"};
        Radyo radyo2 =  new Radyo(kanallar2);
        // kendi Iterator classımızı oluşturduğumuz için iterator oluşturabiliriz: 
        Iterator<String> iterator =  radyo2.iterator();
        
        while (iterator.hasNext()) {   // iterator ile de basabiliriz böyle
            System.out.println(iterator.next());
        }        
    }
}
