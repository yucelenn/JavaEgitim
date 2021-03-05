import java.util.LinkedList;
import java.util.ListIterator;

public class Main {           // array listten daha kolay ekleme cikarma yapilir.Dezavantaji bellek kullanimi daha çok.
                              // hem bilgiyi hem referansi tuttugu icin.
    public static void listeyiBastir(LinkedList<String> gidilecek_yerler){   //bastirmak icin method.
      /*  for(String s: gidilecek_yerler ){   //for each dongusu hepsini basar. bu da olur.
            System.out.println(s);
        } */   
        ListIterator<String> iteratorr =gidilecek_yerler.listIterator();  //yeni bilgi iterator referansi tutacak gibi
        
        //iteratorr.hasNext()  iterator fonsiyonlarindan.
        while(iteratorr.hasNext()){    // bir ilerideki elemanda referans var mi kontrol edecek varsa bir sonrakine  
            System.out.println(iteratorr.next());                                                  // gidecek dongu.
        }
    }
    
    public static void main(String[] args) {  
        
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();   //olay burda bunu yaz.
        // array list gibi ekleme yapalim:
        gidilecek_yerler.add("Postane");      //0.index
        gidilecek_yerler.add("Market");       //1.index
        gidilecek_yerler.add("Okul");         //2.index
        gidilecek_yerler.add("Kutuphane");    //3.index
        gidilecek_yerler.add("Spor salonu");  //4.index
        gidilecek_yerler.add("Ev");           //5.index
        
        listeyiBastir(gidilecek_yerler);
        System.out.println("*************************");
        
        gidilecek_yerler.add(4,"Avm");   //4. indexe Avm yi ekledi
        listeyiBastir(gidilecek_yerler);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        gidilecek_yerler.remove(3);     //3. indextekini siler.
        listeyiBastir(gidilecek_yerler);   
            
    }
}
