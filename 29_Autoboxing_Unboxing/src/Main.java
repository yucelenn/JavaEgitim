import java.util.ArrayList;
public class Main {                           // bilgi amacli.Java zaten kendi yapiyo boxing leri.
    public static void main(String[] args) {
        /*ilkel         Wrapper class
          boolean ------> Boolean
          char ---------> Character
          byte ---------> Byte
          short --------> Short
          int ----------> Integer
          long ---------> Long
          float --------> Float
          double -------> Double
        */
        ArrayList<String> dizilist = new ArrayList<String>();  // Stringte sikinti yok zaten class o.
        ArrayList<Integer> dizilist2 = new ArrayList<Integer>();  //int olsa kabul etmiyor wrapper kullan.
        
        for (int i = 0; i < 10; i++) {
            dizilist2.add(Integer.valueOf(i*4)); //Autoboxing: ilkel i yi kutuya aliyoruz wrapper cinsinde tutuyoruz.            
        } //dizilist2.add(i*4) yapariz normalde Java kendi yukardakini yapar gereksiz yani.
        
        for (int i = 0; i <dizilist2.size(); i++) {
            System.out.println(dizilist2.get(i).intValue());  //Unboxing: kutudaki degeri cikariyoruz(i yi).        
        }                    //dizilist2.get(i)  yapariz normalde Java yukardakini kendi yapar yani gereksiz.
        
   
    }
    
}
