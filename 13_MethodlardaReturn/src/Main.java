public class Main {
    
   public static int toplama(int a,int b,int c){   //void yerine int yazdik cunku return int deger dondurdu. 
       return (a+b+c);            //deger dondurur.
   }   
      
   public static int ucilecarp(int a){  //bu 3 methodu ic ice kullandim.
       return a*3;
   }
   public static int yediekle(int a){
       return a+7;
   }
   public static int ikiilecarp(int a){
       return a*2;
   }
   
   
    public static void main(String[] args) {   
        System.out.println("ilk methodun cikti degeri:"+toplama(1,2,3));
        System.out.println("ic ice methodlarin ciktisi:" + ucilecarp(yediekle(ikiilecarp(5))));  
        //                                                    3 * (     7  +  (2*(5) )  )
    }
    
}
