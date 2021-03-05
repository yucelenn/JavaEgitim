public class Main {
    
    public static void main(String[] args) {
        
        char a = 'v';                       //char da tek tirnak ve harf
        String b = "merhaba";               //string de cift tirnak ve kelime
        String c="lar";
        String d=b+c;                       // stringlerde toplama
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(b + c +" hosgeldiniz");   // stringlerde birlesme
        System.out.println(d);                        //merhabalar basar.
        
        String e="java "+"prog"+" dili";              //boyle de toplanabilir
        System.out.println(e);
        
        String f="bu da"+"\nolur";                    // \n alt satira gecirir 
        System.out.println(f);
    }
}
