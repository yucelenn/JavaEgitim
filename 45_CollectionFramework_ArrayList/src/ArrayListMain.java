import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    
    public static void main(String[] args) {
        
        //ArrayList<String> arraylist = new ArrayList<String>();
        List<String> list = new ArrayList<String>();         // ArrayList List den geldigi icin ordan da obje olusturulabilir boyle.
        
        // Eleman Ekleme
        list.add("Java");
        list.add("Python");
        list.add("C++");
        
        // Elemana Erişme
       // System.out.println(list.get(0));
       // System.out.println(list.get(2));
       //System.out.println(list.get(4)); // Hata Verir.
        
        System.out.println("******************************");
        for (int i = 0 ; i < list.size();i++) {   //list i basmak icin
            System.out.println(list.get(i));
        }
        System.out.println("******************************");
        
        for (String s : list) {     //list i basmak icin (for each dongu ile
            System.out.println(s);
        }
        System.out.println("******************************");

        list.remove("Java");     //eleman silme
        
        for (String s : list) {   //list i basmak icin (son hali)
            System.out.println(s);
        }
    }
}
