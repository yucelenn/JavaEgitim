import java.util.ArrayList;
public class Main {   
    
    public static void yazdir(ArrayList<String> a){   //method icine arraylist gonderme yaptik.
         for (int i = 0; i < a.size(); i++) {
             System.out.println(i+ ". eleman:" +a.get(i) );
        }      
    }
    
    public static void main(String[] args) {       //basit bilgiler burada.
   
        ArrayList<String> dizilistesi = new ArrayList<String>();
        
        dizilistesi.add("Yucelen");     // 0. index
        dizilistesi.add("Ustun");       // 1. index
        dizilistesi.add("Ankara");      // 2. index
        dizilistesi.add("Eryaman");     // 3. index
        dizilistesi.add("Yucelen");     // 4. index
        
        System.out.println(dizilistesi.get(2));    //2. indexteki elemani bastirdik.
        
        System.out.println(dizilistesi.indexOf("Yucelen"));     // Yucelen eleamaninin indexini bulmak icin.yoksa -1 basar
        System.out.println(dizilistesi.lastIndexOf("Yucelen"));  // son Yucelen eleamaninin indexini bulmak icin.
        
        System.out.println(dizilistesi.size());     //diziadi.size()   dizinin uzunlugunu verir. Dongulerde kullan bunu.
        
        System.out.println("*************************************************");
        dizilistesi.remove(3);           // 3. indexi siler diziden
        dizilistesi.remove("Ustun");     // Ustun u siler diziden  
        // sildikten sonra eleman sayisini azaltir.
        
        for (int i = 0; i < dizilistesi.size(); i++) { //silindikten sonra dizi
            System.out.println(dizilistesi.get(i));            
        }
        
        System.out.println("Ustun ve 3. index silinince eleman sayisi:"+dizilistesi.size());    
        System.out.println("*************************************************");

        dizilistesi.set(1,"Etimesgut");     // 1. indexi degistirmek icin. Ankara yerine Etimesgut yazdi.
        
        for (int i = 0; i < dizilistesi.size(); i++) {
            System.out.println(dizilistesi.get(i));            
        }

        yazdir(dizilistesi);   //dizilistesi ni methoda gonderdik.son halini bastirdik.
    }
}
