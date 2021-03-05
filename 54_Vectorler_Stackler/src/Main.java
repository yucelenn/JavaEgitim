import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Main {
    
    public static void main(String[] args) {
                                                       
        Vector<String> vector =  new Vector<String>(); // Vector de ArrayList gibi ama bu thread lerde işlem yaparken güvenli.
                                                       // thread dışı ArrayList kullan daha hızlı vector e göre.
        vector.add("Java");                            // Vector synchronized dır.
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");
        
        for (String s : vector) {
            System.out.println(s);
        }
        System.out.println("********ListIterator**********");
        //böyle de bastırabilirsin:
        ListIterator<String> iterator =  vector.listIterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*********Enumeration**********");
        //böyle de bastırabilirsin:
        Enumeration<String> enumaration = vector.elements();
        
        while (enumaration.hasMoreElements()) {
            System.out.println(enumaration.nextElement());
        }
        System.out.println("******************************");
        // vector metodları;
        System.out.println("İlk Eleman : " + vector.firstElement());
        System.out.println("Son Eleman : " + vector.lastElement());
        
        System.out.println("*************Stack objesini oluşturduk*****************");
        Stack<String> stack = new Stack<String>();  //Stack, Vector interface inden extend edilmiştir. Vector gibi synchronized dır.
        System.out.println("Stack şu an boş mu?: " + stack.empty());          // ilk giren son çıkar Stack'de.
        
        System.out.println("************Stack******************");        
        stack.push("Java");   // add gibi push
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");
        
        for (String s : stack ){
            System.out.println(s);
        }
        System.out.println("**********Stackte Enumration ile gezme**************");
        Enumeration<String> enumeration = stack.elements();
        
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        System.out.println("************Stack son gireni ilk çıkarır pop metodu*****************");
        System.out.println("Son eleman (" + stack.pop() + ") Çıkarılıyor : " );
        System.out.println("************pop metodundan sonra Stack******************");
        for (String s : stack ){
            System.out.println(s);
        }
        System.out.println("******Stack boşaltma*****");
        
        while (!stack.empty()){  // stack boş değilse döngüye girer.
            System.out.println(stack.pop() + " Elemanı Çıkarılıyor... ");   // tek tek elemanları silecek.
        } 
        System.out.println("Stack'teki elemanların hepsi çıktı mı?: " + stack.empty());
    }
}
