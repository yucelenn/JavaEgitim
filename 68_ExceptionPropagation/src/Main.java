public class Main {        // iç içe fonksiyonlarda Exceptionların yakalanması: ExceptionPropagation
    
    public static void ucuncufonksiyon() {
        int a = 12 / 0;   //ArithmeticException fırlatır.    
    }
                                                                       // Stack:ucuncufonksiyon()|  3. en üstte(Exception bunda)
    public static void ikincifonksiyon() {                             //       ikincifonksiyon()|
        try {                                                          //       birincifnksiyon()|
            ucuncufonksiyon();                                         //       main fonksiyonu  | main en dipte
        }                                                              //       ------------------
        catch (Exception e) {                 //try catch herhangi metoda yazılabilir çünkü 3. fonk hepsinin içinde zaten
            System.out.println("Hiçbir sayı 0 a bölünemez");
        }
    }
                                                                                                                            
    public static void birincifonksiyon() {        
        ikincifonksiyon();       
    }
    
    public static void main(String[] args) {        
        birincifonksiyon();        
    }
}
