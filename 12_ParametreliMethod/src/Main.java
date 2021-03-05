public class Main {
    
    public static void selamla(String isim){   //parametrenin cinsini yaz icine
        
       System.out.println("hosgeldiniz "+isim);
    }
    
    public static void toplaaaaa(int a,int b,int c){
        
        System.out.println("toplamlari: "+(a+b+c));
    }
    
    public static void main(String[] args) {
        
        selamla("yucel");        // parametre yucel.
        toplaaaaa(3, 4, 5);      // istedigin kadar parametre olur
    }
}
