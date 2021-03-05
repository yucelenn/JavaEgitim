import java.util.ArrayList;       // ListIterator vs Iterator
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Main {
   
  /* ListIterator:  
    Sadece List Interface'i implemente eden classlarda kullanılır.( vector, stack, linkedlist, arraylist)
    next() ve previous() metodu vardır. 
    Ekstradan add() metodu bulunur.
    
    Iterator:
    Set , Queue ve List Interface'i implement'e eden tüm classlarda kullanılabilir.
    previous() metodu yoktur.*/
    
    public static void main(String[] args) {
        
        Set<String> set =  new HashSet<String>();       // HashSet objesi
        List<String> list =  new ArrayList<String>();   // ArrayList objesi
       
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");  
        
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");
        
        Iterator<String> iterator1 = set.iterator();   // set ten bir iterator oluşturduk
        Iterator<String> iterator2 = list.iterator();  // list ten bir iterator oluşturduk.
        
        while (iterator1.hasNext()) {  // Next i varsa döngüye girer.
            System.out.println(iterator1.next());
        }
                                                  // ikisini de iterator ile bastırdık.
        System.out.println("*******************************");
        while (iterator2.hasNext()) {  // Next i varsa döngüye girer.
            System.out.println(iterator2.next());
        }
        while (iterator2.hasNext()) {  // aynısını tekrar basmaz çünkü iterator öncekinde baştan sona kadar gitti, şu an sonda
            System.out.println(iterator2.next());  // Next i kalmadığı için döngüye girmez bu yüzden
        }
        System.out.println("************listIterator*******************");
        
        List<String> list2 =  new ArrayList<String>();   //ArrayList objesi list2 yi oluşturduk.
        list2.add("Javascript");
        list2.add("Python");
        list2.add("C#");
        list2.add("Go");
        ListIterator<String> iterator = list2.listIterator();  // list2 den listIterator objesi oluşturduk
        
        while (iterator.hasNext()){     // Next i varsa döngüye girer.
            System.out.println(iterator.next());
        }
        System.out.println("*************listIteratorda geriye gitme var******************");
        // listIterator şu an sonda bi öncekine gidecek sürekli yani sondan başa basacak.
        while (iterator.hasPrevious()) {   // Previousı varsa döngüye girer.
            System.out.println(iterator.previous());    //           
        }
        // listIterator şu an başta 
        System.out.println("*************listIteratorda silme işlemi******************");
        while (iterator.hasNext()) {    //Javascript ten ileriye doğru gidecek.
            String value = iterator.next(); // listIterator un nextini  valu stringine aktardı.
            if (value.equals("Go")) {   // value=Go ise silmek için.
                iterator.remove();      
            }
        }
        for (String s : list2) { //bastırmak için
            System.out.println(s);
        }     
    }
}
