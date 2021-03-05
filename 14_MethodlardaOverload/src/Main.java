public class Main {     // ayni methodu farkli sekilde tanimlama
    
    public static void toplama(int a,int b,int c){
        System.out.println("Toplamlari:"+ (a+b+c));
    }
    public static void toplama(int a,int b){
        System.out.println("Toplamlari:"+ (a+b));
    }
    public static void toplama(String a,String b){   // string + int de olur kullanima gore.
        System.out.println( a + " " + b);           // "" bosluk icin kullandim.
    }
       
    
    public static void main(String[] args) {
   
        toplama(3, 4);           // ayni methodu 3 farkli sekilde kullandik. overload ettik.
        toplama(5, 6, 7);       
        toplama("Yucelen","Ustun");
    }
    
}
