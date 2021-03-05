public class Main {                                // while(kosul)   
    public static void main(String[] args) {       // while dongu ile 0 dan 100 e kadar 5 er sayma ornegi
   
        int i=0;
        
        while(i<100){               //i, 100 den kucukse iceri gir diyor kisaca        
            
            System.out.println(i);          // kosul saglandigi surece doner. i=100 oldugunda girmez iceri
            
            i+=5;                           // artirma-azaltma-bolme-carpma dongunun icinde olacak yoksa sonsuz dongu olur.
        }   
    }
}
